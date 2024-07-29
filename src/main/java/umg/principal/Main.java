package umg.principal;

import umg.principal.Vehiculos.Coche;
import umg.principal.Vehiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota");
        coche.generarMarca();

        Moto moto = new Moto("Suzuki");
        moto.generarMarca();
    }
}