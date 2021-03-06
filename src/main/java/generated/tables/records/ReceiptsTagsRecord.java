/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.ReceiptsTags;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class ReceiptsTagsRecord extends TableRecordImpl<ReceiptsTagsRecord> implements Record4<Integer, String, BigDecimal, String> {

	private static final long serialVersionUID = 494513636;

	/**
	 * Setter for <code>public.receipts_tags.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.receipts_tags.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.receipts_tags.merchant</code>.
	 */
	public void setMerchant(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.receipts_tags.merchant</code>.
	 */
	public String getMerchant() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.receipts_tags.amount</code>.
	 */
	public void setAmount(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.receipts_tags.amount</code>.
	 */
	public BigDecimal getAmount() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>public.receipts_tags.name</code>.
	 */
	public void setName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.receipts_tags.name</code>.
	 */
	public String getName() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, BigDecimal, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, BigDecimal, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return ReceiptsTags.RECEIPTS_TAGS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ReceiptsTags.RECEIPTS_TAGS.MERCHANT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return ReceiptsTags.RECEIPTS_TAGS.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ReceiptsTags.RECEIPTS_TAGS.NAME;
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
	public String value2() {
		return getMerchant();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsTagsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsTagsRecord value2(String value) {
		setMerchant(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsTagsRecord value3(BigDecimal value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsTagsRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiptsTagsRecord values(Integer value1, String value2, BigDecimal value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ReceiptsTagsRecord
	 */
	public ReceiptsTagsRecord() {
		super(ReceiptsTags.RECEIPTS_TAGS);
	}

	/**
	 * Create a detached, initialised ReceiptsTagsRecord
	 */
	public ReceiptsTagsRecord(Integer id, String merchant, BigDecimal amount, String name) {
		super(ReceiptsTags.RECEIPTS_TAGS);

		setValue(0, id);
		setValue(1, merchant);
		setValue(2, amount);
		setValue(3, name);
	}
}
