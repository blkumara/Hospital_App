package hospital.app.daoI.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital.app.daoI.AddressI;
import hospital.app.dto.Address;
import hospital.app.dto.Branch;

public class AddressDaoImpl implements AddressI {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean saveAddress(int branch_id, Address address) {

		Branch branch = entityManager.find(Branch.class, branch_id);
		address.setBranch(branch);
		entityTransaction.begin();
		try {
			entityManager.persist(address);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Address getAddressById(int address_id) {
		return entityManager.find(Address.class, address_id);
	}

	public boolean removeAddress(int address_id) {
		Address address = entityManager.find(Address.class, address_id);
		entityTransaction.begin();
		try {

			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateAddress(Address address, int address_id) {
		address.setAddress_id(address_id);
		entityTransaction.begin();
		try {
			entityManager.merge(address);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
