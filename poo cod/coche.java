
public class coche {

    // Atributos
     String color;
     String marca;

    public coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public void mostrarInformacion() {
        System.out.println("El color del coche es: " + color);
        System.out.println("La marca del coche es: " + marca);
    }

    
    public static class Conductor {
         String nombre;

        public Conductor(String nombre) {
            this.nombre = nombre;
        }

        public void conducir(coche coche) {
            System.out.println(nombre + " esta conduciendo un coche de color: " + coche.color);
        }
    }

    public static void main(String[] args) {
        coche coche1 = new coche("Blanco", "Audi");
        
        Conductor conductor1 = new Conductor("juan");
        
        coche1.mostrarInformacion();
        
        conductor1.conducir(coche1);
    }
}