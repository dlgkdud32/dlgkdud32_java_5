public class Main {
    public static void main(String[] args) {
        boolean a = false;

        while (a) {
            System.out.println("무한 루프");
        }

        do {
            System.out.println("무한 루프");
        } while (a);
    }
}