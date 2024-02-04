package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.Address;
import com.planbtech.cosmos.model.entites.Person;
import com.planbtech.cosmos.model.entites.User;
import org.springframework.beans.BeanUtils;

/**
 * Classe para realizar o controle das informações de Usuario a serem exibidas
 */
public class UserDTO {


    /**
     * Propriedade Codigo do Usuario
     */
    private Long id;

    /**
     * Propriedade Pessoa vinculada
     */
    private Person person;

    private String email;
    /**
     * Propriedade senha
     */
    private String password;


    /**
     * Construtor da classe vazio
     */
    public UserDTO() {

    }

    /**
     * Construtor da classe que monta a classe com base na entidade
     *
     * @param entity a ter as informações passadas
     */
    public UserDTO(User entity){
        BeanUtils.copyProperties(entity, this);
    }

    //Getters and setters

    /**
     * Metodo para pegar o codigo do Usuario
     *
     * @return {@code Long} o codigo do usuario
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo para inserir o codigo do Usuario
     *
     * @param id a ser inserido
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * metodo para pegar a senha do Usuario
     *
     * @return {@code String} a senha do usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo para inserir a senha do usuario
     *
     * @param password senha a ser inserida
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo para pegar a Pessoa ao qual o Usuario esta ligado
     *
     * @return {@code Person} que o usuario esta lidado
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Metodo para vincularum uma pessoa ao usuario
     *
     * @param person a pessoa aser vinculada
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
