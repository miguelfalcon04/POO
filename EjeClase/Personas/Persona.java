package EjeClase.Personas;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private String dni;

    public Persona(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDni(){
        return dni;
    }

    @Override
    public int compareTo(Persona p) {
        return p.getNombre().compareTo(this.nombre);
    }

    @Override
    public boolean equals(Object obj){
        return obj.getClass()==this.getClass() && ((Persona)obj).getDni().equals(this.dni);
    }

    @Override
    public String toString() {
        return "Dni: "+ this.dni+ " Nombre: "+this.nombre;
    }
    
}
