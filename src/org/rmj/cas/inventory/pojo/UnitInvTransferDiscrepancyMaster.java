package org.rmj.cas.inventory.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Inv_Transfer_Discrepancy_Master")

/**
 * Inv_Transfer_Discrepancy_Master table POJO
 * @author Valencia Maynard
 * @since 2024.05.15
 */
public class UnitInvTransferDiscrepancyMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
        
    @Basic(optional = false)
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
        
    @Column(name = "sDestinat")
    private String sDestinat;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;       
    
    @Column(name = "sSourceNo")
    private String sSourceNo;    
    
    @Column(name = "sSourceCD")
    private String sSourceCD;    
    
    @Column(name = "nTranTotl")
    private Number nTranTotl;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvTransferDiscrepancyMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.dTransact = null;
        this.sDestinat = "";
        this.sRemarksx = "";
        this.sSourceNo = "";
        this.sSourceCD = "";
        this.nTranTotl = 0.00;
        this.nEntryNox = -1;
        this.cTranStat = TransactionStatus.STATE_OPEN;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("sDestinat");
        laColumns.add("sRemarksx");
        laColumns.add("sSourceNo");
        laColumns.add("sSourceCD");
        laColumns.add("nTranTotl");
        laColumns.add("nEntryNox");
        laColumns.add("cTranStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setTransNox(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNox(){
        return sTransNox;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getTransact(){
        return dTransact;
    }
    
    public void setDestinat(String sDestinat){
        this.sDestinat = sDestinat;
    }
    public String getDestinat(){
        return sDestinat;
    }
    
    public void setRemarksx(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarksx(){
        return sRemarksx;
    }
    
    public void setSourceNo(String sSourceNo){
        this.sSourceNo = sSourceNo;
    }
    public String getSourceNo(){
        return sSourceNo;
    }
    
    public void setSourceCD(String sSourceCD){
        this.sSourceCD = sSourceCD;
    }
    public String getSourceCD(){
        return sSourceCD;
    }
    
    public void setTranTotl(Number nTranTotl){
        this.nTranTotl = nTranTotl;
    }
    public Number getTranTotl(){
        return nTranTotl;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setTranStat(String cTranStat){
        this.cTranStat = cTranStat;
    }
    public String getTranStat(){
        return cTranStat;
    }
    
    public void setModified(String sModified){
        this.sModified = sModified;
    }
    public String getModified(){
        return sModified;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTransNox != null ? sTransNox.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitInvTransferDiscrepancyMaster)) {
            return false;
        }
        UnitInvTransferDiscrepancyMaster other = (UnitInvTransferDiscrepancyMaster) object;
        return !((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvTransferDiscrepancyMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return sDestinat;
            case 5: return sRemarksx;
            case 6: return sSourceNo;
            case 7: return sSourceCD;
            case 8: return nTranTotl;
            case 9: return nEntryNox;
            case 10: return cTranStat;
            case 11: return sModified;
            case 12: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Inv_Transfer_Discrepancy_Master";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sTransNox = (String) foValue; break;
            case 2: sBranchCd = (String) foValue; break;
            case 3: dTransact = (Date) foValue; break;
            case 4: sDestinat = (String) foValue; break;
            case 5: sRemarksx = (String) foValue; break;
            case 6: sSourceNo = (String) foValue; break;
            case 7: sSourceCD = (String) foValue; break;
            case 8: nTranTotl = (Number) foValue; break;
            case 9: nEntryNox = (int) foValue; break;
            case 10: cTranStat = (String) foValue; break;
            case 11: sModified = (String) foValue; break;
            case 12: dModified = (Date) foValue; break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }
    
    public void list(){
        Stream.of(laColumns).forEach(System.out::println);        
    }
}
