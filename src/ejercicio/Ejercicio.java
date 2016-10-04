package ejercicio;

public class Ejercicio {

    public static void main(String[] args) {
        Persona p1= new Persona("luis", "perez", 15, "m"); 
        Persona p2= new Persona("Andres", "Perez", 48, "m"); 
        Familia f1=new Familia("perez");
        f1.Agregar_Miembro(p2);
        f1.Agregar_Miembro(p1);
        Registro r=new Registro();
        for (int i = 0; i < 20; i++) {
            r.agregar_familia(f1);
            r.ListarFamilia();
            r.consultar_familia("perez");
        }
        
    }
    
}
