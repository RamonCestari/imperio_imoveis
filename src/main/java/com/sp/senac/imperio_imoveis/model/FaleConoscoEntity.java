package com.sp.senac.imperio_imoveis.model;


import javax.persistence.*;

@Entity
@Table(name="cadastro_fale_conosco")
public class FaleConoscoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nomeCliente;
    @Column
    private String emailCliente;
    @Column
    private String mensagemCliente;
    @Column
    private int telefoneCliente;

    public FaleConoscoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getMensagemCliente() {
        return mensagemCliente;
    }

    public void setMensagemCliente(String mensagemCliente) {
        this.mensagemCliente = mensagemCliente;
    }

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public String toString() {
        return "FaleConoscoEntity{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", emailCliente='" + emailCliente + '\'' +
                ", mensagemCliente='" + mensagemCliente + '\'' +
                ", telefoneCliente=" + telefoneCliente +
                '}';
    }
}
