/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nidonuevo.model;

/**
 *
 * @author TOSHIBA
 */
public class help extends java.awt.Dialog {

    /**
     * Creates new form help
     */
    public help(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    
        setLocation(430,300);

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        textArea1 = new java.awt.TextArea();
        button1 = new java.awt.Button();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        textArea1.setEditable(false);
        textArea1.setName(""); // NOI18N
        textArea1.setText("Enter: Aceptar\nM=Menu Principal en juego\nQ: Hot key para salir\nManejo con flechas");
        panel1.add(textArea1);

        button1.setLabel("OK");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        panel1.add(button1);

        add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
        click_ok=true;
   
        setVisible(false);
        dispose();
    }//GEN-LAST:event_button1MouseClicked

    /**
     * @param args the command line arguments
     */
   
public boolean isClick_ok() {
        return click_ok;
    }

    /**
     * @param click_ok the click_ok to set
     */
    public void setClick_ok(boolean click_ok) {
        this.click_ok = click_ok;
    }
private boolean click_ok=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Panel panel1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
