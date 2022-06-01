package hospital.app.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int observation_id;
	private String description;
	private String remarks;
	private LocalDateTime observation;
	private String doctorName;

	@ManyToOne
	@JoinColumn
	private Encounter encounter;

	public int getObservation_id() {
		return observation_id;
	}

	public void setObservation_id(int observation_id) {
		this.observation_id = observation_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDateTime getObservation() {
		return observation;
	}

	public void setObservation(LocalDateTime observation) {
		this.observation = observation;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

}
