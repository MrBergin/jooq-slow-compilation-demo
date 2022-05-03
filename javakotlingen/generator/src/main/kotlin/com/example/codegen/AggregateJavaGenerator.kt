package com.example.codegen

import org.jooq.codegen.Generator
import org.jooq.codegen.GeneratorStrategy
import org.jooq.meta.Database
import org.jooq.meta.jaxb.GeneratedAnnotationType
import org.jooq.meta.jaxb.GeneratedSerialVersionUID
import org.jooq.meta.jaxb.VisibilityModifier
import java.util.*

/**
 * A [Generator] which aggregates together two other generators' setXXX and generate functions.
 *
 * For any other functions (e.g. getXXX) it delegates to the [firstGenerator], as it is assumed any changes to
 * [firstGenerator] are reflected in [secondGenerator], too (preferably only changing these generators by the functions
 * on this [AggregateGenerator])
 */
abstract class AggregateGenerator(
    private val firstGenerator: Generator,
    private val secondGenerator: Generator,
) : Generator by firstGenerator {
    override fun generate(db: Database?) {
        firstGenerator.generate(db)
        secondGenerator.generate(db)
    }

    /**
     * Implementations of the [Generator] interface appear to perform side effects with this setter in the form of
     * setting the target language on the [GeneratorStrategy].
     *
     * In this case the decision has been made to call [firstGenerator.setStrategy] last so [firstGenerator]'s language
     * is the one that is set.
     *
     * This is based purely on it being more intuitive that the [firstGenerator]'s language would take precedence.
     */
    override fun setStrategy(strategy: GeneratorStrategy?) {
        secondGenerator.setStrategy(strategy)
        firstGenerator.setStrategy(strategy)
    }

    override fun setGenerateDeprecated(generateDeprecated: Boolean) {
        firstGenerator.setGenerateDeprecated(generateDeprecated)
        secondGenerator.setGenerateDeprecated(generateDeprecated)
    }

    override fun setGenerateDeprecationOnUnknownTypes(generateDeprecationOnUnknownTypes: Boolean) {
        firstGenerator.setGenerateDeprecationOnUnknownTypes(generateDeprecationOnUnknownTypes)
        secondGenerator.setGenerateDeprecationOnUnknownTypes(generateDeprecationOnUnknownTypes)
    }

    override fun setGenerateIndexes(generateIndexes: Boolean) {
        firstGenerator.setGenerateIndexes(generateIndexes)
        secondGenerator.setGenerateIndexes(generateIndexes)
    }

    override fun setGenerateRelations(generateRelations: Boolean) {
        firstGenerator.setGenerateRelations(generateRelations)
        secondGenerator.setGenerateRelations(generateRelations)
    }

    override fun setGenerateImplicitJoinPathsToOne(generateImplicitJoinPathsToOne: Boolean) {
        firstGenerator.setGenerateImplicitJoinPathsToOne(generateImplicitJoinPathsToOne)
        secondGenerator.setGenerateImplicitJoinPathsToOne(generateImplicitJoinPathsToOne)
    }

    override fun setGenerateTableValuedFunctions(generateTableValuedFunctions: Boolean) {
        firstGenerator.setGenerateTableValuedFunctions(generateTableValuedFunctions)
        secondGenerator.setGenerateTableValuedFunctions(generateTableValuedFunctions)
    }

    override fun setGenerateInstanceFields(generateInstanceFields: Boolean) {
        firstGenerator.setGenerateInstanceFields(generateInstanceFields)
        secondGenerator.setGenerateInstanceFields(generateInstanceFields)
    }

    override fun setGenerateVisibilityModifier(generateVisibilityModifier: VisibilityModifier?) {
        firstGenerator.setGenerateVisibilityModifier(generateVisibilityModifier)
        secondGenerator.setGenerateVisibilityModifier(generateVisibilityModifier)
    }

    override fun setGenerateGeneratedAnnotation(generateGeneratedAnnotation: Boolean) {
        firstGenerator.setGenerateGeneratedAnnotation(generateGeneratedAnnotation)
        secondGenerator.setGenerateGeneratedAnnotation(generateGeneratedAnnotation)
    }

    override fun setGenerateGeneratedAnnotationType(generateGeneratedAnnotationType: GeneratedAnnotationType?) {
        firstGenerator.setGenerateGeneratedAnnotationType(generateGeneratedAnnotationType)
        secondGenerator.setGenerateGeneratedAnnotationType(generateGeneratedAnnotationType)
    }

    override fun setGenerateGeneratedAnnotationDate(generateGeneratedAnnotationDate: Boolean) {
        firstGenerator.setGenerateGeneratedAnnotationDate(generateGeneratedAnnotationDate)
        secondGenerator.setGenerateGeneratedAnnotationDate(generateGeneratedAnnotationDate)
    }

    override fun setGenerateNonnullAnnotation(generateNonnullAnnotation: Boolean) {
        firstGenerator.setGenerateNonnullAnnotation(generateNonnullAnnotation)
        secondGenerator.setGenerateNonnullAnnotation(generateNonnullAnnotation)
    }

    override fun setGeneratedNonnullAnnotationType(generatedNonnullAnnotationType: String?) {
        firstGenerator.setGeneratedNonnullAnnotationType(generatedNonnullAnnotationType)
        secondGenerator.setGeneratedNonnullAnnotationType(generatedNonnullAnnotationType)
    }

    override fun setGenerateNullableAnnotation(generateNullableAnnotation: Boolean) {
        firstGenerator.setGenerateNullableAnnotation(generateNullableAnnotation)
        secondGenerator.setGenerateNullableAnnotation(generateNullableAnnotation)
    }

    override fun setGeneratedNullableAnnotationType(generatedNullableAnnotationType: String?) {
        firstGenerator.setGeneratedNullableAnnotationType(generatedNullableAnnotationType)
        secondGenerator.setGeneratedNullableAnnotationType(generatedNullableAnnotationType)
    }

    override fun setGenerateConstructorPropertiesAnnotation(generateConstructorPropertiesAnnotation: Boolean) {
        firstGenerator.setGenerateConstructorPropertiesAnnotation(generateConstructorPropertiesAnnotation)
        secondGenerator.setGenerateConstructorPropertiesAnnotation(generateConstructorPropertiesAnnotation)
    }

    override fun setGenerateConstructorPropertiesAnnotationOnPojos(generateConstructorPropertiesAnnotationOnPojos: Boolean) {
        firstGenerator.setGenerateConstructorPropertiesAnnotationOnPojos(
            generateConstructorPropertiesAnnotationOnPojos
        )
        secondGenerator.setGenerateConstructorPropertiesAnnotationOnPojos(generateConstructorPropertiesAnnotationOnPojos)
    }

    override fun setGenerateConstructorPropertiesAnnotationOnRecords(generateConstructorPropertiesAnnotationOnRecords: Boolean) {
        firstGenerator.setGenerateConstructorPropertiesAnnotationOnRecords(
            generateConstructorPropertiesAnnotationOnRecords
        )
        secondGenerator.setGenerateConstructorPropertiesAnnotationOnRecords(
            generateConstructorPropertiesAnnotationOnRecords
        )
    }

    override fun setUseSchemaVersionProvider(useSchemaVersionProvider: Boolean) {
        firstGenerator.setUseSchemaVersionProvider(useSchemaVersionProvider)
        secondGenerator.setUseSchemaVersionProvider(useSchemaVersionProvider)
    }

    override fun setUseCatalogVersionProvider(useCatalogVersionProvider: Boolean) {
        firstGenerator.setUseCatalogVersionProvider(useCatalogVersionProvider)
        secondGenerator.setUseCatalogVersionProvider(useCatalogVersionProvider)
    }

    override fun setGenerateRoutines(generateRoutines: Boolean) {
        firstGenerator.setGenerateRoutines(generateRoutines)
        secondGenerator.setGenerateRoutines(generateRoutines)
    }

    override fun setGenerateSequences(generateSequences: Boolean) {
        firstGenerator.setGenerateSequences(generateSequences)
        secondGenerator.setGenerateSequences(generateSequences)
    }

    override fun setGenerateSequenceFlags(generateSequenceFlags: Boolean) {
        firstGenerator.setGenerateSequenceFlags(generateSequenceFlags)
        secondGenerator.setGenerateSequenceFlags(generateSequenceFlags)
    }

    override fun setGenerateUDTs(generateUDTs: Boolean) {
        firstGenerator.setGenerateUDTs(generateUDTs)
        secondGenerator.setGenerateUDTs(generateUDTs)
    }

    override fun setGenerateTables(generateTables: Boolean) {
        firstGenerator.setGenerateTables(generateTables)
        secondGenerator.setGenerateTables(generateTables)
    }

    override fun setGenerateEmbeddables(generateEmbeddables: Boolean) {
        firstGenerator.setGenerateEmbeddables(generateEmbeddables)
        secondGenerator.setGenerateEmbeddables(generateEmbeddables)
    }

    override fun setGenerateRecords(generateRecords: Boolean) {
        firstGenerator.setGenerateRecords(generateRecords)
        secondGenerator.setGenerateRecords(generateRecords)
    }

    override fun setGenerateRecordsImplementingRecordN(generateRecordsImplementingRecordN: Boolean) {
        firstGenerator.setGenerateRecordsImplementingRecordN(generateRecordsImplementingRecordN)
        secondGenerator.setGenerateRecordsImplementingRecordN(generateRecordsImplementingRecordN)
    }

    override fun setGenerateEnumsAsScalaSealedTraits(generateEnumsAsScalaSealedTraits: Boolean) {
        firstGenerator.setGenerateEnumsAsScalaSealedTraits(generateEnumsAsScalaSealedTraits)
        secondGenerator.setGenerateEnumsAsScalaSealedTraits(generateEnumsAsScalaSealedTraits)
    }

    override fun setGeneratePojos(generatePojos: Boolean) {
        firstGenerator.setGeneratePojos(generatePojos)
        secondGenerator.setGeneratePojos(generatePojos)
    }

    override fun setGeneratePojosAsJavaRecordClasses(pojosAsJavaRecordClasses: Boolean) {
        firstGenerator.setGeneratePojosAsJavaRecordClasses(pojosAsJavaRecordClasses)
        secondGenerator.setGeneratePojosAsJavaRecordClasses(pojosAsJavaRecordClasses)
    }

    override fun setGeneratePojosAsScalaCaseClasses(pojosAsScalaCaseClasses: Boolean) {
        firstGenerator.setGeneratePojosAsScalaCaseClasses(pojosAsScalaCaseClasses)
        secondGenerator.setGeneratePojosAsScalaCaseClasses(pojosAsScalaCaseClasses)
    }

    override fun setGeneratePojosAsKotlinDataClasses(pojosAsKotlinDataClasses: Boolean) {
        firstGenerator.setGeneratePojosAsKotlinDataClasses(pojosAsKotlinDataClasses)
        secondGenerator.setGeneratePojosAsKotlinDataClasses(pojosAsKotlinDataClasses)
    }

    override fun setGenerateImmutablePojos(generateImmutablePojos: Boolean) {
        firstGenerator.setGenerateImmutablePojos(generateImmutablePojos)
        secondGenerator.setGenerateImmutablePojos(generateImmutablePojos)
    }

    override fun setGenerateSerializablePojos(generateSerializablePojos: Boolean) {
        firstGenerator.setGenerateSerializablePojos(generateSerializablePojos)
        secondGenerator.setGenerateSerializablePojos(generateSerializablePojos)
    }

    override fun setGenerateInterfaces(generateInterfaces: Boolean) {
        firstGenerator.setGenerateInterfaces(generateInterfaces)
        secondGenerator.setGenerateInterfaces(generateInterfaces)
    }

    override fun setGenerateImmutableInterfaces(generateImmutableInterfaces: Boolean) {
        firstGenerator.setGenerateImmutableInterfaces(generateImmutableInterfaces)
        secondGenerator.setGenerateImmutableInterfaces(generateImmutableInterfaces)
    }

    override fun setGenerateSerializableInterfaces(generateSerializableInterfaces: Boolean) {
        firstGenerator.setGenerateSerializableInterfaces(generateSerializableInterfaces)
        secondGenerator.setGenerateSerializableInterfaces(generateSerializableInterfaces)
    }

    override fun setGenerateDaos(generateDaos: Boolean) {
        firstGenerator.setGenerateDaos(generateDaos)
        secondGenerator.setGenerateDaos(generateDaos)
    }

    override fun setGenerateJooqVersionReference(generateJooqVersionReference: Boolean) {
        firstGenerator.setGenerateJooqVersionReference(generateJooqVersionReference)
        secondGenerator.setGenerateJooqVersionReference(generateJooqVersionReference)
    }

    override fun setGenerateJPAAnnotations(generateJPAAnnotations: Boolean) {
        firstGenerator.setGenerateJPAAnnotations(generateJPAAnnotations)
        secondGenerator.setGenerateJPAAnnotations(generateJPAAnnotations)
    }

    override fun setGenerateJPAVersion(generateJPAVersion: String?) {
        firstGenerator.setGenerateJPAVersion(generateJPAVersion)
        secondGenerator.setGenerateJPAVersion(generateJPAVersion)
    }

    override fun setGenerateValidationAnnotations(generateValidationAnnotations: Boolean) {
        firstGenerator.setGenerateValidationAnnotations(generateValidationAnnotations)
        secondGenerator.setGenerateValidationAnnotations(generateValidationAnnotations)
    }

    override fun setGenerateSpringAnnotations(generateSpringAnnotations: Boolean) {
        firstGenerator.setGenerateSpringAnnotations(generateSpringAnnotations)
        secondGenerator.setGenerateSpringAnnotations(generateSpringAnnotations)
    }

    override fun setGenerateKotlinSetterJvmNameAnnotationsOnIsPrefix(generateKotlinSetterJvmNameAnnotationsOnIsPrefix: Boolean) {
        firstGenerator.setGenerateKotlinSetterJvmNameAnnotationsOnIsPrefix(
            generateKotlinSetterJvmNameAnnotationsOnIsPrefix
        )
        secondGenerator.setGenerateKotlinSetterJvmNameAnnotationsOnIsPrefix(
            generateKotlinSetterJvmNameAnnotationsOnIsPrefix
        )
    }

    override fun setGenerateGeneratedSerialVersionUID(generatedSerialVersionUID: GeneratedSerialVersionUID?) {
        firstGenerator.setGenerateGeneratedSerialVersionUID(generatedSerialVersionUID)
        secondGenerator.setGenerateGeneratedSerialVersionUID(generatedSerialVersionUID)
    }

    override fun setMaxMembersPerInitialiser(maxMembersPerInitialiser: Int) {
        firstGenerator.setMaxMembersPerInitialiser(maxMembersPerInitialiser)
        secondGenerator.setMaxMembersPerInitialiser(maxMembersPerInitialiser)
    }

    override fun setGenerateGlobalObjectReferences(generateGlobalObjectReferences: Boolean) {
        firstGenerator.setGenerateGlobalObjectReferences(generateGlobalObjectReferences)
        secondGenerator.setGenerateGlobalObjectReferences(generateGlobalObjectReferences)
    }

    override fun setGenerateGlobalCatalogReferences(globalCatalogReferences: Boolean) {
        firstGenerator.setGenerateGlobalCatalogReferences(globalCatalogReferences)
        secondGenerator.setGenerateGlobalCatalogReferences(globalCatalogReferences)
    }

    override fun setGenerateGlobalSchemaReferences(globalSchemaReferences: Boolean) {
        firstGenerator.setGenerateGlobalSchemaReferences(globalSchemaReferences)
        secondGenerator.setGenerateGlobalSchemaReferences(globalSchemaReferences)
    }

    override fun setGenerateGlobalRoutineReferences(globalRoutineReferences: Boolean) {
        firstGenerator.setGenerateGlobalRoutineReferences(globalRoutineReferences)
        secondGenerator.setGenerateGlobalRoutineReferences(globalRoutineReferences)
    }

    override fun setGenerateGlobalSequenceReferences(globalSequenceReferences: Boolean) {
        firstGenerator.setGenerateGlobalSequenceReferences(globalSequenceReferences)
        secondGenerator.setGenerateGlobalSequenceReferences(globalSequenceReferences)
    }

    override fun setGenerateGlobalTableReferences(globalTableReferences: Boolean) {
        firstGenerator.setGenerateGlobalTableReferences(globalTableReferences)
        secondGenerator.setGenerateGlobalTableReferences(globalTableReferences)
    }

    override fun setGenerateGlobalUDTReferences(globalUDTReferences: Boolean) {
        firstGenerator.setGenerateGlobalUDTReferences(globalUDTReferences)
        secondGenerator.setGenerateGlobalUDTReferences(globalUDTReferences)
    }

    override fun setGenerateGlobalDomainReferences(globalDomainReferences: Boolean) {
        firstGenerator.setGenerateGlobalDomainReferences(globalDomainReferences)
        secondGenerator.setGenerateGlobalDomainReferences(globalDomainReferences)
    }

    override fun setGenerateGlobalQueueReferences(globalQueueReferences: Boolean) {
        firstGenerator.setGenerateGlobalQueueReferences(globalQueueReferences)
        secondGenerator.setGenerateGlobalQueueReferences(globalQueueReferences)
    }

    override fun setGenerateGlobalLinkReferences(globalLinkReferences: Boolean) {
        firstGenerator.setGenerateGlobalLinkReferences(globalLinkReferences)
        secondGenerator.setGenerateGlobalLinkReferences(globalLinkReferences)
    }

    override fun setGenerateGlobalKeyReferences(globalKeyReferences: Boolean) {
        firstGenerator.setGenerateGlobalKeyReferences(globalKeyReferences)
        secondGenerator.setGenerateGlobalKeyReferences(globalKeyReferences)
    }

    override fun setGenerateGlobalIndexReferences(globalIndexReferences: Boolean) {
        firstGenerator.setGenerateGlobalIndexReferences(globalIndexReferences)
        secondGenerator.setGenerateGlobalIndexReferences(globalIndexReferences)
    }

    override fun setGenerateJavadoc(javadoc: Boolean) {
        firstGenerator.setGenerateJavadoc(javadoc)
        secondGenerator.setGenerateJavadoc(javadoc)
    }

    override fun setGenerateComments(comments: Boolean) {
        firstGenerator.setGenerateComments(comments)
        secondGenerator.setGenerateComments(comments)
    }

    override fun setGenerateCommentsOnAttributes(commentsOnAttributes: Boolean) {
        firstGenerator.setGenerateCommentsOnAttributes(commentsOnAttributes)
        secondGenerator.setGenerateCommentsOnAttributes(commentsOnAttributes)
    }

    override fun setGenerateCommentsOnCatalogs(commentsOnCatalogs: Boolean) {
        firstGenerator.setGenerateCommentsOnCatalogs(commentsOnCatalogs)
        secondGenerator.setGenerateCommentsOnCatalogs(commentsOnCatalogs)
    }

    override fun setGenerateCommentsOnColumns(commentsOnColumns: Boolean) {
        firstGenerator.setGenerateCommentsOnColumns(commentsOnColumns)
        secondGenerator.setGenerateCommentsOnColumns(commentsOnColumns)
    }

    override fun setGenerateCommentsOnKeys(commentsOnKeys: Boolean) {
        firstGenerator.setGenerateCommentsOnKeys(commentsOnKeys)
        secondGenerator.setGenerateCommentsOnKeys(commentsOnKeys)
    }

    override fun setGenerateCommentsOnLinks(commentsOnLinks: Boolean) {
        firstGenerator.setGenerateCommentsOnLinks(commentsOnLinks)
        secondGenerator.setGenerateCommentsOnLinks(commentsOnLinks)
    }

    override fun setGenerateCommentsOnPackages(commentsOnPackages: Boolean) {
        firstGenerator.setGenerateCommentsOnPackages(commentsOnPackages)
        secondGenerator.setGenerateCommentsOnPackages(commentsOnPackages)
    }

    override fun setGenerateCommentsOnParameters(commentsOnParameters: Boolean) {
        firstGenerator.setGenerateCommentsOnParameters(commentsOnParameters)
        secondGenerator.setGenerateCommentsOnParameters(commentsOnParameters)
    }

    override fun setGenerateCommentsOnQueues(commentsOnQueues: Boolean) {
        firstGenerator.setGenerateCommentsOnQueues(commentsOnQueues)
        secondGenerator.setGenerateCommentsOnQueues(commentsOnQueues)
    }

    override fun setGenerateCommentsOnRoutines(commentsOnRoutines: Boolean) {
        firstGenerator.setGenerateCommentsOnRoutines(commentsOnRoutines)
        secondGenerator.setGenerateCommentsOnRoutines(commentsOnRoutines)
    }

    override fun setGenerateCommentsOnSchemas(commentsOnSchemas: Boolean) {
        firstGenerator.setGenerateCommentsOnSchemas(commentsOnSchemas)
        secondGenerator.setGenerateCommentsOnSchemas(commentsOnSchemas)
    }

    override fun setGenerateCommentsOnSequences(commentsOnSequences: Boolean) {
        firstGenerator.setGenerateCommentsOnSequences(commentsOnSequences)
        secondGenerator.setGenerateCommentsOnSequences(commentsOnSequences)
    }

    override fun setGenerateCommentsOnTables(commentsOnTables: Boolean) {
        firstGenerator.setGenerateCommentsOnTables(commentsOnTables)
        secondGenerator.setGenerateCommentsOnTables(commentsOnTables)
    }

    override fun setGenerateCommentsOnEmbeddables(commentsOnEmbeddables: Boolean) {
        firstGenerator.setGenerateCommentsOnEmbeddables(commentsOnEmbeddables)
        secondGenerator.setGenerateCommentsOnEmbeddables(commentsOnEmbeddables)
    }

    override fun setGenerateCommentsOnUDTs(commentsOnUDTs: Boolean) {
        firstGenerator.setGenerateCommentsOnUDTs(commentsOnUDTs)
        secondGenerator.setGenerateCommentsOnUDTs(commentsOnUDTs)
    }

    override fun setGenerateSources(sourcesOnViews: Boolean) {
        firstGenerator.setGenerateSources(sourcesOnViews)
        secondGenerator.setGenerateSources(sourcesOnViews)
    }

    override fun setGenerateSourcesOnViews(sourcesOnViews: Boolean) {
        firstGenerator.setGenerateSourcesOnViews(sourcesOnViews)
        secondGenerator.setGenerateSourcesOnViews(sourcesOnViews)
    }

    override fun setGenerateQueues(queues: Boolean) {
        firstGenerator.setGenerateQueues(queues)
        secondGenerator.setGenerateQueues(queues)
    }

    override fun setGenerateLinks(links: Boolean) {
        firstGenerator.setGenerateLinks(links)
        secondGenerator.setGenerateLinks(links)
    }

    override fun setGenerateKeys(keys: Boolean) {
        firstGenerator.setGenerateKeys(keys)
        secondGenerator.setGenerateKeys(keys)
    }

    override fun setFluentSetters(fluentSetters: Boolean) {
        firstGenerator.setFluentSetters(fluentSetters)
        secondGenerator.setFluentSetters(fluentSetters)
    }

    override fun setGenerateFluentSetters(fluentSetters: Boolean) {
        firstGenerator.setGenerateFluentSetters(fluentSetters)
        secondGenerator.setGenerateFluentSetters(fluentSetters)
    }

    override fun setGenerateJavaBeansGettersAndSetters(javaBeansGettersAndSetters: Boolean) {
        firstGenerator.setGenerateJavaBeansGettersAndSetters(javaBeansGettersAndSetters)
        secondGenerator.setGenerateJavaBeansGettersAndSetters(javaBeansGettersAndSetters)
    }

    override fun setGenerateVarargsSetters(varargsSetters: Boolean) {
        firstGenerator.setGenerateVarargsSetters(varargsSetters)
        secondGenerator.setGenerateVarargsSetters(varargsSetters)
    }

    override fun setGeneratePojosEqualsAndHashCode(generatePojosEqualsAndHashCode: Boolean) {
        firstGenerator.setGeneratePojosEqualsAndHashCode(generatePojosEqualsAndHashCode)
        secondGenerator.setGeneratePojosEqualsAndHashCode(generatePojosEqualsAndHashCode)
    }

    override fun setGeneratePojosToString(generatePojosToString: Boolean) {
        firstGenerator.setGeneratePojosToString(generatePojosToString)
        secondGenerator.setGeneratePojosToString(generatePojosToString)
    }

    override fun setFullyQualifiedTypes(fullyQualifiedTypes: String?) {
        firstGenerator.setFullyQualifiedTypes(fullyQualifiedTypes)
        secondGenerator.setFullyQualifiedTypes(fullyQualifiedTypes)
    }

    override fun setGenerateFullyQualifiedTypes(generateFullyQualifiedTypes: String?) {
        firstGenerator.setGenerateFullyQualifiedTypes(generateFullyQualifiedTypes)
        secondGenerator.setGenerateFullyQualifiedTypes(generateFullyQualifiedTypes)
    }

    override fun setGenerateJavaTimeTypes(generateJavaTimeTypes: Boolean) {
        firstGenerator.setGenerateJavaTimeTypes(generateJavaTimeTypes)
        secondGenerator.setGenerateJavaTimeTypes(generateJavaTimeTypes)
    }

    override fun setGenerateSpatialTypes(generateSpatialTypes: Boolean) {
        firstGenerator.setGenerateSpatialTypes(generateSpatialTypes)
        secondGenerator.setGenerateSpatialTypes(generateSpatialTypes)
    }

    override fun setGenerateXmlTypes(generateXmlTypes: Boolean) {
        firstGenerator.setGenerateXmlTypes(generateXmlTypes)
        secondGenerator.setGenerateXmlTypes(generateXmlTypes)
    }

    override fun setGenerateJsonTypes(generateJsonTypes: Boolean) {
        firstGenerator.setGenerateJsonTypes(generateJsonTypes)
        secondGenerator.setGenerateJsonTypes(generateJsonTypes)
    }

    override fun setGenerateIntervalTypes(generateJsonTypes: Boolean) {
        firstGenerator.setGenerateIntervalTypes(generateJsonTypes)
        secondGenerator.setGenerateIntervalTypes(generateJsonTypes)
    }

    override fun setGenerateEmptyCatalogs(generateEmptyCatalogs: Boolean) {
        firstGenerator.setGenerateEmptyCatalogs(generateEmptyCatalogs)
        secondGenerator.setGenerateEmptyCatalogs(generateEmptyCatalogs)
    }

    override fun setGenerateEmptySchemas(generateEmptySchemas: Boolean) {
        firstGenerator.setGenerateEmptySchemas(generateEmptySchemas)
        secondGenerator.setGenerateEmptySchemas(generateEmptySchemas)
    }

    override fun setGenerateNewline(newline: String?) {
        firstGenerator.setGenerateNewline(newline)
        secondGenerator.setGenerateNewline(newline)
    }

    override fun setGenerateIndentation(indentation: String?) {
        firstGenerator.setGenerateIndentation(indentation)
        secondGenerator.setGenerateIndentation(indentation)
    }

    override fun setGeneratePrintMarginForBlockComment(printMarginForBlockComment: Int) {
        firstGenerator.setGeneratePrintMarginForBlockComment(printMarginForBlockComment)
        secondGenerator.setGeneratePrintMarginForBlockComment(printMarginForBlockComment)
    }

    override fun setTargetDirectory(directory: String?) {
        firstGenerator.setTargetDirectory(directory)
        secondGenerator.setTargetDirectory(directory)
    }

    override fun setTargetEncoding(encoding: String?) {
        firstGenerator.setTargetEncoding(encoding)
        secondGenerator.setTargetEncoding(encoding)
    }

    override fun setTargetPackage(packageName: String?) {
        firstGenerator.setTargetPackage(packageName)
        secondGenerator.setTargetPackage(packageName)
    }

    override fun setTargetClean(clean: Boolean) {
        firstGenerator.setTargetClean(clean)
        secondGenerator.setTargetClean(clean)
    }

    override fun setTargetLocale(targetLocale: Locale?) {
        firstGenerator.setTargetLocale(targetLocale)
        secondGenerator.setTargetLocale(targetLocale)
    }
}
