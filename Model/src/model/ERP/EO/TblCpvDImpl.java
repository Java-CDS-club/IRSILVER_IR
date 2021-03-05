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
// ---    Sat Nov 07 12:12:56 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblCpvDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        CpvMId,
        GlL4Id,
        Description,
        Dr,
        Cr,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblCpvM;
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
    public static final int CPVMID = AttributesEnum.CpvMId.index();
    public static final int GLL4ID = AttributesEnum.GlL4Id.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int DR = AttributesEnum.Dr.index();
    public static final int CR = AttributesEnum.Cr.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLCPVM = AttributesEnum.TblCpvM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblCpvDImpl() {
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
     * Gets the attribute value for CpvMId, using the alias name CpvMId.
     * @return the value of CpvMId
     */
    public BigDecimal getCpvMId() {
        return (BigDecimal) getAttributeInternal(CPVMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CpvMId.
     * @param value value to set the CpvMId
     */
    public void setCpvMId(BigDecimal value) {
        setAttributeInternal(CPVMID, value);
    }

    /**
     * Gets the attribute value for GlL4Id, using the alias name GlL4Id.
     * @return the value of GlL4Id
     */
    public BigDecimal getGlL4Id() {
        return (BigDecimal) getAttributeInternal(GLL4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlL4Id.
     * @param value value to set the GlL4Id
     */
    public void setGlL4Id(BigDecimal value) {
        setAttributeInternal(GLL4ID, value);
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
     * Gets the attribute value for Dr, using the alias name Dr.
     * @return the value of Dr
     */
    public BigDecimal getDr() {
        return (BigDecimal) getAttributeInternal(DR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dr.
     * @param value value to set the Dr
     */
    public void setDr(BigDecimal value) {
        setAttributeInternal(DR, value);
    }

    /**
     * Gets the attribute value for Cr, using the alias name Cr.
     * @return the value of Cr
     */
    public BigDecimal getCr() {
        return (BigDecimal) getAttributeInternal(CR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cr.
     * @param value value to set the Cr
     */
    public void setCr(BigDecimal value) {
        setAttributeInternal(CR, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblCpvM() {
        return (EntityImpl) getAttributeInternal(TBLCPVM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblCpvM(EntityImpl value) {
        setAttributeInternal(TBLCPVM, value);
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
        return EntityDefImpl.findDefObject("model.ERP.EO.TblCpvD");
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

