package hospital.app.ServiceI;

import java.util.List;

import hospital.app.dto.Encounter;

public interface EncounterServiceI {
	boolean saveEncounter(int branch_id, int person_id, Encounter encounter);

	Encounter getEncounterById(int encounter_id);

	boolean removeEncounter(int encounter_id);

	boolean updateEncounter(int encounter_id, Encounter encounter);

	List<Encounter> getAllEncounterByPerson(int person_id);

	List<Encounter> getAllEncounterByBranch(int branch_id);

	List<Encounter> getAllEncounterByStatus(String status);
}
