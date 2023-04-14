/*Write a program to find minimum and maximum number 
as well as to add two float numbers using methods of Float. */

class Program_26 {
    public static void main(String args[])
    {
    float a = Float.parseFloat(args[ 0 ]);
    float b = Float.parseFloat(args[ 1 ]);
    float res = Float.sum(a, b);
    System.out.println(res);
    
    float m = Float.max(a,b);
    float n = Float.min(a,b);
    System.out.println(m);
    System.out.println(n);

    }
}
