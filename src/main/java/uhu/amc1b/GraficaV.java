package uhu.amc1b;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaV extends JFrame {

    private final double[][] d;

    public GraficaV(double[][] datos, String nombreA, String nombreB) {
        d = datos;

        //crear el area de trazado
        JFreeChart barChart = ChartFactory.createBarChart(
                "",
                "Talla",
                "",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        //crear la grafica
        CategoryPlot plot = barChart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.CYAN);     //color de f0
        renderer.setSeriesPaint(1, Color.MAGENTA);  //color de f1
        renderer.setItemMargin(0.0);    //espacio entre barras

        //crear la ventana 
        ChartPanel chartPanel = new ChartPanel(barChart);
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        //f0 y f1
        final String f0 = "Unidireccional";
        final String f1 = "Bidireccional";
        //tallas
        final String c0 = String.valueOf((int)(d[0][0]));
        final String c1 = String.valueOf((int)(d[1][0]));
        final String c2 = String.valueOf((int)(d[2][0]));
        final String c3 = String.valueOf((int)(d[3][0]));
        final String c4 = String.valueOf((int)(d[4][0]));
        //crear dataset
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //f0
        dataset.addValue(d[0][3], f0, c0);
        dataset.addValue(d[1][3], f0, c1);
        dataset.addValue(d[2][3], f0, c2);
        dataset.addValue(d[3][3], f0, c3);
        dataset.addValue(d[4][3], f0, c4);
        //f1
        dataset.addValue(d[0][4], f1, c0);
        dataset.addValue(d[1][4], f1, c1);
        dataset.addValue(d[2][4], f1, c2);
        dataset.addValue(d[3][4], f1, c3);
        dataset.addValue(d[4][4], f1, c4);
        //dataset creado
        return dataset;
    }

}
