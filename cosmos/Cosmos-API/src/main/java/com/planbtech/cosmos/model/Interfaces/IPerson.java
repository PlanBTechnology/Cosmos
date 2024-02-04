package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.Address;
import com.planbtech.cosmos.model.entites.Gender;
import com.planbtech.cosmos.model.entites.MaritalStatus;
import com.planbtech.cosmos.model.entites.Scholarity;

import java.time.LocalDate;

/**
 * Ineterface paa servir de molde para a entidade Pessoa
 */
public interface IPerson {

//name,birthDate,cpf,cellphone,adress,gender,maritalStatus,escolarity,email

    /**
     * Metodo que pega o Nome da Pessoa
     *
     * @return {@code String}
     */
    String getName();

    /**
     * Metodo para inserir o nome do usuario
     *
     * @param name String a ser inserida
     */
    void setName(String name);

    /**
     * Metodo que pega a data de nascimento da Pessoa
     *
     * @return {@code LocalDate} data de nascimento do usuario
     */
    LocalDate getBirthDate();

    /**
     * Metodo para inserir data de nascimento de Pessoa
     *
     * @param birthDate recebe LocalDate a ser inserido
     */
    void setBirthDate(LocalDate birthDate);

    /**
     * Metodo que pega o CPF Pessoa
     *
     * @return {@code String} CPF da Pessoa
     */
    String getCpf();

    /**
     * Metodo para inserir o CPF da Pessoa
     *
     * @param cpf String a ser inserida
     */
    void setCpf(String cpf);

    /**
     * Metodo que pega o numero de telefone da Pessoa
     *
     * @return {@code String} o numero de telefone da pessoa
     */
    String getCellphone();

    /**
     * Metodo para inseri o numero de telefone da Pessoa
     *
     * @param cellphone String numero de telefone
     */
    void setCellphone(String cellphone);

    /**
     * Metodo para pega o Endereco da Pessoa
     *
     * @return {@code Address} endereco da pessoa
     */
    Address getAdress();

    /**
     * Metodo para inserir endereco do objeto Pessoa
     *
     * @param adress o objeto endereco a ser inserido
     */
    void setAdress(Address adress);

    /**
     * Metodo para pegar o genero do objeto Pessoa
     *
     * @return {@code String} o genero da entidade
     */
    Gender getGender();

    /**
     * Metodo para inserir o genero do objeto pessoa
     *
     * @param gender string a ser inserida na entidade
     */
    void setGender(Gender gender);

    /**
     * Metodo para pegar o estado civil do objeto pessoa
     *
     * @return {@code String} o estado civil da pessoa
     */
    MaritalStatus getMaritalStatus();

    /**
     * Metodo para inserir um estado civil do objeto Pessoa
     *
     * @param maritalStatus o estado a ser inserido
     */
    void setMaritalStatus(MaritalStatus maritalStatus);

    /**
     * Metodo para pegar a escolaridade do objeto Pessoa
     *
     * @return {@code String} o grau da escolaridade no objeto Pessoa
     */
    Scholarity getScholarity();

    /**
     * Metodo para inserir um grau de escolaridade no objeto Pessoa
     *
     * @param scholarity a ser inserida
     */
    void setScholarity(Scholarity scholarity);


/**
 * Metodo toString para retornar as informações
 *
 * @return informacoes do objeto como uma String
 */

    String toString();

}
