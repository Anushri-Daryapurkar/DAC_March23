/*Write a program to perform below operations on float type to get: 
a. The number of bits used to represent a float value 
b. The number of bytes used to represent a float value 
c. The minimum value a float 
d. The maximum value a float */


class Program_23 {
    public static void main(String args[])
    {
        System.out.println("No. of bits used to represent float value: "+ Float.SIZE);
        System.out.println("No. of bytes used to represent float value: "+ Float.BYTES);
        System.out.println("The Minimum value of float: "+ Float.MIN_VALUE);
        System.out.println("The Maximum value of float: "+ Float.MAX_VALUE);
    } 
}
