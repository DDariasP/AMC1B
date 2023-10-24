package uhu.amc1b;

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

    @Override
    public String toString() {
        return ("[" + valor + "]");
    }

}
