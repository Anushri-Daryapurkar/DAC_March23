/*Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
25 */


class Program_24 {
    //a. float value into String
    public static void main1(String args[]){
        float f = 2.3f;
        String str = Float.toString(f);
        System.out.println(str);
    }

    //b. float value into Float instance.
    public static void main2(String args[]){
        float f = 4.5f;
        Float f1 = Float.valueOf(f);
        System.out.println(f1); 
    }
    //c. String instance into Float instance.
    public static void main3(String args[]){
        String str = new String("12345");
        Float f = Float.valueOf(str);
        System.out.println(f);
    }
    //d. float value into hexadecimal string.
    public static void main(String args[]){
        float f = 54.32f;
        String str = Float.toHexString(f);
        System.out.println(str);
    }

}
