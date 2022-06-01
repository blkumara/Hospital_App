package hospital.app.BranchController;

import hospital.app.ServiceImpl.BranchServiceImpl;
import hospital.app.dto.Branch;

public class SaveBranch {
	
	public static void main(String[] args) {
		Branch  branchdto = new Branch() ;
		branchdto.setPhone(7001444676l);
		branchdto.setName("appolo BTM");
		branchdto.setEmail("btm.appolo@mail.com");
		
		BranchServiceImpl branchServiceImpl =  new BranchServiceImpl() ;
		branchServiceImpl.saveBranch(1, branchdto) ;
	}

}
