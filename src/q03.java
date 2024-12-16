public class q03 {

    boolean allLess(int[] a, int[] b){
        boolean status = false;
        int i = 0;
        if (a.length != b.length){
            status= false;
        }
        else {
            for (int j = 0; j < a.length; j++) {
                if (b[j]-a[j]<0){
                    status = false;
                    break;
                }
                else {
                    status = true;
                }

            }
        }
        return status;

    }
}
