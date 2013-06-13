package com.jamezp.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Vendor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id = null;

    @Column
    private String name;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String postalCode;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vendor)) {
            return false;
        }
        final Vendor other = (Vendor) obj;
        return id == null ? other.id == null : id.equals(other.id);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = prime * hash + (id == null ? 0 : id.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder(Vendor.class.getName());
        result.append("(");
        result.append("name=").append(getName()).append(',');
        result.append("street=").append(getStreet()).append(',');
        result.append("city=").append(getCity()).append(',');
        result.append("state=").append(getState()).append(',');
        result.append("postalCode=").append(getPostalCode()).append(',');
        return result.append(")").toString();
    }
}