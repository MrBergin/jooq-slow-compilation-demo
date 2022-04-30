package org.jooq.codegen

import org.jooq.codegen.GeneratorStrategy.Mode.INTERFACE
import org.jooq.codegen.GeneratorStrategy.Mode.POJO
import org.jooq.meta.Definition
import org.jooq.meta.TableDefinition
import java.io.File


/**
 * An [AggregateJavaGenerator] that supplements a [JavaGenerator] behaviour with a secondary [KotlinGenerator],
 * overriding the behaviour of POJOs and Interface generation to create Kotlin code.
 *
 * The configuration of code generated by the secondary [KotlinGenerator] will honour the configuration of the
 * primary [JavaGenerator]
 */
class JavaKotlinPojoGenerator : AggregateJavaGenerator(Language.JAVA, Language.KOTLIN) {

    /**
     * Override generatePojo to ensure that the JavaWriter ends up writing .kt files for pojos
     *
     * This function was overridden instead of [generatePojos] to ensure the JavaGenerator is the one that closes the
     * JavaWriter
     */
    override fun generatePojo(table: TableDefinition, out: JavaWriter) {
        secondaryGenerator.generatePojo(table, out)
    }

    /**
     * Override generateInterface to ensure that the JavaWriter ends up writing .kt files for interfaces
     *
     * This function was overridden instead of [generateInterfaces] to ensure the JavaGenerator is the one that closes the
     * JavaWriter
     */
    override fun generateInterface(table: TableDefinition, out: JavaWriter) {
        secondaryGenerator.generateInterface(table, out)
    }

    /**
     * Override getFile to ensure that POJOs and INTERFACE files have the correct .kt suffix
     */
    override fun getFile(definition: Definition?, mode: GeneratorStrategy.Mode?): File {
        return if (mode in listOf(POJO, INTERFACE)) {
            secondaryGenerator.getFile(definition, mode)
        } else {
            super.getFile(definition, mode)
        }
    }

    /**
     * Override empty to ensure the .kt suffix is also checked
     */
    override fun empty(file: File?, suffix: String?, keep: MutableSet<File>?, ignore: MutableSet<File>?) {
        super.empty(file, ".kt", keep, ignore)
        super.empty(file, suffix, keep, ignore)
    }
}
