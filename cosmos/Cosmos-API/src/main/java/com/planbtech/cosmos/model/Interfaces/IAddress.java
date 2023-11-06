package com.planbtech.cosmos.model.Interfaces;

/**
 * Interfac de molde para a entidade Address
 */
public interface IAddress {

    //Getters and Setters

    /**
     * Metodo que retornar o nome da rua que compoe a entidade Endereco
     *
     * @return {@code String} o nome da rua
     */
    public String getStreet();

    /**
     * Metodo que pega o nome da Cidade que compoee a entidade Endereco
     *
     * @return {@code String} o nome da Cidade
     */
    public String getCity();

    /**
     * Metodo que pega o estado que compoe a entidade Endereco
     *
     * @return {@code String} o estado
     */
    public String getState();

    /**
     * Metodo que pega o CEP que compoe a entidade Endereco
     *
     * @return {@code String} o CEP
     */
    public String getCEP();

    /**Metodo que pega o Numero ue compoe a entidade Endereco
     *
     * @return {@code Integer} o numero do endereco
     */
    public Integer getNumber();

    /**
     * Metodo para inserir um Srting como nome da Rua da entidade
     *
     * @param street String a ser inserida
     */
    public void setStreet(String street);

    /**
     * Metodo para inserir o nome da Cidade da entidade
     *
     * @param city Srting a ser inserida
     */
    public void setCity(String city);

    /**
     *Metodo para inserir o estado da entidade
     *
     * @param state String a ser inserida
     */
    public void setState(String state);

    /**
     * Metodo para inserir o CEP da entidade
     *
     * @param cep String a ser inserida
     */
    public void setCEP(String cep);

    /**
     * Metodo para inserir o numero da entidade
     *
     * @param number Integer a se inserido
     */
    public void setNumber(Integer number);


}
