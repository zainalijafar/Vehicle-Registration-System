import java.util.*;
public class TextUserInterface {
	
	private Scanner reader;
	private String userInput;
	private VehicleRegister vehicle;
	
	public TextUserInterface() {
		this.reader = new Scanner(System.in);
		this.vehicle = new VehicleRegister();
	}
	
	public void start() {
		
		while(true) {
			
			panelOutput();
			int userInput = convertStringtoInt(userInput());
			
			if (userInput ==1) {
				
				addVehicle();
				
			}else if (userInput == 2) {
				
				findVehicle();
				
			}else if (userInput == 3) {
				
				deleteVehicle();
				
			}else if (userInput == 4) {
				
				exit();
				
				if (internalUser()) {
					
					dispSystem();
					System.out.println("Thank you for using the System");
				}
				break;
			}
		}
	}
	
	public void panelOutput() {
		
		System.out.println("Welcome to Zain's Vehicle Registration System");
		System.out.println("---------------------------------------------");
		
		System.out.println("Choose an operation");
		System.out.println("[1] To Register your vehicle");
		System.out.println("[2] To retrieve your vehicle information");
		System.out.println("[3] To delete your vehicle from the system ");
		System.out.println("[4] To exit the program");
	}
	
	public void addVehicle() {
		
		System.out.println("Enter the country code of the car");
		String code = this.reader.nextLine();
		System.out.println("Enter the registration number");
		String number = this.reader.nextLine();
		RegistrationPlate newPlate = new RegistrationPlate(code,number);
		System.out.println("Who is the new owner of the car");
		String name = this.reader.nextLine();
		this.vehicle.add(newPlate,name);
	}
	
	public void findVehicle() {
		
		System.out.println("Enter the country code of the car");
		String code = this.reader.nextLine();
		System.out.println("Enter the registration number");
		String number = this.reader.nextLine();
		RegistrationPlate newPlate = new RegistrationPlate(code,number);
		System.out.println("The owner of the vehicle is " + this.vehicle.get(newPlate));
	}
	
	public void deleteVehicle() {
		
		System.out.println("Enter the country code of the car");
		String code = this.reader.nextLine();
		System.out.println("Enter the registration number");
		String number = this.reader.nextLine();
		RegistrationPlate newPlate = new RegistrationPlate(code,number);
		this.vehicle.delete(newPlate);
	}
	
	public void exit() {
		
		System.out.println("Thank you for using the Registration System. Have a good day");
	}
	
	public boolean internalUser() {
		
		String password = "systemxyz";
		System.out.println("Enter the password to access the system");
		String inputPassword = this.reader.nextLine();
		int counter = 1;
		
		while (!inputPassword.equals(password)) {
			
			System.out.println("Enter password again");
			inputPassword = this.reader.nextLine();
			counter ++;
			
			if (counter==5) {
				
				System.out.println("You have exceeded the number of tries");
				throw new IllegalArgumentException();
			}
			
			return false;	
		}
			System.out.println("You have logged into the system");
			return true;
	}
	
	public void dispSystem() {
		
		System.out.println("If you want to print the owners of all cars press [1]");
		String input = this.reader.nextLine();
		if (input.equals("1")) {
			
			this.vehicle.printRegistrationWithOwner();
		}
	}
	
	public String userInput() {
		
		this.userInput = this.reader.nextLine();
		return this.userInput;
	}
	
	public int convertStringtoInt(String input) {
		
		int a = Integer.parseInt(input);
		return a;
	}
}