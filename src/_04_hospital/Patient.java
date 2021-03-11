package _04_hospital;

public class Patient extends Doctor{
	
	boolean cared = false;
	
	Patient() {
		
	}
	
	public void checkPulse() {
		cared = true;
	}
	
	public boolean feelsCaredFor() {
		return cared;
	}
}
