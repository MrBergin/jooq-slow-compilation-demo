package org.jooq.codegen

import org.jooq.meta.Database
import org.jooq.meta.jaxb.GeneratedAnnotationType
import org.jooq.meta.jaxb.GeneratedSerialVersionUID
import org.jooq.meta.jaxb.VisibilityModifier
import java.util.*

/**
 * A [JavaGenerator] with a secondary [JavaGenerator] as a field. This class is responsible for ensuring that
 * whatever configuration gets applied to this class is also applied to the [secondaryGenerator]
 *
 * The intended use of this class is to enable implementors of the [AggregateJavaGenerator] to override behaviour
 * in the primary [JavaGenerator] with behaviour from the secondary [JavaGenerator], safe in the knowledge that
 * both generators start with the same config (apart from, perhaps, the passed in primary and secondary languages).
 *
 * An example use case would be generating Java code with the [JavaGenerator], but overriding POJOs with an identically
 * configured [KotlinGenerator]
 */
abstract class AggregateJavaGenerator(
    primaryLanguage: Language,
    secondaryLanguage: Language
) : JavaGenerator(primaryLanguage) {
    val secondaryGenerator = PowerlessJavaGenerator(secondaryLanguage)

    override fun generate(db: Database?) {
        //TODO - This line is why we need to place these generators in the org.jooq.codegen package
        secondaryGenerator.database = db
        super.generate(db)
    }

    override fun setStrategy(strategy: GeneratorStrategy?) {
        secondaryGenerator.setStrategy(strategy)
        super.setStrategy(strategy)
    }

    override fun setGenerateDeprecated(generateDeprecated: Boolean) {
        secondaryGenerator.setGenerateDeprecated(generateDeprecated)
        super.setGenerateDeprecated(generateDeprecated)
    }

    override fun setGenerateDeprecationOnUnknownTypes(generateDeprecationOnUnknownTypes: Boolean) {
        secondaryGenerator.setGenerateDeprecationOnUnknownTypes(generateDeprecationOnUnknownTypes)
        super.setGenerateDeprecationOnUnknownTypes(generateDeprecationOnUnknownTypes)
    }

    override fun setGenerateIndexes(generateIndexes: Boolean) {
        secondaryGenerator.setGenerateIndexes(generateIndexes)
        super.setGenerateIndexes(generateIndexes)
    }

    override fun setGenerateRelations(generateRelations: Boolean) {
        secondaryGenerator.setGenerateRelations(generateRelations)
        super.setGenerateRelations(generateRelations)
    }

    override fun setGenerateImplicitJoinPathsToOne(generateImplicitJoinPathsToOne: Boolean) {
        secondaryGenerator.setGenerateImplicitJoinPathsToOne(generateImplicitJoinPathsToOne)
        super.setGenerateImplicitJoinPathsToOne(generateImplicitJoinPathsToOne)
    }

    override fun setGenerateTableValuedFunctions(generateTableValuedFunctions: Boolean) {
        secondaryGenerator.setGenerateTableValuedFunctions(generateTableValuedFunctions)
        super.setGenerateTableValuedFunctions(generateTableValuedFunctions)
    }

    override fun setGenerateInstanceFields(generateInstanceFields: Boolean) {
        secondaryGenerator.setGenerateInstanceFields(generateInstanceFields)
        super.setGenerateInstanceFields(generateInstanceFields)
    }

    override fun setGenerateVisibilityModifier(generateVisibilityModifier: VisibilityModifier?) {
        secondaryGenerator.setGenerateVisibilityModifier(generateVisibilityModifier)
        super.setGenerateVisibilityModifier(generateVisibilityModifier)
    }

    override fun setGenerateGeneratedAnnotation(generateGeneratedAnnotation: Boolean) {
        secondaryGenerator.setGenerateGeneratedAnnotation(generateGeneratedAnnotation)
        super.setGenerateGeneratedAnnotation(generateGeneratedAnnotation)
    }

    override fun setGenerateGeneratedAnnotationType(generateGeneratedAnnotationType: GeneratedAnnotationType?) {
        secondaryGenerator.setGenerateGeneratedAnnotationType(generateGeneratedAnnotationType)
        super.setGenerateGeneratedAnnotationType(generateGeneratedAnnotationType)
    }

    override fun setGenerateGeneratedAnnotationDate(generateGeneratedAnnotationDate: Boolean) {
        secondaryGenerator.setGenerateGeneratedAnnotationDate(generateGeneratedAnnotationDate)
        super.setGenerateGeneratedAnnotationDate(generateGeneratedAnnotationDate)
    }

    override fun setGenerateNonnullAnnotation(generateNonnullAnnotation: Boolean) {
        secondaryGenerator.setGenerateNonnullAnnotation(generateNonnullAnnotation)
        super.setGenerateNonnullAnnotation(generateNonnullAnnotation)
    }

    override fun setGeneratedNonnullAnnotationType(generatedNonnullAnnotationType: String?) {
        secondaryGenerator.setGeneratedNonnullAnnotationType(generatedNonnullAnnotationType)
        super.setGeneratedNonnullAnnotationType(generatedNonnullAnnotationType)
    }

    override fun setGenerateNullableAnnotation(generateNullableAnnotation: Boolean) {
        secondaryGenerator.setGenerateNullableAnnotation(generateNullableAnnotation)
        super.setGenerateNullableAnnotation(generateNullableAnnotation)
    }

    override fun setGeneratedNullableAnnotationType(generatedNullableAnnotationType: String?) {
        secondaryGenerator.setGeneratedNullableAnnotationType(generatedNullableAnnotationType)
        super.setGeneratedNullableAnnotationType(generatedNullableAnnotationType)
    }

    override fun setGenerateConstructorPropertiesAnnotation(generateConstructorPropertiesAnnotation: Boolean) {
        secondaryGenerator.setGenerateConstructorPropertiesAnnotation(generateConstructorPropertiesAnnotation)
        super.setGenerateConstructorPropertiesAnnotation(generateConstructorPropertiesAnnotation)
    }

    override fun setGenerateConstructorPropertiesAnnotationOnPojos(generateConstructorPropertiesAnnotationOnPojos: Boolean) {
        secondaryGenerator.setGenerateConstructorPropertiesAnnotationOnPojos(
            generateConstructorPropertiesAnnotationOnPojos
        )
        super.setGenerateConstructorPropertiesAnnotationOnPojos(generateConstructorPropertiesAnnotationOnPojos)
    }

    override fun setGenerateConstructorPropertiesAnnotationOnRecords(generateConstructorPropertiesAnnotationOnRecords: Boolean) {
        secondaryGenerator.setGenerateConstructorPropertiesAnnotationOnRecords(
            generateConstructorPropertiesAnnotationOnRecords
        )
        super.setGenerateConstructorPropertiesAnnotationOnRecords(generateConstructorPropertiesAnnotationOnRecords)
    }

    override fun setUseSchemaVersionProvider(useSchemaVersionProvider: Boolean) {
        secondaryGenerator.setUseSchemaVersionProvider(useSchemaVersionProvider)
        super.setUseSchemaVersionProvider(useSchemaVersionProvider)
    }

    override fun setUseCatalogVersionProvider(useCatalogVersionProvider: Boolean) {
        secondaryGenerator.setUseCatalogVersionProvider(useCatalogVersionProvider)
        super.setUseCatalogVersionProvider(useCatalogVersionProvider)
    }

    override fun setGenerateRoutines(generateRoutines: Boolean) {
        secondaryGenerator.setGenerateRoutines(generateRoutines)
        super.setGenerateRoutines(generateRoutines)
    }

    override fun setGenerateSequences(generateSequences: Boolean) {
        secondaryGenerator.setGenerateSequences(generateSequences)
        super.setGenerateSequences(generateSequences)
    }

    override fun setGenerateSequenceFlags(generateSequenceFlags: Boolean) {
        secondaryGenerator.setGenerateSequenceFlags(generateSequenceFlags)
        super.setGenerateSequenceFlags(generateSequenceFlags)
    }

    override fun setGenerateUDTs(generateUDTs: Boolean) {
        secondaryGenerator.setGenerateUDTs(generateUDTs)
        super.setGenerateUDTs(generateUDTs)
    }

    override fun setGenerateTables(generateTables: Boolean) {
        secondaryGenerator.setGenerateTables(generateTables)
        super.setGenerateTables(generateTables)
    }

    override fun setGenerateEmbeddables(generateEmbeddables: Boolean) {
        secondaryGenerator.setGenerateEmbeddables(generateEmbeddables)
        super.setGenerateEmbeddables(generateEmbeddables)
    }

    override fun setGenerateRecords(generateRecords: Boolean) {
        secondaryGenerator.setGenerateRecords(generateRecords)
        super.setGenerateRecords(generateRecords)
    }

    override fun setGenerateRecordsImplementingRecordN(generateRecordsImplementingRecordN: Boolean) {
        secondaryGenerator.setGenerateRecordsImplementingRecordN(generateRecordsImplementingRecordN)
        super.setGenerateRecordsImplementingRecordN(generateRecordsImplementingRecordN)
    }

    override fun setGenerateEnumsAsScalaSealedTraits(generateEnumsAsScalaSealedTraits: Boolean) {
        secondaryGenerator.setGenerateEnumsAsScalaSealedTraits(generateEnumsAsScalaSealedTraits)
        super.setGenerateEnumsAsScalaSealedTraits(generateEnumsAsScalaSealedTraits)
    }

    override fun setGeneratePojos(generatePojos: Boolean) {
        secondaryGenerator.setGeneratePojos(generatePojos)
        super.setGeneratePojos(generatePojos)
    }

    override fun setGeneratePojosAsJavaRecordClasses(pojosAsJavaRecordClasses: Boolean) {
        secondaryGenerator.setGeneratePojosAsJavaRecordClasses(pojosAsJavaRecordClasses)
        super.setGeneratePojosAsJavaRecordClasses(pojosAsJavaRecordClasses)
    }

    override fun setGeneratePojosAsScalaCaseClasses(pojosAsScalaCaseClasses: Boolean) {
        secondaryGenerator.setGeneratePojosAsScalaCaseClasses(pojosAsScalaCaseClasses)
        super.setGeneratePojosAsScalaCaseClasses(pojosAsScalaCaseClasses)
    }

    override fun setGeneratePojosAsKotlinDataClasses(pojosAsKotlinDataClasses: Boolean) {
        secondaryGenerator.setGeneratePojosAsKotlinDataClasses(pojosAsKotlinDataClasses)
        super.setGeneratePojosAsKotlinDataClasses(pojosAsKotlinDataClasses)
    }

    override fun setGenerateImmutablePojos(generateImmutablePojos: Boolean) {
        secondaryGenerator.setGenerateImmutablePojos(generateImmutablePojos)
        super.setGenerateImmutablePojos(generateImmutablePojos)
    }

    override fun setGenerateSerializablePojos(generateSerializablePojos: Boolean) {
        secondaryGenerator.setGenerateSerializablePojos(generateSerializablePojos)
        super.setGenerateSerializablePojos(generateSerializablePojos)
    }

    override fun setGenerateInterfaces(generateInterfaces: Boolean) {
        secondaryGenerator.setGenerateInterfaces(generateInterfaces)
        super.setGenerateInterfaces(generateInterfaces)
    }

    override fun setGenerateImmutableInterfaces(generateImmutableInterfaces: Boolean) {
        secondaryGenerator.setGenerateImmutableInterfaces(generateImmutableInterfaces)
        super.setGenerateImmutableInterfaces(generateImmutableInterfaces)
    }

    override fun setGenerateSerializableInterfaces(generateSerializableInterfaces: Boolean) {
        secondaryGenerator.setGenerateSerializableInterfaces(generateSerializableInterfaces)
        super.setGenerateSerializableInterfaces(generateSerializableInterfaces)
    }

    override fun setGenerateDaos(generateDaos: Boolean) {
        secondaryGenerator.setGenerateDaos(generateDaos)
        super.setGenerateDaos(generateDaos)
    }

    override fun setGenerateJooqVersionReference(generateJooqVersionReference: Boolean) {
        secondaryGenerator.setGenerateJooqVersionReference(generateJooqVersionReference)
        super.setGenerateJooqVersionReference(generateJooqVersionReference)
    }

    override fun setGenerateJPAAnnotations(generateJPAAnnotations: Boolean) {
        secondaryGenerator.setGenerateJPAAnnotations(generateJPAAnnotations)
        super.setGenerateJPAAnnotations(generateJPAAnnotations)
    }

    override fun setGenerateJPAVersion(generateJPAVersion: String?) {
        secondaryGenerator.setGenerateJPAVersion(generateJPAVersion)
        super.setGenerateJPAVersion(generateJPAVersion)
    }

    override fun setGenerateValidationAnnotations(generateValidationAnnotations: Boolean) {
        secondaryGenerator.setGenerateValidationAnnotations(generateValidationAnnotations)
        super.setGenerateValidationAnnotations(generateValidationAnnotations)
    }

    override fun setGenerateSpringAnnotations(generateSpringAnnotations: Boolean) {
        secondaryGenerator.setGenerateSpringAnnotations(generateSpringAnnotations)
        super.setGenerateSpringAnnotations(generateSpringAnnotations)
    }

    override fun setGenerateKotlinSetterJvmNameAnnotationsOnIsPrefix(generateKotlinSetterJvmNameAnnotationsOnIsPrefix: Boolean) {
        secondaryGenerator.setGenerateKotlinSetterJvmNameAnnotationsOnIsPrefix(
            generateKotlinSetterJvmNameAnnotationsOnIsPrefix
        )
        super.setGenerateKotlinSetterJvmNameAnnotationsOnIsPrefix(generateKotlinSetterJvmNameAnnotationsOnIsPrefix)
    }

    override fun setGenerateGeneratedSerialVersionUID(generatedSerialVersionUID: GeneratedSerialVersionUID?) {
        secondaryGenerator.setGenerateGeneratedSerialVersionUID(generatedSerialVersionUID)
        super.setGenerateGeneratedSerialVersionUID(generatedSerialVersionUID)
    }

    override fun setMaxMembersPerInitialiser(maxMembersPerInitialiser: Int) {
        secondaryGenerator.setMaxMembersPerInitialiser(maxMembersPerInitialiser)
        super.setMaxMembersPerInitialiser(maxMembersPerInitialiser)
    }

    override fun setGenerateGlobalObjectReferences(generateGlobalObjectReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalObjectReferences(generateGlobalObjectReferences)
        super.setGenerateGlobalObjectReferences(generateGlobalObjectReferences)
    }

    override fun setGenerateGlobalCatalogReferences(globalCatalogReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalCatalogReferences(globalCatalogReferences)
        super.setGenerateGlobalCatalogReferences(globalCatalogReferences)
    }

    override fun setGenerateGlobalSchemaReferences(globalSchemaReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalSchemaReferences(globalSchemaReferences)
        super.setGenerateGlobalSchemaReferences(globalSchemaReferences)
    }

    override fun setGenerateGlobalRoutineReferences(globalRoutineReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalRoutineReferences(globalRoutineReferences)
        super.setGenerateGlobalRoutineReferences(globalRoutineReferences)
    }

    override fun setGenerateGlobalSequenceReferences(globalSequenceReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalSequenceReferences(globalSequenceReferences)
        super.setGenerateGlobalSequenceReferences(globalSequenceReferences)
    }

    override fun setGenerateGlobalTableReferences(globalTableReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalTableReferences(globalTableReferences)
        super.setGenerateGlobalTableReferences(globalTableReferences)
    }

    override fun setGenerateGlobalUDTReferences(globalUDTReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalUDTReferences(globalUDTReferences)
        super.setGenerateGlobalUDTReferences(globalUDTReferences)
    }

    override fun setGenerateGlobalDomainReferences(globalDomainReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalDomainReferences(globalDomainReferences)
        super.setGenerateGlobalDomainReferences(globalDomainReferences)
    }

    override fun setGenerateGlobalQueueReferences(globalQueueReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalQueueReferences(globalQueueReferences)
        super.setGenerateGlobalQueueReferences(globalQueueReferences)
    }

    override fun setGenerateGlobalLinkReferences(globalLinkReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalLinkReferences(globalLinkReferences)
        super.setGenerateGlobalLinkReferences(globalLinkReferences)
    }

    override fun setGenerateGlobalKeyReferences(globalKeyReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalKeyReferences(globalKeyReferences)
        super.setGenerateGlobalKeyReferences(globalKeyReferences)
    }

    override fun setGenerateGlobalIndexReferences(globalIndexReferences: Boolean) {
        secondaryGenerator.setGenerateGlobalIndexReferences(globalIndexReferences)
        super.setGenerateGlobalIndexReferences(globalIndexReferences)
    }

    override fun setGenerateJavadoc(javadoc: Boolean) {
        secondaryGenerator.setGenerateJavadoc(javadoc)
        super.setGenerateJavadoc(javadoc)
    }

    override fun setGenerateComments(comments: Boolean) {
        secondaryGenerator.setGenerateComments(comments)
        super.setGenerateComments(comments)
    }

    override fun setGenerateCommentsOnAttributes(commentsOnAttributes: Boolean) {
        secondaryGenerator.setGenerateCommentsOnAttributes(commentsOnAttributes)
        super.setGenerateCommentsOnAttributes(commentsOnAttributes)
    }

    override fun setGenerateCommentsOnCatalogs(commentsOnCatalogs: Boolean) {
        secondaryGenerator.setGenerateCommentsOnCatalogs(commentsOnCatalogs)
        super.setGenerateCommentsOnCatalogs(commentsOnCatalogs)
    }

    override fun setGenerateCommentsOnColumns(commentsOnColumns: Boolean) {
        secondaryGenerator.setGenerateCommentsOnColumns(commentsOnColumns)
        super.setGenerateCommentsOnColumns(commentsOnColumns)
    }

    override fun setGenerateCommentsOnKeys(commentsOnKeys: Boolean) {
        secondaryGenerator.setGenerateCommentsOnKeys(commentsOnKeys)
        super.setGenerateCommentsOnKeys(commentsOnKeys)
    }

    override fun setGenerateCommentsOnLinks(commentsOnLinks: Boolean) {
        secondaryGenerator.setGenerateCommentsOnLinks(commentsOnLinks)
        super.setGenerateCommentsOnLinks(commentsOnLinks)
    }

    override fun setGenerateCommentsOnPackages(commentsOnPackages: Boolean) {
        secondaryGenerator.setGenerateCommentsOnPackages(commentsOnPackages)
        super.setGenerateCommentsOnPackages(commentsOnPackages)
    }

    override fun setGenerateCommentsOnParameters(commentsOnParameters: Boolean) {
        secondaryGenerator.setGenerateCommentsOnParameters(commentsOnParameters)
        super.setGenerateCommentsOnParameters(commentsOnParameters)
    }

    override fun setGenerateCommentsOnQueues(commentsOnQueues: Boolean) {
        secondaryGenerator.setGenerateCommentsOnQueues(commentsOnQueues)
        super.setGenerateCommentsOnQueues(commentsOnQueues)
    }

    override fun setGenerateCommentsOnRoutines(commentsOnRoutines: Boolean) {
        secondaryGenerator.setGenerateCommentsOnRoutines(commentsOnRoutines)
        super.setGenerateCommentsOnRoutines(commentsOnRoutines)
    }

    override fun setGenerateCommentsOnSchemas(commentsOnSchemas: Boolean) {
        secondaryGenerator.setGenerateCommentsOnSchemas(commentsOnSchemas)
        super.setGenerateCommentsOnSchemas(commentsOnSchemas)
    }

    override fun setGenerateCommentsOnSequences(commentsOnSequences: Boolean) {
        secondaryGenerator.setGenerateCommentsOnSequences(commentsOnSequences)
        super.setGenerateCommentsOnSequences(commentsOnSequences)
    }

    override fun setGenerateCommentsOnTables(commentsOnTables: Boolean) {
        secondaryGenerator.setGenerateCommentsOnTables(commentsOnTables)
        super.setGenerateCommentsOnTables(commentsOnTables)
    }

    override fun setGenerateCommentsOnEmbeddables(commentsOnEmbeddables: Boolean) {
        secondaryGenerator.setGenerateCommentsOnEmbeddables(commentsOnEmbeddables)
        super.setGenerateCommentsOnEmbeddables(commentsOnEmbeddables)
    }

    override fun setGenerateCommentsOnUDTs(commentsOnUDTs: Boolean) {
        secondaryGenerator.setGenerateCommentsOnUDTs(commentsOnUDTs)
        super.setGenerateCommentsOnUDTs(commentsOnUDTs)
    }

    override fun setGenerateSources(sourcesOnViews: Boolean) {
        secondaryGenerator.setGenerateSources(sourcesOnViews)
        super.setGenerateSources(sourcesOnViews)
    }

    override fun setGenerateSourcesOnViews(sourcesOnViews: Boolean) {
        secondaryGenerator.setGenerateSourcesOnViews(sourcesOnViews)
        super.setGenerateSourcesOnViews(sourcesOnViews)
    }

    override fun setGenerateQueues(queues: Boolean) {
        secondaryGenerator.setGenerateQueues(queues)
        super.setGenerateQueues(queues)
    }

    override fun setGenerateLinks(links: Boolean) {
        secondaryGenerator.setGenerateLinks(links)
        super.setGenerateLinks(links)
    }

    override fun setGenerateKeys(keys: Boolean) {
        secondaryGenerator.setGenerateKeys(keys)
        super.setGenerateKeys(keys)
    }

    override fun setFluentSetters(fluentSetters: Boolean) {
        secondaryGenerator.setFluentSetters(fluentSetters)
        super.setFluentSetters(fluentSetters)
    }

    override fun setGenerateFluentSetters(fluentSetters: Boolean) {
        secondaryGenerator.setGenerateFluentSetters(fluentSetters)
        super.setGenerateFluentSetters(fluentSetters)
    }

    override fun setGenerateJavaBeansGettersAndSetters(javaBeansGettersAndSetters: Boolean) {
        secondaryGenerator.setGenerateJavaBeansGettersAndSetters(javaBeansGettersAndSetters)
        super.setGenerateJavaBeansGettersAndSetters(javaBeansGettersAndSetters)
    }

    override fun setGenerateVarargsSetters(varargsSetters: Boolean) {
        secondaryGenerator.setGenerateVarargsSetters(varargsSetters)
        super.setGenerateVarargsSetters(varargsSetters)
    }

    override fun setGeneratePojosEqualsAndHashCode(generatePojosEqualsAndHashCode: Boolean) {
        secondaryGenerator.setGeneratePojosEqualsAndHashCode(generatePojosEqualsAndHashCode)
        super.setGeneratePojosEqualsAndHashCode(generatePojosEqualsAndHashCode)
    }

    override fun setGeneratePojosToString(generatePojosToString: Boolean) {
        secondaryGenerator.setGeneratePojosToString(generatePojosToString)
        super.setGeneratePojosToString(generatePojosToString)
    }

    override fun setFullyQualifiedTypes(fullyQualifiedTypes: String?) {
        secondaryGenerator.setFullyQualifiedTypes(fullyQualifiedTypes)
        super.setFullyQualifiedTypes(fullyQualifiedTypes)
    }

    override fun setGenerateFullyQualifiedTypes(generateFullyQualifiedTypes: String?) {
        secondaryGenerator.setGenerateFullyQualifiedTypes(generateFullyQualifiedTypes)
        super.setGenerateFullyQualifiedTypes(generateFullyQualifiedTypes)
    }

    override fun setGenerateJavaTimeTypes(generateJavaTimeTypes: Boolean) {
        secondaryGenerator.setGenerateJavaTimeTypes(generateJavaTimeTypes)
        super.setGenerateJavaTimeTypes(generateJavaTimeTypes)
    }

    override fun setGenerateSpatialTypes(generateSpatialTypes: Boolean) {
        secondaryGenerator.setGenerateSpatialTypes(generateSpatialTypes)
        super.setGenerateSpatialTypes(generateSpatialTypes)
    }

    override fun setGenerateXmlTypes(generateXmlTypes: Boolean) {
        secondaryGenerator.setGenerateXmlTypes(generateXmlTypes)
        super.setGenerateXmlTypes(generateXmlTypes)
    }

    override fun setGenerateJsonTypes(generateJsonTypes: Boolean) {
        secondaryGenerator.setGenerateJsonTypes(generateJsonTypes)
        super.setGenerateJsonTypes(generateJsonTypes)
    }

    override fun setGenerateIntervalTypes(generateJsonTypes: Boolean) {
        secondaryGenerator.setGenerateIntervalTypes(generateJsonTypes)
        super.setGenerateIntervalTypes(generateJsonTypes)
    }

    override fun setGenerateEmptyCatalogs(generateEmptyCatalogs: Boolean) {
        secondaryGenerator.setGenerateEmptyCatalogs(generateEmptyCatalogs)
        super.setGenerateEmptyCatalogs(generateEmptyCatalogs)
    }

    override fun setGenerateEmptySchemas(generateEmptySchemas: Boolean) {
        secondaryGenerator.setGenerateEmptySchemas(generateEmptySchemas)
        super.setGenerateEmptySchemas(generateEmptySchemas)
    }

    override fun setGenerateNewline(newline: String?) {
        secondaryGenerator.setGenerateNewline(newline)
        super.setGenerateNewline(newline)
    }

    override fun setGenerateIndentation(indentation: String?) {
        secondaryGenerator.setGenerateIndentation(indentation)
        super.setGenerateIndentation(indentation)
    }

    override fun setGeneratePrintMarginForBlockComment(printMarginForBlockComment: Int) {
        secondaryGenerator.setGeneratePrintMarginForBlockComment(printMarginForBlockComment)
        super.setGeneratePrintMarginForBlockComment(printMarginForBlockComment)
    }

    override fun setTargetDirectory(directory: String?) {
        secondaryGenerator.setTargetDirectory(directory)
        super.setTargetDirectory(directory)
    }

    override fun setTargetEncoding(encoding: String?) {
        secondaryGenerator.setTargetEncoding(encoding)
        super.setTargetEncoding(encoding)
    }

    override fun setTargetPackage(packageName: String?) {
        secondaryGenerator.setTargetPackage(packageName)
        super.setTargetPackage(packageName)
    }

    override fun setTargetClean(clean: Boolean) {
        secondaryGenerator.setTargetClean(clean)
        super.setTargetClean(clean)
    }

    override fun setTargetLocale(targetLocale: Locale?) {
        secondaryGenerator.setTargetLocale(targetLocale)
        super.setTargetLocale(targetLocale)
    }
}
