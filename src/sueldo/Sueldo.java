
package sueldo;
import javax.swing.JOptionPane;

public class Sueldo {

    
    public static void main(String[] args) {
       int horas_laboradas; 
       float salario_total;
       
       horas_laboradas = Integer.parseInt(JOptionPane.showInputDialog("Digita las horras trabajadas por el empleado"));
       
       if(horas_laboradas<=40)
       {
         salario_total=horas_laboradas  *16;
       }
       else
       {
          salario_total = (40*16)+(horas_laboradas-40)*20;
       }
       
       JOptionPane.showMessageDialog(null, "El sueldo final del trabajador es "+salario_total);
       
       
    }
    
}
