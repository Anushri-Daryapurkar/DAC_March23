/*Write a program to convert state of Long instance into byte,
short, int, long, float and double. */

class Program_21 {
    public static void main(String args[])
    {
        long value = 65432157;
        Long l = new Long(value);  //instance of long

        byte b = l.byteValue();
        System.out.println(b);

        short s = l.shortValue();
        System.out.println(s);

        int i = l.intValue();
        System.out.println(i);

        long l1 = l.longValue();
        System.out.println(l1);

        float f = l.floatValue();
        System.out.println(f);

        double d = l.doubleValue();
        System.out.println(d);
    }
}
