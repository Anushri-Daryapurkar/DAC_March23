/*Write a program to find minimum and maximum number 
as well as to add two long numbers using methods of Long. */


class Program_22 {
    public static void main(String args[])
    {
    long a = Long.parseLong(args[ 0 ]);
    long b = Long.parseLong(args[ 1 ]);
    long res = Long.sum(a, b);
    System.out.println(res);
    
    long m = Long.max(a,b);
    long n = Long.min(a,b);
    System.out.println(m);
    System.out.println(n);

    }
    
}
