public class No_12_intToRoman {
    public String intToRoman(int num) {
        int[] unusualDict = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] mapper = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < unusualDict.length; i++) {
            String Roman = mapper[i];
            int div = unusualDict[i];
            while (num >= div) {
                num = num - div;
                res.append(Roman);
            }
            if (num == 0) {
                break;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        No_12_intToRoman trans = new No_12_intToRoman();
        Integer s = new Integer(3);
        System.out.println(trans.intToRoman(1994));
    }
}
