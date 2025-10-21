public class Main {
    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();

        int[] keyboards = {40, 35, 70, 15, 45};
        int[] keyboards2 = {15, 20, 10, 35};
        int[] usb = {20, 15, 40, 15};
        int[] usb2 = {15, 45, 20};
        int budget = 30;

        System.out.println("Cheapest Keyboard: " + ex4.cheapestKeyboard(keyboards));
        System.out.println("Most expensive item: " + ex4.mostExpensiveItem(keyboards2, usb));
        System.out.println("Most expensive USB Markus can buy: " + ex4.mostExpensiveUSB(usb2, budget));
    }
}