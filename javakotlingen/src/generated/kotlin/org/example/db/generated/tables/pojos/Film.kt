/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.pojos


import java.math.BigDecimal
import java.time.OffsetDateTime
import java.util.Arrays

import org.example.db.generated.enums.MpaaRating
import org.example.db.generated.tables.interfaces.IFilm


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Film(
    override val filmId: Int? = null,
    override val title: String? = null,
    override val description: String? = null,
    override val releaseYear: Int? = null,
    override val languageId: Int? = null,
    override val originalLanguageId: Int? = null,
    override val rentalDuration: Short? = null,
    override val rentalRate: BigDecimal? = null,
    override val length: Short? = null,
    override val replacementCost: BigDecimal? = null,
    override val rating: MpaaRating? = null,
    override val lastUpdate: OffsetDateTime? = null,
    override val specialFeatures: Array<String?>? = null,
    override val fulltext: Any? = null
): IFilm {

    override fun toString(): String {
        val sb = StringBuilder("Film (")

        sb.append(filmId)
        sb.append(", ").append(title)
        sb.append(", ").append(description)
        sb.append(", ").append(releaseYear)
        sb.append(", ").append(languageId)
        sb.append(", ").append(originalLanguageId)
        sb.append(", ").append(rentalDuration)
        sb.append(", ").append(rentalRate)
        sb.append(", ").append(length)
        sb.append(", ").append(replacementCost)
        sb.append(", ").append(rating)
        sb.append(", ").append(lastUpdate)
        sb.append(", ").append(Arrays.toString(specialFeatures))
        sb.append(", ").append(fulltext)

        sb.append(")")
        return sb.toString()
    }
}
