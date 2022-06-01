package hospital.app.ServiceI;

import java.util.List;

import hospital.app.dto.Branch;

public interface BranchServiceI {
	boolean saveBranch(int hospital_id, Branch branch);

	Branch getBranchById(int id);

	boolean removeBranch(int id);

	boolean updateBranch(int id, Branch branch);

	List<Branch> getAllBranch();

	List<Branch> getAllBranchByHospitalId(int hospitl_id);
}
