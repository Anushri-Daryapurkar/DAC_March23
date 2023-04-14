/*Write a program to find minimum and maximum number 
as well as to add two double numbers using methods of Double. */

class Program_30 {
    public static void main(String args[])
    {
    double a = Double.parseDouble(args[ 0 ]);
    double b = Double.parseDouble(args[ 1 ]);
    double res = Double.sum(a, b);
    System.out.println(res);
    
    double m = Double.max(a,b);
    double n = Double.min(a,b);
    System.out.println("max:" + m);
    System.out.println("min:" + n);
    }
}
