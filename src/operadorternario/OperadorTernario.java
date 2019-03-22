
package operadorternario;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class OperadorTernario {
    
    public static int sumar(int a, int b){
        return a+b;
    }


    public static int restar(int a, int b){
        return a-b;
    }    
    
    public static void main(String[] args) {
                     
        try{

            int opcion;
            
            do{

               opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción\n"+       
                                                                      "1- Ejercicio 1 : verificamos si A es mayor que B y mostramos un mensaje\n"+
                                                                      "2- Ejercicio 2 : verificamos si A es mayor que B y sumamos o restamos\n"+
                                                                      "3- Salir"));

                int a=0, b=0;
                
                if(opcion==1 || opcion==2){
                    a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de A"));
                    b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de B"));
                }
                switch(opcion){

                    case 1:
                        String msg = (a>b) ? "A es mayor que B" : "A no es mayor que B";
                        JOptionPane.showMessageDialog(null, msg);
                    break;

                    case 2:
                        int res = (a>b) ? sumar(a,b) : restar(a,b);
                        String operacion = (a>b) ? "Suma " : "Resta ";
                        JOptionPane.showMessageDialog(null, "El resultado de la "+operacion+" Es "+res);
                    break;
                    
                    case 3:
                        System.exit(0);
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                    break;
                }
                
            }while(opcion!=3);

        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
