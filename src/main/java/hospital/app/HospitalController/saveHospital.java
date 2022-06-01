package hospital.app.HospitalController;

import hospital.app.daoI.impl.HospitalDaoImpl;
import hospital.app.dto.Hospital;

public class saveHospital {
	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.setName("Apolo Hospital");
		hospital.setGst("karapo475");
		
		HospitalDaoImpl hospitalServiceImpl = new HospitalDaoImpl() ;
		hospitalServiceImpl.createHospital(hospital) ;
	}

}
