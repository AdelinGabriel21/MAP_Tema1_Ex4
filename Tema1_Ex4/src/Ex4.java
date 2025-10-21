public class Ex4 {
    public int cheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];
        for (int cost : keyboards) {
            if (cost < min) {
                min = cost;
            }
        }
        return min;
    }

    public int mostExpensiveItem(int[] keyboards, int[] usb) {
        int max = keyboards[0];
        for (int cost : keyboards) {
            if (cost > max) {
                max = cost;
            }
        }
        for (int cost : usb) {
            if (cost > max) {
                max = cost;
            }
        }
        return max;
    }

    public int mostExpensiveUSB(int[] usb, int budget){
        int max = usb[0];
        for (int cost : usb) {
            if (cost <= budget && cost > max) {
                max = cost;
            }
        }
        return max;
    }
}
