import java.text.DecimalFormat;
import java.util.Scanner;

public class Ny {

        public static void main(String[] args) {
            System.out.print("Beregn dit BMI med denne beregner!\nIndtast din højde i centimeter: ");
            Scanner scanner = new Scanner(System.in);
            double height = scanner.nextDouble()*0.01;
            System.out.print("Indtast din vægt i kg: ");
            double weight = scanner.nextDouble();
            double BMI = weight/Math.pow(height,2.0);
            String statusWeight;

            if (BMI > 18.5) {
                statusWeight = "Undervægtig";
            } else if (BMI < 25) {
                statusWeight = "Normalvægtig";
            } else if (BMI < 40) {
                statusWeight = "Overvægtig";
            } else {
                statusWeight = "Svært overvægtig";
            }

            DecimalFormat f = new DecimalFormat("##.00");
            String formattedBMI = f.format(BMI);
            System.out.println("Din BMI er: "+formattedBMI+". Dette svare til: "+statusWeight);

        }
    }
