package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	Hospital() {

	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);

	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < doctors.size(); i++) {
				if (patients.size() > (i + (3 * j))) {
					doctors.get(i).assignPatient(patients.get(i + (3 * j)));
				}
			}
		}
	}
}
