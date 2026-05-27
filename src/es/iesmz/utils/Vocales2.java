package es.iesmz.utils;

public class Vocales2 {
    public static String sinVocales(String cadena) {
        StringBuilder cadenaSinVocales = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            String letra = String.valueOf(cadena.charAt(i));

            if (!"AEIOUaeiou".contains(letra)) cadenaSinVocales.append(letra);
        }

        return cadenaSinVocales.toString();
    }
}
