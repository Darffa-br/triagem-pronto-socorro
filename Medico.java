package com.triagem.model;

import jakarta.persistence.*;

@Entity
public class Medico {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String especialidade;
    private String crm;
    private boolean emPlantao;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getCrm() { return crm; }
    public void setCrm(String crm) { this.crm = crm; }

    public boolean isEmPlantao() { return emPlantao; }
    public void setEmPlantao(boolean emPlantao) { this.emPlantao = emPlantao; }
}
