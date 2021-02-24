/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriooperadores054786;

/**
 *
 * @author carol
 */
public class LaboratorioOperadores054786 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primera parte: Operadores Usuarios
        //Operadores de incremento
        int x = 10;
        int y = 10;
        boolean b = false;
        System.out.println("Valor inicial de x: " + x);
        System.out.println("Valor inical de y: " + y);
        System.out.println("Valor de x con pre-incremento: " + ++x);
        System.out.println("Valor de y con pre-incremento: " + y++);
        System.out.println("Valor final de x: " + x);
        System.out.println("Valor final de y: " + y);
        
        // Operadores positivos / negativo | complemento boolaneo
        System.out.println("El negativo de x es: " + -x);
        System.out.println("El complemento de b es: " + !b);
        
        // Operadores inversor a nivel de bits
        x = 192;
        System.out.println("El numero 192 en binario es: " + 
                Integer.toBinaryString(x));
        System.out.println("El inverso de 192 en binario es: " +
                Integer.toBinaryString(-x));
        
        // Operador cast
        x = (int) 5.9999999999; // (10 nueves)
        System.out.println("Casteando un doble en entero: " + x);
        
        //Segunda parte: Operadores binarios
        // Operadores aritmeticos
        x = 5;
        y = 5;
        System.out.println("Suma: 5 + 5 = " + (x +y));
        System.out.println("Resta: 5 - 5 = " + (x -y));
        System.out.println("Multiplicación: 5*5 = " + (x * y));
        System.out.println("División: 5 / 5 = " + (x/y));
        System.out.println("Módulo: 5 % 5 = " + ( x % y));
        //Concatenación 
        String fase1 = "¡El operador Suma (+)";
        String fase2 = "Tambien une cadenas de texto!";
        System.out.println(fase1 + fase2);
        //División entera
        x = 7;
        y = 4;
        double z = x/ y;  //El resultado real es 1.75
        System.out.println("La división 7 / 4 es: " + z);
        //Operadores logico-relacionales
        b = (x > y);     
        boolean b2 = (x< y);      //¿7 es mayor que 4? - true
        boolean b3 = (x != y);    //¿7 es menor que 4? - false
        System.out.println("7 > 4 AND 7 < 4?: " + (b && b2));
        System.out.println("7 > 4 OR 7 < 4?: " + (b || b2));
        System.out.println("7 > 4 AND 7 < 4?: " + (b && b3));
        System.out.println("7 > 4 OR 7 <4?: " + (b || b3));
        System.out.println("¿frase1 es un String? " + 
                (fase1 instanceof String));
        // Operadores de Asignación
        System.out.println("¡Hemos estado utilizando el operador " +
                "Asignación desde el principio! ¿Lo habias notado?");
        x = 10;
        y = 10;
        x += 20;
        y = y + 20;
        System.out.println("Valor de x; " + x);
        System.out.println("Valor de y: " + y);
        // Operadores Bitwise
        int byte1 =51;
        int byte2 =112;
        System.out.println("El byte1 en binario; "
        + Integer.toBinaryString(byte1));
        System.out.println("El byte2 en binario: "
        + Integer.toBinaryString(byte2));
        System.out.println("Operación Bitwise AND: " + 
                Integer.toBinaryString(byte1 & byte2));
        System.out.println("Operación Bitwise OR: " +
                Integer.toBinaryString(byte1 | byte2));
        System.out.println("Operaciones Bitwise XOR: " + 
                Integer.toBinaryString(byte1 ^ byte2));
        System.out.println("Desplazamiento 3 lugares a la izquierda: " + 
                Integer.toBinaryString(byte1 << 3));
        System.out.println("Seaplazamiento 3 lugares a la derecha: " + 
                Integer.toBinaryString(byte1 >> 3));
        System.out.println("Desplazamiento sin signo 3 lugares a la derecha " + 
                "derecha: " + Integer.toBinaryString(byte1 >>> 3));
        
    }
    
}
