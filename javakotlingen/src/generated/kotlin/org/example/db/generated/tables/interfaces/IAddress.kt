/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.interfaces


import java.io.Serializable
import java.time.OffsetDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
interface IAddress : Serializable {
    val addressId: Int?
    val address: String?
    val address2: String?
    val district: String?
    val cityId: Int?
    val postalCode: String?
    val phone: String?
    val lastUpdate: OffsetDateTime?
}
