/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import org.example.db.generated.tables.ActorInfo;
import org.example.db.generated.tables.interfaces.IActorInfo;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorInfoRecord extends TableRecordImpl<ActorInfoRecord> implements Record4<Integer, String, String, String>, IActorInfo {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.actor_info.actor_id</code>.
     */
    public void setActorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.actor_info.actor_id</code>.
     */
    @Override
    public Integer getActorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.actor_info.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.actor_info.first_name</code>.
     */
    @Override
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.actor_info.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.actor_info.last_name</code>.
     */
    @Override
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.actor_info.film_info</code>.
     */
    public void setFilmInfo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.actor_info.film_info</code>.
     */
    @Override
    public String getFilmInfo() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ActorInfo.ACTOR_INFO.ACTOR_ID;
    }

    @Override
    public Field<String> field2() {
        return ActorInfo.ACTOR_INFO.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return ActorInfo.ACTOR_INFO.LAST_NAME;
    }

    @Override
    public Field<String> field4() {
        return ActorInfo.ACTOR_INFO.FILM_INFO;
    }

    @Override
    public Integer component1() {
        return getActorId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public String component4() {
        return getFilmInfo();
    }

    @Override
    public Integer value1() {
        return getActorId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public String value4() {
        return getFilmInfo();
    }

    @Override
    public ActorInfoRecord value1(Integer value) {
        setActorId(value);
        return this;
    }

    @Override
    public ActorInfoRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public ActorInfoRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public ActorInfoRecord value4(String value) {
        setFilmInfo(value);
        return this;
    }

    @Override
    public ActorInfoRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IActorInfo from) {
        setActorId(from.getActorId());
        setFirstName(from.getFirstName());
        setLastName(from.getLastName());
        setFilmInfo(from.getFilmInfo());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorInfoRecord
     */
    public ActorInfoRecord() {
        super(ActorInfo.ACTOR_INFO);
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    public ActorInfoRecord(Integer actorId, String firstName, String lastName, String filmInfo) {
        super(ActorInfo.ACTOR_INFO);

        setActorId(actorId);
        setFirstName(firstName);
        setLastName(lastName);
        setFilmInfo(filmInfo);
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    public ActorInfoRecord(org.example.db.generated.tables.pojos.ActorInfo value) {
        super(ActorInfo.ACTOR_INFO);

        if (value != null) {
            setActorId(value.getActorId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setFilmInfo(value.getFilmInfo());
        }
    }
}
