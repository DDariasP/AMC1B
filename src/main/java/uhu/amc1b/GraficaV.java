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

        JFreeChart barChart = ChartFactory.createBarChart(
                "",
                "Talla",
                "",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        CategoryPlot plot = barChart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.CYAN);
        renderer.setSeriesPaint(1, Color.MAGENTA);
        renderer.setItemMargin(0.0);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        final String t0 = "Unidireccional";
        final String t1 = "Bidireccional";
        final String c0 = String.valueOf(d[0][0]);
        final String c1 = String.valueOf(d[1][0]);
        final String c2 = String.valueOf(d[2][0]);
        final String c3 = String.valueOf(d[3][0]);
        final String c4 = String.valueOf(d[4][0]);
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(d[0][3], t0, c0);
        dataset.addValue(d[1][3], t0, c1);
        dataset.addValue(d[2][3], t0, c2);
        dataset.addValue(d[3][3], t0, c3);
        dataset.addValue(d[4][3], t0, c4);

        dataset.addValue(d[0][4], t1, c0);
        dataset.addValue(d[1][4], t1, c1);
        dataset.addValue(d[2][4], t1, c2);
        dataset.addValue(d[3][4], t1, c3);
        dataset.addValue(d[4][4], t1, c4);

        return dataset;
    }

}
