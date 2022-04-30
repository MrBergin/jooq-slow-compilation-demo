/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.interfaces


import java.io.Serializable
import java.math.BigDecimal
import java.time.OffsetDateTime

import org.example.db.generated.enums.MpaaRating


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
interface IFilm : Serializable {
    val filmId: Int?
    val title: String?
    val description: String?
    val releaseYear: Int?
    val languageId: Int?
    val originalLanguageId: Int?
    val rentalDuration: Short?
    val rentalRate: BigDecimal?
    val length: Short?
    val replacementCost: BigDecimal?
    val rating: MpaaRating?
    val lastUpdate: OffsetDateTime?
    val specialFeatures: Array<String?>?
    val fulltext: Any?
}
