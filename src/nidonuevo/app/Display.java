/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nidonuevo.app;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import nidonuevo.model.KeyManager;
import nidonuevo.model.setFile;

/**
 *
 * @author TOSHIBA
 */
public class Display {
    private JFrame frame;
    private String title;
    private int width, height;
    private Canvas canvas;
    private Panel panel1;
    DialogueCanvas canvasLetras;
    
    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height =height;
        createDisplay();
    }
    public void visible(){
        frame.setVisible(true);
    }

    private void createDisplay(){
     
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        //frame.setLocationRelativeTo(null);
        java.awt.TextArea textArea1 = new java.awt.TextArea();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ico_NN.jpg"));
        frame.setIconImage(icon);
        panel1 = new java.awt.Panel();
        panel1.setBackground(new java.awt.Color(102, 255, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        textArea1.setText("Holi boli :D");
        //panel1.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, width, -1));
       
        panel1.setVisible(false);
        frame.getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, height-110, width, 110));
        
        canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		canvas.setBackground(Color.black);
		frame.getContentPane().add(canvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));
		frame.pack();
    }
    public JFrame getFrame(){
        return frame;
    }
    public Canvas getCanvas(){
		return canvas;
	}
public void setFrame(JFrame fr){
    frame = fr;
    frame.pack();
}

public Panel getPanel(){
    return panel1;
}

public void setOnMonPanel(){
    panel1.setVisible(true);
}
public void setOffMonPanel(){
    panel1.setVisible(false);
}

public void setOnDialogos(ArrayList<String> letras){

//        Font fuente=new Font("Monospaced", Font.BOLD, 25);
//        panel1.removeAll();
//        java.awt.TextArea textArea = new java.awt.TextArea();
//        textArea.setText(letras.get(linea));
//        textArea.setFont(fuente);
//        panel1.add(textArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, width, -1));
//        frame.pack();
        canvasLetras= new DialogueCanvas(letras);
        panel1.add(canvasLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,800,110));
        frame.pack();
        //Ultima version
}

public DialogueCanvas getCanvasLetras(){
    return canvasLetras;
}
public void removePanel(){
    frame.remove(panel1);
}


}
