package conta.util;

public class Cores {
	
	// Métodos para obtener códigos de color 
	public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String BLUE = "\033[0;34m";

 // Método para imprimir un mensaje en rojo
    public static void printRed(String message) {
        System.out.println(RED + message + RESET);
    }  
    
 // Método para imprimir un mensaje en azul
    public static void printBlue(String message) {
        System.out.println(BLUE + message + RESET);
    }
}
