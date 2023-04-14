/*Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string. */



class Program_16 {
    //a. int value into String
    public static void main1(String args[])
    {
        int i = 843;
        String str = Integer.toString(i);
        System.out.println(str);
        
    }

    //b. int value into Integer instance.
    public static void main2(String args[])
    {
        int i = 432;
        Integer i1 = Integer.valueOf(i);
        System.out.println(i1);
    }

    //c. String instance into Integer instance.
    public static void main3(String args[])
    {
        String str = new String("1234");
        Integer i = Integer.valueOf(str);
        System.out.println(i);

    }

    //d. int value into binary, octal and hexadecimal string.
    public static void main(String args[])
    {
        int i = 20;
        String str1 = Integer.toBinaryString(i);
        String str2 = Integer.toHexString(i);
        String str3 = Integer.toOctalString(i);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);



    }
}
