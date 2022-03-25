/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables;


import java.time.LocalDateTime;
import java.time.LocalTime;

import org.example.db.generated.Keys;
import org.example.db.generated.Public;
import org.example.db.generated.tables.records.CarsStableRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CarsStable extends TableImpl<CarsStableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.cars_stable</code>
     */
    public static final CarsStable CARS_STABLE = new CarsStable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarsStableRecord> getRecordType() {
        return CarsStableRecord.class;
    }

    /**
     * The column <code>public.cars_stable.manufacturer</code>.
     */
    public final TableField<CarsStableRecord, String> MANUFACTURER = createField(DSL.name("manufacturer"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.cars_stable.weight</code>.
     */
    public final TableField<CarsStableRecord, Integer> WEIGHT = createField(DSL.name("weight"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.cars_stable.model</code>.
     */
    public final TableField<CarsStableRecord, String> MODEL = createField(DSL.name("model"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.cars_stable.id</code>.
     */
    public final TableField<CarsStableRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.cars_stable.creation_date</code>.
     */
    public final TableField<CarsStableRecord, LocalDateTime> CREATION_DATE = createField(DSL.name("creation_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.cars_stable.last_usage_time</code>.
     */
    public final TableField<CarsStableRecord, LocalTime> LAST_USAGE_TIME = createField(DSL.name("last_usage_time"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>public.cars_stable.speed</code>.
     */
    public final TableField<CarsStableRecord, Double> SPEED = createField(DSL.name("speed"), SQLDataType.DOUBLE, this, "");

    private CarsStable(Name alias, Table<CarsStableRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarsStable(Name alias, Table<CarsStableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.cars_stable</code> table reference
     */
    public CarsStable(String alias) {
        this(DSL.name(alias), CARS_STABLE);
    }

    /**
     * Create an aliased <code>public.cars_stable</code> table reference
     */
    public CarsStable(Name alias) {
        this(alias, CARS_STABLE);
    }

    /**
     * Create a <code>public.cars_stable</code> table reference
     */
    public CarsStable() {
        this(DSL.name("cars_stable"), null);
    }

    public <O extends Record> CarsStable(Table<O> child, ForeignKey<O, CarsStableRecord> key) {
        super(child, key, CARS_STABLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CarsStableRecord> getPrimaryKey() {
        return Keys.CARS_STABLE_PK;
    }

    @Override
    public CarsStable as(String alias) {
        return new CarsStable(DSL.name(alias), this);
    }

    @Override
    public CarsStable as(Name alias) {
        return new CarsStable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarsStable rename(String name) {
        return new CarsStable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarsStable rename(Name name) {
        return new CarsStable(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, String, Integer, LocalDateTime, LocalTime, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
