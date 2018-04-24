/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.view;

/**
 *
 * @author Hafees
 */
import java.awt.*;
import java.awt.geom.*;
import java.beans.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.plaf.basic.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SplashScreen extends JPanel {
      public static JFrame frame = new JFrame("Splash");
    protected final JProgressBar progress2 = new JProgressBar() {
        @Override public void updateUI() {
            super.updateUI();
            setUI(new ProgressCircleUI());
            setBorder(BorderFactory.createEmptyBorder(35, 53, 35, 35));
        }
    };
    public SplashScreen() {
        super(new BorderLayout());
        progress2.setStringPainted(true);
        progress2.setFont(progress2.getFont().deriveFont(24f));
            SwingWorker<String, Void> worker = new BackgroundTask() {
                @Override 
                public void done() {
                }
            };
            worker.addPropertyChangeListener(new ProgressListener(progress2));
            worker.execute();
        JPanel p = new JPanel(new GridLayout(1, 3));
        p.setBackground(new java.awt.Color(255, 255, 255));
        p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
       // p.add(progress1);
       JLabel lbl=new JLabel();
        JLabel lb2=new JLabel();
        lb2.setText("IJSE  V 1.0 (beta) All Right Reserved ");
        //lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/giphy1.gif")));
         lb2.setBackground(new java.awt.Color(255, 255, 255));
        lb2.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 0,0 ));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setOpaque(true);
        lb2.setSize(50, 400);
       lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/asset/Online-exam_1.png")));
             //p. add(lbl, BorderLayout.NORTH);
          
             p.add(progress2);
              // p. add(lb2);
         
            //p.add(lb2);
          add(p);
          JPanel lblpanel=new JPanel();
          lblpanel.add(lb2);
         // add(lb2, BorderLayout.SOUTH);
         add(lblpanel,BorderLayout.SOUTH);
         add(lbl, BorderLayout.NORTH);
        setPreferredSize(new Dimension(320, 200));
    }
    
    public static void main(String... args) {
        EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
                System.out.println(" main ");
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
               | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
         frame = new JFrame("Splash");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new SplashScreen());
        frame.setUndecorated(true);
        frame.setBackground(Color.WHITE);
        frame.pack();
        frame.setSize(650,480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
  static public  JFrame getframe(){
    if(frame==null){
    return new JFrame();
    }else{
    return frame;
    }
    
    }
}

class ProgressCircleUI extends BasicProgressBarUI {

    public ProgressCircleUI() {
         System.out.println("ProgressCircleUI 2 ");
    }
    
    @Override
    public Dimension getPreferredSize(JComponent c) {
        Dimension d = super.getPreferredSize(c);
        int v = Math.max(d.width, d.height);
        d.setSize(v, v);
        return d;
    }
    @Override 
    public void paint(Graphics g, JComponent c) {
        //public void paintDeterminate(Graphics g, JComponent c) {
        Insets b = progressBar.getInsets(); // area for border
        int barRectWidth  = progressBar.getWidth()  - b.right - b.left;
        int barRectHeight = progressBar.getHeight() - b.top - b.bottom;
        if (barRectWidth <= 0 || barRectHeight <= 0) {
            return;
        }

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        double degree = 360 * progressBar.getPercentComplete();
        double sz = Math.min(barRectWidth, barRectHeight);
        double cx = b.left + barRectWidth  * .5;
        double cy = b.top  + barRectHeight * .5;
        double or = sz * .5;
        //double ir = or - 20;
        double ir = or * .5; //.8;
        Shape inner  = new Ellipse2D.Double(cx - ir, cy - ir, ir * 2, ir * 2);
        Shape outer  = new Ellipse2D.Double(cx - or, cy - or, sz, sz);
        Shape sector = new Arc2D.Double(cx - or, cy - or, sz, sz, 90 - degree, degree, Arc2D.PIE);

        Area foreground = new Area(sector);
        Area background = new Area(outer);
        Area hole = new Area(inner);

        foreground.subtract(hole);
        background.subtract(hole);

        // draw the track
        g2.setPaint(new Color(0xDDDDDD));
        g2.fill(background);

        // draw the circular sector
        //AffineTransform at = AffineTransform.getScaleInstance(-1.0, 1.0);
        //at.translate(-(barRectWidth + b.left * 2), 0);
        //AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(degree), cx, cy);
        //g2.fill(at.createTransformedShape(area));
        g2.setPaint(progressBar.getForeground());
        g2.fill(foreground);
        g2.dispose();

        // Deal with possible text painting
        if (progressBar.isStringPainted()) {
            paintString(g, b.left, b.top, barRectWidth, barRectHeight, 0, b);
        }
    }
}

class BackgroundTask extends SwingWorker<String, Void> {

    public BackgroundTask() {
        System.out.println("BackgroundTask  3");
    }
    private final Random rnd = new Random();
    @Override 
    public String doInBackground() {
        
                
        int current = 0;
        int lengthOfTask = 100;
        while (current <= lengthOfTask && !isCancelled()) {
            try { // dummy task
                Thread.sleep(rnd.nextInt(100) + 1);
            } catch (InterruptedException ex) {
                return "Interrupted";
            }
            setProgress(100 * current / lengthOfTask);
            current++;
            if(current==101){
            new LoginSelection().setVisible(true);
              JFrame frame = SplashScreen.getframe();
               frame.setVisible(false);
           // new MainPanel().setVisible(false);
            }
        }
               return "Done";
    }
}

class ProgressListener implements PropertyChangeListener {
    
    private final JProgressBar progressBar;
    protected ProgressListener(JProgressBar progressBar) {
        this.progressBar = progressBar;
        this.progressBar.setValue(0);
    }
    @Override public void propertyChange(PropertyChangeEvent e) {
        String strPropertyName = e.getPropertyName();
        if ("progress".equals(strPropertyName)) {
            progressBar.setIndeterminate(false);
            int progress = (Integer) e.getNewValue();
            progressBar.setValue(progress);
        }
    }
}

