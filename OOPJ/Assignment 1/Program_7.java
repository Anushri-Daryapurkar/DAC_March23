/*
 * Write a program to perform below operations on byte type to get: 
 * a. The number of bits used to represent a byte value 
 * b. The number of bytes used to represent a byte value 
 * c. The minimum value a byte 
 * d. The maximum value a byte Reference:https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
 */

class Program_7 {
    public static void main(String args[])
    {
    System.out.println("No. of bits used to represent byte value: "+ Byte.SIZE);
    System.out.println("No. of bytes used to represent byte value: "+ Byte.BYTES);
    System.out.println("The Minimum value of byte: "+ Byte.MIN_VALUE);
    System.out.println("The Maximum value of byte: "+ Byte.MAX_VALUE);
    }

    
}
