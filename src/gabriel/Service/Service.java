package gabriel.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import gabriel.Model.Cliente;

public class Service {

	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("GabrielMendonca");
	
	
	public void Save(Cliente cliente){
	EntityManager manege = fabrica.createEntityManager();	
		
	manege.getTransaction().begin();
	manege.persist(cliente);
	manege.getTransaction().commit();
	manege.close();
	
		
	}
	
	public List<Cliente> ListarTodos(){
		
	EntityManager manege = fabrica.createEntityManager();
	manege.getTransaction().begin();
	Query query  = manege.createQuery( "SELECT c FROM Cliente c");	
	manege.getTransaction().commit();
	
	
	
	return query.getResultList();	
	}
	
	
	
	
	
	
	
	
	
	
}
