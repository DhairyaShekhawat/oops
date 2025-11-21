package oops.elementary_sheet_no1;

public class question_1_iseven {
    public static void main(String[] args) {
        int number = 4; // You can change this value to test with other numbers
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
