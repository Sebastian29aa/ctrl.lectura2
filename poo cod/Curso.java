public class Curso {

    // Atributos
    String nombreCurso;
    String codigo;

    public Curso(String nombreCurso, String codigo) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Codigo del curso: " + codigo);
    }

    // Clase 
    public static class Estudiante {
        String nombre;

        public Estudiante(String nombre) {
            this.nombre = nombre;
        }

        public void inscribirseEnCurso(Curso curso) {
            System.out.println(nombre + " esta inscrito en el curso: " + curso.nombreCurso);
        }

        public void desinscribirseDeCurso(Curso curso) {
            System.out.println(nombre + " se ha desinscrito del curso: " + curso.nombreCurso);
        }
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso("Matematicas", "1987");
        Curso curso2 = new Curso("Historia", "2021");

        Estudiante estudiante1 = new Estudiante("Pedro");

        curso1.mostrarInformacion();
        curso2.mostrarInformacion();

        estudiante1.inscribirseEnCurso(curso1);
        estudiante1.desinscribirseDeCurso(curso2);
    }
}