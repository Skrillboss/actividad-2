import java.util.Scanner;

/**
 * La clase Notas permite ingresar, calcular y mostrar las notas de un estudiante.
 * @version 1.0
 * @since 2024-03-29
 * @author Luis Heredia Colmenares
 */
public class Notas {
    // Declaramos las variables que nos hacen falta
    double uf1, uf2, uf3;
    double acu, acu1, acu2, def;
    // Utilizamos Scanner para poder introducir datos
    Scanner entrada = new Scanner(System.in);

    /**
     * Método para ingresar las notas del estudiante.
     */
    public void ingresarNotas() {
        // Cuando ejecutamos este método, lo primero que queremos es que nos pida notas
        System.out.println("Ingrese las notas del estudiante");

        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Método para comprobar la correcta introducción de las notas.
     */
    public void comprobacion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Método para calcular las notas acumuladas y definitiva.
     * @return La nota definitiva del estudiante.
     */
    public double calcularNotas() {
        acu = uf1 * 0.35;
        acu1 = uf2 * 0.35;
        acu2 = uf3 * 0.30;

        def = acu + acu1 + acu2;
        return def;
    }

    /**
     * Método para mostrar las notas introducidas y su acumulado.
     */
    public void mostrar() {
        System.out.println("Notas introducidas son:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);

        System.out.println("Acumulado 1 = " + acu);
        System.out.println("Acumulado 2 = " + acu1);
        System.out.println("Acumulado 3 = " + acu2);

        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Método para determinar si el estudiante ha aprobado o suspendido.
     * @return "Aprobado" si la nota definitiva es mayor o igual a 5, "Suspendido" si es menor a 5, o "Error en las notas" si es mayor a 10.
     */
    public String aprobado() {
        if (def < 5 && def >= 0) {
            return "Suspendido";
        } else if (def >= 5 && def <= 10) {
            return "Aprobado";
        } else {
            return "Error en las notas";
        }
    }

    /**
     * Método principal que llama a otros métodos para realizar el proceso.
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Creamos mecanismos para llamar a cualquier método fuera de la clase
        Notas fc = new Notas();

        fc.ingresarNotas();
        fc.comprobacion();
        double notaDefinitiva = fc.calcularNotas();
        fc.mostrar();
        String estado = fc.aprobado();
        System.out.println("El estudiante está: " + estado);
    }
}
