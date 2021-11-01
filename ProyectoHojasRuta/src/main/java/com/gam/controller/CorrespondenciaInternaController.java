package com.gam.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name = "correspondenciaInternaController")
@RequestScoped
public class CorrespondenciaInternaController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	
	 @PostConstruct
		public void init() {
			nombre = "";
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
	  public String access(){	    	
	        String dummyuser = "ed";
	        //FacesContext context = FacesContext.getCurrentInstance();
	
	        System.out.println("******* ingreso a incioo correspondencia interna");
	        return "faces/views/correspondenciaInterna";
	    }
	 
}
