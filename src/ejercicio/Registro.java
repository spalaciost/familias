package ejercicio;
import java.util.ArrayList;
import ejercicio.Familia;

public class Registro { 
    private ArrayList<Familia> Familia;

    public Registro() {
        this.Familia = new ArrayList<Familia>();
    }
    
    public Persona consultar_persona(String nombre){
        return null;
    }
    public boolean agregar_familia(Familia familia) {
        this.Familia.add(familia);
        return true;
    }
    public Familia consultar_familia(String apellido){
    return null;
    }  
    public void ListarFamilia(){
        for (Familia familia : Familia) {
            System.out.println("------------");
            familia.Listar_Miembros();
        }
    }
    
}
