package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.Abilitie;
import com.planbtech.cosmos.model.entites.ProfileConf;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface para moldar a classe Perfil
 */
public interface IProfile {

    /**
     * Metodo para pegar o Id do Perfil
     *
     * @return {@code int} o id do perfil
     */
    public Long getId();

    /**
     * Metodo para inserir o Id no objeto Perfil
     *
     * @param id a ser inserido
     */
    public void setId(Long id);

    /**
     * Metodo para pegar a lista de habilidades do Perfil
     *
     * @return {*code ArrayList{Abilitie}} uma lista com as habilidades no Perfil
     */
    public List<Abilitie> getAbilities();

    public void setProfConf(ProfileConf profConf);

    public ProfileConf getProfConf();



    /**
     * Metodo para inseri uma lista de habilidades no Perfil, metodo depreciado
     *
     * @param abilities a lista as ser inserida no objeto Perfil
     *
     */
    public void setAbilities(List<Abilitie> abilities);
}
