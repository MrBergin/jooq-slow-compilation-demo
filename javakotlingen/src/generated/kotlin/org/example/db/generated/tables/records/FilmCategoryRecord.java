/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import java.time.OffsetDateTime;

import org.example.db.generated.tables.FilmCategory;
import org.example.db.generated.tables.interfaces.IFilmCategory;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> implements Record3<Integer, Integer, OffsetDateTime>, IFilmCategory {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_category.film_id</code>.
     */
    public void setFilmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_category.film_id</code>.
     */
    @Override
    public Integer getFilmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.film_category.category_id</code>.
     */
    public void setCategoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_category.category_id</code>.
     */
    @Override
    public Integer getCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.film_category.last_update</code>.
     */
    public void setLastUpdate(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_category.last_update</code>.
     */
    @Override
    public OffsetDateTime getLastUpdate() {
        return (OffsetDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, OffsetDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FilmCategory.FILM_CATEGORY.FILM_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FilmCategory.FILM_CATEGORY.CATEGORY_ID;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return FilmCategory.FILM_CATEGORY.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getFilmId();
    }

    @Override
    public Integer component2() {
        return getCategoryId();
    }

    @Override
    public OffsetDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getFilmId();
    }

    @Override
    public Integer value2() {
        return getCategoryId();
    }

    @Override
    public OffsetDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public FilmCategoryRecord value1(Integer value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmCategoryRecord value2(Integer value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public FilmCategoryRecord value3(OffsetDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public FilmCategoryRecord values(Integer value1, Integer value2, OffsetDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IFilmCategory from) {
        setFilmId(from.getFilmId());
        setCategoryId(from.getCategoryId());
        setLastUpdate(from.getLastUpdate());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmCategoryRecord
     */
    public FilmCategoryRecord() {
        super(FilmCategory.FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(Integer filmId, Integer categoryId, OffsetDateTime lastUpdate) {
        super(FilmCategory.FILM_CATEGORY);

        setFilmId(filmId);
        setCategoryId(categoryId);
        setLastUpdate(lastUpdate);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(org.example.db.generated.tables.pojos.FilmCategory value) {
        super(FilmCategory.FILM_CATEGORY);

        if (value != null) {
            setFilmId(value.getFilmId());
            setCategoryId(value.getCategoryId());
            setLastUpdate(value.getLastUpdate());
        }
    }
}
