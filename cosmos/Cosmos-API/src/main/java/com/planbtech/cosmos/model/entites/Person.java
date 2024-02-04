package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IPerson;
import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Entidade Pessoa que representa a tabela Pessoas no Banco de Dados
 */
@Entity
@Table(name = "Persons")
public class Person implements IPerson {

    /**
     * Propiedade Id como chave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * Propriedade Nome
     */
    private String name;

    /**
     * Propriedade Data de nascimento
     */
    private LocalDate birthDate;

    /**
     * Propriedade CPF
     */
    private String cpf;

    /**
     * Propriedade Numero de Telefone
     */
    private String cellphone;

    /**
     * Propriedaade chave estrangeira Endereco que liga a tabela Endereco
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    /**
     * Propriedade Genero
     */
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "gender")
    private Gender gender;

    /**
     * Propriedade Estado Civil
     */
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "marital_status")
    private MaritalStatus maritalStatus;

    /**
     * Propriedade Escolaridade
     */
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "scholarity")
    private Scholarity scholarity;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Metodo para inserir o nome do usuario
     *
     * @param name String a ser inserida
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que pega a data de nascimento da Pessoa
     *
     * @return {@code LocalDate} data de nascimento do usuario
     */
    @Override
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    /**
     * Metodo para inserir data de nascimento de Pessoa
     *
     * @param birthDate recebe LocalDate a ser inserido
     */
    @Override
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Metodo que pega o CPF Pessoa
     *
     * @return {@code String} CPF da Pessoa
     */
    @Override
    public String getCpf() {
        return this.cpf;
    }

    /**
     * Metodo para inserir o CPF da Pessoa
     *
     * @param cpf String a ser inserida
     */
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Metodo que pega o numero de telefone da Pessoa
     *
     * @return {@code String} o numero de telefone da pessoa
     */
    @Override
    public String getCellphone() {
        return this.cellphone;
    }

    /**
     * Metodo para inseri o numero de telefone da Pessoa
     *
     * @param cellphone String numero de telefone
     */
    @Override
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * Metodo para pega o Endereco da Pessoa
     *
     * @return {@code Address} endereco da pessoa
     */
    @Override
    public Address getAdress() {
        return this.address;
    }

    /**
     * Metodo para inserir endereco da Pessoa
     *
     * @param adress o objeto endereco a ser inserido
     */
    @Override
    public void setAdress(Address adress) {
        this.address = adress;
    }

    /**
     * Metodo para pegar o genero da Pessoa
     *
     * @return {@code String} o genero da entidade
     */
    @Override
    public Gender getGender() {
        return this.gender;
    }

    /**
     * Metodo para inserir o genero da Pessoa
     *
     * @param gender string a ser inserida na entidade
     */
    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Metodo para pegar o estado civil da Pessoa
     *
     * @return {@code String} o estado civil da pessoa
     */
    @Override
    public MaritalStatus getMaritalStatus() {
       return this.maritalStatus;
    }

    /**
     * Metodo para inserir um estado civil da Pessoa
     *
     * @param maritalStatus o estado a ser inserido
     */
    @Override
    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * Metodo para pegar a escolaridade da Pessoa
     *
     * @return {@code String} o grau da escolaridade no objeto Pessoa
     */
    @Override
    public Scholarity getScholarity() {
        return this.scholarity;
    }

    /**
     * Metodo para inserir um grau de escolaridade na Pessoa
     *
     * @param scholarity a ser inserida
     */
    @Override
    public void setScholarity(Scholarity scholarity) {
        this.scholarity = scholarity;
    }

    /**
     * Metodo para pegar o email da Pessoa
     *
     * @return {@code String} o email
     */

    /**
     * Metodo toString para retornar as informacoes
     *
     * @return informacoes do objeto como uma String
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", cpf='" + cpf + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", adress=" + address.toString() +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", escolarity='" + scholarity + '\'' +
                '}';
    }
}
