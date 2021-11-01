package com.gam.mb;

import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.gam.entities.Client;
import com.gam.entities.Usuario;
import com.gam.utils.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.type.StringType;

@ManagedBean
public class UsuarioMB {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void guardarUsuario() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Client cliente = new Client("Raul");
		// Usuario usuario = new Usuario(false, "123456", 0, "operador3");

		session.save(cliente);
		session.getTransaction().commit();
		session.close();
	}

	public void getUsuarios() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Iterator pujas = session.createQuery(
		          "from Client as puja where puja.id < ?")
		         .setLong(0, 1)
		         .iterate();
			while (pujas.hasNext() ) {
			   Client puja = (Client) pujas.next();
			   //hacer algo que no podemos expresar con la consulta
			}
			session.getTransaction().commit();
			session.close();
			
		
		
		
		
		
		//String sqlQuery = "select id,nombre from client";

//		Query consulta = session.createQuery("select id,nombre from Client");
//		consulta.setProperties(Client.class);
//		List<Client> list = consulta.list();
//		
//		for (Client client : list) {
//			System.out.println("Nombre " + client.getNombre());
//		}
		
//		 Query q = session.createQuery("From Client");
//         
//		 List<Client> res = q.list();
//		
//		
//		Query consulta = session.createQuery("from Client where id= :id");
//		consulta.setParameter("id", 1);
//		@SuppressWarnings("unchecked")
//		List<String> lista = consulta.list();
//		for (int i = 0; i < lista.size(); i++)
//        {
//            System.out.println("Nombre " + i + ": " + lista.get(i));
//        }

		
	}

}
