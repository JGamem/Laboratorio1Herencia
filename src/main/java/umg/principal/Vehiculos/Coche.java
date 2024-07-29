package umg.principal.Vehiculos;

public class Coche extends Vehiculo {

    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void generarMarca(){
        System.out.println("Marca: " + getMarca());
    }
    public void generarModelo(){
        System.out.println("Modelo: " + getModelo());
    }
    public void generarAnio(){
        System.out.println("Anio: " + getAnio());
    }
}
