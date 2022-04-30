/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import org.example.db.generated.tables.FilmInStock;
import org.example.db.generated.tables.interfaces.IFilmInStock;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmInStockRecord extends TableRecordImpl<FilmInStockRecord> implements Record1<Integer>, IFilmInStock {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_in_stock.p_film_count</code>.
     */
    public void setPFilmCount(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_in_stock.p_film_count</code>.
     */
    @Override
    public Integer getPFilmCount() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FilmInStock.FILM_IN_STOCK.P_FILM_COUNT;
    }

    @Override
    public Integer component1() {
        return getPFilmCount();
    }

    @Override
    public Integer value1() {
        return getPFilmCount();
    }

    @Override
    public FilmInStockRecord value1(Integer value) {
        setPFilmCount(value);
        return this;
    }

    @Override
    public FilmInStockRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IFilmInStock from) {
        setPFilmCount(from.getPFilmCount());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmInStockRecord
     */
    public FilmInStockRecord() {
        super(FilmInStock.FILM_IN_STOCK);
    }

    /**
     * Create a detached, initialised FilmInStockRecord
     */
    public FilmInStockRecord(Integer pFilmCount) {
        super(FilmInStock.FILM_IN_STOCK);

        setPFilmCount(pFilmCount);
    }

    /**
     * Create a detached, initialised FilmInStockRecord
     */
    public FilmInStockRecord(org.example.db.generated.tables.pojos.FilmInStock value) {
        super(FilmInStock.FILM_IN_STOCK);

        if (value != null) {
            setPFilmCount(value.getPFilmCount());
        }
    }
}
