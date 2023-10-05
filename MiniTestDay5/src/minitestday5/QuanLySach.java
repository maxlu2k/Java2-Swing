package minitestday5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alvin
 */
public class QuanLySach extends javax.swing.JFrame {

    List<Sach> list = new ArrayList<>();

    public QuanLySach() {
        initComponents();
        setLocationRelativeTo(null);
    }

    Sach getToForm() {
        String maSach = txtMaSach.getText();
//        if (maSach.contains(list.)) {
//            JOptionPane.showMessageDialog(null, "Không được trùng!");
//            throw new RuntimeException("MÃ ĐƯỢC TRÙNG!");
//        }
        if (maSach.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã!");
            throw new RuntimeException("MÃ KHÔNG ĐƯỢC ĐỂ TRỐNG!");
        }
        String tenSach = txtTenSach.getText();
        if (tenSach.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tên!");
            throw new RuntimeException("TÊN KHÔNG ĐƯỢC ĐỂ TRỐNG!");
        }
        Date ngayXuatBan = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngayXuatBan = sdf.parse(txtNgaySB.getText());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "SAI ĐỊNH DẠNG NGÀY!");
        }
        if (ngayXuatBan == null) {
            throw new RuntimeException("SAI ĐỊNH DẠNG NGÀY!");
        }
//        if(ngayXuatBan.){
//            throw new RuntimeException("Năm phải lướn hơn 0!");
//        }
        String theLoai = (String) cbbTheLoai.getSelectedItem();
        Boolean xuatSu;
        if (rdoNgoaiNuoc.isSelected()) {
            xuatSu = true;
        } else {
            xuatSu = false;
        }
//        if () {
//            
//        }
        return new Sach(maSach, tenSach, ngayXuatBan, theLoai, xuatSu);
    }

    ;
    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblQLS.getModel();
        model.setRowCount(0);
        for (Sach s : list) {
            Object[] row = new Object[]{s.getMaSach(), s.getTenSach(), s.getNgayXuatBan(), s.getTheLoai(), s.getXuatSu() ? "Ngoài nước" : "Trong nước"};
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgaySB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbTheLoai = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rdoTrongNuoc = new javax.swing.JRadioButton();
        rdoNgoaiNuoc = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLS = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã sách");

        jLabel2.setText("Tên sách");

        txtTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSachActionPerformed(evt);
            }
        });

        jLabel3.setText("Ngày xuất bản");

        jLabel4.setText("Thể loại");

        cbbTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giáo dục", "Thể thao", "Kinh dị" }));

        jLabel5.setText("Xuất sứ");

        buttonGroup1.add(rdoTrongNuoc);
        rdoTrongNuoc.setSelected(true);
        rdoTrongNuoc.setText("Trong nước");

        buttonGroup1.add(rdoNgoaiNuoc);
        rdoNgoaiNuoc.setText("Nước ngoài");
        rdoNgoaiNuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNgoaiNuocActionPerformed(evt);
            }
        });

        tblQLS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Năm xuất bản", "Thể loại", "Xuất xứ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblQLS);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoTrongNuoc)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNgoaiNuoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThem))
                            .addComponent(txtNgaySB, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdoTrongNuoc)
                    .addComponent(rdoNgoaiNuoc)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSachActionPerformed

    private void rdoNgoaiNuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNgoaiNuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNgoaiNuocActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            Sach s = getToForm();
            list.add(s);
            fillToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNgoaiNuoc;
    private javax.swing.JRadioButton rdoTrongNuoc;
    private javax.swing.JTable tblQLS;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNgaySB;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
