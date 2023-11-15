package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IProfile;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.List;

/**
 * Entidade Perfil pra representar a tabela perfil no banco de dados
 */
@Entity
@Table(name = "Profiles")
public class Profile implements IProfile {
    /**
     * Propiedade Id como chave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Propriedade de lista das habilidades
     */


    /**
     * Metodo para pegar o Id do Perfil
     *
     * @return {@code int} o id do perfil
     */
    @Override
    public int getId() {
        return 0;
    }

    /**
     * Metodo para inserir o Id no objeto Perfil
     *
     * @param id a ser inserido
     */
    @Override
    public void setId(int id) {

    }

    /**
     * Metodo para pegar a lista de habilidades do Perfil
     *
     * @return {*code ArrayList{Abilitie}} uma lista com as habilidades no Perfil
     */
    @Override
    public ArrayList<Abilitie> getAbilities() {
        return null;
    }

    /**
     * Metodo para inseri uma lista de habilidades no Perfil, metodo depreciado
     *
     * @param abilities a lista as ser inserida no objeto Perfil
     *
     */
    @Override
    public void setAbilities(ArrayList<Abilitie> abilities) {

    }
}
