package models;

public class Models {
    public void encrypt(String chain) {
        int[] baseChain = new int[chain.length()];
        int[] resultChain = new int[chain.length()];
        for (int i = 0; i < chain.length(); i++) {
            baseChain[i] = chain.charAt(i);
        }
        for (int i = 0; i < chain.length(); i++) {
            resultChain[i] = ~baseChain[i];
            System.out.println(chain.charAt(i) + " " + "[" + baseChain[i] + " " + resultChain[i] + "]");
        }
    }
}
