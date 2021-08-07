import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự : ");
        String strings = scanner.nextLine();
        System.out.println("Nhập ký tự muốn kiểm tra : ");
        char character = scanner.next().charAt(0);
        System.out.printf("Số lần xuất hiện của %c trong chuỗi = %d", character, countCharacter(character, strings));
    }

    public static int stringLength(String strings) {
        int strLength = strings.length();
        return strLength;
    }

    public static int countCharacter(char character, String strings) {
        int count = 0;
        for (int i = 0; i < stringLength(strings); i++) {
            if (character == strings.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
