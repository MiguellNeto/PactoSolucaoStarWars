package com.padwan.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.padwan.test.extra.TipoDeStatus;

@Entity
public class Jedi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //ATRIBUTOS
    private Integer id;
    private String nome;
    private TipoDeStatus tipoDeStatus;
    private String mentor;
    private String aprendiz;
    private float midichlorians;
    
    //CONSTRUTOR DEFAULT
    public Jedi() {
    	
    }
    
    //CONSTRUTOR PASSANDO PARAMETROS
    public Jedi(Integer id, String nome, TipoDeStatus tipoDeStatus, String mentor, float midichlorians, String aprendiz) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipoDeStatus = tipoDeStatus;
		this.mentor = mentor;
		this.aprendiz = aprendiz;
		this.midichlorians = midichlorians;
	}

    
    //Gets e Sets
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public TipoDeStatus getTipoDeStatus() {
		return tipoDeStatus;
	}

	public void setTipoDeStatus(TipoDeStatus tipoDeStatus) {
		this.tipoDeStatus = tipoDeStatus;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public float getMidichlorians() {
		return midichlorians;
	}

	public void setMidichlorians(float midichlorians) {
		this.midichlorians = midichlorians;
	}

	public String getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(String aprendiz) {
		this.aprendiz = aprendiz;
	}
    
	
    
}
