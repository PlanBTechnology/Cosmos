package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IAddress;
import jakarta.persistence.*;



/**
 * Entidade que representa a tabela endereco no banco de dados
 */
@Entity(name="Addresses")
public class Address implements IAddress {

    /**
     * Propriedade id para ser a chave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Propriedade Rua
     */
    private String street;
    /**
     * Propiedade Cidade
     */
    private String city;

    /**
     * Propriedade Estado
     */
    @JoinColumn(name="state")
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private State state;

    /**
     * Propriedade CEP
     */
    private String CEP;

    /**
     * Propriedade Numero
     */
    private Integer number;


    /**
     * Metodo que retornar o nome da rua que compoe o Endereco
     *
     * @return {@code String} o nome da rua
     */
    @Override
    public String getStreet() {
        return this.street;
    }

    /**
     * Metodo que pega o nome da Cidade que compoee o Endereco
     *
     * @return {@code String} o nome da Cidade
     */
    @Override
    public String getCity() {
        return this.city;
    }

    /**
     * Metodo que pega o estado que compoe o Endereco
     *
     * @return {@code String} o estado
     */
    @Override
    public State getState() {
        return this.state;
    }

    /**
     * Metodo que pega o CEP que compoe o Endereco
     *
     * @return {@code String} o CEP
     */
    @Override
    public String getCEP() {
        return this.CEP;
    }

    /**Metodo que pega o Numero ue compoe o Endereco
     *
     * @return {@code Integer} o numero do endereco
     */
    @Override
    public Integer getNumber() {
        return this.number;
    }

    /**
     * Metodo para inserir um Srting como nome da Rua
     *
     * @param street String a ser inserida
     */
    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Metodo para inserir o nome da Cidade
     *
     * @param city Srting a ser inserida
     */
    @Override
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *Metodo para inserir o Estado
     *
     * @param state String a ser inserida
     */
    @Override
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Metodo para inserir o CEP
     *
     * @param cep String a ser inserida
     */
    @Override
    public void setCEP(String cep) {
        this.CEP = cep;
    }

    /**
     * Metodo para inserir o numero da entidade
     *
     * @param number Integer a se inserido
     */
    @Override
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Metodo que pega o id do Endereco
     *
     * @return {@code int} o identificador do endereco
     */
    public Long getId() {
        return id;
    }

    /**
     * Metdodo para inserir o id no Endereco
     *
     * @param id int a ser inserido
     */
    public void setId(Long id) {
        this.id = id;
    }
}
