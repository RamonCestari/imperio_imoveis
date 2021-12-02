package com.sp.senac.imperio_imoveis.model;


import javax.persistence.*;

@Entity
@Table(name = "imagem_pre_cadastro_imovel")
public class ImagemPreCadastroImovelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private PreCadastroImovelEntity preCadastroImovel;
    @Column
    private String imagem;
    @Column
    private boolean destaque;

    public ImagemPreCadastroImovelEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PreCadastroImovelEntity getPreCadastroImovel() {
        return preCadastroImovel;
    }

    public void setPreCadastroImovel(PreCadastroImovelEntity preCadastroImovel) {
        this.preCadastroImovel = preCadastroImovel;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public boolean isDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }
}
