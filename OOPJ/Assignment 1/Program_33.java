/*Pass integer, float and double value from command line. 
Parse it appropriately and perform arithmetic operations (+,-,*,/) on it.
Here you can you switch case. */

class Program_33 {

    public static void main(String args[])
    {
        int i = Integer.parseInt(args[ 0 ]);
        float f = Float.parseFloat(args[ 1 ]);
        double d = Double.parseDouble(args[ 2 ]);

        int ch=1;
        double res; 
        switch(ch)
        {
            case 1:
            res = i + f + d;
            System.out.println(res);
            break;
            
            case 2:
            res = i - f - d;
            System.out.println(res);
            break;
            
            case 3:
            res = i * f * d;
            System.out.println(res);
            break;

            case 4:
            res = i / f / d;
            System.out.println(res);
            break;
        }

    }       
}

