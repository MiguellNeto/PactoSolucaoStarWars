package com.padwan.test.dto;

import com.padwan.test.entity.Jedi;
import com.padwan.test.extra.TipoDeStatus;

public class JediDTO {

    private Integer id;
    private String nome;
    private TipoDeStatus tipoDeStatus;
    private String mentor;
    private String aprendiz;
	private float midichlorians;

    public JediDTO() {

    }
    
    public JediDTO(Integer id, String nome, TipoDeStatus tipoDeStatus, String mentor, float midichlorians, String aprendiz) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipoDeStatus = tipoDeStatus;
		this.mentor = mentor;
		this.midichlorians = midichlorians;
		this.aprendiz = aprendiz;
	}

	public JediDTO(Jedi jedi) {
        this.id = jedi.getId();
        this.nome = jedi.getNome();
        this.tipoDeStatus = jedi.getTipoDeStatus();
        this.mentor = jedi.getMentor();
        this.midichlorians = jedi.getMidichlorians();
        this.aprendiz = jedi.getAprendiz();
    }

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
