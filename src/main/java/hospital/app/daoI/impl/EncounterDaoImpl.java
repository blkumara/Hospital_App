package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.EncounterI;
import hospital.app.dto.Branch;
import hospital.app.dto.Encounter;
import hospital.app.dto.Person;

public class EncounterDaoImpl implements EncounterI {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean saveEncounter(int branch_id, int person_id, Encounter encounter) {
		Person person = entityManager.find(Person.class, person_id);
		Branch branch = entityManager.find(Branch.class, branch_id);
		encounter.setPerson(person);
		encounter.setBranch(branch);

		entityTransaction.begin();
		try {
			entityManager.persist(encounter);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	public Encounter getEncounterById(int encounter_id) {

		return entityManager.find(Encounter.class, encounter_id);

	}

	public boolean removeEncounter(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		entityTransaction.begin();
		try {
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateEncounter(int encounter_id, Encounter encounter) {
		encounter.setEncounter_id(encounter_id);
		entityTransaction.begin();
		try {
			entityManager.merge(encounter);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Encounter> getAllEncounterByPerson(int person_id) {

		return null;
	}

	public List<Encounter> getAllEncounterByBranch(int branch_id) {
		String sql = "select e from Encounter e where e.branch.branch_id=" + branch_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public List<Encounter> getAllEncounterByStatus(String status) {
		String sql = "select e from Encounter e where e.status=" + status;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
