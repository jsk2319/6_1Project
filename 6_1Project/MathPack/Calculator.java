
public class Calculator {
    public static double getAverage(double one, double two){
        return(one+two)/2.0;
    }
    public static double getAverage(double one, double two, double three){
        return(one+two+three)/3.0;
    }
    public static double getAverage(double[] num){
        double sum=0.0;
        for(int i=0; i<num.length; i++){
            sum+=num[i];
        }return(sum/num.length);
    }
    public static double getSum(double one, double two){
        return(one + two);
    }
    public static double getSum(double one, double two, double three){
        return(one + two + three);
    }
    public static double getSum(double[] num){
        double sum=0.0;
        for(int i=0; i<num.length; i++){
            sum+=num[i];
        }
        return (sum);

    }
    public static double getProduct(double one, double two){
        return(one * two);
    }
    public static double getProduct(double one, double two, double three){
        return(one * two * three);
    }
    public static double getProduct(double[] num){
        double product =1.0;
        for(int i=0; i<num.length; i++){
            product*=num[i];
        }
        return(product);
    }
}