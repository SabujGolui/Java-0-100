package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Mydto;

public class MyDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void Save(Mydto mydto) {
		entityTransaction.begin();
		entityManager.persist(mydto);
		entityTransaction.commit();

		System.out.println("Data Inserted");
	}

	public List<Mydto> Check(String email) {

		List<Mydto> list = entityManager.createQuery("select x from Mydto x where email = ?1").setParameter(1, email)
				.getResultList();

		return list;
	}

	public Mydto login(long id) {
		Mydto mydto = entityManager.find(Mydto.class, id);
		return mydto;
	}

	public List<Mydto> fetchAll() {
		List<Mydto> list = entityManager.createQuery("select x from Mydto x").getResultList();

		return list;
	}

	public Mydto fetchStudentInfoById(long id) {
		Mydto mydto = entityManager.find(Mydto.class, id);
		return mydto;
	}

	public void update(Mydto mydto) {
		entityTransaction.begin();
		entityManager.merge(mydto);
		entityTransaction.commit();
	}

	public void deleteById(Mydto mydto) {

		entityTransaction.begin();
		entityManager.remove(mydto);
		entityTransaction.commit();
	}
}
