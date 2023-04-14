/*Write a program to perform below operations on int type to
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer */



class Program_15 {
    public static void main(String args[])
    {
        System.out.println("No. of bits used to represent integer value: "+ Integer.SIZE);
        System.out.println("No. of bytes used to represent integer value: "+ Integer.BYTES);
        System.out.println("The Minimum value of integer: "+ Integer.MIN_VALUE);
        System.out.println("The Maximum value of integer: "+ Integer.MAX_VALUE);
    } 
    
}
