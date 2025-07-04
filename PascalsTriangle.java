public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Next value
            }
            System.out.println();
        }
    }
}
