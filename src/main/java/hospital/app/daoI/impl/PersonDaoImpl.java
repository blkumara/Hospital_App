package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.PersonI;
import hospital.app.dto.Person;

public class PersonDaoImpl implements PersonI {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean savePerson(Person person) {
		entityTransaction.begin();
		try {
			entityManager.persist(person);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Person getPersonByPhone(long phone) {
		return  null;
	}

	public Person getPersonById(int person_id) {
		return entityManager.find(Person.class, person_id);
	}

	public boolean removePerson(int person_id) {
		Person person1 = entityManager.find(Person.class, person_id);

		entityTransaction.begin();
		try {
			entityManager.remove(person1);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updatePerson(int person_id, Person person) {
		person.setPerson_id(person_id);
		entityTransaction.begin();
		try {
			entityManager.merge(person);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Person> getAllPerson() {
		String sql="select p from Person p";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();	
		}


}
