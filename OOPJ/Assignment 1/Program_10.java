/*Write a program to perform below operations on char type to get: 
a. The number of bits used to represent a char value 
b. The number of bytes used to represent a char value c. 
The minimum value a char d. 
The maximum value a char
 */

class Program10 {
    public static void main(String args[])
    {
        System.out.println("No. of bits used to represent char value: "+ Character.SIZE);
        System.out.println("No. of bytes used to represent char value: "+ Character.BYTES);
        System.out.println("The Minimum value of char: "+ Character.MIN_VALUE);
        System.out.println("The Maximum value of char: "+ Character.MAX_VALUE);
    }    
}
