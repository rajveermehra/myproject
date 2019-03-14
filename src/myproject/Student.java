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
@Table(name = "student", catalog = "mess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findBySrno", query = "SELECT s FROM Student s WHERE s.srno = :srno"),
    @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name"),
    @NamedQuery(name = "Student.findByRollno", query = "SELECT s FROM Student s WHERE s.rollno = :rollno"),
    @NamedQuery(name = "Student.findByClass1", query = "SELECT s FROM Student s WHERE s.class1 = :class1"),
    @NamedQuery(name = "Student.findBySem", query = "SELECT s FROM Student s WHERE s.sem = :sem"),
    @NamedQuery(name = "Student.findByPhone", query = "SELECT s FROM Student s WHERE s.phone = :phone"),
    @NamedQuery(name = "Student.findByStatus", query = "SELECT s FROM Student s WHERE s.status = :status"),
    @NamedQuery(name = "Student.findByAccountno", query = "SELECT s FROM Student s WHERE s.accountno = :accountno")})
public class Student implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Srno")
    private int srno;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "Rollno")
    private String rollno;
    @Basic(optional = false)
    @Column(name = "Class")
    private String class1;
    @Basic(optional = false)
    @Column(name = "Sem")
    private int sem;
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @Column(name = "Accountno")
    private String accountno;

    public Student() {
    }

    public Student(String rollno) {
        this.rollno = rollno;
    }

    public Student(String rollno, int srno, String name, String class1, int sem, String phone, String status, String accountno) {
        this.rollno = rollno;
        this.srno = srno;
        this.name = name;
        this.class1 = class1;
        this.sem = sem;
        this.phone = phone;
        this.status = status;
        this.accountno = accountno;
    }

    public int getSrno() {
        return srno;
    }

    public void setSrno(int srno) {
        int oldSrno = this.srno;
        this.srno = srno;
        changeSupport.firePropertyChange("srno", oldSrno, srno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        String oldRollno = this.rollno;
        this.rollno = rollno;
        changeSupport.firePropertyChange("rollno", oldRollno, rollno);
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        String oldClass1 = this.class1;
        this.class1 = class1;
        changeSupport.firePropertyChange("class1", oldClass1, class1);
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        int oldSem = this.sem;
        this.sem = sem;
        changeSupport.firePropertyChange("sem", oldSem, sem);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        String oldAccountno = this.accountno;
        this.accountno = accountno;
        changeSupport.firePropertyChange("accountno", oldAccountno, accountno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollno != null ? rollno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.rollno == null && other.rollno != null) || (this.rollno != null && !this.rollno.equals(other.rollno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.Student[ rollno=" + rollno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
