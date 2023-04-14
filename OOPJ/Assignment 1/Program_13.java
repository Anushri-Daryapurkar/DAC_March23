/*Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
 */

class Program_13 {
    //a
    public static void main1(String args[]){
        short s = 235;
        String str = Short.toString(s);
        System.out.println(str);
    }

    //b
    public static void main2(String args[]){
        short s = 543;
        Short s1 = Short.valueOf(s);
        System.out.println(s1);
    }

    //c string instance into short instance
    public static void main(String args[])
    {
        String str = new String("123");
        Short s = Short.valueOf(str);
        System.out.println(s);
    }

}


