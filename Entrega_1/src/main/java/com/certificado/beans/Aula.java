package com.certificado.beans;

public class Aula {

	private int id;					// identificador da aula
	private int idTemplateAula;		// identificador do template da aula
	private String professor; 		// nome do professor
	private int qtdAlunos; 			// quantidade de alunos por aula
	private String data;   			// data que a aula vai ocorrer
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdTemplateAula() {
		return idTemplateAula;
	}
	public void setIdTemplateAula(int idTemplateAula) {
		this.idTemplateAula = idTemplateAula;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	
	
}