package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 10 12:50:41 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblAssetOrderDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        AssetOrderMId,
        SrNo,
        AssetL4Id,
        Description,
        ArQty,
        Qty,
        BalQty,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        Rate,
        Amount,
        AssetReqMId,
        TblAssetL4,
        TblAssetOrderM;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int ASSETORDERMID = AttributesEnum.AssetOrderMId.index();
    public static final int SRNO = AttributesEnum.SrNo.index();
    public static final int ASSETL4ID = AttributesEnum.AssetL4Id.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ARQTY = AttributesEnum.ArQty.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int BALQTY = AttributesEnum.BalQty.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int ASSETREQMID = AttributesEnum.AssetReqMId.index();
    public static final int TBLASSETL4 = AttributesEnum.TblAssetL4.index();
    public static final int TBLASSETORDERM = AttributesEnum.TblAssetOrderM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblAssetOrderDImpl() {
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for AssetOrderMId, using the alias name AssetOrderMId.
     * @return the value of AssetOrderMId
     */
    public BigDecimal getAssetOrderMId() {
        return (BigDecimal) getAttributeInternal(ASSETORDERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetOrderMId.
     * @param value value to set the AssetOrderMId
     */
    public void setAssetOrderMId(BigDecimal value) {
        setAttributeInternal(ASSETORDERMID, value);
    }

    /**
     * Gets the attribute value for SrNo, using the alias name SrNo.
     * @return the value of SrNo
     */
    public Integer getSrNo() {
        return (Integer) getAttributeInternal(SRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrNo.
     * @param value value to set the SrNo
     */
    public void setSrNo(Integer value) {
        setAttributeInternal(SRNO, value);
    }

    /**
     * Gets the attribute value for AssetL4Id, using the alias name AssetL4Id.
     * @return the value of AssetL4Id
     */
    public BigDecimal getAssetL4Id() {
        return (BigDecimal) getAttributeInternal(ASSETL4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetL4Id.
     * @param value value to set the AssetL4Id
     */
    public void setAssetL4Id(BigDecimal value) {
        setAttributeInternal(ASSETL4ID, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for ArQty, using the alias name ArQty.
     * @return the value of ArQty
     */
    public BigDecimal getArQty() {
        return (BigDecimal) getAttributeInternal(ARQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArQty.
     * @param value value to set the ArQty
     */
    public void setArQty(BigDecimal value) {
        setAttributeInternal(ARQTY, value);
    }

    /**
     * Gets the attribute value for Qty, using the alias name Qty.
     * @return the value of Qty
     */
    public BigDecimal getQty() {
        return (BigDecimal) getAttributeInternal(QTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Qty.
     * @param value value to set the Qty
     */
    public void setQty(BigDecimal value) {
        setAttributeInternal(QTY, value);
    }

    /**
     * Gets the attribute value for BalQty, using the alias name BalQty.
     * @return the value of BalQty
     */
    public BigDecimal getBalQty() {
        return (BigDecimal) getAttributeInternal(BALQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BalQty.
     * @param value value to set the BalQty
     */
    public void setBalQty(BigDecimal value) {
        setAttributeInternal(BALQTY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for AssetReqMId, using the alias name AssetReqMId.
     * @return the value of AssetReqMId
     */
    public BigDecimal getAssetReqMId() {
        return (BigDecimal) getAttributeInternal(ASSETREQMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetReqMId.
     * @param value value to set the AssetReqMId
     */
    public void setAssetReqMId(BigDecimal value) {
        setAttributeInternal(ASSETREQMID, value);
    }

    /**
     * @return the associated entity TblAssetL4Impl.
     */
    public TblAssetL4Impl getTblAssetL4() {
        return (TblAssetL4Impl) getAttributeInternal(TBLASSETL4);
    }

    /**
     * Sets <code>value</code> as the associated entity TblAssetL4Impl.
     */
    public void setTblAssetL4(TblAssetL4Impl value) {
        setAttributeInternal(TBLASSETL4, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblAssetOrderM() {
        return (EntityImpl) getAttributeInternal(TBLASSETORDERM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblAssetOrderM(EntityImpl value) {
        setAttributeInternal(TBLASSETORDERM, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblAssetOrderD");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
                        try {
                            loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
                        } catch(Exception ex) {
                            ex.printStackTrace();
                        }
                        
                        if (operation == DML_INSERT) {
                            setCreatedBy(loginId);
                            setUpdatedBy(loginId);
                            } else if(operation == DML_UPDATE) {
                            setUpdatedBy(loginId);
                        }
        super.doDML(operation, e);
    }
}

