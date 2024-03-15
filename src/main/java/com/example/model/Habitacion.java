package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Habitacion {
	private int codigo;
	private String caracteristicas;
	private String tipo;
	private String camas;
	private String estado;
	
	public Habitacion() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCamas() {
		return camas;
	}

	public void setCamas(String camas) {
		this.camas = camas;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
