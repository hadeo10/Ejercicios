package miprimerprograma;

/**
 *
 * @author hector
 */
public class Loopy {
    
    public static void main(String[] args){
        int x=1;
        int y=2;
        System.out.println("Antes del Loop");
        while(x<4){
            System.out.println(" Estamos dentro del loop");
            System.out.println("El valor de x es " + x);
            x = x+1;
            System.out.println("El valor de y es " + y);
            y = x+1;
        }
        System.out.println("Despues del Loop");
    }
}
