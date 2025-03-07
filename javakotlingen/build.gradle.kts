plugins {
    kotlin("jvm")
    id("nu.studer.jooq")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jooq:jooq-codegen:3.16.5")
    jooqGenerator("org.postgresql:postgresql:42.3.1")

    jooqGenerator(project(":javakotlingen:generator"))
}

jooq {
    configurations {
        create("main") {
            generateSchemaSourceOnCompilation.set(false)
            version.set("3.16.5")
            jooqConfiguration.apply {
                jdbc.apply {
                    driver = "org.postgresql.Driver"
                    url = "jdbc:postgresql://localhost:5432/pagila"
                    user = "postgres"
                    password = "postgres"
                }
                generator.apply {
                    name = "org.jooq.codegen.JavaKotlinPojoGenerator"
                    database.apply {
                        name = "org.jooq.meta.postgres.PostgresDatabase"
                        inputSchema = "public"
                    }
                    target.apply {
                        packageName = "org.example.db.generated"
                        directory = "src/generated/kotlin/"
                    }
                    generate.apply {
                        isImmutablePojos = true
                        isPojosAsKotlinDataClasses = true
                        isImmutableInterfaces = true
                    }
                }
            }
        }
    }
}
