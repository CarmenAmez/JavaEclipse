package fundamentos_java.java;

import metodos_java.java.Metodos3;

public class Cadenas {
    
    public static int CalcontadorDeLetras(String palabra, char letra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) { 
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String palabra = "anaranjado";
        char letra = 'a';
        int contador = CalcontadorDeLetras(palabra, letra);
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la palabra \"" + palabra + "\".");

        Metodos3 m = new Metodos3();
        m.Cadenas("hola", 'o');
    }

    public Cadenas(String palabra, char letra) {
        int contador = CalcontadorDeLetras(palabra, letra);
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la palabra \"" + palabra + "\".");
    }
}

