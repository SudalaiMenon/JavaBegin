package JavaTest;


public class FindApplianceCostDiscount {
    int findApplianceCost(int a, int b, int c) {
        int light = 0;
        int fan = 0;
        int ac = 0;
        for (int z = 0; z < a; z++) {
            ac = ac + 25000;
        }
        for (int y = 0; y < b; y++) {
            fan = fan + 1500;
        }
        for (int x = 0; x < c; x++) {
            light = light + 250;
        }
        int sum = light + fan + ac;
        return sum;
    }

    public static void main(String[] args) {
        FindApplianceCostDiscount costDiscount = new FindApplianceCostDiscount();
        int total = costDiscount.findApplianceCost(1, 2, 5);
        float discount = (total * 95) / 100;
        System.out.println(" Total :" + total);
        System.out.println(" Discount :" + discount);
    }
}
