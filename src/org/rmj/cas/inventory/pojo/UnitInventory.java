package org.rmj.cas.inventory.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.iface.GEntity;

/**
 * Inventory Table POJO
 *
 * @author Michael Torres Cuison
 * @since 2018.10.03
 */
public class UnitInventory implements Serializable, GEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;

    @Column(name = "sBarCodex")
    private String sBarCodex;

    @Column(name = "sDescript")
    private String sDescript;

    @Column(name = "sBriefDsc")
    private String sBriefDsc;

    @Column(name = "sAltBarCd")
    private String sAltBarCd;

    @Column(name = "sCategCd1")
    private String sCategCd1;

    @Column(name = "sCategCd2")
    private String sCategCd2;

    @Column(name = "sCategCd3")
    private String sCategCd3;

    @Column(name = "sCategCd4")
    private String sCategCd4;

    @Column(name = "sBrandCde")
    private String sBrandCde;

    @Column(name = "sModelCde")
    private String sModelCde;

    @Column(name = "sColorCde")
    private String sColorCde;

    //added: 2019-05-20
    @Column(name = "sMeasurID")
    private String sMeasurID;

    @Column(name = "sInvTypCd")
    private String sInvTypCd;

    @Column(name = "nUnitPrce")
    private Number nUnitPrce;

    @Column(name = "nSelPrice")
    private Number nSelPrice;

    @Column(name = "nDiscLev1")
    private Number nDiscLev1;

    @Column(name = "nDiscLev2")
    private Number nDiscLev2;

    @Column(name = "nDiscLev3")
    private Number nDiscLev3;

    @Column(name = "nDealrDsc")
    private Number nDealrDsc;

    @Column(name = "cComboInv")
    private String cComboInv;

    @Column(name = "cWSubUnit")
    private String cWSubUnit;

    @Column(name = "cWithBOMx")
    private String cWithBOMx;

    @Column(name = "cWthPromo")
    private String cWthPromo;

    @Column(name = "cSerialze")
    private String cSerialze;

    @Column(name = "cUnitType")
    private String cUnitType;

    @Column(name = "cInvStatx")
    private String cInvStatx;

    //jovanalic
    //added:2021-07-21
    @Column(name = "cWthExprt")
    private String cWthExprt;

    @Column(name = "sSupersed")
    private String sSupersed;

    @Column(name = "cNoExpiry")
    private String cNoExpiry;

    @Column(name = "cRecdStat")
    private String cRecdStat;

    @Column(name = "sModified")
    private String sModified;

    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;

    public UnitInventory() {
        this.sStockIDx = "";
        this.sBarCodex = "";
        this.sDescript = "";
        this.sBriefDsc = "";
        this.sAltBarCd = "";
        this.sCategCd1 = "";
        this.sCategCd2 = "";
        this.sCategCd3 = "";
        this.sCategCd4 = "";
        this.sBrandCde = "";
        this.sModelCde = "";
        this.sColorCde = "";
        this.sMeasurID = "";
        this.sInvTypCd = "";
        this.nUnitPrce = 0.00;
        this.nSelPrice = 0.00;
        this.nDiscLev1 = 0.00;
        this.nDiscLev2 = 0.00;
        this.nDiscLev3 = 0.00;
        this.nDealrDsc = 0.00;
        this.cWSubUnit = "0";
        this.cWithBOMx = "0";
        this.cComboInv = "0";
        this.cComboInv = "0";
        this.cWthPromo = "0";
        this.cSerialze = "0";
        this.cUnitType = "1";
        this.cInvStatx = "1";
        this.cWthExprt = "1";
        this.sSupersed = "";
        this.cNoExpiry = "0";
        this.cRecdStat = RecordStatus.ACTIVE;

        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("sBarCodex");
        laColumns.add("sDescript");
        laColumns.add("sBriefDsc");
        laColumns.add("sAltBarCd");
        laColumns.add("sCategCd1");
        laColumns.add("sCategCd2");
        laColumns.add("sCategCd3");
        laColumns.add("sCategCd4");
        laColumns.add("sBrandCde");
        laColumns.add("sModelCde");
        laColumns.add("sColorCde");
        laColumns.add("sMeasurID");
        laColumns.add("sInvTypCd");
        laColumns.add("nUnitPrce");
        laColumns.add("nSelPrice");
        laColumns.add("nDiscLev1");
        laColumns.add("nDiscLev2");
        laColumns.add("nDiscLev3");
        laColumns.add("nDealrDsc");
        laColumns.add("cWSubUnit");
        laColumns.add("cWithBOMx");
        laColumns.add("cComboInv");
        laColumns.add("cWthPromo");
        laColumns.add("cSerialze");
        laColumns.add("cUnitType");
        laColumns.add("cInvStatx");
        laColumns.add("cWthExprt");
        laColumns.add("sSupersed");
        laColumns.add("cNoExpiry");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }

    public void setStockIDx(String sStockIDx) {
        this.sStockIDx = sStockIDx;
    }

    public String getStockIDx() {
        return sStockIDx;
    }

    public void setBarCodex(String sBarCodex) {
        this.sBarCodex = sBarCodex;
    }

    public String getBarCodex() {
        return sBarCodex;
    }

    public void setDescript(String sDescript) {
        this.sDescript = sDescript;
    }

    public String getDescript() {
        return sDescript;
    }

    public void setBriefDsc(String sBriefDsc) {
        this.sBriefDsc = sBriefDsc;
    }

    public String getBriefDsc() {
        return sBriefDsc;
    }

    public void setAltBarCd(String sAltBarCd) {
        this.sAltBarCd = sAltBarCd;
    }

    public String getAltBarCd() {
        return sAltBarCd;
    }

    public void setCategCd1(String sCategCd1) {
        this.sCategCd1 = sCategCd1;
    }

    public String getCategCd1() {
        return sCategCd1;
    }

    public void setCategCd2(String sCategCd2) {
        this.sCategCd2 = sCategCd2;
    }

    public String getCategCd2() {
        return sCategCd2;
    }

    public void setCategCd3(String sCategCd3) {
        this.sCategCd3 = sCategCd3;
    }

    public String getCategCd3() {
        return sCategCd3;
    }

    public void setCategCd4(String sCategCd4) {
        this.sCategCd4 = sCategCd4;
    }

    public String getCategCd4() {
        return sCategCd4;
    }

    public void setBrandCde(String sBrandCde) {
        this.sBrandCde = sBrandCde;
    }

    public String getBrandCde() {
        return sBrandCde;
    }

    public void setModelCde(String sModelCde) {
        this.sModelCde = sModelCde;
    }

    public String getModelCde() {
        return sModelCde;
    }

    public void setColorCde(String sColorCde) {
        this.sColorCde = sColorCde;
    }

    public String getColorCde() {
        return sColorCde;
    }

    public void setMeasureID(String sMeasurID) {
        this.sMeasurID = sMeasurID;
    }

    public String getMeasureID() {
        return sMeasurID;
    }

    public void setInvTypeCode(String sInvTypCd) {
        this.sInvTypCd = sInvTypCd;
    }

    public String getInvTypeCode() {
        return sInvTypCd;
    }

    public void setUnitPrce(Number nUnitPrce) {
        this.nUnitPrce = nUnitPrce;
    }

    public Number getUnitPrce() {
        return nUnitPrce;
    }

    public void setSelPrice(Number nSelPrice) {
        this.nSelPrice = nSelPrice;
    }

    public Number getSelPrice() {
        return nSelPrice;
    }

    public void setDiscLev1(Number nDiscLev1) {
        this.nDiscLev1 = nDiscLev1;
    }

    public Number getDiscLev1() {
        return nDiscLev1;
    }

    public void setDiscLev2(Number nDiscLev2) {
        this.nDiscLev2 = nDiscLev2;
    }

    public Number getDiscLev2() {
        return nDiscLev2;
    }

    public void setDiscLev3(Number nDiscLev3) {
        this.nDiscLev3 = nDiscLev3;
    }

    public Number getDiscLev3() {
        return nDiscLev3;
    }

    public void setDealerDsc(Number nDealrDsc) {
        this.nDealrDsc = nDealrDsc;
    }

    public Number getDealerDsc() {
        return nDealrDsc;
    }

    public void isWithSubUnit(String cWSubUnit) {
        this.cWSubUnit = cWSubUnit;
    }

    public String isWithSubUnit() {
        return cWSubUnit;
    }

    public void isWithBOM(String cWithBOMx) {
        this.cWithBOMx = cWithBOMx;
    }

    public String isWithBOM() {
        return cWithBOMx;
    }

    public void isComboInv(String cComboInv) {
        this.cComboInv = cComboInv;
    }

    public String isComboInv() {
        return cComboInv;
    }

    public void isWthPromo(String cWthPromo) {
        this.cWthPromo = cWthPromo;
    }

    public String isWthPromo() {
        return cWthPromo;
    }

    public void isSerialze(String cSerialze) {
        this.cSerialze = cSerialze;
    }

    public String isSerialze() {
        return cSerialze;
    }

    public void setUnitType(String cUnitType) {
        this.cUnitType = cUnitType;
    }

    public String getUnitType() {
        return cUnitType;
    }

    public void setInvStatx(String cInvStatx) {
        this.cInvStatx = cInvStatx;
    }

    public String getInvStatx() {
        return cInvStatx;
    }

    public void setCWthExprt(String cWthExprt) {
        this.cWthExprt = cWthExprt;
    }

    public String getCWthExprt() {
        return cWthExprt;
    }

    public void setSupersed(String sSupersed) {
        this.sSupersed = sSupersed;
    }

    public String getSupersed() {
        return sSupersed;
    }

    public void setNoExpiry(String cNoExpiry) {
        this.cNoExpiry = cNoExpiry;
    }

    public String getNoExpiry() {
        return cNoExpiry;
    }

    public void setRecdStat(String cRecdStat) {
        this.cRecdStat = cRecdStat;
    }

    public String getRecdStat() {
        return cRecdStat;
    }

    public void setModified(String sModified) {
        this.sModified = sModified;
    }

    public String getModified() {
        return sModified;
    }

    public void setDateModified(Date dModified) {
        this.dModified = dModified;
    }

    public Date getDateModified() {
        return dModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sStockIDx != null ? sStockIDx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitInvMaster)) {
            return false;
        }
        UnitInventory other = (UnitInventory) object;
        return !((this.sStockIDx == null && other.sStockIDx != null)
                || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)));
    }

    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInventory[sStockIDx=" + sStockIDx + "]";
    }

    @Override
    public Object getValue(int fnColumn) {
        switch (fnColumn) {
            case 1:
                return sStockIDx;
            case 2:
                return sBarCodex;
            case 3:
                return sDescript;
            case 4:
                return sBriefDsc;
            case 5:
                return sAltBarCd;
            case 6:
                return sCategCd1;
            case 7:
                return sCategCd2;
            case 8:
                return sCategCd3;
            case 9:
                return sCategCd4;
            case 10:
                return sBrandCde;
            case 11:
                return sModelCde;
            case 12:
                return sColorCde;
            case 13:
                return sMeasurID;
            case 14:
                return sInvTypCd;
            case 15:
                return nUnitPrce;
            case 16:
                return nSelPrice;
            case 17:
                return nDiscLev1;
            case 18:
                return nDiscLev2;
            case 19:
                return nDiscLev3;
            case 20:
                return nDealrDsc;
            case 21:
                return cWSubUnit;
            case 22:
                return cWithBOMx;
            case 23:
                return cComboInv;
            case 24:
                return cWthPromo;
            case 25:
                return cSerialze;
            case 26:
                return cUnitType;
            case 27:
                return cInvStatx;
            case 28:
                return cWthExprt;
            case 29:
                return sSupersed;
            case 30:
                return cNoExpiry;
            case 31:
                return cRecdStat;
            case 32:
                return sModified;
            case 33:
                return dModified;
            default:
                return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);

        if (lnCol > 0) {
            return getValue(lnCol);
        } else {
            return null;
        }
    }

    @Override
    public String getTable() {
        return "Inventory";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol) {
            return "";
        } else {
            return (String) laColumns.get(fnCol - 1);
        }
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch (fnColumn) {
            case 1:
                sStockIDx = (String) foValue;
                break;
            case 2:
                sBarCodex = (String) foValue;
                break;
            case 3:
                sDescript = (String) foValue;
                break;
            case 4:
                sBriefDsc = (String) foValue;
                break;
            case 5:
                sAltBarCd = (String) foValue;
                break;
            case 6:
                sCategCd1 = (String) foValue;
                break;
            case 7:
                sCategCd2 = (String) foValue;
                break;
            case 8:
                sCategCd3 = (String) foValue;
                break;
            case 9:
                sCategCd4 = (String) foValue;
                break;
            case 10:
                sBrandCde = (String) foValue;
                break;
            case 11:
                sModelCde = (String) foValue;
                break;
            case 12:
                sColorCde = (String) foValue;
                break;
            case 13:
                sMeasurID = (String) foValue;
                break;
            case 14:
                sInvTypCd = (String) foValue;
                break;
            case 15:
                nUnitPrce = (Number) foValue;
                break;
            case 16:
                nSelPrice = (Number) foValue;
                break;
            case 17:
                nDiscLev1 = (Number) foValue;
                break;
            case 18:
                nDiscLev2 = (Number) foValue;
                break;
            case 19:
                nDiscLev3 = (Number) foValue;
                break;
            case 20:
                nDealrDsc = (Number) foValue;
                break;
            case 21:
                cWSubUnit = (String) foValue;
                break;
            case 22:
                cWithBOMx = (String) foValue;
                break;
            case 23:
                cComboInv = (String) foValue;
                break;
            case 24:
                cWthPromo = (String) foValue;
                break;
            case 25:
                cSerialze = (String) foValue;
                break;
            case 26:
                cUnitType = (String) foValue;
                break;
            case 27:
                cInvStatx = (String) foValue;
                break;
            case 28:
                cWthExprt = (String) foValue;
                break;
            case 29:
                sSupersed = (String) foValue;
                break;
            case 30:
                cNoExpiry = (String) foValue;
                break;
            case 31:
                cRecdStat = (String) foValue;
                break;
            case 32:
                sModified = (String) foValue;
                break;
            case 33:
                dModified = (Date) foValue;
                break;
        }
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0) {
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    public void list() {
        Stream.of(laColumns).forEach(System.out::println);
    }
}
