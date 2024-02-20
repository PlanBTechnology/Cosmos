package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IAbilitie;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * Entidade para represenat Habilidades no banco de dados
 */
@Entity
@Table(name = "Abilities")
public class Abilitie implements IAbilitie {

    /**
     * Propriedade para representar o codigo da habilidade, como sendo chave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Long code;

    /**
     * Propriedade para representar o nome dahabilidade
     */
    @NotEmpty
    private String name;

    /**
     * Propriedade para representar a classificacao da habilidade
     */
    @NotEmpty
    private String classification;

    /**
     * Propriedade para representar a pontuacao da habilidade
     */
    @NotNull
    private Double pontuation;

    /**
     * Metodo para pegar o codigo da habilidade
     *
     * @return {@code int }o codigo da habilidade
     */
    @Override
    public Long getCode() {
        return this.code;
    }

    /**
     * Metodo para criar ou alterar o codigo da habilidade
     *
     * @param code recebe o codigo a ser inserido
     */
    @Override
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * Metodo para pegar o nome da habilidade
     *
     * @return {@code  Sting} retorna o nome da habilidade
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Metodo para criar ou alterar o nome da habilidade
     *
     * @param name recebe o nome a ser inserido
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para pegar a classificacao da habilidade do usuario
     *
     * @return {@code String} a classificacao da habilidade de F a S
     */
    @Override
    public String getClassification() {
        return this.classification;
    }

    /**
     * Metodo para inserir ou alterar a classificacao da habilidade do usuario
     *
     * @param classification a classificacao a ser inserida de F a S
     */
    @Override
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * Metodo para pegar a pontuacao do usuariocom a habilidade
     *
     * @return a pontuacao do usuario
     */
    @Override
    public Double getPontuation() {
        return this.pontuation;
    }

    /**
     * Metodo para inserir ou alterar a pontuacao do usuario
     *
     * @param pontuation pontuacao a ser inserida
     */
    @Override
    public void setPontuation(Double pontuation) {
        this.pontuation = pontuation;
    }
}
