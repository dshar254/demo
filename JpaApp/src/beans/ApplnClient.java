package beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ApplnClient {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaApp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		Employee empl = new Employee(); //--> for insert operation
		empl.setid(1001); 
		empl.setName("Ram");
		manager.persist(empl); 
		tran.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//for updation
		/*Query qry = manager.createQuery("update Employee e set e.name=?1 where e.id=?2");
		qry.setParameter(1, "Vidya Sagar");
		qry.setParameter(2, 1001 );
		int rows = qry.executeUpdate();
		tran.commit();
		System.out.println("no. of rows updated... "+rows);*/
		
		// for deletion
		/*Query delqry = manager.createQuery("delete from Employee e where e.id=?1");
		delqry.setParameter(1, 1002);
		delqry.executeUpdate();
		tran.commit();*/
		
		// to get single object
	/*	Employee empl = manager.find(Employee.class, 22);
		System.out.println(empl.getCode()+""+empl.getName());
		*/
		//To get all objects
		/*Query empls = manager.createQuery("from Employee");
		List<Employee> empList = empls.getResultList();
		for(Employee e : empList)
			System.out.println(e.getid()+"\t\t"+e.getName());
		manager.close();*/
		System.out.println("success");
		
	}
}
