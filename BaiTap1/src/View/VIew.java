/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import connectDB.AddData;
import connectDB.ConnectDB;
import Class.LoaiSanPham;
import Class.SanPham;
import Model.CustomTble;
import Model.CustomLSP;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class VIew extends javax.swing.JFrame {
    int dong = -1;
    ConnectDB conn = null;
    AddData duLieu = new AddData();
    ArrayList<SanPham> arr_SP = new ArrayList<>();
    ArrayList<LoaiSanPham> arr_LSP = new ArrayList<>();
    /**
     * Creates new form VIew
     */
    public VIew() {
        initComponents();
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn = new ConnectDB();
        CenteredFrame(this);
        DaTa();
        loadBangSP();
        loadBangLSP();
        loadComboMLSP();
        cbMLSP.removeAllItems();
        
        
    }
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    public void DaTa() {
        // add dữ liệu lớp học
        try{
        String sql = "Select * from SanPham";
        if (conn.getData_SP(sql) != null) {
            arr_SP = conn.getData_SP(sql);
        } else {
            duLieu.add_Class();
        }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // add dữ liệu của cán bộ
        try{
            String sql_cbgv = "select * from LoaiSanPham";
        if (conn.getData_LoaiSP(sql_cbgv) != null) {
            arr_LSP = conn.getData_LoaiSP(sql_cbgv);
        } else {
            duLieu.add_GiaoVien();
        }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    public void loadBangSP() {
        tablesp.setModel(new CustomTble(arr_SP));
    }
    public void loadBangLSP() {
        tablelsp.setModel(new CustomLSP(arr_LSP));
    }
    public void loadComboMLSP() {
        for (int i = 0; i < arr_LSP.size(); i++) {
            cbMLSP.addItem(arr_LSP.get(i).getMaLoaiSP());
        }
    }
    private void xoaTrang(){
        txtMLSP.setText("");
        txtMsp.setText("");
        txtNSX.setText("");
        txtTLSP.setText("");
        txtTsp.setText("");  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablelsp = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtMsp = new javax.swing.JTextField();
        txtTsp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMLSP = new javax.swing.JTextField();
        txtTLSP = new javax.swing.JTextField();
        cbMLSP = new javax.swing.JComboBox();
        txtNSX = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablelsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablelsp);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablesp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablesp);

        jButton1.setText(" Thêm Sản Phẩm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên Sản Phẩm");

        jLabel4.setText("Mã Sản Phẩm");

        jLabel5.setText("Mã Loại Sản Phẩm");

        jLabel6.setText("Tên Loại Sản Phẩm");

        jButton2.setText("Thêm Loại Sản Phẩm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã Loại Sản Phẩm");

        jLabel2.setText("Nhà Sản Xuất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTsp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMsp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTLSP, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(txtMLSP))))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(jButton1))
                            .addComponent(jButton2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cbMLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1)))
                .addGap(120, 120, 120)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String maSp = txtMsp.getText();
        String tenSp =  txtTsp.getText();
        String nsx = txtNSX.getText();
        String malsp = cbMLSP.getSelectedItem().toString();
        String lop1 = "insert into SanPham values('" + maSp + "','" + tenSp + "','" + nsx + "','" + malsp + "')";
        try {
            if(txtMsp.getText().equals("")||txtTsp.getText().equals("")||txtNSX.getText().equals("")){
                throw new Exception("Bạn cần cung cấp đầy đủ thông tin !!! ");
            } else { 
            if(arr_SP.contains(new SanPham(txtMsp.getText()))){
                throw new Exception("Mã sanr phaamr đã tồn tại !!! ");
            } else {
                conn.doSQL(lop1);
                arr_SP.clear();
                String sql = "Select * from SanPham";
                if (conn.getData_SP(sql) != null) {
                    arr_SP = conn.getData_SP(sql);
                }
                JOptionPane.showMessageDialog(this, "Thêm thành công thông tin  !!!");  
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        loadBangSP();
        xoaTrang();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String maSp = txtMLSP.getText();
        String tenSp =  txtTLSP.getText();
        
        String lop1 = "insert into LoaiSanPham values('" + maSp + "','" + tenSp + "')";
        try {
            if(txtMLSP.getText().equals("")||txtTLSP.getText().equals("")){
                throw new Exception("Bạn cần cung cấp đầy đủ thông tin !!! ");
            } else { 
            if(arr_LSP.contains(new LoaiSanPham(txtMLSP.getText()))){
                throw new Exception("Mã LSP đã tồn tại !!! ");
            } else {
                conn.doSQL(lop1);
                arr_LSP.clear();
                String sql = "Select * from LoaiSanPham";
                if (conn.getData_LoaiSP(sql) != null) {
                    arr_LSP = conn.getData_LoaiSP(sql);
                }
                JOptionPane.showMessageDialog(this, "Thêm thành công thông tin loaij sanr phaamr !!!");  
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        loadBangLSP();
        xoaTrang();
        cbMLSP.removeAllItems();
        loadComboMLSP();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
     
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbMLSP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablelsp;
    private javax.swing.JTable tablesp;
    private javax.swing.JTextField txtMLSP;
    private javax.swing.JTextField txtMsp;
    private javax.swing.JTextField txtNSX;
    private javax.swing.JTextField txtTLSP;
    private javax.swing.JTextField txtTsp;
    // End of variables declaration//GEN-END:variables
}
