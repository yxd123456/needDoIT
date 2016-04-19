package com.hz.greendao.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "EQUIMENT_INSTALL_TYPE".
 */
public class EquimentInstallType implements java.io.Serializable {

    private long id;
    private String barNameEn;
    private String towerMaterialType;
    private String scbz;
    private java.util.Date cjsj;
    private java.util.Date updateDate;
    private Integer voltageType;
    private Integer terrainId;
    private Integer belongId;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public EquimentInstallType() {
    }

    public EquimentInstallType(long id) {
        this.id = id;
    }

    public EquimentInstallType(long id, String barNameEn, String towerMaterialType, String scbz, java.util.Date cjsj, java.util.Date updateDate, Integer voltageType, Integer terrainId, Integer belongId) {
        this.id = id;
        this.barNameEn = barNameEn;
        this.towerMaterialType = towerMaterialType;
        this.scbz = scbz;
        this.cjsj = cjsj;
        this.updateDate = updateDate;
        this.voltageType = voltageType;
        this.terrainId = terrainId;
        this.belongId = belongId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBarNameEn() {
        return barNameEn;
    }

    public void setBarNameEn(String barNameEn) {
        this.barNameEn = barNameEn;
    }

    public String getTowerMaterialType() {
        return towerMaterialType;
    }

    public void setTowerMaterialType(String towerMaterialType) {
        this.towerMaterialType = towerMaterialType;
    }

    public String getScbz() {
        return scbz;
    }

    public void setScbz(String scbz) {
        this.scbz = scbz;
    }

    public java.util.Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(java.util.Date cjsj) {
        this.cjsj = cjsj;
    }

    public java.util.Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getVoltageType() {
        return voltageType;
    }

    public void setVoltageType(Integer voltageType) {
        this.voltageType = voltageType;
    }

    public Integer getTerrainId() {
        return terrainId;
    }

    public void setTerrainId(Integer terrainId) {
        this.terrainId = terrainId;
    }

    public Integer getBelongId() {
        return belongId;
    }

    public void setBelongId(Integer belongId) {
        this.belongId = belongId;
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public String toString() {
        return "EquimentInstallType{" +
                "id=" + id +
                ", barNameEn='" + barNameEn + '\'' +
                ", towerMaterialType='" + towerMaterialType + '\'' +
                ", scbz='" + scbz + '\'' +
                ", cjsj=" + cjsj +
                ", updateDate=" + updateDate +
                ", voltageType=" + voltageType +
                ", terrainId=" + terrainId +
                ", belongId=" + belongId +
                '}';
    }
    // KEEP METHODS END

}
