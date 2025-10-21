public class Main {
    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();

        int[] keyboards = {40, 35, 70, 15, 45};

        int[] keyboards2 = {15, 20, 10, 35};
        int[] usb = {20, 15, 40, 15};

        int[] usb2 = {15, 45, 20};
        int budget = 30;

        int budget2 = 60;
        int[] keyboards3 = {40, 50, 60};
        int[] keyboards4 = {60};
        int[] keyboards5 = {40, 60};
        int[] usb3 = {8, 12};


        System.out.println("Cheapest Keyboard: " + ex4.cheapestKeyboard(keyboards));
        System.out.println("Most expensive item: " + ex4.mostExpensiveItem(keyboards2, usb));
        System.out.println("Most expensive USB Markus can buy: " + ex4.mostExpensiveUSB(usb2, budget));
        System.out.println("Most expensive Keyboard and USB Markus can buy: " + ex4.maxBudget(budget2, keyboards3, usb3));
        System.out.println("Most expensive Keyboard and USB Markus can buy: " + ex4.maxBudget(budget2, keyboards4, usb3));
        System.out.println("Most expensive Keyboard and USB Markus can buy: " + ex4.maxBudget(budget2, keyboards5, usb3));
    }
}