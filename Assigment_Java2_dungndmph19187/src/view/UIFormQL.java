/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.EmployeeService;

/**
 *
 * @author alvin
 */
public class UIFormQL extends javax.swing.JFrame {

    String[] colums = {"MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"};
    DefaultTableModel model = new DefaultTableModel(colums, 0);
    EmployeeService svi = new EmployeeService();

    public UIFormQL() {
        initComponents();
        setLocationRelativeTo(null);
        tblQLNV.setModel(model);
//        txtMaNhanVuen.setEditable(false);
//        txtMaNhanVuen.setEnabled(false);
        fillToTable(svi.getAll());
    }

    public void checkForm() {

    }

//    public UUID generateUniqueID() {
//        // Tạo một mã id tự sinh
//        UUID id = UUID.randomUUID();
//        // Kiểm tra xem mã id đã tồn tại hay chưa
//        for (Employee employee : list) {
//            if (employee.getId() == id) {
//                // Tạo lại mã id tự sinh
//                id = UUID.randomUUID();
//            }
//        }
//        return id;
//    }
//        UUID id = generateUniqueID();
    Employee getForm() {
        String id = txtMaNhanVuen.getText();
        if (id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã!");
            throw new RuntimeException("MÃ KHÔNG ĐƯỢC ĐỂ TRỐNG!");
        }
        // Kiểm tra mã không bị trùng
        for (Employee employee : svi.getAll()) {
            if (employee.getId().equals(id)) {
                JOptionPane.showMessageDialog(null, "Mã đã tồn tại!");
                return null;
            }
        }
        String fullName = txtHoVaTen2.getText();
        if (fullName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tên!");
            throw new RuntimeException("TÊN KHÔNG ĐƯỢC ĐỂ TRỐNG!");
        }
        Integer age = Integer.valueOf(txtTuoi.getText());
        if (age == null) {
            JOptionPane.showMessageDialog(null, "Tuổi phải là số nguyên dương!");
            throw new RuntimeException("TUỔI PHẢI LÀ SỐ NGUYÊN DƯƠNG!");
        }
        if (age < 1) {
            JOptionPane.showMessageDialog(null, "Tuổi phải là số nguyên dương!");
            throw new RuntimeException("TUỔI PHẢI LÀ SỐ NGUYÊN DƯƠNG!");
        }
        String email = txtEmail.getText();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống email!");
            throw new RuntimeException("EMAIL KHÔNG ĐƯỢC ĐỂ TRỐNG!");
        }
        Double salary = Double.valueOf(txtLuong.getText().trim());
        return new Employee(id, fullName, age, email, salary);
    }

    public void fillToTable(List<Employee> list) {
        model.setRowCount(0);
        for (Employee em : list) {
            Object[] row = new Object[]{em.getId(), em.getFullName(), em.getAge(), em.getEmail(), em.getSalary()};
            model.addRow(row);
        }
    }

    public void showDetail() {
        int index = tblQLNV.getSelectedRow();
        if (index >= 0) {
            Employee em = svi.getAll().get(index);
            txtMaNhanVuen.setText(em.getId());
            txtHoVaTen2.setText(em.getFullName());
            txtTuoi.setText(String.valueOf(em.getAge()));
            txtEmail.setText(em.getEmail());
            txtLuong.setText(String.valueOf(em.getSalary()));
        }
    }

    public void clearForm() {
        txtHoVaTen2.setText("");
        txtEmail.setText("");
        txtMaNhanVuen.setText("");
        txtTuoi.setText("");
        txtLuong.setText("");
    }

    public void remove() {
        int index = tblQLNV.getSelectedRow();
        if (index >= 0) {
            Employee em = svi.getAll().get(index);
            svi.getAll().remove(em);
        }
    }

    public void updated() {
        int index = tblQLNV.getSelectedRow();
        if (index >= 0) {
            Employee em = svi.getAll().get(index);
            em.setId(txtMaNhanVuen.getText());
            em.setFullName(txtHoVaTen2.getText());
            em.setAge(Integer.valueOf(txtTuoi.getText()));
            em.setEmail(txtEmail.getText());
            em.setSalary(Double.valueOf(txtLuong.getText()));
        }
        fillToTable(svi.getAll());
    }

    public void search() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        txtMaNhanVuen = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtHoVaTen2 = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        txtTuoi = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();
        btnSort = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("MÃ NHÂN VIÊN");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setText("HỌ VÀ TÊN");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtHoVaTen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoVaTen2ActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel4.setText("TUỔI");

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        txtTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuoiActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("EMAIL");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("lƯƠNG");

        txtLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quản Lý Nhân Viên");

        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLNV);

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHoVaTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaNhanVuen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLuong))
                                        .addGap(2, 2, 2)))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnNew)
                                                    .addComponent(btnSave)
                                                    .addComponent(btnDelete)
                                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(btnSort, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(168, 168, 168))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnFind, btnLoad, btnNew, btnOpen, btnSave, btnSort, btnUpdate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLuong, txtMaNhanVuen, txtTuoi});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtHoVaTen2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaNhanVuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoVaTen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnFind, btnLoad, btnNew, btnOpen, btnSave, btnSort, btnUpdate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtLuong, txtMaNhanVuen, txtTuoi});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtHoVaTen2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoVaTen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoVaTen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoVaTen2ActionPerformed

    private void txtTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuoiActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuongActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();
        fillToTable(svi.getAll());
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Employee em = getForm();
            svi.getAll().add(em);
            clearForm();
            fillToTable(svi.getAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNVMouseClicked
        showDetail();
        System.out.println("click");
    }//GEN-LAST:event_tblQLNVMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        remove();
        clearForm();
        fillToTable(svi.getAll());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        fillToTable(svi.search(txtMaNhanVuen.getText()));
        clearForm();

    }//GEN-LAST:event_btnFindActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updated();
        clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        fillToTable(svi.sortBySalaryDesc());
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        try {
            for (int i = 0; i < svi.getAll().size(); i++) {
                svi.getAll().get(i).setId((String) model.getValueAt(i, 0));
                svi.getAll().get(i).setFullName((String) model.getValueAt(i, 1));
//                svi.getAll().get(i).setAge((Integer) model.getValueAt(i, 2));
                svi.getAll().get(i).setEmail((String) model.getValueAt(i, 3));
//                svi.getAll().get(i).setSalary((Double) model.getValueAt(i, 4));
// lỗi cast Int to String
            }
            svi.writeData();
            JOptionPane.showMessageDialog(null, "Luu thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {
            svi.readData();
            fillToTable(svi.getAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOpenActionPerformed

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
            java.util.logging.Logger.getLogger(UIFormQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIFormQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIFormQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIFormQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIFormQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen2;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNhanVuen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
