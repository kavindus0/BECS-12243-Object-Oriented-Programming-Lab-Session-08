public class q02 {
    public static void main(String[] args) {
        q02 Q02Objj = new q02();
        Integer[] a = {10, 20, 13, 40, 50};
        System.out.println(Q02Objj.minGap(a));
    }

    public  int minGap(Integer[] num) {
        if (num.length < 2) {
            return 0;
        }
        int minVVal = Integer.MAX_VALUE;
        for (int i = 0; i < num.length - 1; i++) {
            int gap = Math.abs(num[i + 1] - num[i]);
            if (gap < minVVal) {
                minVVal = gap;
            }
        }

        return minVVal;
    }
}
