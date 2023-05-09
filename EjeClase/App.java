package EjeClase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import EjeClase.Personas.Persona;

public class App {

    // Scanner 
    private static Scanner sc;
    public static void inicializar(){
        sc = new Scanner(System.in);
    }
    public static void finalizar(){
        sc.close();
    }

    //Menú
    public static void menu(){
        System.out.println("1. Añadir");
        System.out.println("2. Insertar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Ordenar");
        System.out.println("6. Visualizar");
        System.out.println("7. Salir");
    }

    //Añadir
    public static void anadir(ArrayList<Persona> n){
        String nombre,dni;
        System.out.print("Añada un nombre: ");
        nombre = sc.nextLine();
        System.out.print("Añada el dni: ");
        dni = sc.nextLine();
        Persona i = new Persona(nombre, dni);
        n.add(i);
    }

    //Insertar
    public static void insertar(ArrayList<Persona> n){
        String nombre,dni;
        System.out.print("Añada un nombre: ");
        nombre = sc.nextLine();
        System.out.print("Añada el dni: ");
        dni = sc.nextLine();
        Persona i = new Persona(nombre, dni);
        System.out.print("¿En qué posición desea añadirlo?: ");
        int pos = Integer.parseInt(sc.nextLine());
        n.add(pos, i);
    }

    //Modificar
    public static void modificar(ArrayList<Persona> n){
        System.out.print("¿En qué posición desea modificar?: ");
        int pos = Integer.parseInt(sc.nextLine());
        String nombre,dni;
        System.out.print("Añada un nombre: ");
        nombre = sc.nextLine();
        System.out.print("Añada el dni: ");
        dni = sc.nextLine();
        Persona i = new Persona(nombre, dni);
        n.set(pos, i);
    }

    //Borrar
    public static void borrar(ArrayList<Persona> n){
        System.out.print("¿En qué posición desea elimicar?: ");
        int pos = Integer.parseInt(sc.nextLine());
        n.remove(pos);
    }

    //Ordenar
    public static void ordenar(ArrayList<Persona> n){
        Collections.sort(n);
    }

    //Visualizar
    public static void visualizar(ArrayList<Persona> n){
        for(int i=0; i<n.size(); i++){
            System.out.print(n.get(i)+"\n");
        }
    }


    public static void main(String[] args) {
        inicializar();
        ArrayList<Persona> n = new ArrayList<Persona>();
        int opcion=0;

        do {
            System.out.println();
            menu();
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch(opcion){
                case 1:
                anadir(n);
                break;

                case 2:
                insertar(n);
                break;

                case 3:
                modificar(n);
                break;
                
                case 4:
                borrar(n);
                break;

                case 5:
                ordenar(n);
                break;

                case 6:
                visualizar(n);
                break;
            }
        } while (opcion!=7);

        finalizar();
    }
}
