package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IProfile;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
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
    private Long id;

    @OneToOne
    @JoinColumn(name="profileconf")
    private ProfileConf profileConf;

    @OneToMany
    @JoinColumn(name="code")
    private List<Abilitie> abilities;

    @OneToMany
    @JoinColumn(name="profileid")
    private List<JobProfile> jobProfiles;

    /**
     * Propriedade de lista das habilidades
     */

    /**
     * Metodo para pegar o Id do Perfil
     *
     * @return {@code int} o id do perfil
     */
    @Override
    public Long getId() {
        return this.id;
    }

    /**
     * Metodo para inserir o Id no objeto Perfil
     *
     * @param id a ser inserido
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo para pegar a lista de habilidades do Perfil
     *
     * @return {*code ArrayList{Abilitie}} uma lista com as habilidades no Perfil
     */
    @Override
    public List<Abilitie> getAbilities() {
        return this.abilities;
    }

    @Override
    public void setProfConf(ProfileConf profConf) {
        this.profileConf = profConf;
    }

    @Override
    public ProfileConf getProfConf() {
        return this.profileConf;
    }

    /**
     * Metodo para inseri uma lista de habilidades no Perfil, metodo depreciado
     *
     * @param abilities a lista as ser inserida no objeto Perfil
     *
     */
    @Override
    public void setAbilities(List<Abilitie> abilities) {
        this.abilities = abilities;
    }
}
