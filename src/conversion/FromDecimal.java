/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author clark
 */
public class FromDecimal {
    
    public static int binary = 0;
    public static int octal = 0;
    public static int hexa = 0;
    public static int hold1;
    public static int hold2;
    //Binary
    public static String Decimal(int decimal){
        hold1= decimal;
        hold2= decimal;
        String add = "";
        while(decimal != 0){
            binary = decimal % 2;
            add = binary + add;
            decimal /= 2;
        } 
        return add;
    }
    //Octal
    public static String toOctal(){
        String add = "";
        
        while(hold1 != 0){
            octal = hold1 % 8;
            add = octal + add;
            hold1 /= 8;
        }
        return add;
    }
    //Hexa
    public static String toHexa(){
        String add = "";
        char Hex[] = {'0','1','2','3','4','5','6','7','8','9',
                                     'A','B','C','D','E','F'};
        while(hold2 != 0){
            hexa = hold2 % 16;
            add = Hex[hexa] + add;
            hold2 /= 16;
        }
        return add;
    }
}
