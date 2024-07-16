/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec;
import javax.swing.JFrame;
/**
 *
 * @author Pana
 */
public class RectangleViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new JFrame();
        jf.setTitle("Two triangles");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create a rec object
        comVUT com = new comVUT();
        jf.add(com);
        
        //show the construct object on a frame
        jf.setVisible(true);
    }
    
}
