/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables


import java.time.LocalDateTime

import kotlin.collections.List

import org.example.db.generated.Public
import org.example.db.generated.indexes.IDX_FK_INVENTORY_ID
import org.example.db.generated.indexes.IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID
import org.example.db.generated.keys.RENTAL_PKEY
import org.example.db.generated.keys.RENTAL__RENTAL_CUSTOMER_ID_FKEY
import org.example.db.generated.keys.RENTAL__RENTAL_INVENTORY_ID_FKEY
import org.example.db.generated.keys.RENTAL__RENTAL_STAFF_ID_KEY
import org.example.db.generated.tables.records.RentalRecord
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row7
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Rental(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, RentalRecord>?,
    aliased: Table<RentalRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<RentalRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.rental</code>
         */
        val RENTAL: Rental = Rental()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RentalRecord> = RentalRecord::class.java

    /**
     * The column <code>public.rental.rental_id</code>.
     */
    val RENTAL_ID: TableField<RentalRecord, Int?> = createField(DSL.name("rental_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.rental.rental_date</code>.
     */
    val RENTAL_DATE: TableField<RentalRecord, LocalDateTime?> = createField(DSL.name("rental_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column <code>public.rental.inventory_id</code>.
     */
    val INVENTORY_ID: TableField<RentalRecord, Int?> = createField(DSL.name("inventory_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.rental.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<RentalRecord, Short?> = createField(DSL.name("customer_id"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>public.rental.return_date</code>.
     */
    val RETURN_DATE: TableField<RentalRecord, LocalDateTime?> = createField(DSL.name("return_date"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>public.rental.staff_id</code>.
     */
    val STAFF_ID: TableField<RentalRecord, Short?> = createField(DSL.name("staff_id"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>public.rental.last_update</code>.
     */
    val LAST_UPDATE: TableField<RentalRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<RentalRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<RentalRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.rental</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.rental</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.rental</code> table reference
     */
    constructor(): this(DSL.name("rental"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, RentalRecord>): this(Internal.createPathAlias(child, key), child, key, RENTAL, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(IDX_FK_INVENTORY_ID, IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID)
    override fun getIdentity(): Identity<RentalRecord, Int?> = super.getIdentity() as Identity<RentalRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<RentalRecord> = RENTAL_PKEY
    override fun getReferences(): List<ForeignKey<RentalRecord, *>> = listOf(RENTAL__RENTAL_INVENTORY_ID_FKEY, RENTAL__RENTAL_CUSTOMER_ID_FKEY, RENTAL__RENTAL_STAFF_ID_KEY)

    private lateinit var _inventory: Inventory
    private lateinit var _customer: Customer
    private lateinit var _staff: Staff

    /**
     * Get the implicit join path to the <code>public.inventory</code> table.
     */
    fun inventory(): Inventory {
        if (!this::_inventory.isInitialized)
            _inventory = Inventory(this, RENTAL__RENTAL_INVENTORY_ID_FKEY)

        return _inventory;
    }

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    fun customer(): Customer {
        if (!this::_customer.isInitialized)
            _customer = Customer(this, RENTAL__RENTAL_CUSTOMER_ID_FKEY)

        return _customer;
    }

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    fun staff(): Staff {
        if (!this::_staff.isInitialized)
            _staff = Staff(this, RENTAL__RENTAL_STAFF_ID_KEY)

        return _staff;
    }
    override fun `as`(alias: String): Rental = Rental(DSL.name(alias), this)
    override fun `as`(alias: Name): Rental = Rental(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Rental = Rental(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Rental = Rental(name, null)

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<Int?, LocalDateTime?, Int?, Short?, LocalDateTime?, Short?, LocalDateTime?> = super.fieldsRow() as Row7<Int?, LocalDateTime?, Int?, Short?, LocalDateTime?, Short?, LocalDateTime?>
}
