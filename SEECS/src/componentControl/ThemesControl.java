/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package componentControl;

import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import dataFilesControl.FileUtil;
import de.javasoft.plaf.synthetica.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.skin.*;

/**
 *
 * @author Amila
 */
public class ThemesControl {
    private static int no;
    private static FileUtil fileUtil;
    static {
        try {
            fileUtil=new FileUtil();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThemesControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ThemesControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void setTheme(int no){
        try {
            switch(no){
                case 0: UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        break;
                case 1: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Windows".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                        break;
                case 2: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Windows Classic".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                        break;
                case 3: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                        break;
                case 4: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("CDE/Motif".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                        break;
                case 5: UIManager.setLookAndFeel(new MotifLookAndFeel());
                        break;
                case 6: UIManager.setLookAndFeel(new SubstanceAutumnLookAndFeel());
                        break;    
                case 7: UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
                        break;
                case 8: UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());
                        break;
                case 9: UIManager.setLookAndFeel(new SubstanceFieldOfWheatLookAndFeel());
                        break;  
                case 10: UIManager.setLookAndFeel(new SubstanceGreenMagicLookAndFeel());
                        break;
                case 11: UIManager.setLookAndFeel(new SubstanceLookAndFeel());
                        break;
                case 12: UIManager.setLookAndFeel(new SubstanceMagmaLookAndFeel());
                        break;
                case 13: UIManager.setLookAndFeel(new SubstanceMangoLookAndFeel());
                        break;
                case 14: UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
                        break;
                case 15: UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
                        break;
                case 16: UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
                        break;
                case 17: UIManager.setLookAndFeel(new SubstanceRavenLookAndFeel());
                        break;
                case 18: UIManager.setLookAndFeel(new SubstanceSaharaLookAndFeel());
                        break;
                case 19: UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                        break;
                case 20: UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
                        break;
                case 21: UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
                        break; 
                case 22: UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
                        break;
                case 23: UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
                        break;
                case 24: UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
                        break;
                case 25: UIManager.setLookAndFeel(new SyntheticaClassyLookAndFeel());
                        break;
                case 26: UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
                        break;
                case 27: UIManager.setLookAndFeel(new SyntheticaMauveMetallicLookAndFeel());
                        break;
                case 28: UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
                        break;
                case 29: UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
                        break;
                case 30: UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
                        break;
                case 31: UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
                        break;
                case 32: UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
                        break;
                case 33: UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
                        break;    
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Theme files not found");
        }
    }
  
    public static void setTheme(javax.swing.JDialog  parent,int no){
        try {
            switch(no){
                case 0: UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 1: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Windows".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 2: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Windows Classic".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 3: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 4: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("CDE/Motif".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 5: UIManager.setLookAndFeel(new MotifLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 6: UIManager.setLookAndFeel(new SubstanceAutumnLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;    
                case 7: UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 8: UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 9: UIManager.setLookAndFeel(new SubstanceFieldOfWheatLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;  
                case 10: UIManager.setLookAndFeel(new SubstanceGreenMagicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 11: UIManager.setLookAndFeel(new SubstanceLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 12: UIManager.setLookAndFeel(new SubstanceMagmaLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 13: UIManager.setLookAndFeel(new SubstanceMangoLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 14: UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 15: UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 16: UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 17: UIManager.setLookAndFeel(new SubstanceRavenLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 18: UIManager.setLookAndFeel(new SubstanceSaharaLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 19: UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 20: UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 21: UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break; 
                case 22: UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 23: UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 24: UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 25: UIManager.setLookAndFeel(new SyntheticaClassyLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 26: UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 27: UIManager.setLookAndFeel(new SyntheticaMauveMetallicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 28: UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 29: UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 30: UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 31: UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 32: UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 33: UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;    
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Theme files not found");
        }
    }
    
    public static void setTheme(javax.swing.JFrame  parent,int no){
        try {
            switch(no){
                case 0: UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 1: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Windows".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 2: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Windows Classic".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 3: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 4: for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("CDE/Motif".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                SwingUtilities.updateComponentTreeUI(parent);
                                break;
                            }
                        }
                        break;
                case 5: UIManager.setLookAndFeel(new MotifLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 6: UIManager.setLookAndFeel(new SubstanceAutumnLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;    
                case 7: UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 8: UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 9: UIManager.setLookAndFeel(new SubstanceFieldOfWheatLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;  
                case 10: UIManager.setLookAndFeel(new SubstanceGreenMagicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 11: UIManager.setLookAndFeel(new SubstanceLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 12: UIManager.setLookAndFeel(new SubstanceMagmaLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 13: UIManager.setLookAndFeel(new SubstanceMangoLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 14: UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 15: UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 16: UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 17: UIManager.setLookAndFeel(new SubstanceRavenLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 18: UIManager.setLookAndFeel(new SubstanceSaharaLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 19: UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 20: UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 21: UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break; 
                case 22: UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 23: UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 24: UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 25: UIManager.setLookAndFeel(new SyntheticaClassyLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 26: UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 27: UIManager.setLookAndFeel(new SyntheticaMauveMetallicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 28: UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 29: UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 30: UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 31: UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 32: UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;
                case 33: UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
                        SwingUtilities.updateComponentTreeUI(parent);
                        break;    
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Theme files not found");
        }
    }
    
     public static void getTheme(int no) throws FileNotFoundException, IOException{
         //WriteFile.Themes(no);
         fileUtil.setTheme(no);
     }
    
}
