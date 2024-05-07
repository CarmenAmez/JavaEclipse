package fundamentos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BucleWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Introduce los números que desees (si introduces -1 se finaliza la lista):");
        String put = br.readLine();
        int numero = Integer.parseInt(put);
        int counter = 0;
        
        while (numero != -1) {
            counter++;
            put = br.readLine();
            numero = Integer.parseInt(put);
        }
        
        System.out.println("Se introdujeron " + counter + " números.");
    }
        
        
//        String nombre = "";
//        boolean isCorrect = false;
//        
//        while (!isCorrect) {
//            System.out.println("Por favor, introduce tu nombre:");
//            nombre = br.readLine();
//            
//            if (nombre.isEmpty()) {
//                System.out.println("Error: No has introducido ningún nombre.");
//            } else {
//                String respuesta = "";
//                while (!respuesta.equals("si") && !respuesta.equals("no")) {
//                    System.out.println("¿Son estos los datos correctos? (Sí/No)");
//                    respuesta = br.readLine();
//                    
//                    if (!respuesta.equals("si") && !respuesta.equals("no")) {
//                        System.out.println("Por favor, responde 'Sí' o 'No'.");
//                    }
//                }
//                
//                if (respuesta.equals("si")) {
//                	isCorrect = true;
//                    System.out.println("Perfecto, puedes seguir con el examen.");
//                }
//            }
//        }
//        
//        br.close();
//    }

}
