package uhu.amc1b;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author diego
 */
public class Grafo extends JFrame {

    public final Camino cm;

    public Grafo(Camino camino) {
        cm = camino;

        //crear la grafica
        XYPlot plot = new XYPlot();

        //crear cada parte-i del camino
        for (int i = 0; i < cm.path.length - 1; i++) {
            XYDataset setDisti = createDist(i);
            //caracteristicas de parte-i
            XYItemRenderer rendereri = new XYLineAndShapeRenderer(true, true);
            rendereri.setSeriesShape(0, new Ellipse2D.Double(-3.0, 0.0, 3.0, 3.0));
            rendereri.setSeriesPaint(0, Color.CYAN);
            rendereri.setSeriesStroke(0, new BasicStroke(2.0f));
            //añadir parte-i a la grafica
            plot.setDataset(i, setDisti);
            plot.setRenderer(i, rendereri);
        }

        //crear la nube
        XYDataset setNube = createNube();
        //caracteristicas de la nube
        XYItemRenderer rendererN = new XYLineAndShapeRenderer(false, true);
        rendererN.setSeriesShape(0, new Rectangle2D.Double(-3.0, 0.0, 6.0, 6.0));
        rendererN.setSeriesPaint(0, Color.MAGENTA);
        //añadir la nube a la grafica
        plot.setDataset(cm.path.length, setNube);
        plot.setRenderer(cm.path.length, rendererN);

        //crear y añadir los ejes
        ValueAxis domain = new NumberAxis("");
        ValueAxis range = new NumberAxis("");
        plot.setDomainAxis(0, domain);
        plot.setRangeAxis(0, range);

        //crear el area de trazado
        JFreeChart chart = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        plot.setBackgroundPaint(Color.DARK_GRAY);
        chart.removeLegend();

        //crear la ventana 
        ChartPanel panel = new ChartPanel(chart);
        panel.setDomainZoomable(true);
        panel.setRangeZoomable(true);
        setContentPane(panel);
    }

    private XYDataset createNube() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        //ciudades 
        XYSeries series = new XYSeries("");
        for (int i = 0; i < cm.path.length - 1; i++) {
            series.add(cm.path[i].x, cm.path[i].y);
        }
        dataset.addSeries(series);
        return dataset;
    }

    private XYDataset createDist(int n) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        //parte-i
        XYSeries series = new XYSeries("");
        series.add(cm.path[n].x, cm.path[n].y);
        series.add(cm.path[n + 1].x, cm.path[n + 1].y);
        dataset.addSeries(series);
        return dataset;
    }
}
