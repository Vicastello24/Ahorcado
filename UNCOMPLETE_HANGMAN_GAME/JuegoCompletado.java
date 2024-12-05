public class JuegoCompletado {
    public static boolean juegoCompletado(String palabra, String adivinadas) {
        for (char letra : palabra.toCharArray()) {
            if (adivinadas.indexOf(letra) == -1) {
                return false;
            }
        }
        return true;
    }
}
