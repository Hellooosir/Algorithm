import java.util.Scanner;

public class ChatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;
        A = scanner.nextInt(); // A를 입력받음
        B = scanner.nextInt(); // B를 입력받음

        // A와 B의 조건 확인 (0 < A, B < 10)
        if (A > 0 && A < 10 && B > 0 && B < 10) {
            System.out.println(A + B); // 조건을 만족하면 A+B 출력
        } else {
            System.out.println("0 < A, B < 10의 조건을 만족해야 합니다.");
        }

        scanner.close();
    }
}