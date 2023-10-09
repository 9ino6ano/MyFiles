/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg.Cash;

/**
 *
 * @author Pana
 */
public class CashRegTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        CashRegister objReg = new CashRegister();
        //record the 1st purchase
        objReg.recordPurchae(0.75);
        objReg.recordPurchae(1.50);
        objReg.receivePay(2, 0, 5, 0, 0);
        System.out.print("Change : ");
        System.out.println(objReg.giveChange());
        System.out.println("Expected: 0.25");
        //record the 2nd purchase
        objReg.recordPurchae(2.25);
        objReg.recordPurchae(19.25);
        objReg.receivePay(23, 2, 0, 0, 0);
        System.out.print("Change : ");
        System.out.println(objReg.giveChange());
        System.out.println("Expected: 2.0");
        
    
    }
    
}
