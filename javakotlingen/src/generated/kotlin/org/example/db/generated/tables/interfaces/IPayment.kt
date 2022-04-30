/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.interfaces


import java.io.Serializable
import java.math.BigDecimal
import java.time.OffsetDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
interface IPayment : Serializable {
    val paymentId: Int?
    val customerId: Int?
    val staffId: Int?
    val rentalId: Int?
    val amount: BigDecimal?
    val paymentDate: OffsetDateTime?
}
