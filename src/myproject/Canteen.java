/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Rajveermehra
 */
@Entity
@Table(name = "canteen", catalog = "mess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Canteen.findAll", query = "SELECT c FROM Canteen c"),
    @NamedQuery(name = "Canteen.findByItemid", query = "SELECT c FROM Canteen c WHERE c.itemid = :itemid"),
    @NamedQuery(name = "Canteen.findByAccountno", query = "SELECT c FROM Canteen c WHERE c.accountno = :accountno"),
    @NamedQuery(name = "Canteen.findByItem", query = "SELECT c FROM Canteen c WHERE c.item = :item"),
    @NamedQuery(name = "Canteen.findByPrize", query = "SELECT c FROM Canteen c WHERE c.prize = :prize"),
    @NamedQuery(name = "Canteen.findByDay", query = "SELECT c FROM Canteen c WHERE c.day = :day")})
public class Canteen implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Itemid")
    private Integer itemid;
    @Basic(optional = false)
    @Column(name = "Accountno")
    private String accountno;
    @Basic(optional = false)
    @Column(name = "Item")
    private String item;
    @Basic(optional = false)
    @Column(name = "Prize")
    private String prize;
    @Basic(optional = false)
    @Column(name = "Day")
    private String day;

    public Canteen() {
    }

    public Canteen(Integer itemid) {
        this.itemid = itemid;
    }

    public Canteen(Integer itemid, String accountno, String item, String prize, String day) {
        this.itemid = itemid;
        this.accountno = accountno;
        this.item = item;
        this.prize = prize;
        this.day = day;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        Integer oldItemid = this.itemid;
        this.itemid = itemid;
        changeSupport.firePropertyChange("itemid", oldItemid, itemid);
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        String oldAccountno = this.accountno;
        this.accountno = accountno;
        changeSupport.firePropertyChange("accountno", oldAccountno, accountno);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        String oldItem = this.item;
        this.item = item;
        changeSupport.firePropertyChange("item", oldItem, item);
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        String oldPrize = this.prize;
        this.prize = prize;
        changeSupport.firePropertyChange("prize", oldPrize, prize);
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        String oldDay = this.day;
        this.day = day;
        changeSupport.firePropertyChange("day", oldDay, day);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canteen)) {
            return false;
        }
        Canteen other = (Canteen) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.Canteen[ itemid=" + itemid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
