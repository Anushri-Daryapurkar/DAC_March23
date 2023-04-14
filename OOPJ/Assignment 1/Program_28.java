/*Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string
(Note: Here you can use doubleToLongBits() method along with methods of Long class). */

class Program_28 {

    //a. double value into String
    public static void main1(String args[]){
        double d = 23.56444;
        String str = Double.toString(d);
        System.out.println(str);
    }
    
    //b. double value into Double instance.
    public static void main2(String args[]){
        double d = 4.56442;
        Double d1 = Double.valueOf(d);
        System.out.println(d1); 
    }

    //c. String instance into Double instance.
    public static void main3(String args[]){
        String str = new String("12345");
        Double d = Double.valueOf(str);
        System.out.println(d);
    }

    //d. double value into binary, octal and hexadecimal string
    public static void main(String args[]){
        double d = 54.32566;
        // String str1 = Double.toBinaryString(d);
        // String str2 = Double.toOctalString(d);
        String str3 = Double.toHexString(d);
        System.out.println(str3);
    }
    
}
