package collections1.utilidades;

import collections1.entidades.Perro;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Perro> ordenarNombreAsc = new Comparator<Perro>/*Acá apretar ctrl+Esp y autocompleta el resto*/() {
        @Override
        public int compare(Perro t, Perro t1) {
            return t1.getRaza().compareTo(t.getRaza());
        }
    };
}
