package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.ServiceI.BranchServiceI;
import hospital.app.daoI.impl.BranchDaoImpl;
import hospital.app.dto.Branch;

public class BranchServiceImpl implements BranchServiceI{
	BranchDaoImpl branchDaoImpl=new  BranchDaoImpl();
	public boolean saveBranch(int hospital_id, Branch branch) {
		if (branchDaoImpl.saveBranch(hospital_id, branch)) {
			return branchDaoImpl.saveBranch(hospital_id, branch);
		} else {
			System.out.println("Branch not saved");
			return false;
		}	}

	public Branch getBranchById(int branch_id) {
		if (branchDaoImpl.getBranchById(branch_id) != null) {
			return branchDaoImpl.getBranchById(branch_id);
		} else {
			System.out.println("Branch not found");
			return null;
		}	}

	public boolean removeBranch(int branch_id) {
		if (branchDaoImpl.removeBranch(branch_id)) {
			return branchDaoImpl.removeBranch(branch_id);
		} else {
			System.out.println("Branch not removed");
			return false;
		}	}

	public boolean updateBranch(int branch_id, Branch branch) {
		if (branchDaoImpl.updateBranch(branch_id, branch)) {
			return branchDaoImpl.updateBranch(branch_id, branch);
		} else {
			System.out.println("Branch not updated");
			return false;
		}	}

	public List<Branch> getAllBranch() {
		if (branchDaoImpl.getAllBranch() != null) {
			return branchDaoImpl.getAllBranch();
		} else {
			System.out.println("Branch empty");
			return branchDaoImpl.getAllBranch();
		}
			}

	public List<Branch> getAllBranchByHospitalId(int hospitl_id) {
		if (branchDaoImpl.getAllBranchByHospitalId(hospitl_id) != null) {
			return branchDaoImpl.getAllBranchByHospitalId(hospitl_id);
		} else {
			System.out.println("Branch empty");
			return branchDaoImpl.getAllBranchByHospitalId(hospitl_id);
		}
	}

}
