import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user1 =new Users();
		user1.setEmail(null);
		user1.setFullname("gaurav arya");
		user1.setPassword("helloworld");
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.persist(user1);
       entityManager.close();
       entityManagerFactory.close();
    System.out.println("A Users object was persisted");   
	
	
	}

}
