/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.pojos


import org.example.db.generated.tables.interfaces.IFilmInStock


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class FilmInStock(
    override val pFilmCount: Int? = null
): IFilmInStock {

    override fun toString(): String {
        val sb = StringBuilder("FilmInStock (")

        sb.append(pFilmCount)

        sb.append(")")
        return sb.toString()
    }
}
