
package metodosyatributos;

/**
 *
 * @author Sayad
 */
public class Calcular {
    
    String Nombre;
    double[] Calificaciones = new double[5];
    
    public Calcular(String Nombre, double[] Calificaciones){
    this.Nombre = Nombre;
    this.Calificaciones = Calificaciones;
    }
    
    public double Promedio(){
        double Promedio = 0;
        
        for (int i = 0; i<5; i++){
            Promedio += this.Calificaciones[i];
        }
        
        Promedio/=5;
        
        return Promedio;
    }
    
    
    public char Calificacion(double Promedio){
        
        if(Promedio<=50){
            return 'F';
        }
        
        else if (Promedio<=60){
            return 'E';
        }
        
        else if (Promedio<=70){
            return 'D';
        }
        
        else if (Promedio<=80){
            return 'C';
        }
        
        else if (Promedio<=90){
            return 'B';
        }
        
    return 'A';
    }
    
    public void Imprimir(String Nombre, double Promedio, char Calificacion){
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Calificación 1: " + Calificaciones[0]);
        System.out.println("Calificación 1: " + Calificaciones[1]);
        System.out.println("Calificación 1: " + Calificaciones[2]);
        System.out.println("Calificación 1: " + Calificaciones[3]);
        System.out.println("Calificación 1: " + Calificaciones[4]);
        System.out.println("Promedio: " + Promedio);
        System.out.println("Calificación: " + Calificacion);
    }
    
}
