package com.libapi.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "credit_info")
public class CreditInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "from_weight")
    private BigDecimal fromWeight;
    @Column(name = "to_weight")
    private BigDecimal toWeight;
    @Column(name = "party_id")
    private Integer partyId;
    @Column(name = "payment_type")
    private Integer paymentType;
    @Column(name = "mode_consign")
    private Integer modeConsign;
    @Column(name = "doc_dt")
    @Temporal(TemporalType.DATE)
    private Date docDt;
    @Column(name = "doc_time")
    @Temporal(TemporalType.TIME)
    private Date docTime;


    @Column(name = "weight")
    private String weight;

    @Column(name = "type")
    private String type;

    @Column(name = "location_id")
    private String locationId;

    @Column(name = "user_id")
    private String userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getFromWeight() {
        return fromWeight;
    }

    public void setFromWeight(BigDecimal fromWeight) {
        this.fromWeight = fromWeight;
    }

    public BigDecimal getToWeight() {
        return toWeight;
    }

    public void setToWeight(BigDecimal toWeight) {
        this.toWeight = toWeight;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getModeConsign() {
        return modeConsign;
    }

    public void setModeConsign(Integer modeConsign) {
        this.modeConsign = modeConsign;
    }

    public Date getDocDt() {
        return docDt;
    }

    public void setDocDt(Date docDt) {
        this.docDt = docDt;
    }

    public Date getDocTime() {
        return docTime;
    }

    public void setDocTime(Date docTime) {
        this.docTime = docTime;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CreditInfo(Integer id, BigDecimal fromWeight, BigDecimal toWeight, Integer partyId, Integer paymentType,
                      Integer modeConsign, Date docDt, Date docTime, String weight, String type, String locationId,
                      String userId) {
        super();
        this.id = id;
        this.fromWeight = fromWeight;
        this.toWeight = toWeight;
        this.partyId = partyId;
        this.paymentType = paymentType;
        this.modeConsign = modeConsign;
        this.docDt = docDt;
        this.docTime = docTime;
        this.weight = weight;
        this.type = type;
        this.locationId = locationId;
        this.userId = userId;
    }

    public CreditInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "CreditInfo [id=" + id + ", fromWeight=" + fromWeight + ", toWeight=" + toWeight + ", partyId=" + partyId
                + ", paymentType=" + paymentType + ", modeConsign=" + modeConsign + ", docDt=" + docDt + ", docTime="
                + docTime + ", weight=" + weight + ", type=" + type + ", locationId=" + locationId + ", userId="
                + userId + "]";
    }


}
