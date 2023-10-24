/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uhu.amc1b;

import java.awt.Cursor;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author diego
 */
public class Opcion5 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Opcion5() {
        initComponents();
        grupo1.add(b00);
        grupo1.add(b01);
        grupo1.add(b02);
        grupo1.add(b03);
        grupo2.add(b10);
        grupo2.add(b11);
        grupo2.add(b12);
        grupo2.add(b13);
        b00.setSelected(true);
        b10.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        grupo2 = new javax.swing.ButtonGroup();
        b01 = new javax.swing.JRadioButton();
        b00 = new javax.swing.JRadioButton();
        bok = new javax.swing.JButton();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        b03 = new javax.swing.JRadioButton();
        b10 = new javax.swing.JRadioButton();
        b11 = new javax.swing.JRadioButton();
        b12 = new javax.swing.JRadioButton();
        b13 = new javax.swing.JRadioButton();
        b02 = new javax.swing.JRadioButton();
        bcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b01.setText("Poda");

        b00.setText("Exhaustivo");

        bok.setText("OK");
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });

        lab1.setText("Algoritmo 1:");

        lab2.setText("Algoritmo 2:");

        b03.setText("DyVPlus");

        b10.setText("Exhaustivo");

        b11.setText("Poda");

        b12.setText("DyV");

        b13.setText("DyVPlus");

        b02.setText("DyV");

        bcancel.setText("CANCEL");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lab1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b00)
                            .addComponent(b01)
                            .addComponent(b03)
                            .addComponent(b02)
                            .addComponent(bok, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b10)
                                    .addComponent(b11)
                                    .addComponent(b12)
                                    .addComponent(lab2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b13)
                                    .addComponent(bcancel))
                                .addContainerGap(58, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab1)
                    .addComponent(lab2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b00)
                    .addComponent(b10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b01)
                    .addComponent(b11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b12)
                    .addComponent(b02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b03)
                    .addComponent(b13))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bok)
                    .addComponent(bcancel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //comprobar input
            int a1 = -1;
            int a2 = -1;
            if (b00.isSelected()) {
                a1 = 0;
            }
            if (b01.isSelected()) {
                a1 = 1;
            }
            if (b02.isSelected()) {
                a1 = 2;
            }
            if (b03.isSelected()) {
                a1 = 3;
            }
            if (b10.isSelected()) {
                a2 = 0;
            }
            if (b11.isSelected()) {
                a2 = 1;
            }
            if (b12.isSelected()) {
                a2 = 2;
            }
            if (b13.isSelected()) {
                a2 = 3;
            }
            //guardar eleccion
            String n1 = "";
            String n2 = "";
            switch (a1) {
                case 0:
                    n1 = "Exhaustiva";
                    break;
                case 1:
                    n1 = "Poda";
                    break;
                case 2:
                    n1 = "DyV";
                    break;
                case 3:
                    n1 = "DyVPlus";
                    break;
            }
            switch (a2) {
                case 0:
                    n2 = "Exhaustiva";
                    break;
                case 1:
                    n2 = "Poda";
                    break;
                case 2:
                    n2 = "DyV";
                    break;
                case 3:
                    n2 = "DyVPlus";
                    break;
            }
            //definir tallas y num de iteraciones
            int T[] = {200, 500, 1500, 3250, 5000};
            double TD[] = {200.0, 500.0, 1500.0, 3250.0, 5000.0};
            int N = 10;
            Busqueda b[][] = new Busqueda[T.length][N];
            //crear arrays
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    Punto tmp[] = new Punto[T[i]];
                    Punto.rellenar(tmp, T[i], Menu.peor);
                    b[i][j] = new Busqueda(tmp);
                }
            }
            //hacer busquedas
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    b[i][j].exhaustiva();
                    b[i][j].poda();
                    b[i][j].dyv();
                    b[i][j].dyvplus();
                }
            }
            //calcular medias
            double[][] tablaT = new double[T.length][Busqueda.NUM];
            int[][] tablaC = new int[T.length][Busqueda.NUM];
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < Busqueda.NUM; j++) {
                    tablaT[i][j] = 0.0;
                    tablaC[i][j] = 0;
                }
            }
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    tablaT[i][0] = tablaT[i][0] + b[i][j].t[0];
                    tablaT[i][1] = tablaT[i][1] + b[i][j].t[1];
                    tablaT[i][2] = tablaT[i][2] + b[i][j].t[2];
                    tablaT[i][3] = tablaT[i][3] + b[i][j].t[3];
                    tablaC[i][0] = tablaC[i][0] + b[i][j].numcal[0];
                    tablaC[i][1] = tablaC[i][1] + b[i][j].numcal[1];
                    tablaC[i][2] = tablaC[i][2] + b[i][j].numcal[2];
                    tablaC[i][3] = tablaC[i][3] + b[i][j].numcal[3];
                }
            }
            //definir formato de salida
            DecimalFormat tp = new DecimalFormat("0.0000");
            double nanoMedia = 1000000.0 * (double) (N);
            //rellenar tabla
            String[] atributos = {"Talla",
                n1,
                n2,
                n1,
                n2};
            Object[][] datos = {
                {" ", "Tiempo(ms)", "Tiempo(ms)", "Calculadas", "Calculadas"},
                {T[0], tp.format(tablaT[0][a1] / nanoMedia), tp.format(tablaT[0][a2] / nanoMedia), tablaC[0][a1] / N, tablaC[0][a2] / N},
                {T[1], tp.format(tablaT[1][a1] / nanoMedia), tp.format(tablaT[1][a2] / nanoMedia), tablaC[1][a1] / N, tablaC[1][a2] / N},
                {T[2], tp.format(tablaT[2][a1] / nanoMedia), tp.format(tablaT[2][a2] / nanoMedia), tablaC[2][a1] / N, tablaC[2][a2] / N},
                {T[3], tp.format(tablaT[3][a1] / nanoMedia), tp.format(tablaT[3][a2] / nanoMedia), tablaC[3][a1] / N, tablaC[3][a2] / N},
                {T[4], tp.format(tablaT[4][a1] / nanoMedia), tp.format(tablaT[4][a2] / nanoMedia), tablaC[4][a1] / N, tablaC[4][a2] / N}
            };
            double[][] valores = {
                {TD[0], tablaT[0][a1] / nanoMedia, tablaT[0][a2] / nanoMedia},
                {TD[1], tablaT[1][a1] / nanoMedia, tablaT[1][a2] / nanoMedia},
                {TD[2], tablaT[2][a1] / nanoMedia, tablaT[2][a2] / nanoMedia},
                {TD[3], tablaT[3][a1] / nanoMedia, tablaT[3][a2] / nanoMedia},
                {TD[4], tablaT[4][a1] / nanoMedia, tablaT[4][a2] / nanoMedia}
            };
            //mostrar tabla
            JTable t = new JTable(datos, atributos);
            t.setEnabled(false);
            JScrollPane sp = new JScrollPane(t);
            JFrame f = new JFrame();
            f.add(sp);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 700, 150);
            f.setTitle("Comparación - " + n1 + " vs " + n2);
            f.setVisible(true);
            this.setVisible(false);
            //mostrar g
            Grafica5 g = new Grafica5(valores, n1, n2);
            g.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            g.setBounds(200, 350, 800, 400);
            g.setTitle("Representación");
            g.setVisible(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_bokActionPerformed

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bcancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Opcion5().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b00;
    private javax.swing.JRadioButton b01;
    private javax.swing.JRadioButton b02;
    private javax.swing.JRadioButton b03;
    private javax.swing.JRadioButton b10;
    private javax.swing.JRadioButton b11;
    private javax.swing.JRadioButton b12;
    private javax.swing.JRadioButton b13;
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bok;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.ButtonGroup grupo2;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    // End of variables declaration//GEN-END:variables
}