package uhu.amc1b;

import java.awt.Cursor;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author diego
 */
public class Menu extends javax.swing.JFrame {

    public static String fileName;
    public static File file;
    public static Punto array[];

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelArchivo = new javax.swing.JLabel();
        botonOpcion1 = new javax.swing.JButton();
        botonOpcion2 = new javax.swing.JButton();
        botonOpcion3 = new javax.swing.JButton();
        botonOpcion4 = new javax.swing.JButton();
        botonOpcion5 = new javax.swing.JButton();
        botonOpcionE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        labelTitulo.setText("Algoritmos Voraces");

        labelSubtitulo.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        labelSubtitulo.setText("Problema del viajante");

        labelArchivo.setText("Array cargado:");

        botonOpcion1.setText("1) Crear un fichero .tsp aleatorio");
        botonOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion1ActionPerformed(evt);
            }
        });

        botonOpcion2.setText("2) Cargar un dataset en memoria");
        botonOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion2ActionPerformed(evt);
            }
        });

        botonOpcion3.setText("3) Búsqueda unidireccional");
        botonOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion3ActionPerformed(evt);
            }
        });

        botonOpcion4.setText("4) Búsqueda bidireccional");
        botonOpcion4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion4ActionPerformed(evt);
            }
        });

        botonOpcion5.setText("5) Comparar ambas estrategias");
        botonOpcion5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion5ActionPerformed(evt);
            }
        });

        botonOpcionE.setText("E) Búsqueda exhaustiva");
        botonOpcionE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addComponent(labelSubtitulo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonOpcion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcion3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcionE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcion5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(botonOpcion4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelSubtitulo)
                .addGap(26, 26, 26)
                .addComponent(labelArchivo)
                .addGap(26, 26, 26)
                .addComponent(botonOpcion1)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion2)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion3)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion4)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion5)
                .addGap(18, 18, 18)
                .addComponent(botonOpcionE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion1ActionPerformed
        try {
            //crear array aleatorio
            int talla = 0;
            Object input = JOptionPane.showInputDialog(this,
                    "¿Tamaño del fichero?", "Crear un fichero .tsp aleatorio", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                talla = Integer.parseInt((String) input);
                if (talla > 0 && talla <= 5000) {
                    array = Data.crearTSP(talla);
                    labelArchivo.setText("Array cargado: " + fileName);
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Input no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion1ActionPerformed

    private void botonOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion2ActionPerformed
        try {
            //abrir popup
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Elegir un archivo .tsp");
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".tsp", "tsp");
            fc.setFileFilter(filter);
            int input = fc.showOpenDialog(this);
            //leer archivo
            if (input == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                fileName = file.getName();
                array = Data.parsearTSP(file);
                labelArchivo.setText("Array cargado: " + fileName);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Archivo no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion2ActionPerformed

    private void botonOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion3ActionPerformed
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //hacer busqueda y crear archivo
            Busqueda b = new Busqueda(array);
            b.unidireccional();
            Data.guardarBusqueda(b.array.get(b.UNI), "Unidireccional");
            //definir formatos de salida
            DecimalFormat cm = new DecimalFormat("#.00000000");
            DecimalFormat tp = new DecimalFormat("0.0000");
            double nano = 1000000.0;
            //rellenar tabla
            String[] atributos = {" ",
                "Unidireccional"};
            Object[][] datos = {
                {"Camino", cm.format(b.path[b.UNI].valor)},
                {"Tiempo(ms)", tp.format(b.t[b.UNI] / nano)}
            };
            //mostrar tabla
            JTable t = new JTable(datos, atributos);
            JScrollPane sp = new JScrollPane(t);
            JFrame f = new JFrame();
            f.add(sp);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 1100, 120);
            f.setTitle("Resultados - " + fileName);
            f.setVisible(true);
            //mostrar g
            Grafo g = new Grafo(b.path[b.UNI]);
            g.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            g.setBounds(200, 350, 800, 400);
            g.setTitle("Representación");
            g.setVisible(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No hay ningún array cargado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion3ActionPerformed

    private void botonOpcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion5ActionPerformed
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //definir tallas y num de iteraciones
            int T[] = {500, 1000, 1500, 3250, 5000};
            double TD[] = {500.0, 1000.0, 1500.0, 3250.0, 5000.0};
            int N = 100;
            Busqueda b[][] = new Busqueda[T.length][N];
            //crear arrays
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    Punto tmp[] = new Punto[T[i]];
                    Punto.rellenar(tmp, T[i]);
                    b[i][j] = new Busqueda(tmp);
                }
            }
            //hacer busquedas
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    b[i][j].unidireccional();
                    b[i][j].bidireccional();
                }
            }
            //calcular medias
            double[][] tablaT = new double[T.length][Busqueda.NUM - 1];
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < Busqueda.NUM - 1; j++) {
                    tablaT[i][j] = 0.0;
                }
            }
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    tablaT[i][0] = tablaT[i][0] + b[i][j].t[0];
                    tablaT[i][1] = tablaT[i][1] + b[i][j].t[1];
                }
            }
            //definir formato de salida
            DecimalFormat tp = new DecimalFormat("0.0000");
            double nanoMedia = 1000000.0 * (double) (N);
            //rellenar tabla
            String[] atributos = {"Talla",
                "Unidireccional",
                "Bidireccional"};
            Object[][] datos = {
                {" ", "Tiempo(ms)", "Tiempo(ms)"},
                {T[0], tp.format(tablaT[0][0] / nanoMedia), tp.format(tablaT[0][1] / nanoMedia)},
                {T[1], tp.format(tablaT[1][0] / nanoMedia), tp.format(tablaT[1][1] / nanoMedia)},
                {T[2], tp.format(tablaT[2][0] / nanoMedia), tp.format(tablaT[2][1] / nanoMedia)},
                {T[3], tp.format(tablaT[3][0] / nanoMedia), tp.format(tablaT[3][1] / nanoMedia)},
                {T[4], tp.format(tablaT[4][0] / nanoMedia), tp.format(tablaT[4][1] / nanoMedia)}
            };
            double[][] valores = {
                {TD[0], (tablaT[0][0] / nanoMedia), (tablaT[0][1] / nanoMedia)},
                {TD[1], (tablaT[1][0] / nanoMedia), (tablaT[1][1] / nanoMedia)},
                {TD[2], (tablaT[2][0] / nanoMedia), (tablaT[2][1] / nanoMedia)},
                {TD[3], (tablaT[3][0] / nanoMedia), (tablaT[3][1] / nanoMedia)},
                {TD[4], (tablaT[4][0] / nanoMedia), (tablaT[4][1] / nanoMedia)}
            };
            //mostrar tabla
            JTable t = new JTable(datos, atributos);
            JScrollPane sp = new JScrollPane(t);
            JFrame f = new JFrame();
            f.add(sp);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 800, 150);
            f.setTitle("Resultados");
            f.setVisible(true);
            //mostrar g
            Grafica g = new Grafica(valores, "Unidireccional", "Bidireccional");
            g.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            g.setBounds(200, 350, 800, 400);
            g.setTitle("Representación");
            g.setVisible(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No hay ningún array cargado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion5ActionPerformed

    private void botonOpcionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionEActionPerformed
        try {
            //crear array aleatorio
            int talla = 0;
            Object input = JOptionPane.showInputDialog(this,
                    "¿Tamaño del fichero?", "Crear un fichero .tsp aleatorio", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                talla = Integer.parseInt((String) input);
                if (talla > 0 && talla <= 12) {
                    array = Data.crearTSP(talla);
                    labelArchivo.setText("Array cargado: " + fileName);
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Input no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //hacer busqueda y crear archivo
            Busqueda b = new Busqueda(array);
            b.exhaustiva();
            Data.guardarBusqueda(b.array.get(b.EXH), "Exhaustiva");
            //definir formatos de salida
            DecimalFormat cm = new DecimalFormat("#.00000000");
            DecimalFormat tp = new DecimalFormat("0.0000");
            double nano = 1000000.0;
            //rellenar tabla
            String[] atributos = {" ",
                "Exhaustiva"};
            Object[][] datos = {
                {"Camino", cm.format(b.path[b.EXH].valor)},
                {"Tiempo(ms)", tp.format(b.t[b.EXH] / nano)}
            };
            //mostrar tabla
            JTable t = new JTable(datos, atributos);
            JScrollPane sp = new JScrollPane(t);
            JFrame f = new JFrame();
            f.add(sp);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 1100, 120);
            f.setTitle("Resultados - " + fileName);
            f.setVisible(true);
            //mostrar g
            Grafo g = new Grafo(b.path[b.EXH]);
            g.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            g.setBounds(200, 350, 800, 400);
            g.setTitle("Representación");
            g.setVisible(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "???", "Error", JOptionPane.ERROR_MESSAGE);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_botonOpcionEActionPerformed

    private void botonOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion4ActionPerformed
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //hacer busqueda y crear archivo
            Busqueda b = new Busqueda(array);
            b.bidireccional();
            Data.guardarBusqueda(b.array.get(b.BI), "Bidireccional");
            //definir formatos de salida
            DecimalFormat cm = new DecimalFormat("#.00000000");
            DecimalFormat tp = new DecimalFormat("0.0000");
            double nano = 1000000.0;
            //rellenar tabla
            String[] atributos = {" ",
                "Bidireccional"};
            Object[][] datos = {
                {"Camino", cm.format(b.path[b.BI].valor)},
                {"Tiempo(ms)", tp.format(b.t[b.BI] / nano)}
            };
            //mostrar tabla
            JTable t = new JTable(datos, atributos);
            JScrollPane sp = new JScrollPane(t);
            JFrame f = new JFrame();
            f.add(sp);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 1100, 120);
            f.setTitle("Resultados - " + fileName);
            f.setVisible(true);
            //mostrar g
            Grafo g = new Grafo(b.path[b.BI]);
            g.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            g.setBounds(200, 350, 800, 400);
            g.setTitle("Representación");
            g.setVisible(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No hay ningún array cargado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
}//GEN-LAST:event_botonOpcion4ActionPerformed

    public static void main(String args[]) {
        Menu m = new Menu();
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setBounds(200, 200, 360, 470);
        m.setTitle("AMC - Práctica 1b");
        m.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOpcion1;
    private javax.swing.JButton botonOpcion2;
    private javax.swing.JButton botonOpcion3;
    private javax.swing.JButton botonOpcion4;
    private javax.swing.JButton botonOpcion5;
    private javax.swing.JButton botonOpcionE;
    private javax.swing.JLabel labelArchivo;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
