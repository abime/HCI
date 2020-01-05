/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leafdetection;

import DataLib.DatabaseGeneric;
import DataLib.SingleLog;
import DataLib.SingleRow;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ImportDataSet extends javax.swing.JFrame {

    /**
     * Creates new form DataAnalysis1
     */
    DefaultTableModel tmImproved, tmKmeans, tmLog, tmID3, tm;
    Object data[][];
    MainForm parent;
    int selectedColImprovedIndex, selectedColNormal;
    int distanceIndex = 1;

    boolean train = false;
    DatabaseGeneric testDB;
    File file = new File(System.getProperty("user.dir") + "/Patient.csv");

    public ImportDataSet(MainForm parent) {
        initComponents();
        Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth() / 2, sd.height / 2 - this.getHeight() / 2);
        this.parent = parent;
        jTable1.setBackground(Color.black);
        jTable1.setForeground(Color.green);
        jTable1.setRowHeight(24);
        jTable1.setFont(new Font("Arial", Font.BOLD, 12));
        jTable1.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
        jTable1.getTableHeader().setBackground(new Color(205, 205, 205));

        showAllData();
       // fillTable();

        // jRadioButtonID3KM.setSelected(true);
        testDB = new DatabaseGeneric();

    }

    public int[] convertToInt(double outD[]) {
        int outI[] = new int[outD.length];
        for (int i = 0; i < outD.length; i++) {
            if (outD[i] < 0.5) {
                outI[i] = 0;
            } else {
                outI[i] = 1;
            }
        }
        return outI;
    }

    double[] getArr(Vector<Object> arr) {
        double temp[] = new double[arr.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = Double.parseDouble(arr.get(i).toString());
        }

        return temp;
    }

    public void showAllData() {

        try {
//            colName = new Object[parent.db.TOTAL_COL];
//            for (int i = 0; i < parent.db.TOTAL_COL; i++) {
//                colName[i] = "COL" + (i + 1);
//            }
            SingleRow sEntry = new SingleRow();
            data = new Object[parent.db.allData.size()][parent.db.TOTAL_COL];
            int totalEntry = parent.db.allData.size();
//           / System.out.println("Size      :" + totalEntry +" Total Col : "+parent.db.TOTAL_COL);
            try {

                for (int i = 0; i < totalEntry; i++) {
                    for (int j = 0; j < parent.db.TOTAL_COL; j++) {
                        data[i][j] = parent.db.allData.get(i).rowData.get(j);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error Found:  " + e);
                e.printStackTrace();
            }

            jTable1.setModel(new DefaultTableModel(data, parent.db.colHeader));
        } catch (Exception e) {
            System.out.println("Error" + e);
            e.printStackTrace();
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

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("M I N I N I N G    A L G O R I T H M");

        jTabbedPane1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setText("Import Data set");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Managment", jPanel3);

        jButton2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        parent.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
//        jComboKmeans.removeAllItems();
//        for (int i = 0; i < parent.db.TOTAL_COL; i++) {
//            jComboKmeans.addItem("COL " + (i + 1));
//        }
//
//        jComboColIndex.removeAllItems();
//        for (int i = 0; i < parent.db.TOTAL_COL; i++) {
//            jComboColIndex.addItem("COL " + (i + 1));
//        }
//
//        jComboCluster.removeAllItems();
//        for (int i = 1; i <= 20; i++) {
//            jComboCluster.addItem(i);
//        }
//        jComboCluster.setSelectedIndex(1);
//        ShowLog();
//        showCentroidLog();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        parent.db = new DatabaseGeneric();
        try {
            boolean isValidRow = true;
            FileDialog fd = new FileDialog(this);
            fd.setVisible(true);
            String fname = "";
            if (fd.getFile() == null) {
                return;
            }
            fname = fd.getDirectory() + fd.getFile();
            Vector<Object> tempVector = new Vector<Object>();
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String contents = "";
            // boolean flag = true;
            boolean isFirst = true;
            while (true) {
                contents = br.readLine();
                if (contents == null) {
                    break;
                }
                StringTokenizer stok = new StringTokenizer(contents, ";");
                tempVector = new Vector<Object>();
                while (stok.hasMoreElements()) {
                    String temp = stok.nextToken();
                    if (!temp.equals(" ")) {
                        tempVector.addElement(temp);
                    }
                }
                for (int i = 0; i < tempVector.size(); i++) {
                    if (tempVector.elementAt(i).equals("?")) {
                        tempVector.add(i, "-1");
                        tempVector.remove(i + 1);
                    }
                }
                SingleRow sEntry = new SingleRow();
                sEntry.rowData = tempVector;
                if (isFirst) {
                    isFirst = false;
                    parent.db.TOTAL_COL = tempVector.size();
                    parent.db.colHeader = new Object[parent.db.TOTAL_COL];
                    for (int i = 0; i < tempVector.size(); i++) {
                        parent.db.colHeader[i] = tempVector.get(i);
                    }
                } else {
                    parent.db.allData.add(sEntry);
                }

            }
            br.close();
            parent.saveDB();

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(this, "Error Reading file : " + e);
            // parent.saveDB(db);

            e.printStackTrace();

        }
        showAllData();

    }//GEN-LAST:event_jButton1ActionPerformed
    int minDistance(int val, int centroid) {
        return Math.abs(val - centroid);
    }

    double getDist(double d1, double d2) {
        return Math.sqrt((Math.abs(d1 - d2) * Math.abs(d1 - d2)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}