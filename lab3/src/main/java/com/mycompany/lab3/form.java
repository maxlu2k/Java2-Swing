package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alvin
 */
public class form extends javax.swing.JFrame {

    public form() {
        initComponents();
        setLocationRelativeTo(null);
        txtHocLuc.setEditable(false);
        cbPhanThuong.setEnabled(false);
        lbErrorNganh.setVisible(false);
        lbErrorHoVaTen.setVisible(false);
        lbErrorDiem.setVisible(false);
        cbbNganh.setSelectedIndex(-1);

    }
    List<Student> list = new ArrayList<>();

    public void addStudent() {
        Student sv = new Student();
        sv.setName(txtHoVaTen.getText());
        sv.setMark(Double.valueOf(txtDiem.getText()));
        sv.setMajor((String) cbbNganh.getSelectedItem());
        list.add(sv);
        txtHocLuc.setText(sv.getGrade());
        cbPhanThuong.setSelected(sv.isBonus());
        System.out.println(sv.toString());
        for (Student svList : list) {
//            if (txtHoVaTen.getText().equals(svList.getName())) {
//                lbErrorHoVaTen.setVisible(true);
//                lbErrorHoVaTen.setText("Tên học sinh bị trùng!");
//            } else {
//                sv.setName(txtHoVaTen.getText());
//                sv.setMark(Double.parseDouble(txtDiem.getText()));
//                sv.setMajor((String) cbbNganh.getSelectedItem());
//                list.add(sv);
//                txtHocLuc.setText(sv.getGrade());
//                cbPhanThuong.setSelected(sv.isBonus());
//                System.out.println(sv.toString());
//            }
System.out.println(svList.getName());
        }
    }

    public void removeStudent() {
        int index = tbBang.getSelectedRow();
        list.remove(index);
    }

    public void updateStudent() {
        int index = tbBang.getSelectedRow();
        Student sv = list.get(index);
        sv.setName(txtHoVaTen.getText());
        sv.setMark(Double.valueOf(txtDiem.getText()));
        sv.setMajor((String) cbbNganh.getSelectedItem());
        txtHocLuc.setText(sv.getGrade());
        cbPhanThuong.setSelected(sv.isBonus());
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tbBang.getModel();
        model.setRowCount(0);
        for (Student st : list) {
            Object[] row = new Object[]{st.getName(), st.getMark(), st.getMajor(), st.getGrade(), st.isBonus() ? "Có thưởng" : "Không thưởng"};
            model.addRow(row);
        }
    }

    public void showDetail() {
        int index = tbBang.getSelectedRow();
        if (index >= 0) {
            Student sv = list.get(index);
            txtHoVaTen.setText(sv.getName());
            txtDiem.setText(String.valueOf(sv.getMark()));
            cbbNganh.setSelectedItem(sv.getMajor());
            txtHocLuc.setText(sv.getGrade());
            cbPhanThuong.setSelected(sv.isBonus());
        }
    }

    public boolean checkForm() {
        String inputt = txtHoVaTen.getText();
        Pattern pattern = Pattern.compile("^\\s");
        boolean isEmptyFirst = pattern.matcher(inputt).find();

        // Kiểm tra có khoảng trắng
        Pattern pattern2 = Pattern.compile("\\s");
        boolean isSpace = pattern2.matcher(inputt).find();

        // Kết quả
        if (isEmptyFirst && isSpace) {
            lbErrorHoVaTen.setVisible(true);
            lbErrorHoVaTen.setText("Họ và tên không để trống !");
            return false;
        } else {
//        if (txtHoVaTen.getText().isEmpty()) {
//            lbErrowHoVaTen.setVisible(true);
//            lbErrowHoVaTen.setText("Họ và tên không để trống !");
//            return false;
//        }
            return true;
        }
    }

    public void test() {
        String input = "     abc";
        // Kiểm tra có khoảng trắng đầu tiên
        Pattern pattern = Pattern.compile("^\\s");
        boolean isEmptyFirst = pattern.matcher(input).find();

        // Kiểm tra có khoảng trắng
        Pattern pattern2 = Pattern.compile("\\s");
        boolean isSpace = pattern2.matcher(input).find();

        // Kết quả
        if (isEmptyFirst && isSpace) {
            System.out.println("Không hợp lệ");
        } else {
            System.out.println("Hợp lệ");
        }
    }

