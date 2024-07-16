/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvfrm;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Pana
 * This sample program shows a map in action
 */
public class MapDemo {

    /**
     * @param args the command line arguments
     *@see this program demonstrates a map that maps names of colours
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Color> favouriteColours = new HashMap<String, Color>();
        favouriteColours.put("Juliet", Color.BLUE);
        favouriteColours.put("Romeo", Color.GREEN);
        favouriteColours.put("Adam", Color.RED);
        favouriteColours.put("Eve", Color.BLUE);
        
        //PRINT ALL KEYS AND VALUES IN THE MAP
        Set<String> keySet = favouriteColours.keySet();
        for (String key : keySet) {
            Color value = favouriteColours.get(key);
            System.out.println(key+" : "+value);
        }
        
        
    }
    
}
