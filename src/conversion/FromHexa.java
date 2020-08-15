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
public class FromHexa {
    
    public String combi = "0123456789ABCDEF";
    public static int decimal = 0;
    public static int binary = 0;
    public static int octal = 0;
    public static int hold;
    //Decimal
    public int Hexa(String hexa){
        String check = hexa.toUpperCase();
        decimal = 0;
        for(int i = 0; i < check.length(); i++){
            char c = check.charAt(i);
            int dex = combi.indexOf(c);
            decimal = 16 * decimal + dex;
        }
        hold = decimal;
        return decimal;
    }
    //Binary
    public static String toBinary(){
        String add = "";
        binary = 0;
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
        int octal = 0;
        
        while(hold != 0){
            octal = hold % 8;
            add = octal + add;
            hold /= 8;
        }
        return add;
    }
}
    
