
package adivinadordenumero;

public class GuessGame {
                                            //Tres variables para tres jugadores
    Player p1;
    Player p2;
    Player p3;    
                                            //Se crea 3 objetos jugadores y se asigan a 3 instancias    
    public void startGame() {
        p1 =new Player();
        p2 =new Player();
        p3 =new Player();
                                            //Declara 3 variables para tomar 3 numeros adivinados        
        int guessp1 = 0;                    // por los jugadores 
        int guessp2 = 0;
        int guessp3 = 0;
                                            //Declara 3 variables para asignar el resultado (V o F)        
                                            // acerca de si los jugadores acertaron o no
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
                                            // Generando el N° que los jugadores deben adivinar        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Yo estoy pensando en un numero entre 0 y 9...");
        
                                            // Llamando al metodo guess () de cada jugador        
        while(true) {
	           System.out.println("El numero a adivinar es " + targetNumber);           
	           p1.guess();
	           p2.guess();
	           p3.guess();
                                            // Obteniendo el numero que cada jugador ha propuesto
                                            // resultado de correr el metodo guess()
	           guessp1 = p1.number;
	           System.out.println("El primer jugador adivina " + guessp1);
	           guessp2 = p2.number;
	           System.out.println("El segundo jugador adivina " + guessp2);
	           guessp3 = p3.number;
	           System.out.println("El tercer jugador adivina " + guessp3);

	           if (guessp1 == targetNumber) {                  // Verificar si algún jugador acerto
	               p1isRight = true;                           // con el N° generado por la clase
	           }                                               // Si algún jugador acerto se asigna
	           if (guessp2 == targetNumber) {                  // a su correspondiente variable el 
	               p2isRight = true;                           // valor verdadero... "Recordar que se
	           }                                               // asigno falso por defecto"
	           if (guessp3 == targetNumber) {
	               p3isRight = true;
	           }
                                                                   // Si un jugador Gana (el operador lo reporta)
	           if (p1isRight || p2isRight || p3isRight)
	           {
	               System.out.println("Nosotros tenemos un Jugador!");
	               System.out.println("¿El Jugador 1 gano? " + p1isRight);
	               System.out.println("¿El jugador 2 gano? " + p2isRight);
	               System.out.println("¿El jugador 3 gano? " + p3isRight);
	               System.out.println("El juego ha finalizado.");
	               break; 
	           }
                                                                  // Si nadie Gana se mantiene en el bucle y 
                                                                  // pregunta a los jugadores por el otro juego                   
                   else {
	        	   // Nadie ha adivinado, nos mantenemos en el juego aun!
	               System.out.println("Los jugadores probaran otra vez.");
	           } // end if/else
	           
	      }	  //end loop  
        
       }     //end method
    
}     //end class
