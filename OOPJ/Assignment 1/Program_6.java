/*Write a program to perform below operations on Boolean type to convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
Reference:https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
*/

class Program_6 {
    //a.boolean value into String
    public static void main(String args[])
    {
        boolean b = false;
        String str = Boolean.toString(b);
        System.out.println(str);
    }

    //b.boolean value into Boolean instance.
    public static void main2(String args[])
    {
        boolean b = true;
        Boolean bool = Boolean.valueOf(b);
    
        System.out.println(bool);
    }

    //c.String value into boolean value
    public static void main3(String args[])
    {
        String str = new String("True");
        boolean bool = Boolean.parseBoolean(str);
    
        System.out.println(bool);
    }

    //d.String value into Boolean instance.//
    public static void main4(String args[])
    {
        String str = new String("True");
        boolean bool = Boolean.parseBoolean(str);
        Boolean b = Boolean.valueOf(bool);
    
        System.out.println(b);
    }

}
