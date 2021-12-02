package com.sp.senac.imperio_imoveis.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pre_cadastro_imovel")

public class PreCadastroImovelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column
    private String nomeProprietario, email;
    @Column
    private int telefone, whats;
    @Column
    private String endereco, numero, complemento;
    @Column
    private String cidade, uf, bairro;
    @Column
    private int cep;
    @Column
    private String tipoImovel;
    @Column
    private Boolean alugar;
    @Column
    private Boolean vender;
    @OneToMany
    private List<ImagemPreCadastroImovelEntity> imagens;

    public PreCadastroImovelEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getWhats() {
        return whats;
    }

    public void setWhats(int whats) {
        this.whats = whats;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public Boolean getAlugar() {
        return alugar;
    }

    public void setAlugar(Boolean alugar) {
        this.alugar = alugar;
    }

    public Boolean getVender() {
        return vender;
    }

    public void setVender(Boolean vender) {
        this.vender = vender;
    }

    @Override
    public String toString() {
        return "PreCadastroImovel{" +
                "nomeProprietario='" + nomeProprietario + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                ", whats=" + whats +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep=" + cep +
                '}';
    }
}
