package com.sp.senac.imperio_imoveis.model;

import javax.persistence.*;

@Entity
@Table(name="corretor")
public class CorretorEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String emailCorretor;
    @Column
    private String creciCorretor;
    @Column
    private String senhaCorretor;
    @Column
    private String nomeCorretor;

    public CorretorEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailCorretor() {
        return emailCorretor;
    }

    public void setEmailCorretor(String emailCorretor) {
        this.emailCorretor = emailCorretor;
    }

    public String getCreciCorretor() {
        return creciCorretor;
    }

    public void setCreciCorretor(String creciCorretor) {
        this.creciCorretor = creciCorretor;
    }

    public String getSenhaCorretor() {
        return senhaCorretor;
    }

    public void setSenhaCorretor(String senhaCorretor) {
        this.senhaCorretor = senhaCorretor;
    }

    public String getNomeCorretor() {
        return nomeCorretor;
    }

    public void setNomeCorretor(String nomeCorretor) {
        this.nomeCorretor = nomeCorretor;
    }

    @Override
    public String toString() {
        return "CorretorEntity{" +
                "id=" + id +
                ", email='" + emailCorretor + '\'' +
                ", creci='" + creciCorretor + '\'' +
                ", senha='" + senhaCorretor + '\'' +
                ", nome='" + nomeCorretor + '\'' +
                '}';
    }
}
