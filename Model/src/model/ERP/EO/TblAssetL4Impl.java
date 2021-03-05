package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 10 12:49:49 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblAssetL4Impl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AssetL4Id,
        AssetL3Id,
        Name,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        UomId,
        TblAssetL3,
        TblAssetOrderD,
        TblAssetPurchD,
        TblAssetReqD,
        TblAssetReturnD;
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
    public static final int ASSETL4ID = AttributesEnum.AssetL4Id.index();
    public static final int ASSETL3ID = AttributesEnum.AssetL3Id.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UOMID = AttributesEnum.UomId.index();
    public static final int TBLASSETL3 = AttributesEnum.TblAssetL3.index();
    public static final int TBLASSETORDERD = AttributesEnum.TblAssetOrderD.index();
    public static final int TBLASSETPURCHD = AttributesEnum.TblAssetPurchD.index();
    public static final int TBLASSETREQD = AttributesEnum.TblAssetReqD.index();
    public static final int TBLASSETRETURND = AttributesEnum.TblAssetReturnD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblAssetL4Impl() {
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
     * Gets the attribute value for AssetL3Id, using the alias name AssetL3Id.
     * @return the value of AssetL3Id
     */
    public BigDecimal getAssetL3Id() {
        return (BigDecimal) getAttributeInternal(ASSETL3ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetL3Id.
     * @param value value to set the AssetL3Id
     */
    public void setAssetL3Id(BigDecimal value) {
        setAttributeInternal(ASSETL3ID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
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
     * Gets the attribute value for UomId, using the alias name UomId.
     * @return the value of UomId
     */
    public BigDecimal getUomId() {
        return (BigDecimal) getAttributeInternal(UOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomId.
     * @param value value to set the UomId
     */
    public void setUomId(BigDecimal value) {
        setAttributeInternal(UOMID, value);
    }

    /**
     * @return the associated entity TblAssetL3Impl.
     */
    public TblAssetL3Impl getTblAssetL3() {
        return (TblAssetL3Impl) getAttributeInternal(TBLASSETL3);
    }

    /**
     * Sets <code>value</code> as the associated entity TblAssetL3Impl.
     */
    public void setTblAssetL3(TblAssetL3Impl value) {
        setAttributeInternal(TBLASSETL3, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblAssetOrderD() {
        return (RowIterator) getAttributeInternal(TBLASSETORDERD);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblAssetPurchD() {
        return (RowIterator) getAttributeInternal(TBLASSETPURCHD);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblAssetReqD() {
        return (RowIterator) getAttributeInternal(TBLASSETREQD);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblAssetReturnD() {
        return (RowIterator) getAttributeInternal(TBLASSETRETURND);
    }

    /**
     * @param assetL4Id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal assetL4Id) {
        return new Key(new Object[] { assetL4Id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblAssetL4");
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

