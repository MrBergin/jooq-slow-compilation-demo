/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.interfaces


import java.io.Serializable
import java.math.BigDecimal

import org.example.db.generated.enums.MpaaRating


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
interface IFilmList : Serializable {
    val fid: Int?
    val title: String?
    val description: String?
    val category: String?
    val price: BigDecimal?
    val length: Short?
    val rating: MpaaRating?
    val actors: String?
}
