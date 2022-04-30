package org.jooq.codegen

/**
 * A [JavaGenerator] that can't close [JavaWriter]s
 *
 * This exists so a generator (call it the secondary generator) can be relied on purely for its behaviour and not
 * write anything out, letting another generator (let's call it the primary generator) do the writing.
 *
 * If this isn't done then the secondary generator could write out a file which would affect the result of the
 * modified files count in the primary generator
 */
class PowerlessJavaGenerator(language: Language) : JavaGenerator(language) {
    override fun closeJavaWriter(out: JavaWriter?) {
    }
}
