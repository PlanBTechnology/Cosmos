package com.planbtech.cosmos.model.entites;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_beloging")
public class Beloging {

    @EmbeddedId
    private BeLonginPK id = new BeLonginPK();

    public Beloging() {

    }

    public Beloging(User user, Address address) {
        this.id.setUser(user);
        this.id.setAddress(address);
    }

    public BeLonginPK getId() {
        return id;
    }

    public void setId(BeLonginPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beloging beloging)) return false;

        return getId() != null ? getId().equals(beloging.getId()) : beloging.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
