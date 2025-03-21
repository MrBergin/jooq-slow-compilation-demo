/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.pojos


import java.math.BigDecimal

import org.example.db.generated.tables.interfaces.ISalesByStore


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class SalesByStore(
    override val store: String? = null,
    override val manager: String? = null,
    override val totalSales: BigDecimal? = null
): ISalesByStore {

    override fun toString(): String {
        val sb = StringBuilder("SalesByStore (")

        sb.append(store)
        sb.append(", ").append(manager)
        sb.append(", ").append(totalSales)

        sb.append(")")
        return sb.toString()
    }
}
