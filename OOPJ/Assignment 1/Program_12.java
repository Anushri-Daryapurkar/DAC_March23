/*Write a program to perform below operations on short type to
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short */

class Program12 {
    public static void main(String args[])
    {
        System.out.println("No. of bits used to represent short value: "+ Short.SIZE);
        System.out.println("No. of bytes used to represent short value: "+ Short.BYTES);
        System.out.println("The Minimum value of short: "+ Short.MIN_VALUE);
        System.out.println("The Maximum value of short: "+ Short.MAX_VALUE);
    } 
    
}
