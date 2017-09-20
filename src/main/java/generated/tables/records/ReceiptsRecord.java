/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Receipts;

import java.math.BigDecimal;
import java.sql.Time;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReceiptsRecord extends UpdatableRecordImpl<ReceiptsRecord> implements Record5<Integer, Time, String, BigDecimal, Integer> {

	private static final long serialVersionUID = -1941296675;

	/**
	 * Setter for <code>public.receipts.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.receipts.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.receipts.uploaded</code>.
	 */
	public void setUploaded(Time value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.receipts.uploaded</code>.
	 */
	public Time getUploaded() {
		return (Time) getValue(1);
	}

	/**
	 * Setter for <code>public.receipts.merchant</code>.
	 */
	public void setMerchant(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.receipts.merchant</code>.
	 */
	public String getMerchant() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.receipts.amount</code>.
	 */
	public void setAmount(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.receipts.amount</code>.
	 */
	public BigDecimal getAmount() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>public.receipts.receipt_type</code>.
	 */
	public void setReceiptType(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.receipts.receipt_type</code>.
	 */
	public Integer getReceiptType() {
		return (Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Time, String, BigDecimal, Integer> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Time, String, BigDecimal, Integer> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Receipts.RECEIPTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Time> field2() {
		return Receipts.RECEIPTS.UPLOADED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Receipts.RECEIPTS.MERCHANT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return Receipts.RECEIPTS.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Receipts.RECEIPTS.RECEIPT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Time value2() {
		return getUploaded();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMerchant();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getReceiptType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsRecord value2(Time value) {
		setUploaded(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsRecord value3(String value) {
		setMerchant(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsRecord value4(BigDecimal value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsRecord value5(Integer value) {
		setReceiptType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsRecord values(Integer value1, Time value2, String value3, BigDecimal value4, Integer value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ReceiptsRecord
	 */
	public ReceiptsRecord() {
		super(Receipts.RECEIPTS);
	}

	/**
	 * Create a detached, initialised ReceiptsRecord
	 */
	public ReceiptsRecord(Integer id, Time uploaded, String merchant, BigDecimal amount, Integer receiptType) {
		super(Receipts.RECEIPTS);

		setValue(0, id);
		setValue(1, uploaded);
		setValue(2, merchant);
		setValue(3, amount);
		setValue(4, receiptType);
	}
}
