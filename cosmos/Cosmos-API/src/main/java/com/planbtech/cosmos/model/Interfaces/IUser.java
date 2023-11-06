package com.planbtech.cosmos.model.Interfaces;


import com.planbtech.cosmos.model.entites.Person;

/**
 * Interface de Molde para a classe Usuario
 */
public interface IUser {

    /**
     * Metodo para pegar a Pessoa ao qual o Usuario esta ligado
     *
     * @return {@code Person} que o usuario esta lidado
     */
    public Person getPerson();

    /**
     * metodo para pegar a senha do Usuario
     *
     * @return {@code String} a senha do usuario
     */
    public String getPassword();

    /**
     * Metodo para vincularum uma pessoa ao usuario
     *
     * @param pessoa a pessoa aser vinculada
     */
    public void setPerson(Person pessoa);

    /**
     * Metodo para inserir a senha do usuario
     *
     * @param password senha a ser inserida
     */
    public void setPassword(String password);

}
