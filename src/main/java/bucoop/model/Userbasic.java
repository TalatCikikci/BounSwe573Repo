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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author z003j14c
 */
@Entity
@Table(name = "userbasic", catalog = "bucoopdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userbasic.findAll", query = "SELECT u FROM Userbasic u"),
    @NamedQuery(name = "Userbasic.findById", query = "SELECT u FROM Userbasic u WHERE u.id = :id"),
    @NamedQuery(name = "Userbasic.findByUsername", query = "SELECT u FROM Userbasic u WHERE u.username = :username"),
    @NamedQuery(name = "Userbasic.findByPassword", query = "SELECT u FROM Userbasic u WHERE u.password = :password"),
    @NamedQuery(name = "Userbasic.findByType", query = "SELECT u FROM Userbasic u WHERE u.type = :type"),
    @NamedQuery(name = "Userbasic.findByActive", query = "SELECT u FROM Userbasic u WHERE u.active = :active")})
public class Userbasic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active")
    private boolean active;

    public Userbasic() {
    }

    public Userbasic(Integer id) {
        this.id = id;
    }

    public Userbasic(Integer id, String username, String password, String type, boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
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
        if (!(object instanceof Userbasic)) {
            return false;
        }
        Userbasic other = (Userbasic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bucoop.model.Userbasic[ id=" + id + " ]";
    }
    
}
