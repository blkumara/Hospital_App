package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.UserI;
import hospital.app.dto.User;

public class UserDaoImpl implements UserI{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public boolean saveUser(User user) {
		
		entityTransaction.begin();
		try {
			entityManager.persist(user);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;	}
	public User getUserById(int id) {
		return entityManager.find(User.class, id);

	}
	public User validateUser(String email, String password) {
		String sql = "SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<User> users = query.getResultList();

		return users.get(0);	}
	public boolean removeUser(int id) {
		User user = entityManager.find(User.class, id);

		entityTransaction.begin();
		try {
			entityManager.remove(user);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		}
	public boolean updateUser(int id, User user) {
		user.setId(id);
		entityTransaction.begin();
		try {
			entityManager.merge(user);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public List<User> getAllUser() {
		String sql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}


}
