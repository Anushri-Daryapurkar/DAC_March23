/*Write a program to convert state of Integer instance into
byte, short, int, long, float and double. */



class Program_17 {
    public static void main(String args[])
    {
        int value = 223;
        Integer i = new Integer(value);  //instance if integer

        byte b = i.byteValue();
        System.out.println("byte: " + b);

        short s = i.shortValue();
        System.out.println("short: " +s);

        int i1 = i.intValue();
        System.out.println("int: " +i1);

        long l = i.longValue();
        System.out.println("long: " +l);

        float f = i.shortValue();
        System.out.println("float: " +f);

        double d = i.shortValue();
        System.out.println("double: " +d);

    }
    
}
