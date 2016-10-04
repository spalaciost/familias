package ejercicio;

public class Persona {
    private String nombre;
    private String Apellido;
    private int edad;
    private String genero;

    public Persona(String nombre, String Apellido, int edad, String genero) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", genero=" + genero + '}';
    }

   
}