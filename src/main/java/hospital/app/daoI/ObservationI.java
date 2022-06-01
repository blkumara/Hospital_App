package hospital.app.daoI;

import java.util.List;

import hospital.app.dto.Observation;

public interface ObservationI {
	boolean saveObservation(int encounter_id,Observation observation);

	Observation getObservationById(int observation_id);

	boolean removeObservation(int observation_id);

	boolean updateObservation(int observation_id, Observation observation);

	List<Observation> getAllObservationByEncounter(int encounter_id);

	List<Observation> getAllObservation();

}
