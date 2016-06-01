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
@Table(name = "userall")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userall.findAll", query = "SELECT u FROM Userall u"),
    @NamedQuery(name = "Userall.findById", query = "SELECT u FROM Userall u WHERE u.id = :id"),
    @NamedQuery(name = "Userall.findByUsername", query = "SELECT u FROM Userall u WHERE u.username = :username"),
    @NamedQuery(name = "Userall.findByPassword", query = "SELECT u FROM Userall u WHERE u.password = :password"),
    @NamedQuery(name = "Userall.findByType", query = "SELECT u FROM Userall u WHERE u.type = :type"),
    @NamedQuery(name = "Userall.findByActive", query = "SELECT u FROM Userall u WHERE u.active = :active"),
    @NamedQuery(name = "Userall.findByIsapplicant", query = "SELECT u FROM Userall u WHERE u.isapplicant = :isapplicant"),
    @NamedQuery(name = "Userall.findByEmail", query = "SELECT u FROM Userall u WHERE u.email = :email"),
    @NamedQuery(name = "Userall.findByFirstname", query = "SELECT u FROM Userall u WHERE u.firstname = :firstname"),
    @NamedQuery(name = "Userall.findBySurname", query = "SELECT u FROM Userall u WHERE u.surname = :surname"),
    @NamedQuery(name = "Userall.findByEmailpriv", query = "SELECT u FROM Userall u WHERE u.emailpriv = :emailpriv"),
    @NamedQuery(name = "Userall.findByFirstnamepriv", query = "SELECT u FROM Userall u WHERE u.firstnamepriv = :firstnamepriv"),
    @NamedQuery(name = "Userall.findBySurnamepriv", query = "SELECT u FROM Userall u WHERE u.surnamepriv = :surnamepriv"),
    @NamedQuery(name = "Userall.findByAvatarpriv", query = "SELECT u FROM Userall u WHERE u.avatarpriv = :avatarpriv"),
    @NamedQuery(name = "Userall.findByAboutpriv", query = "SELECT u FROM Userall u WHERE u.aboutpriv = :aboutpriv")})
public class Userall implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "isapplicant")
    private boolean isapplicant;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "email")
    private String email;
    @Size(max = 40)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 40)
    @Column(name = "surname")
    private String surname;
    @Lob
    @Column(name = "avatar")
    private byte[] avatar;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "about")
    private String about;
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

    public Userall() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean getIsapplicant() {
        return isapplicant;
    }

    public void setIsapplicant(boolean isapplicant) {
        this.isapplicant = isapplicant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
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
    
}
