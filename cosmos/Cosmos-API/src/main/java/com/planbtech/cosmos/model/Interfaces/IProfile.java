package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.Abilitie;

import java.util.ArrayList;

/**
 * Interface para moldar a classe Perfil
 */
public interface IProfile {

    /**
     * Metodo para pegar o Id do Perfil
     *
     * @return {@code int} o id do perfil
     */
    public int getId();

    /**
     * Metodo para inserir o Id no objeto Perfil
     *
     * @param id a ser inserido
     */
    public void setId(int id);

    /**
     * Metodo para pegar a lista de habilidades do Perfil
     *
     * @return {*code ArrayList{Abilitie}} uma lista com as habilidades no Perfil
     */
    public ArrayList<Abilitie> getAbilities();

    /**
     * Metodo para inseri uma lista de habilidades no Perfil, metodo depreciado
     *
     * @param abilities a lista as ser inserida no objeto Perfil
     *
     */
    public void setAbilities(ArrayList<Abilitie> abilities);
}
