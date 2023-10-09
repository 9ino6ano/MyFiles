/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcha1;

/**
 *
 * @author Pana
 */
public class JvCha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.Introduction code into java
        System.out.println("Hello, to the World");
        System.out.println("Dumela lefatshe kaofela");
        //2.Accumulating and multiiplying variables.
        int sum1 = 1+2+3+4+5+6+7+8+9;
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 ="+"\t"+sum1+"\n");
        int sum2 = 1*2*3*4*5*6*7*8*9;
        System.out.println("1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 ="+"\t"+sum2+"\n");
        //3. Interest gain after a no. of years
        double Balance = 1000;
        double InterestRate = 0.05;
        int years = 3;
        
        for (int i =1 ; i <= years; i++) {
            Balance = Balance + (Balance * InterestRate);
            System.out.println("The Balance for the " +i+" year, is : "+"R"+ Balance);
        }
            System.out.println("The Total Balance is : "+ " R"+Balance);
        //program for writing a name enclosed in a box
        String Name = "Panana";
        System.out.println("\t_________");
        System.out.print("\t|        |\n");
        System.out.println("\t"+Name+""+""+""+"\n");
        System.out.println("\t|________|");
        // writing a name with capitals
        System.out.println("*****" +"    **"+"     *     *"+"     *");
        System.out.println("*   *"+"   *  *"+"    * *   *"+"    * *");
        System.out.println("*****"+"  ******"+"   *  *  *"+"   *****");
        System.out.println("*"+"     *      *"+"  *   * *"+"  *     *");
        System.out.println("*"+"    *        *"+" *     *"+" *       *");
        //program drawing a face
        System.out.println("/////////////");
        System.out.println(" '' '' '' ''");
        System.out.println(" + 0     0  +");
        System.out.println("{|    ^     |}");
        System.out.println(" | '_    _' |");
        System.out.println(" |   ____   |");
        System.out.println("+------------+");
        //Program for drawing a house
        System.out.println("    +");
        System.out.println("  +    +");
        System.out.println("+        +");
        System.out.println("+--------+");
        System.out.println("|  .-.   |");
        System.out.println("|  | |   |");
        System.out.println("+-+-+-+-+-");
        //Program for drawing a animal speaking
        System.out.println(" ()__()"+"    ----------");
        System.out.println("(  ' ' )"+" /"+ "Hello   \'");
        System.out.println("(   -  )"+"<"+ " Stouter  |");
        System.out.println(" |  |  |"+" \'"+ "Panzo!! /");
        System.out.println("(___|___)"+"  ----------");
        
        
        
    }
    
}
