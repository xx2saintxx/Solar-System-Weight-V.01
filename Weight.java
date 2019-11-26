import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {
        double mercury = 3.7;
        double venus = 8.87;
        double earth = 9.81;
        double mars = 3.711;
        double jupiter = 24.79;
        double saturn = 10.44;
        double uranus = 8.87;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your weight to see what you weigh on the 8 planets of the Milky Way!");
        double weight = myObj.nextDouble();
        
            System.out.println("On Mercury you weigh:  " + mercury * weight
                    + '\n' + "On Venus you weigh: " + venus * weight
                    + '\n' + "On Earth you weigh: " + weight
                    + '\n' + "On Mars you weigh: " + mars * weight
                    + '\n' + "On Jupiter you weigh: " + jupiter * weight
                    + '\n' + "On saturn you weigh: " + saturn * weight
                    + '\n' + "On Uranus you weigh: " + uranus * weight);
    }
}