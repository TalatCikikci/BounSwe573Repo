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
@Table(name = "productall")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productall.findAll", query = "SELECT p FROM Productall p"),
    @NamedQuery(name = "Productall.findById", query = "SELECT p FROM Productall p WHERE p.id = :id"),
    @NamedQuery(name = "Productall.findByProductname", query = "SELECT p FROM Productall p WHERE p.productname = :productname"),
    @NamedQuery(name = "Productall.findByProductactive", query = "SELECT p FROM Productall p WHERE p.productactive = :productactive"),
    @NamedQuery(name = "Productall.findByCategoryname", query = "SELECT p FROM Productall p WHERE p.categoryname = :categoryname"),
    @NamedQuery(name = "Productall.findByProducername", query = "SELECT p FROM Productall p WHERE p.producername = :producername"),
    @NamedQuery(name = "Productall.findByProduceractive", query = "SELECT p FROM Productall p WHERE p.produceractive = :produceractive")})
public class Productall implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "categoryid")
    private int categoryid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "producerid")
    private int producerid;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Size(max = 40)
    @Column(name = "productname")
    private String productname;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "productdesc")
    private String productdesc;
    @Column(name = "productactive")
    private Boolean productactive;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "categoryname")
    private String categoryname;
    @Size(max = 40)
    @Column(name = "producername")
    private String producername;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "producerdesc")
    private String producerdesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "produceractive")
    private boolean produceractive;

    public Productall() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public Boolean getProductactive() {
        return productactive;
    }

    public void setProductactive(Boolean productactive) {
        this.productactive = productactive;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
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

    public boolean getProduceractive() {
        return produceractive;
    }

    public void setProduceractive(boolean produceractive) {
        this.produceractive = produceractive;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getProducerid() {
        return producerid;
    }

    public void setProducerid(int producerid) {
        this.producerid = producerid;
    }
    
}
