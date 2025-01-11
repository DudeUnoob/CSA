public class Average5 {

    public Average5() {

    }


    public double average5(double[] arr) {
        
        if (arr.length < 5) {
            double sum = 0;
            for (double num : arr) {
                sum += num;
            }
            return sum / arr.length;
        }
        
        int maxStart = arr.length - 5;
        int start = (int)(Math.random() * (maxStart + 1));
        
        double sum = 0;
        for (int i = start; i < start + 5; i++) {
            sum += arr[i];
        }
        return sum / 5;
    }

    public static void main(String[] args) {
        
    }
}