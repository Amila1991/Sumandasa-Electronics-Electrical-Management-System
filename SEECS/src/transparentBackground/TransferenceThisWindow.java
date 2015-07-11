/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transparentBackground;

import java.awt.*;
import static java.awt.GraphicsDevice.WindowTranslucency.*;
import javax.swing.*;

/**
 *
 * @author Amila
 */
public class TransferenceThisWindow {

    public static void tranceferantThis(JFrame jf) {
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        boolean isPerPixelTranslucencySupported =
                gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);



        jf.setBackground(new Color(0, 0, 0, 0));

        jf.setLocationRelativeTo(null);


        JPanel panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    final int R = 240;
                    final int G = 240;
                    final int B = 240;

                    Paint p =
                            new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                            0.0f, getHeight(), new Color(R, G, B, 0), true);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };
    }

    public static void tranceferantThis(JDialog jf) {
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        boolean isPerPixelTranslucencySupported =
                gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);



        jf.setBackground(new Color(0, 0, 0, 0));

        jf.setLocationRelativeTo(null);


        JPanel panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    final int R = 240;
                    final int G = 240;
                    final int B = 240;

                    Paint p =
                            new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                            0.0f, getHeight(), new Color(R, G, B, 0), true);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };
    }
    
    public static void tranceferantThis(JInternalFrame jf) {
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        boolean isPerPixelTranslucencySupported =
                gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);



        jf.setBackground(new Color(0, 0, 0, 0));

        //jf.setLocationRelativeTo(null);


        JPanel panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    final int R = 240;
                    final int G = 240;
                    final int B = 240;

                    Paint p =
                            new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                            0.0f, getHeight(), new Color(R, G, B, 0), true);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };
    }
    
    public static void tranceferantThis(JDesktopPane jf) {
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        boolean isPerPixelTranslucencySupported =
                gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);



        jf.setBackground(new Color(0, 0, 0, 0));

        //jf.setLocationRelativeTo(null);


        JPanel panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    final int R = 240;
                    final int G = 240;
                    final int B = 240;

                    Paint p =
                            new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                            0.0f, getHeight(), new Color(R, G, B, 0), true);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };
    }
}
