package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.Abilitie;

import java.util.ArrayList;

public interface IProfile {

    //id,abilities
    public int getId();

    public void setId(int id);

    public ArrayList<Abilitie> getAbilities();

    public void setAbilities(ArrayList<Abilitie> abilities);
}
