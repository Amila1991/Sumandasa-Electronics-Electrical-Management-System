/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package componentControl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Amila
 */
public class TextControl {
    
    public static String setaddressTextArea(JTextArea txtAddress){
        String address=txtAddress.getText();
        System.out.println(address);
        StringTokenizer tk=new StringTokenizer(address,"\n");
        String token=null;
        while(tk.hasMoreTokens()){
            if(token==null){
                token=tk.nextToken();
                token=checkComa(token);
                address=token;
            }else{
                token=tk.nextToken();
                token=checkComa(token);
                address+=","+token;
                
            }	
            System.out.println(address);
        }
        return address;
    }
    
    private static String checkComa(String word){
        if (word.substring(word.length()-1).equals(",")) {
            return word.substring(0, word.length()-1);
        }else{
            return word;
        }
    }
   public static void getaddressTextArea(String address,JTextArea txtAddress){
        System.out.println(address);
        StringTokenizer tk=new StringTokenizer(address,",");
        String token=null;
        while(tk.hasMoreTokens()){
            token=tk.nextToken()+",\n";
            System.out.println(address);
            txtAddress.append(token);
        }
    } 
   
   public static void setdropdownlist(JFrame frame,final ArrayList<String> list,JTextField txt){
        AutoSuggestor autoSuggestor = new componentControl.AutoSuggestor(txt,frame, null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) {
            @Override
            public boolean wordTyped(String typedWord) {

                //create list for dictionary this in your case might be done via calling a method which queries db and returns results as arraylist


                setDictionary(list);
                //addToDictionary("bye");//adds a single word

                return super.wordTyped(typedWord);//now call super to check for any matches against newest dictionary
            }
        };
   }
   
}
