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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author z003j14c
 */
@Entity
@Table(name = "commentrate", catalog = "bucoopdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commentrate.findAll", query = "SELECT c FROM Commentrate c"),
    @NamedQuery(name = "Commentrate.findById", query = "SELECT c FROM Commentrate c WHERE c.id = :id"),
    @NamedQuery(name = "Commentrate.findByCommenttitle", query = "SELECT c FROM Commentrate c WHERE c.commenttitle = :commenttitle"),
    @NamedQuery(name = "Commentrate.findByProductid", query = "SELECT c FROM Commentrate c WHERE c.productid = :productid"),
    @NamedQuery(name = "Commentrate.findByRating", query = "SELECT c FROM Commentrate c WHERE c.rating = :rating"),
    @NamedQuery(name = "Commentrate.findByActive", query = "SELECT c FROM Commentrate c WHERE c.active = :active")})
public class Commentrate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "commenttitle")
    private String commenttitle;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentbody")
    private String commentbody;
    @Column(name = "productid")
    private Integer productid;
    @Column(name = "rating")
    private Integer rating;
    @Column(name = "active")
    private Boolean active;

    public Commentrate() {
    }

    public Commentrate(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommenttitle() {
        return commenttitle;
    }

    public void setCommenttitle(String commenttitle) {
        this.commenttitle = commenttitle;
    }

    public String getCommentbody() {
        return commentbody;
    }

    public void setCommentbody(String commentbody) {
        this.commentbody = commentbody;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
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
        if (!(object instanceof Commentrate)) {
            return false;
        }
        Commentrate other = (Commentrate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bucoop.model.Commentrate[ id=" + id + " ]";
    }
    
}
