package String;

import java.util.ArrayList;
public class Printing {
    public static void main(String[] args) {
        float a = 12.43743f;
        System.out.printf("the formatted pattern is %.2f",a);


        System.out.println('a'+'b');//here it is taking as ascii character
        
        //here it is concatated
        System.out.println("a"+"b");// here it is taking as string value

        System.out.println((char)('a'+3));//here it is getting converted to the char
        System.out.println(" "+new Integer(40));
        System.out.println(new ArrayList<Integer>());
        System.out.println("Harsh"+new ArrayList<>());
        //so here in the print there should be atleast one string then only it will show output
        System.out.println(new Integer(40)+" "+new ArrayList<>());
    }
}
