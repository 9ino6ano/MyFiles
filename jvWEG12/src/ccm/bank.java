/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;
import java.util.Scanner;
import java.io.IOException;

/**
 *A text based simulation of an automatic teller machine
 * @author Pana
 */
public class bank {// ATM Simulator

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        /*JFrame objFrame = new JFrame();
        objFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objFrame.setTitle("First National Bank");
        objFrame.setSize(400, 400);
        objFrame.setVisible(true);
        */
        ATM objATM;
        try {
            BankData objTheBank = new BankData();
            objTheBank.readCustomers("customers.txt");
            objATM = new ATM(objTheBank);
            
        } catch (IOException e) {
            System.out.println("Error opening accounts file.");
            return;
        }
        Scanner in = new Scanner(System.in);
        while (true) {            
            int state = objATM.getState();
            if (state == ATM.START) {
                System.out.print("Enter The Customer Number: ");
                int number = in.nextInt();
                objATM.setCustomerNumber(number);
            }
            else if (state == ATM.PIN) {
                System.out.print("Enter Pin: ");
                int pin = in.nextInt();
                objATM.selectCustomer(pin);
            }
            else if (state == ATM.ACCOUNT) {
                System.out.println("A = Checking, B = Savings , C = Quit");
                String command = in.next();
                if (command.equalsIgnoreCase("A")) {
                    objATM.selectAccount(ATM.CHECKING);
                }
                else if (command.equalsIgnoreCase("b")) {
                    objATM.selectAccount(ATM.SAVINGS);
                }
                else if (command.equalsIgnoreCase("C")) {
                    objATM.reset();
                }else{
                    System.out.println("Illegal Input");
                }
            }
            else if (state == ATM.TRANSACT) {
                System.out.println("Balance = "+objATM.getBalance());
                System.out.print("A = Deposit, B = Withdrawal, C = Cancel");
                String command = in.next();
                if (command.equalsIgnoreCase("A")) {
                    System.out.print("Amount: ");
                    double amount = in.nextDouble();
                    objATM.deposit(amount);
                    objATM.back();
                }
                else if (command.equalsIgnoreCase("B")) {
                    System.out.print("Amount: ");
                    double amount = in.nextDouble();
                    objATM.withDraw(amount);
                    objATM.back();
                }
                else if (command.equalsIgnoreCase("C")) {
                    objATM.back();
                }
                else{
                    System.out.println("Illegal Input");
                }
            }
            
        }
    }
    
}
