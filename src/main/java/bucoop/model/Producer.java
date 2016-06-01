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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author z003j14c
 */
@Entity
@Table(name = "producer", catalog = "bucoopdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producer.findAll", query = "SELECT p FROM Producer p"),
    @NamedQuery(name = "Producer.findById", query = "SELECT p FROM Producer p WHERE p.id = :id"),
    @NamedQuery(name = "Producer.findByProducername", query = "SELECT p FROM Producer p WHERE p.producername = :producername"),
    @NamedQuery(name = "Producer.findByLocation", query = "SELECT p FROM Producer p WHERE p.location = :location"),
    @NamedQuery(name = "Producer.findByActive", query = "SELECT p FROM Producer p WHERE p.active = :active")})
public class Producer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Size(max = 40)
    @Column(name = "producername")
    private String producername;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "producerdesc")
    private String producerdesc;
    @Size(max = 400)
    @Column(name = "location")
    private String location;
    @NotNull
    @Column(name = "active")
    private Boolean active;

    public Producer() {
    }

    public Producer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducername() {
        return producername;
    }

    public void setProducername(String producername) {
        this.producername = producername;
    }

    public String getProducerdesc() {
        return producerdesc;
    }

    public void setProducerdesc(String producerdesc) {
        this.producerdesc = producerdesc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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
        if (!(object instanceof Producer)) {
            return false;
        }
        Producer other = (Producer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bucoop.model.Producer[ id=" + id + " ]";
    }
    
}
