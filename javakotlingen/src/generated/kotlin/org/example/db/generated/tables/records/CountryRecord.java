/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import java.time.OffsetDateTime;

import org.example.db.generated.tables.Country;
import org.example.db.generated.tables.interfaces.ICountry;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record3<Integer, String, OffsetDateTime>, ICountry {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.country.country_id</code>.
     */
    public void setCountryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.country.country_id</code>.
     */
    @Override
    public Integer getCountryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.country.country</code>.
     */
    public void setCountry(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.country.country</code>.
     */
    @Override
    public String getCountry() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.country.last_update</code>.
     */
    public void setLastUpdate(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.country.last_update</code>.
     */
    @Override
    public OffsetDateTime getLastUpdate() {
        return (OffsetDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, OffsetDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Country.COUNTRY.COUNTRY_ID;
    }

    @Override
    public Field<String> field2() {
        return Country.COUNTRY.COUNTRY_;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return Country.COUNTRY.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getCountryId();
    }

    @Override
    public String component2() {
        return getCountry();
    }

    @Override
    public OffsetDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getCountryId();
    }

    @Override
    public String value2() {
        return getCountry();
    }

    @Override
    public OffsetDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public CountryRecord value1(Integer value) {
        setCountryId(value);
        return this;
    }

    @Override
    public CountryRecord value2(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public CountryRecord value3(OffsetDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public CountryRecord values(Integer value1, String value2, OffsetDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(ICountry from) {
        setCountryId(from.getCountryId());
        setCountry(from.getCountry());
        setLastUpdate(from.getLastUpdate());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(Integer countryId, String country, OffsetDateTime lastUpdate) {
        super(Country.COUNTRY);

        setCountryId(countryId);
        setCountry(country);
        setLastUpdate(lastUpdate);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(org.example.db.generated.tables.pojos.Country value) {
        super(Country.COUNTRY);

        if (value != null) {
            setCountryId(value.getCountryId());
            setCountry(value.getCountry());
            setLastUpdate(value.getLastUpdate());
        }
    }
}
