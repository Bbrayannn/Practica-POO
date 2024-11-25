package ejercisio8;

public class Math2 implements IExtremos {

    @Override
    public int min(int[] a) {
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }

        }
        return min;
    }

    @Override
    public int max(int[] a) {
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public double min(double[] a) {
        double min=a[0];
        for (double num:a){
            if (num>min){
                min=num;
                
            }
        }
        return min;
    }

    @Override
    public double max(double[] a) {
        double min=a[0];
        for(double num:a){
            if (num>min){
                min=num;
            }
        }
        return min;
    }

}
