/*Write a program to find minimum and maximum number as well as
to add two integer numbers using methods of Integer. */

class Program_18 {

    public static void main(String args[])
    {
    int a = Integer.parseInt(args[ 0 ]);
    int b = Integer.parseInt(args[ 1 ]);
    int res = Integer.sum(a, b);
    System.out.println(res);
    
    int m = Integer.max(a,b);
    int n = Integer.min(a,b);
    System.out.println(m);
    System.out.println(n);

    }
}
