import modelo.Animal;
import modelo.Especie;
import modelo.Gato;
import modelo.Perro;

public class Main {
    public static void main(String[] args) {
        Animal animalitos = new Gato("andres",10, 25.3, true, Especie.GATO,new String[]{"verde","azul"},true, 20);
        Animal animalitos2 = new Perro("pepe",11, 40.3, true, Especie.PERRO,"Buldog", new String[]{"pepe","karlota"}, 20);
        animalitos.mostrarInfo();
        animalitos2.mostrarInfo();
    }
}