    public void clearForm() {
        txtDiem.setText("");
        txtHoVaTen.setText("");
        txtHocLuc.setText("");
        cbbNganh.setSelectedIndex(-1);
        cbPhanThuong.setSelected(false);
        lbErrorNganh.setVisible(false);
        lbErrorDiem.setVisible(false);
        lbErrorHoVaTen.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHocLuc = new javax.swing.JTextField();
        cbPhanThuong = new javax.swing.JCheckBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBang = new javax.swing.JTable();
        cbbNganh = new javax.swing.JComboBox<>();
        lbErrorNganh = new javax.swing.JLabel();
        lbErrorDiem = new javax.swing.JLabel();
        lbErrorHoVaTen = new javax.swing.JLabel();
        btnXepTheoTen = new javax.swing.JButton();
        btnXepTheoDiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setText("HỌ VÀ TÊN");

        jLabel3.setText("ĐIỂM");

        txtDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemActionPerformed(evt);
            }
        });

        jLabel4.setText("NGÀNH");

        jLabel5.setText("HỌC LỰC");

        cbPhanThuong.setText("có phần thưởng ?");

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("XOÁ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("CẬP NHẬT");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnLamMoi.setText("NHẬP MỚI");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        tbBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "HỌ VÀ TÊN", "ĐIỂM", "NGÀNH", "HỌC LỰC", "THƯỞNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBang);

        cbbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "PTPM", "UDPM", "QTKD", "Du Lịch Khách Sạn" }));

        lbErrorNganh.setForeground(new java.awt.Color(255, 0, 0));
        lbErrorNganh.setText("Error");

        lbErrorDiem.setForeground(new java.awt.Color(255, 0, 0));
        lbErrorDiem.setText("Error");

        lbErrorHoVaTen.setForeground(new java.awt.Color(255, 0, 0));
        lbErrorHoVaTen.setText("Error");

        btnXepTheoTen.setText("Sắp xếp theo tên");
        btnXepTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXepTheoTenActionPerformed(evt);
            }
        });

        btnXepTheoDiem.setText("Sắp xếp theo điểm");
        btnXepTheoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXepTheoDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbErrorDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lbErrorHoVaTen))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPhanThuong)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnXoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCapNhat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLamMoi))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbErrorNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXepTheoTen)
                        .addGap(18, 18, 18)
                        .addComponent(btnXepTheoDiem)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiem, txtHoVaTen, txtHocLuc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lbErrorHoVaTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorDiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbErrorNganh))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPhanThuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnLamMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXepTheoTen)
                    .addComponent(btnXepTheoDiem))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDiem, txtHoVaTen, txtHocLuc});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        if (txtHoVaTen.getText().isEmpty() || txtHoVaTen.getText().isBlank() || cbbNganh.getSelectedIndex() == -1) {
//            lbErrorNganh.setVisible(true);
//            lbErrorNganh.setText("Chưa chọn ngành học !");
//            
        Pattern pattern = Pattern.compile("^[0-9]{1,2}$");
        boolean isHoTen = txtHoVaTen.getText().matches("^\s*");//Rỗng; khoảng trắng; ký tự đặc biệt
        boolean isDiem = txtDiem.getText().matches("^[0-9]+(\\.[0-9]+)?$");//Rỗng; khoảng trắng; ký tự đặc biệt
        if (isHoTen) {
            lbErrorHoVaTen.setVisible(true);
            lbErrorHoVaTen.setText("ko để ký tự đặc biệt, ko để trống !");
            lbErrorDiem.setVisible(false);
            lbErrorNganh.setVisible(false);
            return;
        }
        if (!isDiem) {
            lbErrorDiem.setVisible(true);
            lbErrorDiem.setText("Sai định dạng điểm !");
            lbErrorHoVaTen.setVisible(false);
            lbErrorNganh.setVisible(false);
            return;
        }
        if (cbbNganh.getSelectedIndex() == -1) {
            lbErrorNganh.setVisible(true);
            lbErrorNganh.setText("Chưa chọn ngành học !");
            lbErrorDiem.setVisible(false);
            lbErrorHoVaTen.setVisible(false);
            return;
        } else {
            addStudent();
            fillToTable();
            clearForm();
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void txtDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        removeStudent();
        fillToTable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBangMouseClicked
        this.showDetail();
    }//GEN-LAST:event_tbBangMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        updateStudent();
        fillToTable();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXepTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXepTheoTenActionPerformed
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(list, comparator);
        fillToTable();
    }//GEN-LAST:event_btnXepTheoTenActionPerformed

    private void btnXepTheoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXepTheoDiemActionPerformed
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getMark(), o2.getMark());
            }
        };
        Collections.sort(list, comparator);
        fillToTable();
    }//GEN-LAST:event_btnXepTheoDiemActionPerformed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXepTheoDiem;
    private javax.swing.JButton btnXepTheoTen;
    private javax.swing.JButton btnXoa;
    private javax.swing.JCheckBox cbPhanThuong;
    private javax.swing.JComboBox<String> cbbNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbErrorDiem;
    private javax.swing.JLabel lbErrorHoVaTen;
    private javax.swing.JLabel lbErrorNganh;
    private javax.swing.JTable tbBang;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtHocLuc;
    // End of variables declaration//GEN-END:variables
}
