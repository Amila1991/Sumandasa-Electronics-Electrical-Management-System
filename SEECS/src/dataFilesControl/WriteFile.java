/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataFilesControl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Amila
 */
public class WriteFile {
    public static void writeDBConnection(String...data) throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("DBConnection.txt");
        for (String string : data) {
            pw.println(string);
        }
        pw.flush();

    }
    public static void writeUsingHost(String data) throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("UsingHost.txt");
        pw.println(data);
        pw.flush();

    }
    public static void writeConnectionHost(String...data) throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("ConnectionHosts.txt");
        for (String string : data) {
            pw.println(string);
        }
        pw.flush();

    }
    
    public static void Themes(int no) throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("Themes.txt");
        pw.println(no);
        pw.flush();
    }
    
    public static void defaultFileWriter() throws FileNotFoundException{
        File f=new File("Themes.txt");
        System.out.println("Theme.txt "+!f.exists());
        if (!f.exists()) {
           Themes(0);
        }
        f=new File("DefualtDBConnection.txt");
        if (!f.exists()) {
            PrintWriter pw=new PrintWriter(f);
            String[] data={"com.mysql.jdbc.Driver","jdbc:mysql://localhost/SumanadasaElectricalService"};
            for (String string : data) {
                pw.println(string);
            }
            pw.flush();
            
        }
        f=new File("ConnectionDriver.txt");
        if (!f.exists()) {
            PrintWriter pw=new PrintWriter(f);
            String data="jdbc:mysql:";
            pw.println(data);
            pw.flush();     
        }
        f=new File("ConnectionClass.txt");
        if (!f.exists()) {
            PrintWriter pw=new PrintWriter(f);
            String data="com.mysql.jdbc.Driver";
            pw.println(data);
            pw.flush();     
        }
        f=new File("ConnectionHost.txt");
        System.out.println("ConnectionHost.txt "+!f.exists());
        if (!f.exists()) {
           writeConnectionHost("localhost");
        }
    }
}
