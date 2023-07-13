/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

public class Principal {

    public static void main(String[] args) {

        String nombreArchivo = "usuarios.txt";
        LecturaArchivo lectura = new LecturaArchivo(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);

        System.out.println("---------------------------");

    }
}
