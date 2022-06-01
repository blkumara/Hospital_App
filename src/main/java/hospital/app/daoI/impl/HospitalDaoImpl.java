package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.HospitalI;
import hospital.app.dto.Hospital;

public class HospitalDaoImpl implements HospitalI {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean createHospital(Hospital hospital) {
		entityTransaction.begin();
		try {
			entityManager.persist(hospital);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Hospital getHospitalById(int hospital_id) {
		return entityManager.find(Hospital.class, hospital_id);

	}

	public boolean removeHospital(int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		entityTransaction.begin();
		try {
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateHospital(int hospital_id, Hospital hospital) {
		if (entityManager.find(Hospital.class, hospital_id) == null) {
			return false;

		}
		entityTransaction.begin();

		try {
			entityManager.merge(hospital);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
		return true;
	}

	public List<Hospital> getAllHospital() {
		Query query = entityManager.createQuery("select h Hospital h");

		return query.getResultList();

	}

}
