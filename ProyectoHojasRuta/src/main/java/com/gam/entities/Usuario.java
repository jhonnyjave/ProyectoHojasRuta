package com.gam.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	@Column(name = "id",unique = true)
	private long id;
	@Column(name = "activo")
	private boolean activo;
	@Column(name = "contrasena")
	private String contrasena;
	@Column(name = "rol")
	private byte rol;
	@Column(name = "usuario",unique = true)
	private String usuario;

	public Usuario() {
	}

	public Usuario(boolean activo, String contrasena, byte rol, String usuario) {
		//super();
		this.activo = activo;
		this.contrasena = contrasena;
		this.rol = rol;
		this.usuario = usuario;
	}

	public Usuario(long id, boolean activo, String contrasena, byte rol, String usuario) {
		//super();
		this.id = id;
		this.activo = activo;
		this.contrasena = contrasena;
		this.rol = rol;
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public byte getRol() {
		return rol;
	}

	public void setRol(byte rol) {
		this.rol = rol;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}