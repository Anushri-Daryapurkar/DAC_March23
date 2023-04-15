import java.util.Scanner;
class Telephone{
    String customerName;
    int phoneNumber;
    int numberOfCalls;
    double duration;

    void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        this.customerName = sc.nextLine();
        System.out.println("Enter phone Number:");
        this.phoneNumber = sc.nextInt();
        System.out.println("Enter Number of calls:");
        this.numberOfCalls = sc.nextInt();
        System.out.println("Enter duration of call:");
        this.duration = numberOfCalls * 1;
    }
    void getInfo(){
        System.out.println("Customer Name: "+ this.customerName);
        System.out.println("Phone Number: "+ this.phoneNumber);
        System.out.println("Number of Calls: "+ this.numberOfCalls);
        System.out.println("Duration of call: "+ this.duration);
    }

    double calculateBill(){
        double billAmount=0;
        if(numberOfCalls <= 100)  {  
            billAmount = (numberOfCalls * 50 * 1) + (10/100);  
        }    
        else if( numberOfCalls > 100){  
            billAmount = ((100 * 50 * 1) + ((numberOfCalls - 100) * 25 * 1)) + (10/100);  
        }    
        System.out.println("Telephone bill for "+ customerName+ " for " + numberOfCalls + " calls is : " + billAmount);
        return billAmount;
    }   
}

class Program5 {
    public static void main(String args[]){
    Telephone t = new Telephone();
    t.setInfo();
    t.getInfo();
    t.calculateBill();
    }
}
