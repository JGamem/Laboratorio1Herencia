package umg.principal.Vehiculos;

public class Vehiculo {

    private String modelo;
    private String marca;
    private int anio;
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    public void generarMarca (){
        System.out.println("La marca es: " + marca);
    }
    public String getModelo() {
        return modelo;
    }
    public void generarModelo(){
        System.out.println("El modelo es: " + modelo);
    }
    public int getAnio() {
        return anio;
    }
    public void generarAnio(){
        System.out.println("El anio es: " + anio);
    }
}
