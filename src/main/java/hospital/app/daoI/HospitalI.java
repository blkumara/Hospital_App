package hospital.app.daoI;

import java.util.List;

import hospital.app.dto.Hospital;
import hospital.app.dto.User;

public interface HospitalI {

	boolean createHospital(Hospital hospital);

	Hospital getHospitalById(int hospital_id);

	boolean removeHospital(int hospital_id);

	boolean updateHospital(int hospital_id,Hospital hospital);

	List<Hospital> getAllHospital();

}
