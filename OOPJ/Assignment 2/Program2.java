import java.util.Scanner;

class BMICalculator{
    double height;
    double weight;

    // BMICalculator( double height, double weight){ 
    //     this.height = height;
    //     this.weight = weight;
    // }

    BMICalculator( ){
        this.setValues(height, weight);
    }    

    public double calculateBMI(){
        double BMI = weight/(height*height);
        System.out.println("Calculated BMI: " + BMI);
        return BMI;
    }
    void setValues(double height, double weight ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Height : ");
        this.height = sc.nextDouble();
        System.out.print("Weight : ");
        this.weight = sc.nextDouble();  
        sc.close();
    }
}

class Program2{
    public static void main(String args[])
    {
        // BMICalculator b = new BMICalculator(1.6,60.50);
        // b.calculateBMI();
        BMICalculator b1 = new BMICalculator( ); 
        b1.calculateBMI( );
    }
}

