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
interface IRental : Serializable {
    val rentalId: Int?
    val rentalDate: OffsetDateTime?
    val inventoryId: Int?
    val customerId: Int?
    val returnDate: OffsetDateTime?
    val staffId: Int?
    val lastUpdate: OffsetDateTime?
}
