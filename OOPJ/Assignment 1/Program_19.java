/*Write a program to perform below operations on long type to
get:
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long */


class Program_19 {
    public static void main(String args[])
    {
        System.out.println("No. of bits used to represent long value: "+ Long.SIZE);
        System.out.println("No. of bytes used to represent long value: "+ Long.BYTES);
        System.out.println("The Minimum value of long: "+ Long.MIN_VALUE);
        System.out.println("The Maximum value of long: "+ Long.MAX_VALUE);
    } 
}
