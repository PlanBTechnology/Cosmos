package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IUser;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

/**
 * Entidade Usuario para representar a tabela Usuarios no banco de dados
 */
@Entity
@Table(name = "Users")
public class User implements IUser {

    /**
     * Propiedade Id como chave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    /**
     * Propriedade Chave estrangeira que liga a tabela Pessoas
     */
    @NotNull(message = "Pessoa nao pode ser nula")
    @JoinColumn
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Person.class, orphanRemoval = true)
    private Person person;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profileid")
    private Profile profile;

    /**
     * Propiedade Senha
     */
    private String password;

    private String email;

    public User() {
    }

    /**
     * Metodo para pegar a Pessoa ao qual o Usuario esta ligado
     *
     * @return {@code Person} que o usuario esta lidado
     */
    @Override
    public Person getPerson() {
        return person;
    }

    /**
     * metodo para pegar a senha do Usuario
     *
     * @return {@code String} a senha do usuario
     */
    @Override
    public String getPassword() {
        return this.password;
    }

    /**
     * Metodo para vincularum uma pessoa ao usuario
     *
     * @param person a pessoa aser vinculada
     */
    @Override
    public void setPerson(Person person) {
        this.person = person;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * Metodo para inserir a senha do usuario
     *
     * @param password senha a ser inserida
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Metodo para pegar o Id do Usuario
     *
     * @return {@code Long} o id do Usuario
     */
    public Long getId() {
        return id;
    }

    /**
     * mMetodo para inserir o id do Usuario
     *
     * @param id a ser inserido
     */
    public void setId(Long id) {
        this.id = id;
    }

}
