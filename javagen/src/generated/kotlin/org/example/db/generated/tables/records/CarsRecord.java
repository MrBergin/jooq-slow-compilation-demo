/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import java.time.LocalDateTime;
import java.time.LocalTime;

import org.example.db.generated.tables.Cars;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CarsRecord extends UpdatableRecordImpl<CarsRecord> implements Record7<String, Integer, String, Integer, LocalDateTime, LocalTime, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.cars.manufacturer</code>.
     */
    public void setManufacturer(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.cars.manufacturer</code>.
     */
    public String getManufacturer() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.cars.weight</code>.
     */
    public void setWeight(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.cars.weight</code>.
     */
    public Integer getWeight() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.cars.model</code>.
     */
    public void setModel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.cars.model</code>.
     */
    public String getModel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.cars.id</code>.
     */
    public void setId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.cars.id</code>.
     */
    public Integer getId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.cars.creation_date</code>.
     */
    public void setCreationDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.cars.creation_date</code>.
     */
    public LocalDateTime getCreationDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.cars.last_usage_time</code>.
     */
    public void setLastUsageTime(LocalTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.cars.last_usage_time</code>.
     */
    public LocalTime getLastUsageTime() {
        return (LocalTime) get(5);
    }

    /**
     * Setter for <code>public.cars.speed</code>.
     */
    public void setSpeed(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.cars.speed</code>.
     */
    public Double getSpeed() {
        return (Double) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, String, Integer, LocalDateTime, LocalTime, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, Integer, String, Integer, LocalDateTime, LocalTime, Double> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Cars.CARS.MANUFACTURER;
    }

    @Override
    public Field<Integer> field2() {
        return Cars.CARS.WEIGHT;
    }

    @Override
    public Field<String> field3() {
        return Cars.CARS.MODEL;
    }

    @Override
    public Field<Integer> field4() {
        return Cars.CARS.ID;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Cars.CARS.CREATION_DATE;
    }

    @Override
    public Field<LocalTime> field6() {
        return Cars.CARS.LAST_USAGE_TIME;
    }

    @Override
    public Field<Double> field7() {
        return Cars.CARS.SPEED;
    }

    @Override
    public String component1() {
        return getManufacturer();
    }

    @Override
    public Integer component2() {
        return getWeight();
    }

    @Override
    public String component3() {
        return getModel();
    }

    @Override
    public Integer component4() {
        return getId();
    }

    @Override
    public LocalDateTime component5() {
        return getCreationDate();
    }

    @Override
    public LocalTime component6() {
        return getLastUsageTime();
    }

    @Override
    public Double component7() {
        return getSpeed();
    }

    @Override
    public String value1() {
        return getManufacturer();
    }

    @Override
    public Integer value2() {
        return getWeight();
    }

    @Override
    public String value3() {
        return getModel();
    }

    @Override
    public Integer value4() {
        return getId();
    }

    @Override
    public LocalDateTime value5() {
        return getCreationDate();
    }

    @Override
    public LocalTime value6() {
        return getLastUsageTime();
    }

    @Override
    public Double value7() {
        return getSpeed();
    }

    @Override
    public CarsRecord value1(String value) {
        setManufacturer(value);
        return this;
    }

    @Override
    public CarsRecord value2(Integer value) {
        setWeight(value);
        return this;
    }

    @Override
    public CarsRecord value3(String value) {
        setModel(value);
        return this;
    }

    @Override
    public CarsRecord value4(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CarsRecord value5(LocalDateTime value) {
        setCreationDate(value);
        return this;
    }

    @Override
    public CarsRecord value6(LocalTime value) {
        setLastUsageTime(value);
        return this;
    }

    @Override
    public CarsRecord value7(Double value) {
        setSpeed(value);
        return this;
    }

    @Override
    public CarsRecord values(String value1, Integer value2, String value3, Integer value4, LocalDateTime value5, LocalTime value6, Double value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarsRecord
     */
    public CarsRecord() {
        super(Cars.CARS);
    }

    /**
     * Create a detached, initialised CarsRecord
     */
    public CarsRecord(String manufacturer, Integer weight, String model, Integer id, LocalDateTime creationDate, LocalTime lastUsageTime, Double speed) {
        super(Cars.CARS);

        setManufacturer(manufacturer);
        setWeight(weight);
        setModel(model);
        setId(id);
        setCreationDate(creationDate);
        setLastUsageTime(lastUsageTime);
        setSpeed(speed);
    }
}
