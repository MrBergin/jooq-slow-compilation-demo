package com.example.codegen

import org.jooq.codegen.JavaGenerator
import org.jooq.codegen.KotlinGenerator
import org.jooq.meta.Database
import java.io.File


/**
 * An [AggregateGenerator] that writes out both Kotlin and Java generated Jooq code and then removes:
 *
 * 1) All Java files that are either Pojos or Interfaces
 * 2) All Kotlin files that are NOT Pojos or Interfaces
 *
 * The end result is a Java generated build with Pojos and Interfaces written in Kotlin
 */
class JavaKotlinPojoGenerator : AggregateGenerator(JavaGenerator(), KotlinGenerator()) {

    override fun generate(db: Database?) {
        super.generate(db)

        val packageDirectory = targetPackage.replace(".", File.separator)
        val basePackage = File(targetDirectory).resolve(packageDirectory)

        deleteAllKotlinExceptPojosAndInterfaces(basePackage)
        deleteAllJavaPojosAndInterfaces(basePackage)
        deleteAnyEmptyDirectories(basePackage)
    }

    private fun deleteAnyEmptyDirectories(basePackage: File) {
        basePackage
            .walkBottomUp()
            .filter { it.isDirectory }
            .filter { it.listFiles()?.isEmpty() ?: false }
            .forEach { it.delete() }
    }

    private fun deleteAllKotlinExceptPojosAndInterfaces(basePackage: File) {
        basePackage
            .walkBottomUp()
            .filterNot { it.parentFile.name in listOf("interfaces", "pojos") }
            .filter { it.extension == "kt" }
            .forEach { it.delete() }
    }

    private fun deleteAllJavaPojosAndInterfaces(basePackage: File) {
        basePackage
            .walkBottomUp()
            .filter { it.parentFile.name in listOf("interfaces", "pojos") }
            .filter { it.extension == "java" }
            .forEach { it.delete() }
    }

}