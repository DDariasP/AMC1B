package uhu.amc1b;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class Busqueda {

    public static final int NUM = 3;
    public static final int UNI = 0;
    public static final int BI = 1;
    public static final int EXH = 2;
    public final ArrayList<Punto[]> array = new ArrayList<>();
    public final ArrayList<Punto[]> permutations = new ArrayList<>();
    public final int numcal[] = new int[NUM];
    public final double t[] = new double[NUM];
    public final Camino path[] = new Camino[NUM];

    public Busqueda(Punto p[]) {
        for (int i = 0; i < NUM; i++) {
            array.add(Punto.copiar(p));
        }
        for (int i = 0; i < NUM; i++) {
            numcal[i] = 0;
        }
    }

    public void unidireccional() {
        double t1 = System.nanoTime();
        Punto[] p = array.get(UNI);
        path[UNI] = unidireccional(p, p.length);
        double t2 = System.nanoTime();
        t[UNI] = (double) (t2 - t1);
    }

    private Camino unidireccional(Punto[] p, int n) {
        double dmin = 0.0;
        Punto[] ruta = new Punto[n + 1];
        boolean[] visitado = new boolean[n];
        for (int i = 0; i < n; i++) {
            visitado[i] = false;
        }
        ruta[0] = p[0];
        visitado[0] = true;
        int actual = 0;
        for (int i = 1; i < n; i++) {
            actual = masCercanaU(p, visitado, n, actual);
            ruta[i] = p[actual];
            visitado[actual] = true;
            dmin = dmin + Punto.distancia(ruta[i - 1], ruta[i]);
            numcal[UNI]++;
        }
        ruta[n] = ruta[0];
        dmin = dmin + Punto.distancia(ruta[n - 1], ruta[n]);
        numcal[UNI]++;
        return new Camino(dmin, ruta);
    }

    private int masCercanaU(Punto[] p, boolean[] visitado, int n, int actual) {
        double dmin = Double.MAX_VALUE;
        int destino = -1;
        for (int i = 0; i < n; i++) {
            if (!visitado[i]) {
                double d = Punto.distancia(p[i], p[actual]);
                numcal[UNI]++;
                if (dmin > d) {
                    dmin = d;
                    destino = i;
                }
            }
        }
        return destino;
    }

    public void bidireccional() {
        double t1 = System.nanoTime();
        Punto[] p = array.get(BI);
        path[BI] = bidireccional(p, p.length);
        double t2 = System.nanoTime();
        t[BI] = (double) (t2 - t1);
    }

    private Camino bidireccional(Punto[] p, int n) {
        double dmin = 0.0;
        LinkedList<Punto> ruta = new LinkedList<>();
        Ciudad[] listaC = new Ciudad[n];
        for (int i = 0; i < n; i++) {
            listaC[i] = new Ciudad(p[i]);
        }
        ruta.addFirst(p[0]);
        listaC[0].visitar();
        int nextPrimero = 0;
        int nextUltimo = 0;
        for (int i = 1; i < n; i++) {
            int primero = nextPrimero;
            nextPrimero = masCercanaB(p, listaC, n, nextPrimero);
            int ultimo = nextUltimo;
            nextUltimo = masCercanaB(p, listaC, n, nextUltimo);
            double dPrimero = Punto.distancia(ruta.getFirst(), p[nextPrimero]);
            numcal[BI]++;
            double dUltimo = Punto.distancia(ruta.getLast(), p[nextUltimo]);
            numcal[BI]++;
            if (dPrimero < dUltimo) {
                ruta.addFirst(p[nextPrimero]);
                listaC[nextPrimero].visitar();
                dmin = dmin + dPrimero;
                nextUltimo = ultimo;
            } else {
                ruta.addLast(p[nextUltimo]);
                listaC[nextUltimo].visitar();
                dmin = dmin + dUltimo;
                nextPrimero = primero;
            }
        }
        Punto penultimo = ruta.getLast();
        ruta.addLast(ruta.getFirst());
        dmin = dmin + Punto.distancia(penultimo, ruta.getLast());
        numcal[BI]++;
        return new Camino(dmin, ruta);
    }

    private int masCercanaB(Punto[] p, Ciudad[] listaC, int n, int actual) {
        double dmin = Double.MAX_VALUE;
        int destino = -1;
        for (int i = 0; i < n; i++) {
            if (!listaC[i].visitado) {
                double d = Punto.distancia(p[i], p[actual]);
                numcal[BI]++;
                if (dmin > d) {
                    dmin = d;
                    destino = i;
                }
            }
        }
        return destino;
    }

    public void exhaustiva() {
        double t1 = System.nanoTime();
        Punto[] p = array.get(EXH);
        heaps(p.length, p);
        double min = Double.MAX_VALUE;
        for (int i = 0; i < permutations.size(); i++) {
            double camino = 0.0;
            Punto[] listaC = permutations.get(i);
            for (int j = 0; j < listaC.length - 2; j++) {
                camino = camino + Punto.distancia(listaC[j], listaC[j + 1]);
                numcal[EXH]++;
            }
            camino = camino + Punto.distancia(listaC[0], listaC[listaC.length - 1]);
            numcal[EXH]++;
            Punto[] b = Punto.copiarplus1(listaC);
            if (min > camino) {
                min = camino;
                path[EXH] = new Camino(min, b);
            }
        }
        double t2 = System.nanoTime();
        t[EXH] = (double) (t2 - t1);
    }

    private void heaps(int n, Punto[] elements) {
        if (n == 1) {
            permutations.add(elements);
        } else {
            for (int i = 0; i < n - 1; i++) {
                heaps(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            heaps(n - 1, elements);
        }
    }

    private void swap(Punto[] elements, int a, int b) {
        Punto tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

}
