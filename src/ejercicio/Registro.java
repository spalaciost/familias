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
    public void consultar_familia(String apellido){
        for (Familia familia : Familia) {
            if(familia.getApellido().equals(apellido)){
            familia.Listar_Miembros();
            }
            
        }
    }
    
    public void ListarFamilia(){
        for (Familia familia : Familia) {
            System.out.println("------------");
            familia.Listar_Miembros();
        }
    }
    
}
