/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucoop.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author z003j14c
 */
@Entity
@Table(name = "memberrequest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memberrequest.findAll", query = "SELECT m FROM Memberrequest m"),
    @NamedQuery(name = "Memberrequest.findById", query = "SELECT m FROM Memberrequest m WHERE m.id = :id"),
    @NamedQuery(name = "Memberrequest.findByRequesterid", query = "SELECT m FROM Memberrequest m WHERE m.requesterid = :requesterid")})
public class Memberrequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "requesterid")
    private Integer requesterid;

    public Memberrequest() {
    }

    public Memberrequest(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRequesterid() {
        return requesterid;
    }

    public void setRequesterid(Integer requesterid) {
        this.requesterid = requesterid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Memberrequest)) {
            return false;
        }
        Memberrequest other = (Memberrequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bucoop.model.Memberrequest[ id=" + id + " ]";
    }
    
}
