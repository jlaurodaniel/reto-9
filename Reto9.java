
package reto.pkg9;

import javax.swing.JOptionPane;


public class Reto9 {

   
    public static void main(String[] args) {
        int salud=50 ,comida, aux2,daño=0,uso; 
        boolean status=false;
        String aux,nombre;
        
   nombre=JOptionPane.showInputDialog("bienvenido ,introduce el nombre de tu mascota");
     JOptionPane.showMessageDialog(null, nombre);
     do{
     aux=JOptionPane.showInputDialog("Escriba 1 para darle pasto a "+nombre+" y 0 para darle alimento");
            uso=Integer.parseInt(aux);
            
            if(uso==1){
            aux=JOptionPane.showInputDialog("La cantidad de letras sera el pasto que le daras a "+nombre+".");
            daño=aux.length();
            salud-=daño;
            JOptionPane.showMessageDialog(null,"hey!!!!! eso no fue comida..:C");
            }else if(uso==0){
            aux=JOptionPane.showInputDialog("La cantidad de letras sera el alimento que le daras a "+nombre+".");
            comida=aux.length();
            salud+=comida;
            JOptionPane.showMessageDialog(null,"GRACIAS ,QUE RICO!!!!..:D");
            }else {JOptionPane.showMessageDialog(null,"ingresa un valor correcto...");
            status=true;
            }
          aux=JOptionPane.showInputDialog("seguir jugando ,si/no?: ");
          if(aux.equals("si")){
          status=true;
          }else {
          status=false;
          }
    }while(status);
     
     JOptionPane.showMessageDialog(null,"la salud de "+nombre+" es "+salud+" puntos ");
     
     /*
     comida=nombre.length();
     salud+=comida;
     JOptionPane.showMessageDialog(null, salud);
     JOptionPane.showMessageDialog(null, comida);
     */
    }
    
}
