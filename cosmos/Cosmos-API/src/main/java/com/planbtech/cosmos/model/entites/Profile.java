package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IProfile;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Profiles")
public class Profile implements IProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Nullable
    private ArrayList<Abilitie> abilities = new ArrayList<>();

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public ArrayList<Abilitie> getAbilities() {
        return null;
    }

    @Override
    public void setAbilities(ArrayList<Abilitie> abilities) {

    }
}
