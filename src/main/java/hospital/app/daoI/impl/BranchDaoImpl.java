package hospital.app.daoI.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital.app.daoI.BranchI;
import hospital.app.dto.Branch;
import hospital.app.dto.Hospital;

public class BranchDaoImpl implements BranchI {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean saveBranch(int hospital_id, Branch branch) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		branch.setHospital(hospital);
		entityTransaction.begin();
		try {
			entityManager.persist(branch);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public Branch getBranchById(int branch_id) {
		return entityManager.find(Branch.class, branch_id);

	}

	public boolean removeBranch(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		entityTransaction.begin();
		try {
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateBranch(int branch_id, Branch branch) {
		branch.setBranch_id(branch_id);
		entityTransaction.begin();
		try {
			entityManager.merge(branch);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public List<Branch> getAllBranch() {
		Query query=entityManager.createQuery("select b from Branch b");
		
		return query.getResultList();
	}

	public List<Branch> getAllBranchByHospitalId(int hospitl_id) {
		Query query=entityManager.createQuery("Select b from Branch b where b.hospital.id="+hospitl_id);
		return query.getResultList();
	}

}
