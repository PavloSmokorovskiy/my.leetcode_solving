package other;

public class PyramidPrinting {
    public static void main(String[] args) {
        int n = 3;

        StringBuilder line = new StringBuilder();
        for (int row = 1; row <= n; row++) {
            line.setLength(0);

            int spaces = n - row;
            int stars = 2 * row - 1;

            for (int s = 0; s < spaces; s++){
                line.append(' ');
            }
            for (int a = 0; a < stars; a++){
                line.append('*');
            }

            System.out.println(line.toString());
        }
    }
}
