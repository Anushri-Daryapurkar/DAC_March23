/*Write a program to perform below operations on Double type to get: 
a. The number of bits used to represent a double value 
b. The number of bytes used to represent a double value 
c. The minimum value a double 
d. The maximum value a double */


class Program_27 {
    public static void main(String args[])
    {
        System.out.println("No. of bits used to represent double value: "+ Float.SIZE);
        System.out.println("No. of bytes used to represent doublr value: "+ Float.BYTES);
        System.out.println("The Minimum value of double: "+ Float.MIN_VALUE);
        System.out.println("The Maximum value of double: "+ Float.MAX_VALUE);
    } 
}
