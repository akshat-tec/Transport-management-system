
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * loginpage.java
 *
 * Created on 24 Sep, 2019, 8:18:31 AM
 */

/**
 *
 * @author sfs
 */
public class loginpage extends javax.swing.JFrame {

    /** Creates new form loginpage */
    public loginpage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 10));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 90, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 10));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 110, 60));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 10));
        jButton2.setText("RESET");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 90, 60));

        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 0, 51));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 160, 40));

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 153));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText(" PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 240, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("user");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 110, 40));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("JasmineUPC", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText(" LOGIN ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 180, 60));

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\SACHIN\\images\\t16.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 530, 250));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 60, 900, 620);

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 60));
        jLabel11.setText(" 7 STAR TRANSPORT COMPANY");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 0, 900, 71);

        jLabel5.setBackground(new java.awt.Color(0, 0, 102));
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText(" ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 70, 950, 540);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1020, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String usser=jTextField1.getText();
         String password=jPasswordField1.getText();
        if(usser.equals("akshat")&&password.equals("sachin"))
         {
                          JOptionPane.showMessageDialog(this,"WELCOME TO THE COMPANY");
                          new MAINPAGE().setVisible(true);
      }
          else{
             JOptionPane.showMessageDialog(this,"INCORRECT ENTRY");}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
