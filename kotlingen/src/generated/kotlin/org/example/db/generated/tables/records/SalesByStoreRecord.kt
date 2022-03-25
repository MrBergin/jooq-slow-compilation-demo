/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records


import java.math.BigDecimal

import org.example.db.generated.tables.SalesByStore
import org.jooq.Field
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SalesByStoreRecord() : TableRecordImpl<SalesByStoreRecord>(SalesByStore.SALES_BY_STORE), Record3<String?, String?, BigDecimal?> {

    var store: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var manager: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var totalSales: BigDecimal?
        set(value): Unit = set(2, value)
        get(): BigDecimal? = get(2) as BigDecimal?

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<String?, String?, BigDecimal?> = super.fieldsRow() as Row3<String?, String?, BigDecimal?>
    override fun valuesRow(): Row3<String?, String?, BigDecimal?> = super.valuesRow() as Row3<String?, String?, BigDecimal?>
    override fun field1(): Field<String?> = SalesByStore.SALES_BY_STORE.STORE
    override fun field2(): Field<String?> = SalesByStore.SALES_BY_STORE.MANAGER
    override fun field3(): Field<BigDecimal?> = SalesByStore.SALES_BY_STORE.TOTAL_SALES
    override fun component1(): String? = store
    override fun component2(): String? = manager
    override fun component3(): BigDecimal? = totalSales
    override fun value1(): String? = store
    override fun value2(): String? = manager
    override fun value3(): BigDecimal? = totalSales

    override fun value1(value: String?): SalesByStoreRecord {
        this.store = value
        return this
    }

    override fun value2(value: String?): SalesByStoreRecord {
        this.manager = value
        return this
    }

    override fun value3(value: BigDecimal?): SalesByStoreRecord {
        this.totalSales = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: BigDecimal?): SalesByStoreRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised SalesByStoreRecord
     */
    constructor(store: String? = null, manager: String? = null, totalSales: BigDecimal? = null): this() {
        this.store = store
        this.manager = manager
        this.totalSales = totalSales
    }
}
