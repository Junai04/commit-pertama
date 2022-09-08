/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistor;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Resistor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double r1,r2,r3,rt,x;
        
        System.out.println("r 1 =");
        r1 = input.nextInt();
        System.out.println("r2 = ");
        r2 = input.nextInt();
        System.out.println("r3 = ");
        r3 = input.nextInt();
        x = (1/r1)+(1/r2)+(1/r3);
        System.out.println("x = "+ x);
        rt = 1/x;
        System.out.println("total resistor ="+ rt);
        
        
        
        
    }
    
}
