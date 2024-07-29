package umg.principal.Vehiculos;

public class Moto extends Vehiculo{
    public Moto(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void generarMarca(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Anio: " + getAnio());
    }
}
