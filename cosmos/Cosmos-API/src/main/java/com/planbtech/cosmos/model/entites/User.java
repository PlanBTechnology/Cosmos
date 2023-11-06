package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IUser;
import jakarta.persistence.*;

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
    private Long id;

    /**
     * Propriedade Chave estrangeira que liga a tabela Pessoas
     */
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Person pessoa;

    /**
     * Propiedade Senha
     */
    private String password;

    /**
     * Metodo para pegar a Pessoa ao qual o Usuario esta ligado
     *
     * @return {@code Person} que o usuario esta lidado
     */
    @Override
    public Person getPerson() {
        return null;
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
     * @param pessoa a pessoa aser vinculada
     */
    @Override
    public void setPerson(Person pessoa) {

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
