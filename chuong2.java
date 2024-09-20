public class Chuong2 {
    public static void main(String[] args) {
        double height ;
        double weight ;
        double bmi ;

        height = 70;
        weight = 195;
         bmi = weight / (height * height ) * 703;

        System.out.println("Gia tri BMI: ");
        System.out.println(bmi);

        
        double height2 = 70;
        double weight2 = 195;
        double bmi2 = weight2 / (height2 * height2 ) * 703;



        System.out.println("Gia tri BMI 2: " );
        System.out.println(bmi2);
        System.out.println();

        System.out.println("Gia tri BMI 2: " + bmi2 );

    double tinhtoan = (5*7.0/2-2.5) / 5 *2 ;
    System.out.println("cau a "+ tinhtoan);
    double tinhtoan1 = (41% 7*3/5/5/2*2.5);
    System.out.println("caub"+ tinhtoan1);
    double tinhtoan2 = (8/5+13/2/3.0);
    System.out.println("cau c " + tinhtoan2 );
    double tinhtoan3 = (2.5+3.5) / 2 ;
    System.out.println("cau d "+ tinhtoan3);
    double tinhtoan4 = 9/4 * 2.0 - 5 / 4 ;
    System.out.println("cau e "+ tinhtoan4);
    double tinhtoan5 = 9/ 2.0 + 7 / 3 - 3.0 / 2;
    System.out.println("cau f "+ tinhtoan5);


    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height) * 703;
    }
}
