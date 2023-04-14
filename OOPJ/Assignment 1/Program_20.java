/*Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string. */


class Program_20 {
    //a. long value into String
    public static void main1(String args[]){
        long l = 483366;
        String str = Long.toString(l);
        System.out.println(str);
    }

    //b. long value into Long instance.
    public static void main2(String args[]){
        long l = 875432;
        Long l1 = Long.valueOf(l);
        System.out.println(l1);
    }

    //c. String instance into Long instance.
    public static void main3(String args[]){
        String str = new String("0123");
        Long l1 = Long.valueOf(str);
        System.out.println(l1);
    }

    //d. long value into binary, octal and hexadecimal string
    public static void main(String args[])
    {
        long l = 54322776;
        String str1 = Long.toBinaryString(l);
        String str2 = Long.toHexString(l);
        String str3 = Long.toOctalString(l);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
