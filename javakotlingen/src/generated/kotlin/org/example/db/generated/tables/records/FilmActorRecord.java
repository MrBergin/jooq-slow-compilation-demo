/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import java.time.OffsetDateTime;

import org.example.db.generated.tables.FilmActor;
import org.example.db.generated.tables.interfaces.IFilmActor;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmActorRecord extends UpdatableRecordImpl<FilmActorRecord> implements Record3<Integer, Integer, OffsetDateTime>, IFilmActor {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_actor.actor_id</code>.
     */
    public void setActorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_actor.actor_id</code>.
     */
    @Override
    public Integer getActorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.film_actor.film_id</code>.
     */
    public void setFilmId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_actor.film_id</code>.
     */
    @Override
    public Integer getFilmId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.film_actor.last_update</code>.
     */
    public void setLastUpdate(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_actor.last_update</code>.
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
        return FilmActor.FILM_ACTOR.ACTOR_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FilmActor.FILM_ACTOR.FILM_ID;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return FilmActor.FILM_ACTOR.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getActorId();
    }

    @Override
    public Integer component2() {
        return getFilmId();
    }

    @Override
    public OffsetDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getActorId();
    }

    @Override
    public Integer value2() {
        return getFilmId();
    }

    @Override
    public OffsetDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public FilmActorRecord value1(Integer value) {
        setActorId(value);
        return this;
    }

    @Override
    public FilmActorRecord value2(Integer value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmActorRecord value3(OffsetDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public FilmActorRecord values(Integer value1, Integer value2, OffsetDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IFilmActor from) {
        setActorId(from.getActorId());
        setFilmId(from.getFilmId());
        setLastUpdate(from.getLastUpdate());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmActorRecord
     */
    public FilmActorRecord() {
        super(FilmActor.FILM_ACTOR);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(Integer actorId, Integer filmId, OffsetDateTime lastUpdate) {
        super(FilmActor.FILM_ACTOR);

        setActorId(actorId);
        setFilmId(filmId);
        setLastUpdate(lastUpdate);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(org.example.db.generated.tables.pojos.FilmActor value) {
        super(FilmActor.FILM_ACTOR);

        if (value != null) {
            setActorId(value.getActorId());
            setFilmId(value.getFilmId());
            setLastUpdate(value.getLastUpdate());
        }
    }
}
