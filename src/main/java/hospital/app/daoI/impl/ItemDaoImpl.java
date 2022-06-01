package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.ItemI;
import hospital.app.dto.Item;
import hospital.app.dto.MedOrder;

public class ItemDaoImpl implements ItemI {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean saveItem(int medorder_id, Item item) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medorder_id);
		item.setMedOrder(medOrder);
		entityTransaction.begin();
		try {
			entityManager.persist(item);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Item getItemById(int item_id) {
		return entityManager.find(Item.class, item_id);
	}


	public boolean updateItem(int item_id, Item item) {
		item.setItem_id(item_id);
		entityTransaction.begin();
		try {
			entityManager.merge(item);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			}
	}

	public List<Item> getAllItemByOrder(int medorder_id) {
		String sql="select i from Item i where i.medOrder.medorder_id="+medorder_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();	}

	public List<Item> getAllItem() {
		String sql="select i from Item i";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();	}

	public boolean removeItem(int item_id) {
		Item item1= entityManager.find(Item.class, item_id);
		entityTransaction.begin();
		try {
			entityManager.remove(item1);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
