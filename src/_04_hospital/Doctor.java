package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	boolean surgDone = false;
	boolean makesHouseCall = false;
	
	Doctor() {

	}
	
	public boolean performsSurgery() {
		return surgDone;
	}
	
	public boolean makesHouseCalls() {
		return makesHouseCall;
	}
	
	public void assignPatient(Patient patient) throws DoctorFullException {
		if(patients.size()<3) {
			patients.add(patient);
		} else {
			throw new DoctorFullException();
		}
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void doMedicine() {
		for(Patient patient : patients) {
			patient.checkPulse();
		}
	}
}
