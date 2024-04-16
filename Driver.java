import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // created a new arrayList for monkeys
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    // Instance variables (if needed)
    static int userChoice = 0;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner monkeyScanner = new Scanner(System.in);
        Scanner reserveScanner = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.

        displayMenu();
        while (scnr.hasNext()) {
            if (scnr.hasNextInt()) {
                // integer choice
                userChoice = scnr.nextInt();

                // switch statement for user choice
                switch (userChoice) {
                    case 1:
                        intakeNewDog(scanner);
                        break;
                    case 2:
                        intakeNewMonkey(monkeyScanner);
                        break;
                    case 3:
                        reserveAnimal(reserveScanner);
                        break;
                    case 4:
                        System.out.println("print list of dog");
                        break;
                    case 5:
                        System.out.println("print list of monkey");
                        break;
                    case 6:
                        System.out.println("print list of all non reserved animals");
                        break;
                    default:
                        System.out.println("Invalid entry");
                        displayMenu();
                        break;
                }

            } else {
                String userChoice = scnr.nextLine();
                if (Objects.equals(userChoice, "q")) {
                    System.out.println("exit");
                } else {
                    System.out.println("You have entered an invalid option. Choose again");
                    displayMenu();

                }
            }
        }

        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
        // method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
                false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
                "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
                "Canada");
        Dog dog4 = new Dog("Carl", "Dashound", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false,
                "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }

    // Adds monkeys to a list for testing
    // Optional for testing
    public static void initializeMonkeyList() {
        // test monkeys
        Monkey monkey1 = new Monkey("Alan", "Male", "12", "14", "05-12-2019", "United States", "intake", false,
                "United States", "Tamarin", 10, 22, 35);

        // add test monkeys to the monkeyList
        monkeyList.add(monkey1);

    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                displayMenu();
                return; // returns to menu
            }
        }
        // Gather dog information from user
        System.out.println("Enter the dog breed");
        String breed = scanner.nextLine();
        System.out.println("Enter the dog gender");
        String gender = scanner.nextLine();
        System.out.println("Enter the dog age");
        String age = scanner.nextLine();
        System.out.println("Enter the dog weight");
        String weight = scanner.nextLine();
        System.out.println("Enter the dog acquisitionDate");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter the dog acquisitionCountry");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter the dog trainingStatus");
        String trainingStatus = scanner.nextLine();

        // getting the boolean value
        System.out.println("Is the dog reserved? Enter true or false.");
        String userInput = scanner.nextLine();

        Boolean reserved = false;
        if (userInput.equalsIgnoreCase("true")) {
            reserved = true;
        } else {
            reserved = false;
        }

        System.out.println("Enter the dog inServiceCountry");
        String inServiceCountry = scanner.nextLine();

        // Add the code to instantiate a new dog and add it to the appropriate list
        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved, inServiceCountry);

        // add the new dog to the dogList
        dogList.add(dog);
        System.out.println("The dog has been added to the system.");
        scanner.close();
    }

    // Complete intakeNewMonkey
    // Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner monkeyScanner) {
        System.out.println("What is the monkey's name?");
        String name = monkeyScanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                displayMenu();
                return; // returns to menu
            }
        }
        // Gather the rest of the information from the user
        System.out.println("Enter the monkey gender");
        String gender = monkeyScanner.nextLine();
        System.out.println("Enter the monkey age");
        String age = monkeyScanner.nextLine();
        System.out.println("Enter the monkey weight");
        String weight = monkeyScanner.nextLine();
        System.out.println("Enter the monkey acquisitionDate");
        String acquisitionDate = monkeyScanner.nextLine();
        System.out.println("Enter the monkey acquisitionCountry");
        String acquisitionCountry = monkeyScanner.nextLine();
        System.out.println("Enter the monkey trainingStatus");
        String trainingStatus = monkeyScanner.nextLine();

        // Get the boolean value
        System.out.println("Is the monkey reserved? Enter true or false.");
        String userInput = monkeyScanner.nextLine();

        Boolean reserved = false;
        if (userInput.equalsIgnoreCase("true")) {
            reserved = true;
        } else {
            reserved = false;
        }
        System.out.println("Enter the monkey inServiceCountry");
        String inServiceCountry = monkeyScanner.nextLine();

        // validate the species
        // these are the only approved species of monkey
        String[] monkeySpecies = { "guenon", "macaque", "marmoset", "capuchin", "squirrel monkey", "tamarin" };
        List<String> mokeySpeciesList = Arrays.asList(monkeySpecies);
        System.out.println("Enter the monkey species");
        String species = monkeyScanner.nextLine();
        if (mokeySpeciesList.contains(species.toLowerCase())) {
            System.out.println("This species is approved!!");
        } else {
            System.out.println("This species is not approved!");
            displayMenu();
            return; // return to menu
        }

        System.out.println("Enter monkey tail length");
        int tailLength = monkeyScanner.nextInt();
        System.out.println("Enter monkey height");
        int height = monkeyScanner.nextInt();
        System.out.println("Enter monkey body length");
        int bodyLength = monkeyScanner.nextInt();

        // Add the code to instantiate a new monkey and add it to the appropriate list
        Monkey monkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved,
                inServiceCountry, species, tailLength, height, bodyLength);

        // add the new monkey to the monkeyList
        monkeyList.add(monkey);
        System.out.println("The money has been added to the system.");
        monkeyScanner.close();

    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner reserveScanner) {
        System.out.println("Please enter animal type.");
        String animalType = reserveScanner.nextLine();
        System.out.println("Please enter the country you wouldl ike to reserve the animal for.");
        String inServiceCountry = reserveScanner.nextLine();

        //if the user input is dog
        if (animalType.toLowerCase().equals("dog")) {

            // this check assumes that you can't set reserved to true if it is already true
            // or you can't reserve an aminal that is already reserved
            List<Dog> dogResultList = dogList.stream()
                    .filter(dog -> dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry)
                            && !dog.getReserved())
                    .collect(Collectors.toList());
               
            // checks if the filter returned an results        
            if (dogResultList.isEmpty()) {
                System.out.println("There is not an availble dog in this country.");
                displayMenu();
                return; // returns to the main menu
            } else {
                // this sets the 1st item in the list that statisfys input criteria to reserved
                dogResultList.get(0).setReserved(true);
                System.out.println("You have reserved the dog " + dogResultList.get(0).getName());
            }

            //if they user input is monkey
        } else if (animalType.toLowerCase().equals("monkey")) {
            System.out.println("you have picked monkey");

            // this check assumes that you can't set reserved to true if it is already true
            // or you can't reserve an aminal that is already reserved
            List<Monkey> monkeyResultList = monkeyList.stream()
                    .filter(monkey -> monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry)
                            && !monkey.getReserved())
                    .collect(Collectors.toList());

            // checks if the stream/ filter returned a result
            if (monkeyResultList.isEmpty()) {
                System.out.println("There is not an availble monkey in this country.");
                displayMenu();
                return; // returns to the main menu

            } else {

                // if a result was returned this sets the 1st item to reserved
                monkeyResultList.get(0).setReserved(true);
                System.out.println("You have reserved the monkey " + monkeyResultList.get(0).getName());
            }

        } else {
            //if user types in anoything other than dog or monkey
            System.out.println("We only accpet types dog and monkey currently");
            displayMenu();
            return; // returns user to the main menu
        }

    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is
    // reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be
    // implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals() {
        System.out.println("The method printAnimals needs to be implemented");

    }
}
