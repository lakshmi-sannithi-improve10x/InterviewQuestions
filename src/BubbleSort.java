public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        for (int k = 0; k < a.length; k++){
            for (int i = 0; i < a.length -i -1; i++){
                if (a[i] > a[i + 1]){
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
    }
}
