package com.planbtech.cosmos.model.Interfaces;

/**
 * Inteface como forma de moldar a entidade Abilities
 */
public interface IAbilitie {


    /**
     * Metodo para pegar o codigo da habilidade
     *
     * @return {@code int }o codigo da habilidade
     */
    public int getCode();

    /**
     * Metodo para criar ou alterar o codigo da habilidade
     *
     * @param code recebe o codigo a ser inserido
     */
    public void setCode(int code);

    /**
     * Metodo para pegar o nome da habilidade
     *
     * @return {@code  Sting} retorna o nome da habilidade
     */
    public String getName();

    /**
     * Metodo para criar ou alterar o nome da habilidade
     *
     * @param name recebe o nome a ser inserido
     */
    public void setName(String name);

    /**
     * Metodo para pegar a classificacao da habilidade do usuario
     *
     * @return {@code String} a classificacao da habilidade de F a S
     */
    public String getClassification();

    /**
     * Metodo para inserir ou alterar a classificacao da habilidade do usuario
     *
     * @param classification a classificacao a ser inserida de F a S
     */
    public void setClassification(String classification);

    /**
     * Metodo para pegar a pontuacao do usuariocom a habilidade
     *
     * @return a pontuacao do usuario
     */
    public Double getPontuation();

    /**
     * Metodo para inserir ou alterar a pontuacao do usuario
     *
     * @param pontuation pontuacao a ser inserida
     */
    public void setPontuation(Double pontuation);
}
