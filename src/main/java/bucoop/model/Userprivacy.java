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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author z003j14c
 */
@Entity
@Table(name = "userprivacy", catalog = "bucoopdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userprivacy.findAll", query = "SELECT u FROM Userprivacy u"),
    @NamedQuery(name = "Userprivacy.findById", query = "SELECT u FROM Userprivacy u WHERE u.id = :id"),
    @NamedQuery(name = "Userprivacy.findByEmailpriv", query = "SELECT u FROM Userprivacy u WHERE u.emailpriv = :emailpriv"),
    @NamedQuery(name = "Userprivacy.findByFirstnamepriv", query = "SELECT u FROM Userprivacy u WHERE u.firstnamepriv = :firstnamepriv"),
    @NamedQuery(name = "Userprivacy.findBySurnamepriv", query = "SELECT u FROM Userprivacy u WHERE u.surnamepriv = :surnamepriv"),
    @NamedQuery(name = "Userprivacy.findByAvatarpriv", query = "SELECT u FROM Userprivacy u WHERE u.avatarpriv = :avatarpriv"),
    @NamedQuery(name = "Userprivacy.findByAboutpriv", query = "SELECT u FROM Userprivacy u WHERE u.aboutpriv = :aboutpriv")})
public class Userprivacy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emailpriv")
    private boolean emailpriv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "firstnamepriv")
    private boolean firstnamepriv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "surnamepriv")
    private boolean surnamepriv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avatarpriv")
    private boolean avatarpriv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aboutpriv")
    private boolean aboutpriv;

    public Userprivacy() {
    }

    public Userprivacy(Integer id) {
        this.id = id;
    }

    public Userprivacy(Integer id, boolean emailpriv, boolean firstnamepriv, boolean surnamepriv, boolean avatarpriv, boolean aboutpriv) {
        this.id = id;
        this.emailpriv = emailpriv;
        this.firstnamepriv = firstnamepriv;
        this.surnamepriv = surnamepriv;
        this.avatarpriv = avatarpriv;
        this.aboutpriv = aboutpriv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getEmailpriv() {
        return emailpriv;
    }

    public void setEmailpriv(boolean emailpriv) {
        this.emailpriv = emailpriv;
    }

    public boolean getFirstnamepriv() {
        return firstnamepriv;
    }

    public void setFirstnamepriv(boolean firstnamepriv) {
        this.firstnamepriv = firstnamepriv;
    }

    public boolean getSurnamepriv() {
        return surnamepriv;
    }

    public void setSurnamepriv(boolean surnamepriv) {
        this.surnamepriv = surnamepriv;
    }

    public boolean getAvatarpriv() {
        return avatarpriv;
    }

    public void setAvatarpriv(boolean avatarpriv) {
        this.avatarpriv = avatarpriv;
    }

    public boolean getAboutpriv() {
        return aboutpriv;
    }

    public void setAboutpriv(boolean aboutpriv) {
        this.aboutpriv = aboutpriv;
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
        if (!(object instanceof Userprivacy)) {
            return false;
        }
        Userprivacy other = (Userprivacy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bucoop.model.Userprivacy[ id=" + id + " ]";
    }
    
}
