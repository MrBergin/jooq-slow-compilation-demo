/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import java.math.BigDecimal;

import org.example.db.generated.enums.MpaaRating;
import org.example.db.generated.tables.FilmList;
import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmListRecord extends TableRecordImpl<FilmListRecord> implements Record8<Integer, String, String, String, BigDecimal, Short, MpaaRating, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_list.fid</code>.
     */
    public void setFid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_list.fid</code>.
     */
    public Integer getFid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.film_list.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_list.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.film_list.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_list.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.film_list.category</code>.
     */
    public void setCategory(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.film_list.category</code>.
     */
    public String getCategory() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.film_list.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.film_list.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.film_list.length</code>.
     */
    public void setLength(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.film_list.length</code>.
     */
    public Short getLength() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>public.film_list.rating</code>.
     */
    public void setRating(MpaaRating value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.film_list.rating</code>.
     */
    public MpaaRating getRating() {
        return (MpaaRating) get(6);
    }

    /**
     * Setter for <code>public.film_list.actors</code>.
     */
    public void setActors(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.film_list.actors</code>.
     */
    public String getActors() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, String, BigDecimal, Short, MpaaRating, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, String, String, String, BigDecimal, Short, MpaaRating, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FilmList.FILM_LIST.FID;
    }

    @Override
    public Field<String> field2() {
        return FilmList.FILM_LIST.TITLE;
    }

    @Override
    public Field<String> field3() {
        return FilmList.FILM_LIST.DESCRIPTION;
    }

    @Override
    public Field<String> field4() {
        return FilmList.FILM_LIST.CATEGORY;
    }

    @Override
    public Field<BigDecimal> field5() {
        return FilmList.FILM_LIST.PRICE;
    }

    @Override
    public Field<Short> field6() {
        return FilmList.FILM_LIST.LENGTH;
    }

    @Override
    public Field<MpaaRating> field7() {
        return FilmList.FILM_LIST.RATING;
    }

    @Override
    public Field<String> field8() {
        return FilmList.FILM_LIST.ACTORS;
    }

    @Override
    public Integer component1() {
        return getFid();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public String component4() {
        return getCategory();
    }

    @Override
    public BigDecimal component5() {
        return getPrice();
    }

    @Override
    public Short component6() {
        return getLength();
    }

    @Override
    public MpaaRating component7() {
        return getRating();
    }

    @Override
    public String component8() {
        return getActors();
    }

    @Override
    public Integer value1() {
        return getFid();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public String value4() {
        return getCategory();
    }

    @Override
    public BigDecimal value5() {
        return getPrice();
    }

    @Override
    public Short value6() {
        return getLength();
    }

    @Override
    public MpaaRating value7() {
        return getRating();
    }

    @Override
    public String value8() {
        return getActors();
    }

    @Override
    public FilmListRecord value1(Integer value) {
        setFid(value);
        return this;
    }

    @Override
    public FilmListRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public FilmListRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FilmListRecord value4(String value) {
        setCategory(value);
        return this;
    }

    @Override
    public FilmListRecord value5(BigDecimal value) {
        setPrice(value);
        return this;
    }

    @Override
    public FilmListRecord value6(Short value) {
        setLength(value);
        return this;
    }

    @Override
    public FilmListRecord value7(MpaaRating value) {
        setRating(value);
        return this;
    }

    @Override
    public FilmListRecord value8(String value) {
        setActors(value);
        return this;
    }

    @Override
    public FilmListRecord values(Integer value1, String value2, String value3, String value4, BigDecimal value5, Short value6, MpaaRating value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmListRecord
     */
    public FilmListRecord() {
        super(FilmList.FILM_LIST);
    }

    /**
     * Create a detached, initialised FilmListRecord
     */
    public FilmListRecord(Integer fid, String title, String description, String category, BigDecimal price, Short length, MpaaRating rating, String actors) {
        super(FilmList.FILM_LIST);

        setFid(fid);
        setTitle(title);
        setDescription(description);
        setCategory(category);
        setPrice(price);
        setLength(length);
        setRating(rating);
        setActors(actors);
    }
}
