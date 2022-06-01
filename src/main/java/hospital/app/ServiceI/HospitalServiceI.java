package hospital.app.ServiceI;

import java.util.List;

import hospital.app.dto.Hospital;

public interface HospitalServiceI {
	boolean createHospital(Hospital hospital);

	Hospital getHospitalById(int hospital_id);

	boolean removeHospital(int hospital_id);

	boolean updateHospital(int hospital_id,Hospital hospital);

	List<Hospital> getAllHospital();

}
