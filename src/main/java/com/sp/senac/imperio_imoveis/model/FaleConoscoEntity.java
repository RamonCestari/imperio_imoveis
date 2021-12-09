package com.sp.senac.imperio_imoveis.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "fale_conosco")
public class FaleConoscoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome,
            email,
            mensagem,
            telefone;

    public FaleConoscoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "FaleConoscoEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
