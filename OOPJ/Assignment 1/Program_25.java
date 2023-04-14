/*Write a program to convert state of Float instance into 
byte, short, int, long, float and double. */

class Program_25 {
    public static void main(String args[])
    {
        float value = 68.2f;
        Float f = new Float(value);   //byte instance
        
        byte b1 = f.byteValue();
        System.out.println("Byte: " + b1);

        short s = f.shortValue();
        System.out.println("Short: " +s);

        int i = f.intValue();
        System.out.println("Int: " +i);

        long l = f.longValue();
        System.out.println("Short: " +l);

        float f1 = f.floatValue();
        System.out.println("float:" +f1);

        double d = f.doubleValue();
        System.out.println("Double: " +d);
        
    }    
}
