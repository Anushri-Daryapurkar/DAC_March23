package org.assignment;
import java.util.*;

class Details {
	private String vehicleType;
	private int  numAxles;
	private double distanceTravelled;
	private double tollFee;
	private double totalAmountDue;


	Details(){
	
	}


	void calculateTollFee(){
		if (vehicleType.equals("Car") || vehicleType.equals("Van") || vehicleType.equals("Bus")){
			tollFee = 0.25 * numAxles * distanceTravelled;
		}
		else if (vehicleType.equals("Truck")){
			tollFee = 0.5 * numAxles *distanceTravelled;
		}
		totalAmountDue = tollFee + 2.0;
		System.out.println("Toll Fee: " + tollFee);
	}

	void generatebill(){
		System.out.println("Vehicle type: " + vehicleType);
		System.out.println("No. of Axles: " + numAxles);
		System.out.println("Distance Travelled: "+ distanceTravelled);
		System.out.println("Toll fee: " + tollFee);
		System.out.println("Total amount due: " + totalAmountDue);
	}

	void Menu(){
   
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("1. Enter vehicle type(Car/Van/Bus/Truck)");
			System.out.println("2. Enter number of axles");
			System.out.println("3. Enter distance travelled");
			System.out.println("4. Calculate toll fee");
			System.out.println("5.Generate bill");
			System.out.println("6. Exit");
			choice = sc.nextInt();
       
       
    
			switch(choice){
			case 1:
				System.out.println("1. Enter vehicle type(Car/Van/Bus/Truck)");
				vehicleType = sc.next();		
				break;

        case 2:
        System.out.print("2. Enter number of axles");
        numAxles = sc.nextInt();
        sc.nextLine();
        break;

        case 3:
        System.out.println("3. Enter distance travelled");
        distanceTravelled = sc.nextDouble();
        break;

        case 4:
        calculateTollFee();
        System.out.println("4. Calculate toll fee");
        break;

        case 5:
        generatebill();
        break;
        
        case 6:
        System.out.println("exiting");
        break;

        default:
        System.out.println("Invalid choice.");
    }


   } 

   while(choice !=6);
    
}

} 


class Program7 {
    public static void main(String[] args) {
        Details dt = new Details(); 
        dt.Menu();
        
    }
}
