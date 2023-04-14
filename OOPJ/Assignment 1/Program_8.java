/*Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/
class Program_8 {
    //a. byte value into String
    public static void main1(String args[])
    {
        byte b = 123;
        String str = Byte.toString(b);
        System.out.println(str);
    }

    ///b. byte value into Byte instance.
    public static void main2(String args[])
    {
        byte b = 50;
        Byte b1 = Byte.valueOf(b);
        System.out.println(b1);
    }

    //c. String instance into Byte instance. 
    public static void main(String args[])
    {    
        String str = new String("123");
        Byte b = Byte.valueOf(Byte.parseByte(str));
        System.out.println(b);
    }
}
