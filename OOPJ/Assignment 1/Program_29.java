/*Write a program to convert state of Double instance into 
byte, short, int, long, float and double. */

class Program_29 {
    public static void main(String args[])
    {
        double value = 68;
        Double d = new Double(value);   //byte instance
        
        byte b1 = d.byteValue();
        System.out.println("Byte: " + b1);

        short s = d.shortValue();
        System.out.println("Short: " +s);

        int i = d.intValue();
        System.out.println("Int: " +i);

        long l = d.longValue();
        System.out.println("Short: " +l);

        float f = d.floatValue();
        System.out.println("float:" +f);

        double d1 = d.doubleValue();
        System.out.println("Double: " +d1);
        
    }    
}
