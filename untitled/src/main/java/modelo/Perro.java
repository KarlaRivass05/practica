package modelo;

public class Perro extends Animal{


    private String raza;
    private String[] historialVacunas;
    private float descuento;

    public Perro(String nombre, int edad, double precio, boolean disponible, Especie especie, String raza, String[] historialVacunas, float descuento) {
        super(nombre, edad, precio, disponible, especie);
        this.raza = raza;
        this.historialVacunas = historialVacunas;
        this.descuento=descuento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String[] getHistorialVacunas() {
        return historialVacunas;
    }

    public void setHistorialVacunas(String[] historialVacunas) {
        this.historialVacunas = historialVacunas;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Wauf wauf putita");
    }

    @Override
    public double calcularDescuento() {
        return (super.getPrecio()*getDescuento())/100;
    }

    @Override
    public boolean estaDisponible() {
        return true;
    }

    @Override
    public double getPrecioFinal() {
        return getPrecio()-getDescuento();
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("raza: " + getRaza()) ;
        for (int i = 0; i <getHistorialVacunas().length ; i++) {
            System.out.println("Historial: " + historialVacunas[i]);

        }
        System.out.println("el precio final es de: " + getPrecioFinal());

    }

}



