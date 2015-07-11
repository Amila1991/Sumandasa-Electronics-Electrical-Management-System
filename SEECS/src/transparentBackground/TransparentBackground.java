/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transparentBackground;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class TransparentBackground extends JComponent
        implements ComponentListener, WindowFocusListener,
        Runnable {

    private static final long serialVersionUID = 1L;
    private JFrame frame;
    private Image background;
    private long lastupdate = 0;
    public boolean refreshRequested = true;

    public TransparentBackground(JFrame frame) {
        this.frame = frame;
        updateBackground();
        frame.addComponentListener(this);
        frame.addWindowFocusListener(this);
        new Thread(this).start();
    }

    public void componentShown(ComponentEvent evt) {
        repaint();
    }

    public void componentResized(ComponentEvent evt) {
        repaint();
    }

    public void componentMoved(ComponentEvent evt) {
        repaint();
    }

    public void componentHidden(ComponentEvent evt) {
    }

    public void windowGainedFocus(WindowEvent evt) {
        refresh();
    }

    public void windowLostFocus(WindowEvent evt) {
        refresh();
    }

    public void refresh() {
        if (frame.isVisible()) {
            repaint();
            refreshRequested = true;
            lastupdate = new Date().getTime();
        }
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(250);
                long now = new Date().getTime();
                if (refreshRequested
                        && ((now - lastupdate) > 1000)) {
                    if (frame.isVisible()) {
                        Point location = frame.getLocation();
                        frame.hide();
                        updateBackground();
                        frame.show();
                        frame.setLocation(location);
                        refresh();
                    }
                    lastupdate = now;
                    refreshRequested = false;
                }
            }
        } catch (Exception ex) {
            // p(ex.toString( ));
            ex.printStackTrace();
        }
    }

    public void updateBackground() {
        try {
            Robot rbt = new Robot();
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension dim = tk.getScreenSize();
            background = rbt.createScreenCapture(
                    new Rectangle(0, 0, (int) dim.getWidth(),
                    (int) dim.getHeight()));
        } catch (Exception ex) {
            //p(ex.toString( ));
            ex.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Point pos = this.getLocationOnScreen();
        Point offset = new Point(-pos.x, -pos.y);
        g.drawImage(background, offset.x, offset.y, null);
    }
}
