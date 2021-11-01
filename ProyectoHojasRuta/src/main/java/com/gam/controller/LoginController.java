/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gam.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
//import javax.inject.Named;

//@Named
@SuppressWarnings("deprecation")
@ManagedBean(name = "loginController")
@RequestScoped
public class LoginController implements Serializable{
    
   	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
    
    private String selected;
    
    @PostConstruct
    public void init(){
        username = "";
        password = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String access(){
    	
        String dummy_user = "ed";
        String dummy_pass = "123";
        FacesContext context = FacesContext.getCurrentInstance();
        //I use JDBC PostgreSQL driver for find the users in table "users"
        /*if (username.equals(dummy_user) && password.equals(dummy_pass)) {
            //Here you must put your code to redirect or do something 
            context.addMessage(null, new FacesMessage("Ingreso Correctamente los datos",  "Ingreso Correctamente los datos") );
            return "menu";
        }
        else{
        	username="";
        	password="";
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error Verifique el usuario y la contraseña",  "Error Verifique el usuario y la contraseña") );
            return "index.xhtml";
        }*/
        System.out.println("******* ingreso a incioo HOME");
        return "faces/views/correspondenciaInterna";
    }
    public void limpiar() {
    	username="";
    	password="";
    }
    public String inicio() {
    	return "inicio";
    }
    
    public String diaSeleccionado() {
    	String seleccion="";
    	
    	switch (selected) {
		case "dia1": seleccion="Lunes";			
			break;
		case "dia2": seleccion="Martes";			
		break;

		default:
			
			break;
		}
    	return seleccion;
    }

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}
    
  
}
