package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.MedOrderI;
import hospital.app.dto.Encounter;
import hospital.app.dto.Item;
import hospital.app.dto.MedOrder;

public class MedOrederDaoImpl implements MedOrderI {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean saveMedOrder(int encounter_id, MedOrder medOrder) {
		int sum = 0;
		for (Item item : medOrder.getItems()) {

			sum += item.getCost();
		}
		medOrder.setTotal(sum);
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		medOrder.setEncounter(encounter);
		entityTransaction.begin();
		try {
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public MedOrder getMedOrderById(int order_id) {
		return entityManager.find(MedOrder.class, order_id);
	}

	public boolean removeMedOrder(int order_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, order_id);
		entityTransaction.begin();
		try {
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateMedOrder(int medOrder_id, MedOrder medOrder) {
		medOrder.setMedOrder_id(medOrder_id);
		entityTransaction.begin();
		try {
			entityManager.merge(medOrder);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<MedOrder> getAllMedOrderEncounter(int encounter_id) {
		String sql = "select m from MedOrder m where m.encounter.enounter_id=" + encounter_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public List<MedOrder> getAllMedOrder() {
		String sql = "select m from MedOrderDto m ";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
