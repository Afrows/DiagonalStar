public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        String star = "*";

        int rowCount = 0;

        for (int i = 1; i <= number; i++) {
            rowCount++;
            for (int j = 1; j <= number; j++) {
                if(i == 1 || i == number) {
                    System.out.print(star);
                }
                else if (j == 1 || j == number) {
                    System.out.print(star);
                }
                else if (j == i) {
                    System.out.print(star);
                }
                else if (j == (number - i + 1)) {
                        System.out.print(star);
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println(" ");
            }
        }
    }