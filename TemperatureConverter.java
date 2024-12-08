import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args){
        // Creates a Scanner object for reading user input
        Scanner input = new Scanner(System.in);

        // Options menu for user 
        System.out.println("Choose an option: \n 1. Celcius to Farenheit \n 2. Farenheit to Celcius");
        String option = input.nextLine();

        // Validates user's option and performs appropriate conversion
        if (option.equals("1")){
            // Converting Celcius to Farenheit
            float minTemp= 0; // minimum valid temperature in celcius
            float maxTemp= 100; // maximum valid temperature in celcius

           while (true){
                // Prompts user to enter temperature in degree celcius
                System.out.println("Enter the value you want to convert to Farenheit in degrees");
                float celciusTemperature = input.nextFloat();

                // Checks if input is within a valid range
                if (celciusTemperature >= minTemp && celciusTemperature <= maxTemp){
                    // Performs conversion with the formula
                    float farenheitTemperature = (celciusTemperature * (9.0f/5)) + 32;
                    System.out.printf("The temperature in Farenheit is %f", farenheitTemperature );
                    break;
                }
                else{
                    // Informs the user of invalid input
                    System.out.println("Invalid temperature input for degree celcius, enter a value within the range 0 and 100 inclusive.");
                }

            }
        }

        else if (option.equals("2")){
            // Converting Farenheit to Celcius
            float minTemp= -32; // minimum valid temperature in farenheit
            float maxTemp= 212; // maximum valid temperature in farenheit

            while (true){
                // Prompts user to enter temperature in degree farenheit
                System.out.println("Enter the value you want to convert to Celcius in degrees");
                float farenheitTemperature = input.nextFloat();

                // Checks if input is within a valid range
                if (farenheitTemperature >= minTemp && farenheitTemperature <= maxTemp){

                    // Performs conversion with the formula
                    float celciusTemperature = (farenheitTemperature - 32) * 5.0f/9 ;
                    System.out.printf("The temperature in Celcius is %f", celciusTemperature );
                    break;
                }
                else{
                    // Informs the user of invalid input
                    System.out.println("Invalid temperature input for degree farenheit, enter a value within the range -32 and 212 inclusive.");
                }
            }
        }

        else{
            // handles invalid option input
            System.out.println("Invalid option, enter 1 or 2.");
        }
        
        // Closes the scanner
        input.close();
    }
    
}
