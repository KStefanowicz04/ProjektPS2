

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double[] tablica = new double[10000000];
        for(int i=0; i<10000000; i++) {
            tablica[i] = Math.random();
            System.out.println("Wartosc na indeksie " + i + ": " + tablica[i]);
        }

    }
}
