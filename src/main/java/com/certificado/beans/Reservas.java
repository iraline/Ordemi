package com.certificado.beans;

public class Reservas {
	
	private int id;
	private int idUsuario;
	private int idAula;
	private boolean participa;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public boolean isParticipa() {
		return participa;
	}
	public void setParticipa(boolean participa) {
		this.participa = participa;
	}
	
}
