package uhu.amc1b;

import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class Camino {

    public final double valor;
    public final Punto[] path;

    public Camino(double a, Punto[] b) {
        valor = a;
        path = Punto.copiar(b);
    }

    public Camino(Camino c) {
        valor = c.valor;
        path = Punto.copiar(c.path);
    }

    public Camino(double a, LinkedList<Punto> b) {
        valor = a;
        path = new Punto[b.size()];
        for (int i = 0; i < b.size(); i++) {
            path[i] = new Punto(b.get(i));
        }
    }

    @Override
    public String toString() {
        return ("[" + valor + "]");
    }

}
