/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables;


import org.example.db.generated.Public;
import org.example.db.generated.tables.records.CustomerListRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerList extends TableImpl<CustomerListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.customer_list</code>
     */
    public static final CustomerList CUSTOMER_LIST = new CustomerList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerListRecord> getRecordType() {
        return CustomerListRecord.class;
    }

    /**
     * The column <code>public.customer_list.id</code>.
     */
    public final TableField<CustomerListRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.customer_list.name</code>.
     */
    public final TableField<CustomerListRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.address</code>.
     */
    public final TableField<CustomerListRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.zip code</code>.
     */
    public final TableField<CustomerListRecord, String> ZIP_CODE = createField(DSL.name("zip code"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.phone</code>.
     */
    public final TableField<CustomerListRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.city</code>.
     */
    public final TableField<CustomerListRecord, String> CITY = createField(DSL.name("city"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.country</code>.
     */
    public final TableField<CustomerListRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.notes</code>.
     */
    public final TableField<CustomerListRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.sid</code>.
     */
    public final TableField<CustomerListRecord, Integer> SID = createField(DSL.name("sid"), SQLDataType.INTEGER, this, "");

    private CustomerList(Name alias, Table<CustomerListRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerList(Name alias, Table<CustomerListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"customer_list\" as  SELECT cu.customer_id AS id,\n    ((cu.first_name || ' '::text) || cu.last_name) AS name,\n    a.address,\n    a.postal_code AS \"zip code\",\n    a.phone,\n    city.city,\n    country.country,\n        CASE\n            WHEN cu.activebool THEN 'active'::text\n            ELSE ''::text\n        END AS notes,\n    cu.store_id AS sid\n   FROM (((customer cu\n     JOIN address a ON ((cu.address_id = a.address_id)))\n     JOIN city ON ((a.city_id = city.city_id)))\n     JOIN country ON ((city.country_id = country.country_id)));"));
    }

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    public CustomerList(String alias) {
        this(DSL.name(alias), CUSTOMER_LIST);
    }

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    public CustomerList(Name alias) {
        this(alias, CUSTOMER_LIST);
    }

    /**
     * Create a <code>public.customer_list</code> table reference
     */
    public CustomerList() {
        this(DSL.name("customer_list"), null);
    }

    public <O extends Record> CustomerList(Table<O> child, ForeignKey<O, CustomerListRecord> key) {
        super(child, key, CUSTOMER_LIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public CustomerList as(String alias) {
        return new CustomerList(DSL.name(alias), this);
    }

    @Override
    public CustomerList as(Name alias) {
        return new CustomerList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(String name) {
        return new CustomerList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(Name name) {
        return new CustomerList(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
