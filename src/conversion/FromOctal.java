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
public class FromOctal {
    private static int decimal = 0;
    private static int binary = 0;
    private static int hexa = 0;
    private static int hold;
    //Decimal
    public static int Octal(int octal){
        int temp = 0;
        int n = 0;
        decimal = 0;
        while(octal != 0){
            temp = octal % 10;
            decimal += temp * Math.pow(8,n);
            n++;
            octal /= 10;
           
        }
        hold = decimal;
        return decimal;
    }
    //Binary
    public static String toBinary(){
        //binary = 0;
        String add = "";
        while(decimal != 0){
        binary = decimal % 2;
        add = binary + add;
        decimal /= 2;
        }
        return add; 
    }
    //Hexa
    public static String toHexa(){
        hexa = 0;
        String addHex = "";
        char Hex[] = {'0','1','2','3','4','5','6','7','8','9',
                                     'A','B','C','D','E','F'};
        
        while(hold != 0){
            hexa = hold % 16;
            addHex = Hex[hexa] + addHex;
            hold /= 16;
        }
        return addHex;
    }
}
