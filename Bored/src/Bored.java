
public class Bored {
    public static void main(String[] args) {
        /**
         * El metodo convierte octal a decimal
         */
        StringBuilder chain = new StringBuilder();
        int cociente = 768, number;
        do {
            number = cociente % 8;
            chain.append(number);
            cociente = cociente / 8;
        } while (cociente != 0);
        StringBuilder sb = new StringBuilder(chain.toString());
        String inverted = sb.reverse().toString();
        System.out.println(inverted);
        /**
         * Calcular espacios en blanco
         */
        String le = "lkasdñfj sdalñk fjasdf ";
        int spaces = 0;
        for (int i = 0; i <le.length(); i++) {
            if (le.charAt(i)== 32)spaces++;
        }
        System.out.println(spaces);

        /**
         * Suprimir una palabra de una cadena
         */
        String word = "Lola la bandida";
        String delete = "bandida";
        String ultimString = "";
        if (word.contains(delete))ultimString = word.replaceAll(delete, "");
        System.out.println(ultimString);
    }
}