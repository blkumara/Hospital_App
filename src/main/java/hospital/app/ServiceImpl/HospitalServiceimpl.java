package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.ServiceI.HospitalServiceI;
import hospital.app.daoI.impl.HospitalDaoImpl;
import hospital.app.dto.Hospital;

public class HospitalServiceimpl implements HospitalServiceI {
	HospitalDaoImpl hospitalDaoImpl = new HospitalDaoImpl();

	public boolean createHospital(Hospital hospital) {
		if (hospitalDaoImpl.createHospital(hospital)) {
			return hospitalDaoImpl.createHospital(hospital);
		} else {
			System.out.println("hospital not saved");
			return false;
		}
	}

	public Hospital getHospitalById(int hospital_id) {
		if (hospitalDaoImpl.getHospitalById(hospital_id) != null) {
			return hospitalDaoImpl.getHospitalById(hospital_id);
		} else {
			System.out.println("hospital not found");
			return null;
		}
	}

	public boolean removeHospital(int hospital_id) {
		if (hospitalDaoImpl.removeHospital(hospital_id)) {
			return hospitalDaoImpl.removeHospital(hospital_id);
		} else {
			System.out.println("hospital not removed");
			return false;
		}
	}

	public boolean updateHospital(int hospital_id, Hospital hospital) {
		if (hospitalDaoImpl.updateHospital(hospital_id, hospital)) {
			return hospitalDaoImpl.updateHospital(hospital_id, hospital);
		} else {
			System.out.println("hospital not updated");
			return false;
		}
	}

	public List<Hospital> getAllHospital() {
		if (hospitalDaoImpl.getAllHospital() != null) {
			return hospitalDaoImpl.getAllHospital();
		} else {
			System.out.println("no records found");
			return null;
		}
	}

}
