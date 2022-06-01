package hospital.app.ObservationController;

import java.time.LocalDate;
import java.time.LocalTime;

import hospital.app.ServiceImpl.ObservationServiceImpl;
import hospital.app.dto.Observation;

public class SaveObservation {
	
	public static void main(String[] args) {
		Observation observation=new Observation();
		observation.setDescription("he is normal but needs some more medication");
		observation.setObservation(LocalDate.of(2021, 10, 22).now(2,5));
		observation.setDoctorName("kumara");
		observation.setRemarks("severe");
		
		ObservationServiceImpl impl=new ObservationServiceImpl();
		impl.saveObservation(1, observation);
	}

}
