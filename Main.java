public class Main {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 15800, 65000, 99000, 189000, 210000, 42000, 165800,258900};
        double sum = 0;
        for(double x: revenue){
            sum = sum + x;}
        int len = revenue.length;
        double average = sum / len;
        System.out.print(average);
    }
}