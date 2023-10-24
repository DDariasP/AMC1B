package uhu.amc1b;

import java.util.ArrayList;

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
    public final double t[] = new double[NUM];
    public final Camino path[] = new Camino[NUM];

    public Busqueda(Punto p[]) {
        for (int i = 0; i < NUM; i++) {
            array.add(Punto.copiar(p));
        }
    }

    public void exhaustiva() {
        double t1 = System.nanoTime();
        Punto[] p = array.get(EXH);
        heaps(p.length, p);
        double min = Double.MAX_VALUE;
        for (int i = 0; i < permutations.size(); i++) {
            double camino = 0.0;
            Punto[] tmp = permutations.get(i);
            for (int j = 0; j < tmp.length - 1; j++) {
                camino = camino + Punto.distancia(tmp[i], tmp[i + 1]);
            }
            camino = camino + Punto.distancia(tmp[0], tmp[tmp.length - 1]);
            if (min > camino) {
                min = camino;
                path[EXH] = new Camino(min, tmp);
            }
        }
        double t2 = System.nanoTime();
        t[EXH] = (double) (t2 - t1);
    }

    public void heaps(int n, Punto[] elements) {
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

    private static void swap(Punto[] elements, int a, int b) {
        Punto tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

}
