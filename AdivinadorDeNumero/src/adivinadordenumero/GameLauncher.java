
package adivinadordenumero;

public class GameLauncher {
    public static void main (String [] args) {           //Se lanza la aplicacion , teniendo el metodo Main
        GuessGame game = new GuessGame ();            // Se crea el objeto "GuessGame"
        game.startGame();                         // Al objeto "GuessGame" se crea el metodo starGame
    }
}
