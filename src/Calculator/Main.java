import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 계산기 ===");

        System.out.printf("첫번째 숫자를 입력해주세요.");
        double num1 = scanner.nextDouble();

        System.out.println("연산자를 입력해주세요(+, -, *, /)");
        char operator = scanner.next().charAt(0);

        System.out.println("두번쨰 숫자를 입력해주세요.");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+' :
            result = num1 + num2;
                System.out.println(result);
                break;

            case '-' :
                result = num1 - num2;
                System.out.println(result);
                break;

            case '*' :
                result = num1 * num2;
                System.out.println(result);
                break;

            case '/' :
                if (num2 == 0) {
                    System.out.println("나눌 수 없습니다.");
                } else {
                    result = (int) (num1/num2);
                    System.out.println (result);
                    System.out.println("나머지는 " + num1 % num2);
            }

                    break;
                    default:
                        System.out.println("사용할 수 없는 연산자 입니다.");


        }

        scanner.close();
    }
}