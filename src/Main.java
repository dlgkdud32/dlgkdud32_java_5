public class Main {
    public static void main(String[] args) {
        int age = 24;
        boolean hasID = true;

        if (age >= 20 && hasID) {
            System.out.println("접속가능.");
        }

        boolean isWeekend = false;
        boolean isHolyday = true;

        if (isWeekend || isHolyday) {
            System.out.println("쉴 수 있습니다.");
        }

        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("그냥 나가.");
        }
    }
}