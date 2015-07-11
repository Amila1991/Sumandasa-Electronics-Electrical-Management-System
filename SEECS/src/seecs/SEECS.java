/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seecs;

import cashier.CashierMain;
import componentControl.ThemesControl;
import dataFilesControl.FileUtil;
import dataFilesControl.ReadFile;
import dataFilesControl.WriteFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.StartFrame;

/**
 *
 * @author Amila Karunathilaka
 */
public class SEECS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
        FileUtil fileUtil=new FileUtil();
        try {
            
            fileUtil.defaultFileWriter();
            WriteFile.defaultFileWriter();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(SEECS.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ThemesControl.setTheme(ReadFile.getThemespathinFile());
        String [] aa=fileUtil.readDeveloperAccount();
        System.out.println();
        System.out.println();
        System.out.println(aa[0]+"    "+aa[1]);
        aa=fileUtil.getDatabase();
        System.out.println();
        System.out.println();
        System.out.println(aa[0]+"    "+aa[1]);
        new StartFrame().setVisible(true);
    }

  
}
