package modelo;

public class Gato extends Animal {
    private boolean esInterior;
    private String colores[];
    private float descuento;

    public Gato(String nombre, int edad, double precio, boolean disponible, Especie especie, String[] colores, boolean esInterior, float descuento) {
        super(nombre, edad, precio, disponible, especie);
        this.colores = colores;
        this.esInterior = esInterior;
        this.descuento=descuento;
    }

    public boolean isEsInterior() {
        return esInterior;
    }

    public void setEsInterior(boolean esInterior) {
        this.esInterior = esInterior;
    }

    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public void hacerSonido() {
        System.out.println("miau putita");
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
        System.out.println("ES DE INTERIOR LA BESTIA: " + isEsInterior()) ;
        for (int i = 0; i <getColores().length ; i++) {
            System.out.println("Historial: " + colores[i]);
        }
        System.out.println("el precio final es de: " + getPrecioFinal());

    }
}
