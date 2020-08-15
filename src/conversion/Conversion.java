/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author clark
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
          /*UIManager.put( "control", new Color( 128, 128, 128) );
          UIManager.put( "info", new Color(128,128,128) );
          UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
          UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
          UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
          UIManager.put( "nimbusFocus", new Color(115,164,209) );
          UIManager.put( "nimbusGreen", new Color(176,179,50) );
          UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
          UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
          UIManager.put( "nimbusOrange", new Color(191,98,4) );
          UIManager.put( "nimbusRed", new Color(169,46,34) );
          UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
          UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
          UIManager.put( "text", new Color( 255, 230, 230));*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    private static int decimal = 0;
    private static int octal = 0;
    private static int hexa = 0;
    private static int hold;
    //Decimal
    public static int toDecimal(long binary){
        int n = 0;
        long temp;
        decimal = 0;
        
        while(binary != 0){
            temp = binary% 10;
            decimal += temp*Math.pow(2,n);
            binary /= 10;
            n++;
        }
       hold = decimal;
       return decimal;
    }
    //Octal
    public static int toOctal(){
       octal = 0;
       int i = 1;
       while(decimal != 0){
           octal += (decimal % 8) * i;
           decimal /= 8;
           i *= 10;
       }
       return octal;
    }
    //Hexa
    public static String toHexa(){
        String add = "";
        char Hex[] = {'0','1','2','3','4','5','6','7','8','9',
                                     'A','B','C','D','E','F'};
        while(hold != 0){
            hexa = hold % 16;
            add = Hex[hexa] + add; 
            hold/=16;
        }
        return add;
    } 
}
