
public class RegistrationPlate {

	private final String regCode; 
	private final String country;
	
	public RegistrationPlate(String regCode,String country) {
		
		this.regCode = regCode;
		this.country = country;
	}
	
	public boolean equals(Object object) {
		
		if (object == null) {
			
			return false;
		}
		
		if (getClass()!= object.getClass()) {
			
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		
		if (this.country == null) {
			
			return 100;
		}
		return this.country.hashCode();
	}
	
	public String toString() {
		
		return country + " " + regCode;
	}
}
