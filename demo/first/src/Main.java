import java.lang.Math;

public class Main {
    public static void main(String[] args) {

    BmiService BmiService = new BmiService (); 

    double bmiIndex = BmiService.bmiCalculate(165, 630);
    double bmiIndexRounded = Math.round(bmiIndex * 100) / 100;

       if (9.5 <= bmiIndexRounded && 18.5 > bmiIndexRounded) {
        System.out.println("Your BMI index is:" + bmiIndexRounded + ". This is considered as an underweight");
       } else if (18.5 <= bmiIndexRounded && 24.9 >= bmiIndexRounded) {
        System.out.println("Your BMI index is:" + bmiIndexRounded + ". This is considered as normal");
       } else if (25.0 <= bmiIndexRounded && 29.9>= bmiIndexRounded) {
        System.out.println("Your BMI index is:" + bmiIndexRounded + ". This is considered as an overweight");
       } else if (30 <= bmiIndexRounded && 34.9 >= bmiIndexRounded) {
        System.out.println("Your BMI index is:" + bmiIndexRounded + ". This is considered as an obesity");
       } else if (35.0 < bmiIndexRounded) {
        System.out.println("Your BMI index is:" + bmiIndexRounded + ". This is considered as an extreme obesity");
       } else {
        System.out.println("Error");
       }
    }
}