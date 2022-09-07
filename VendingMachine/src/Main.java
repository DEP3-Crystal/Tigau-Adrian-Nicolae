import java.util.Scanner;

import java.util.Arrays;


public class Main {
    public static int[] money = {1, 5, 10, 25, 50, 100};
    public static int[] receivedchange = new int[6];

    public static int[] calculateChange(double sum, double price) {


        int change = (int) ((sum - price) * 100);
        for (int i = 5; i >= 0; i--) {
            receivedchange[i] = change / money[i];
            change = change % money[i];
        }
        return receivedchange;
    }

    public static void menu() {
        double[] priceList = new double[]{0.25, 0.55, 0.89, 1, 4};
        Scanner scanner1 = new Scanner(System.in);
        int selectedProduct;
        double price = 0;
        System.out.println("The available products are: 1.Gum: 0.25$ 2.Candy: 0.55$ 3.Chocolate: 0.89$ 4.Soda: 1$ 5.Beef Jerky: 4$ ");
        System.out.println("Please select a product:");
        selectedProduct = scanner1.nextInt();
        if (selectedProduct == 1) {
            price = priceList[0];
        }

        if (selectedProduct == 2) {
            price = priceList[1];
        }

        if (selectedProduct == 3) {
            price = priceList[2];
        }

        if (selectedProduct == 4) {
            price = priceList[3];
        }

        if (selectedProduct == 5) {
            price = priceList[4];
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your money: ");
        double sum = scanner.nextDouble();
        scanner.close();
        System.out.println("Your change is: " + Arrays.toString(calculateChange(sum, price)));
    }

    public static void main(String[] args) {
        menu();
    }

}