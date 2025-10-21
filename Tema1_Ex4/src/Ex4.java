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
}
