/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smitn.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ito
 */
@Entity
@Table(name = "US_STATE", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "UsState.findAll", query = "SELECT u FROM UsState u")
    , @NamedQuery(name = "UsState.findByUsStateId", query = "SELECT u FROM UsState u WHERE u.usStateId = :usStateId")
    , @NamedQuery(name = "UsState.findByUsStateCd", query = "SELECT u FROM UsState u WHERE u.usStateCd = :usStateCd")
    , @NamedQuery(name = "UsState.findByUsStateNm", query = "SELECT u FROM UsState u WHERE u.usStateNm = :usStateNm")})
public class UsState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "US_STATE_ID", nullable = false)
    private Integer usStateId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "US_STATE_CD", nullable = false, length = 2)
    private String usStateCd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "US_STATE_NM", nullable = false, length = 30)
    private String usStateNm;
    @OneToMany(mappedBy = "usStateId")
    private Collection<UsCity> usCityCollection;
    @OneToMany(mappedBy = "usStateId")
    private Collection<Address> addressCollection;

    public UsState() {
    }

    public UsState(Integer usStateId) {
        this.usStateId = usStateId;
    }

    public UsState(Integer usStateId, String usStateCd, String usStateNm) {
        this.usStateId = usStateId;
        this.usStateCd = usStateCd;
        this.usStateNm = usStateNm;
    }

    public Integer getUsStateId() {
        return usStateId;
    }

    public void setUsStateId(Integer usStateId) {
        this.usStateId = usStateId;
    }

    public String getUsStateCd() {
        return usStateCd;
    }

    public void setUsStateCd(String usStateCd) {
        this.usStateCd = usStateCd;
    }

    public String getUsStateNm() {
        return usStateNm;
    }

    public void setUsStateNm(String usStateNm) {
        this.usStateNm = usStateNm;
    }

    public Collection<UsCity> getUsCityCollection() {
        return usCityCollection;
    }

    public void setUsCityCollection(Collection<UsCity> usCityCollection) {
        this.usCityCollection = usCityCollection;
    }

    public Collection<Address> getAddressCollection() {
        return addressCollection;
    }

    public void setAddressCollection(Collection<Address> addressCollection) {
        this.addressCollection = addressCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usStateId != null ? usStateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsState)) {
            return false;
        }
        UsState other = (UsState) object;
        if ((this.usStateId == null && other.usStateId != null) || (this.usStateId != null && !this.usStateId.equals(other.usStateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.smitn.entity.UsState[ usStateId=" + usStateId + " ]";
    }
    
}
