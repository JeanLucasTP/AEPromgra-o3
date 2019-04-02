package br.unicesumar.ads.tarefarestservice;

import javax.persistence.Entity;



@Entity
public class tarefa {	
	@Id
	private int id;
	private String descricao;
	private String dataCriacao;
	private Status situacao;
	private String responsavel;
	private float horasEstimadas;
	
	public enum Status {
		NAO_INICIADA,
		EM_PROGRESSO,
		TERMINADA,
		BLOQUEADA;
	}
	
	public tarefa(int id, String descricao, String dataCriacao,
			Status situacao, String responsavel, float horasEstimadas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.situacao = situacao;
		this.responsavel = responsavel;
		this.horasEstimadas = horasEstimadas;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Status getSituacao() {
		return situacao;
	}
	public void setSituacao(Status situacao) {
		this.situacao = situacao;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public float getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(float horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
}

	
	
	



