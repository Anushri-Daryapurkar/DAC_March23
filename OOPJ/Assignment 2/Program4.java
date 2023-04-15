class ElectricityBill{
    String customerName;
    double unitsConsumed=350;
    double billAmount;

    ElectricityBill(){
        this.customerName = "Anushri";
        this.unitsConsumed = 340;
    }
    ElectricityBill(String customerName, double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }
    
    double calculateBillAmount(){
        if(unitsConsumed < 100)  {  
            billAmount = unitsConsumed * 5;  
        }    
        else if(unitsConsumed < 200){  
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;  
        }    
        else if(unitsConsumed > 300)  {  
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;  
        }  
        System.out.println("Electricity bill for "+ customerName+ " for " +unitsConsumed+ " units is : " + billAmount);
        return billAmount;
    }   
}

class Program4 {
    public static void main(String args[])
    {
        ElectricityBill e1 = new ElectricityBill();
        e1.calculateBillAmount();

        ElectricityBill e2 = new ElectricityBill("Ketki",120);
        e2.calculateBillAmount();
    }    
}
