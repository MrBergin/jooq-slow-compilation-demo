/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import java.math.BigDecimal;
import java.time.OffsetDateTime;

import org.example.db.generated.tables.PaymentP2020_02;
import org.example.db.generated.tables.interfaces.IPaymentP2020_02;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentP2020_02Record extends TableRecordImpl<PaymentP2020_02Record> implements Record6<Integer, Integer, Integer, Integer, BigDecimal, OffsetDateTime>, IPaymentP2020_02 {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.payment_p2020_02.payment_id</code>.
     */
    public void setPaymentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.payment_p2020_02.payment_id</code>.
     */
    @Override
    public Integer getPaymentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.payment_p2020_02.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.payment_p2020_02.customer_id</code>.
     */
    @Override
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.payment_p2020_02.staff_id</code>.
     */
    public void setStaffId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.payment_p2020_02.staff_id</code>.
     */
    @Override
    public Integer getStaffId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.payment_p2020_02.rental_id</code>.
     */
    public void setRentalId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.payment_p2020_02.rental_id</code>.
     */
    @Override
    public Integer getRentalId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.payment_p2020_02.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.payment_p2020_02.amount</code>.
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.payment_p2020_02.payment_date</code>.
     */
    public void setPaymentDate(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.payment_p2020_02.payment_date</code>.
     */
    @Override
    public OffsetDateTime getPaymentDate() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, BigDecimal, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, Integer, Integer, BigDecimal, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PaymentP2020_02.PAYMENT_P2020_02.PAYMENT_ID;
    }

    @Override
    public Field<Integer> field2() {
        return PaymentP2020_02.PAYMENT_P2020_02.CUSTOMER_ID;
    }

    @Override
    public Field<Integer> field3() {
        return PaymentP2020_02.PAYMENT_P2020_02.STAFF_ID;
    }

    @Override
    public Field<Integer> field4() {
        return PaymentP2020_02.PAYMENT_P2020_02.RENTAL_ID;
    }

    @Override
    public Field<BigDecimal> field5() {
        return PaymentP2020_02.PAYMENT_P2020_02.AMOUNT;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return PaymentP2020_02.PAYMENT_P2020_02.PAYMENT_DATE;
    }

    @Override
    public Integer component1() {
        return getPaymentId();
    }

    @Override
    public Integer component2() {
        return getCustomerId();
    }

    @Override
    public Integer component3() {
        return getStaffId();
    }

    @Override
    public Integer component4() {
        return getRentalId();
    }

    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    @Override
    public OffsetDateTime component6() {
        return getPaymentDate();
    }

    @Override
    public Integer value1() {
        return getPaymentId();
    }

    @Override
    public Integer value2() {
        return getCustomerId();
    }

    @Override
    public Integer value3() {
        return getStaffId();
    }

    @Override
    public Integer value4() {
        return getRentalId();
    }

    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    @Override
    public OffsetDateTime value6() {
        return getPaymentDate();
    }

    @Override
    public PaymentP2020_02Record value1(Integer value) {
        setPaymentId(value);
        return this;
    }

    @Override
    public PaymentP2020_02Record value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public PaymentP2020_02Record value3(Integer value) {
        setStaffId(value);
        return this;
    }

    @Override
    public PaymentP2020_02Record value4(Integer value) {
        setRentalId(value);
        return this;
    }

    @Override
    public PaymentP2020_02Record value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public PaymentP2020_02Record value6(OffsetDateTime value) {
        setPaymentDate(value);
        return this;
    }

    @Override
    public PaymentP2020_02Record values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5, OffsetDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IPaymentP2020_02 from) {
        setPaymentId(from.getPaymentId());
        setCustomerId(from.getCustomerId());
        setStaffId(from.getStaffId());
        setRentalId(from.getRentalId());
        setAmount(from.getAmount());
        setPaymentDate(from.getPaymentDate());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentP2020_02Record
     */
    public PaymentP2020_02Record() {
        super(PaymentP2020_02.PAYMENT_P2020_02);
    }

    /**
     * Create a detached, initialised PaymentP2020_02Record
     */
    public PaymentP2020_02Record(Integer paymentId, Integer customerId, Integer staffId, Integer rentalId, BigDecimal amount, OffsetDateTime paymentDate) {
        super(PaymentP2020_02.PAYMENT_P2020_02);

        setPaymentId(paymentId);
        setCustomerId(customerId);
        setStaffId(staffId);
        setRentalId(rentalId);
        setAmount(amount);
        setPaymentDate(paymentDate);
    }

    /**
     * Create a detached, initialised PaymentP2020_02Record
     */
    public PaymentP2020_02Record(org.example.db.generated.tables.pojos.PaymentP2020_02 value) {
        super(PaymentP2020_02.PAYMENT_P2020_02);

        if (value != null) {
            setPaymentId(value.getPaymentId());
            setCustomerId(value.getCustomerId());
            setStaffId(value.getStaffId());
            setRentalId(value.getRentalId());
            setAmount(value.getAmount());
            setPaymentDate(value.getPaymentDate());
        }
    }
}
