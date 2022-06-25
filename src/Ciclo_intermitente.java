public class Ciclo_intermitente {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            int e;
            if (i % 2 == 0) {
                e = 3;
            } else {
                e = 1;
            }
            System.out.println("numero: " + e);
        }
    }
}
