package uhu.amc1b;

import java.text.DecimalFormat;

/**
 *
 * @author diego
 */
public class Ciudad {

    public boolean visitado;
    public final Punto punto;

    public Ciudad(Punto a) {
        visitado = false;
        punto = new Punto(a);
    }

    public Ciudad(Ciudad c) {
        visitado = c.visitado;
        punto = new Punto(c.punto);
    }

    public void visitar() {
        visitado = true;
    }

    @Override
    public String toString() {
        DecimalFormat p = new DecimalFormat("#.00");
        return ("C" + punto.id + " (" + p.format(punto.x) + ", " + p.format(punto.y) + ")");
    }

}
