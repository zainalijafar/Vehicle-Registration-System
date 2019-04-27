import java.util.*;

public class VehicleRegister {

	private HashMap<RegistrationPlate,String> owners;
	
	public VehicleRegister() {
		
		this.owners = new HashMap<>();
	}
	
	public void add(RegistrationPlate plate,String owners) {
		
		this.owners.put(plate,owners);
	}
	
	public String get(RegistrationPlate plate) {
		
		if (this.owners.get(plate)==null) {
			
			return null;
		}
		return this.owners.get(plate);
	}
	
	public boolean delete(RegistrationPlate plate) {
		
		if (this.owners.get(plate) != null) {
			
			this.owners.remove(plate);
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public void printRegistrationPlates() {
		
		System.out.println("The Registration Plates are the following : ");
		
		for (RegistrationPlate k : this.owners.keySet()) {
			
			System.out.println(k);
		}
	}
	
	public void printOwners() {
		
		System.out.println("The owners of the car are the following : ");
		
		for (RegistrationPlate k : this.owners.keySet()) {
			
			System.out.println(this.owners.get(k));
		}
	}
	
	public void printRegistrationWithOwner() {
		
		for (RegistrationPlate k : this.owners.keySet()) {
			
			System.out.println("The car " + k + " is associated with this " +  this.owners.get(k) + " owner ");
		}
	}
}