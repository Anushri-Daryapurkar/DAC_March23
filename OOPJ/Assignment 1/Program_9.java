//Write a program to convert state of Byte instance into 
//byte, short, int. long, float and double.
class Program_9 
{
    public static void main(String args[])
    {
        byte value = 68;
        Byte b = new Byte(value);   //byte instance
        
        byte b1 = b.byteValue();
        System.out.println("Byte: " + b1);

        short s = b.shortValue();
        System.out.println("Short: " +s);

        int i = b.intValue();
        System.out.println("Int: " +i);

        long l = b.longValue();
        System.out.println("Short: " +l);

        float f = b.floatValue();
        System.out.println("float:" +f);

        double d = b.doubleValue();
        System.out.println("Double: " +d);
        
    }    
}
