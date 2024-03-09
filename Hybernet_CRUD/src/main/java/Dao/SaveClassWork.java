package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.ClassWorks;

/**
 * This class provides methods to save ClassWorks entities to the database.
 */
public class SaveClassWork {

	// Create an EntityManagerFactory for the 'dev' persistence unit
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");

	// Create an EntityManager instance
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	// Create an EntityTransaction instance for managing transactions
	EntityTransaction entityTransaction = entityManager.getTransaction();

	/**
	 * Saves the given ClassWorks entity to the database.
	 *
	 * @param saveclasswork The ClassWorks entity to be saved.
	 */
	public void save(ClassWorks saveclasswork) {
		// Begin a new transaction
		entityTransaction.begin();

		// Persist the ClassWorks entity to the database
		entityManager.persist(saveclasswork);

		// Commit the transaction
		entityTransaction.commit();

		// Print a message indicating that data has been committed
		System.out.println("Data has been committed");
	}

	public void Update(ClassWorks saveclasswork) {
		// Begin a new transaction
		entityTransaction.begin();

		// Persist the ClassWorks entity to the database
		entityManager.merge(saveclasswork);

		// Commit the transaction
		entityTransaction.commit();

		// Print a message indicating that data has been committed
		System.out.println("Data has been Updated");

	}

	public void fetch(int id) {
		ClassWorks cw = entityManager.find(ClassWorks.class, id);
		System.out.println("C-id: " + cw.getC_id() + " C-Name: " + cw.getName() + " C-Email: " + cw.getEmail()
				+ " C-No: " + cw.getNo());

	}

	public void delete(int id) {
		ClassWorks cw = entityManager.find(ClassWorks.class, id);
		// Begin a new transaction
		entityTransaction.begin();

		// Persist the ClassWorks entity to the database
		entityManager.remove(cw);

		// Commit the transaction
		entityTransaction.commit();

		System.out.println("Deleted");

	}

	public void fetchAll() {
		// Query query = entityManager.createQuery("select x from ClassWorks x where
		// email=?1").setParameter(1,email); // email in input
//		Query query = entityManager.createQuery("select x from ClassWorks x");
//		List<ClassWorks> list = query.getResultList();
//
//		for (ClassWorks cw : list) {
//			System.out.println("C-id: " + cw.getC_id() + " C-Name: " + cw.getName() + " C-Email: " + cw.getEmail()
//					+ " C-No: " + cw.getNo());
//		}
		Query query = entityManager.createQuery("select x from ClassWorks x");
		List<ClassWorks> list = query.getResultList();

		for (ClassWorks cw : list) {
			System.out.println("C-id: " + cw.getC_id() + " C-Name: " + cw.getName() + " C-Email: " + cw.getEmail()
					+ " C-No: " + cw.getNo());
		}
	}
}
