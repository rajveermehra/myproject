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
@Table(name = "messoff", catalog = "mess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Messoff.findAll", query = "SELECT m FROM Messoff m"),
    @NamedQuery(name = "Messoff.findByNostu", query = "SELECT m FROM Messoff m WHERE m.nostu = :nostu"),
    @NamedQuery(name = "Messoff.findByAccountno", query = "SELECT m FROM Messoff m WHERE m.accountno = :accountno"),
    @NamedQuery(name = "Messoff.findByDays", query = "SELECT m FROM Messoff m WHERE m.days = :days"),
    @NamedQuery(name = "Messoff.findByStartingDate", query = "SELECT m FROM Messoff m WHERE m.startingDate = :startingDate"),
    @NamedQuery(name = "Messoff.findByEndingDate", query = "SELECT m FROM Messoff m WHERE m.endingDate = :endingDate")})
public class Messoff implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Nostu")
    private int nostu;
    @Id
    @Basic(optional = false)
    @Column(name = "Accountno")
    private String accountno;
    @Basic(optional = false)
    @Column(name = "Days")
    private String days;
    @Basic(optional = false)
    @Column(name = "StartingDate")
    private String startingDate;
    @Basic(optional = false)
    @Column(name = "EndingDate")
    private String endingDate;

    public Messoff() {
    }

    public Messoff(String accountno) {
        this.accountno = accountno;
    }

    public Messoff(String accountno, int nostu, String days, String startingDate, String endingDate) {
        this.accountno = accountno;
        this.nostu = nostu;
        this.days = days;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public int getNostu() {
        return nostu;
    }

    public void setNostu(int nostu) {
        int oldNostu = this.nostu;
        this.nostu = nostu;
        changeSupport.firePropertyChange("nostu", oldNostu, nostu);
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        String oldAccountno = this.accountno;
        this.accountno = accountno;
        changeSupport.firePropertyChange("accountno", oldAccountno, accountno);
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        String oldDays = this.days;
        this.days = days;
        changeSupport.firePropertyChange("days", oldDays, days);
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        String oldStartingDate = this.startingDate;
        this.startingDate = startingDate;
        changeSupport.firePropertyChange("startingDate", oldStartingDate, startingDate);
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        String oldEndingDate = this.endingDate;
        this.endingDate = endingDate;
        changeSupport.firePropertyChange("endingDate", oldEndingDate, endingDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountno != null ? accountno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messoff)) {
            return false;
        }
        Messoff other = (Messoff) object;
        if ((this.accountno == null && other.accountno != null) || (this.accountno != null && !this.accountno.equals(other.accountno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.Messoff[ accountno=" + accountno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
