package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.ServiceI.ObeservationServiceI;
import hospital.app.daoI.impl.ObservationDaoImpl;
import hospital.app.dto.Observation;

public class ObservationServiceImpl implements ObeservationServiceI {
	ObservationDaoImpl observationDaoImpl=new ObservationDaoImpl();
	public boolean saveObservation(int encounter_id, Observation observation) {
		if (observationDaoImpl.saveObservation(encounter_id, observation)) {
			return observationDaoImpl.saveObservation(encounter_id, observation);
		} else {
			System.out.println("Observation not saved");
			return false;
		}
		
	}

	public Observation getObservationById(int observation_id) {
		if (observationDaoImpl.getObservationById(observation_id)!= null) {
			return observationDaoImpl.getObservationById(observation_id);
		} else {
			System.out.println("Observation not found");
			return null;
		}	}

	public boolean removeObservation(int observation_id) {
		if (observationDaoImpl.removeObservation(observation_id)) {
			return observationDaoImpl.removeObservation(observation_id);
		} else {
			System.out.println("Observation not removed");
			return false;
		}	}

	public boolean updateObservation(int observation_id, Observation observation) {
		if (observationDaoImpl.updateObservation(observation_id, observation)) {
			return observationDaoImpl.updateObservation(observation_id, observation);
		} else {
			System.out.println("Observation not updated");
			return false;
		}	}

	public List<Observation> getAllObservationByEncounter(int encounter_id) {
		if (observationDaoImpl.getAllObservationByEncounter(encounter_id) != null) {
			return observationDaoImpl.getAllObservationByEncounter(encounter_id) ;
		} else {
			System.out.println("Observation empty");
			return observationDaoImpl.getAllObservationByEncounter(encounter_id) ;
		}	}

	public List<Observation> getAllObservation() {
		if (observationDaoImpl.getAllObservation() != null) {
			return observationDaoImpl.getAllObservation() ;
		} else {
			System.out.println("Observation empty");
			return observationDaoImpl.getAllObservation() ;
		}	}

}
