package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.ServiceI.EncounterServiceI;
import hospital.app.daoI.impl.EncounterDaoImpl;
import hospital.app.dto.Encounter;

public class EncounterServiceImpl implements EncounterServiceI {
	EncounterDaoImpl encounterDaoImpl = new EncounterDaoImpl();

	public boolean saveEncounter(int branch_id, int person_id, Encounter encounter) {
		if (encounterDaoImpl.saveEncounter(person_id, branch_id, encounter)) {
			return encounterDaoImpl.saveEncounter(person_id, branch_id, encounter);
		} else {
			System.out.println("Encounter not saved");
			return false;
		}	}

	public Encounter getEncounterById(int encounter_id) {
		if (encounterDaoImpl.getEncounterById(encounter_id)!=null) {
			return encounterDaoImpl.getEncounterById(encounter_id);
		} else {
			System.out.println("Encounter not found");
			return null;
		}	}

	public boolean removeEncounter(int encounter_id) {
		if (encounterDaoImpl.removeEncounter(encounter_id)) {
			return encounterDaoImpl.removeEncounter(encounter_id);
		} else {
			System.out.println("Encounter not removed");
			return false;
		}	}

	public boolean updateEncounter(int encounter_id, Encounter encounter) {
		if (encounterDaoImpl.updateEncounter(encounter_id, encounter)) {
			return encounterDaoImpl.updateEncounter(encounter_id, encounter);
		} else {
			System.out.println("Encounter not updated");
			return false;
		}	}

	public List<Encounter> getAllEncounterByPerson(int person_id) {
		if (encounterDaoImpl.getAllEncounterByPerson(person_id) != null) {
			return encounterDaoImpl.getAllEncounterByPerson(person_id);
		} else {
			System.out.println("Encounter empty");
			return encounterDaoImpl.getAllEncounterByPerson(person_id);
		}	}

	public List<Encounter> getAllEncounterByBranch(int branch_id) {
		if (encounterDaoImpl.getAllEncounterByBranch(branch_id) != null) {
			return encounterDaoImpl.getAllEncounterByBranch(branch_id) ;
		} else {
			System.out.println("Encounter empty");
			return encounterDaoImpl.getAllEncounterByBranch(branch_id);
		}	}

	public List<Encounter> getAllEncounterByStatus(String status) {
		if (encounterDaoImpl.getAllEncounterByStatus(status) != null) {
			return encounterDaoImpl.getAllEncounterByStatus(status) ;
		} else {
			System.out.println("no encounters with given status");
			return encounterDaoImpl.getAllEncounterByStatus(status);
		}	}

}
