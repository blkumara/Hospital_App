package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.ObservationI;
import hospital.app.dto.Encounter;
import hospital.app.dto.Observation;

public class ObservationDaoImpl implements ObservationI {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public boolean saveObservation(int encounter_id, Observation observation) {
		
		Encounter encounter   = entityManager.find(Encounter.class, encounter_id);
		observation.setEncounter(encounter);
		entityTransaction.begin();
		try {
			entityManager.persist(observation);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	}
	public Observation getObservationById(int observation_id) {
		return entityManager.find(Observation.class, observation_id);
	}
	public boolean removeObservation(int observation_id) {
		Observation observation= entityManager.find(Observation.class, observation_id);
		entityTransaction.begin();
		try {
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	}
	public boolean updateObservation(int observation_id, Observation observation) {
		observation.setObservation_id(observation_id);
		entityTransaction.begin();
		try {
			entityManager.merge(observation);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			}
	}
	public List<Observation> getAllObservationByEncounter(int encounter_id) {
		String sql="select o from Observation o where o.encounter.encounter_id="+encounter_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();	}
	public List<Observation> getAllObservation() {
		String sql="select o from Observation o " ;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();	}
	

}
