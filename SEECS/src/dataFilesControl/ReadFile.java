/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataFilesControl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amila Karunathilaka
 */
public class ReadFile {
    public static Map<String,String> getDBConnectionpathinFile(){
        Map<String,String> path=new HashMap<String, String>();
        try {
            FileReader fr = new FileReader("DBConnection.txt");
            BufferedReader br=new BufferedReader(fr);
            path.put("DriverName", br.readLine());
            path.put("URL",br.readLine());
            path.put("USER",br.readLine());
            path.put("PASSWORD",br.readLine());
        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return path;
    }
    public static int getThemespathinFile(){
        int no=0;
        try {
            FileReader fr = new FileReader("Themes.txt");
            BufferedReader br=new BufferedReader(fr);
            no=Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return no;
    }
    public static String getUsingHost(){
        String data=null;
        try {
            FileReader fr = new FileReader("UsingHost.txt");
            BufferedReader br=new BufferedReader(fr);
            data=br.readLine();
        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    public static boolean checkFileExists(String filename){
        File f=new File(filename);
        return f.exists();
    }
    
    public static String getFileData(String fileName){
        String data=null;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br=new BufferedReader(fr);
            data=br.readLine();
        } catch (Exception ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
