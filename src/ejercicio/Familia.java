package ejercicio;
import java.util.ArrayList;

public class Familia { 
    
    
    private String apellido;
    private ArrayList<Persona> persona;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.persona = new ArrayList<Persona>();
    }

    public boolean Agregar_Miembro(Persona persona){
        this.persona.add(persona);
        return true;
    }
    public Persona buscar_miembro(String nombre){
        return null;
    }
    public String getApellido() {
        return apellido;
    }
    public void Listar_Miembros(){
        /*for(Persona p: this.persona){
            System.out.println(p);
        }*/
        for(int i=0; i<this.persona.size();i++){
        Persona p = this.persona.get(i);
            System.out.println(p);
        }
}
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    }