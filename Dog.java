
public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }


//causes the output to print in a better format
    @Override
    public String toString() {
        return "Dog  breed: " + breed + ", Name: " + getName() + ", Animal Type: " + getAnimalType()
                + ", Breed: " + getBreed() + ", Gender: " + getGender() + ", Age: " + getAge()
                + ", Weight: " + getWeight() + ", Acquisition Date: " + getAcquisitionDate()
                + ", Acquisition Location: " + getAcquisitionLocation() + ", Reserved: " + getReserved()
                + ", In Service Location: " + getInServiceLocation() + ", Training Status: "  + getTrainingStatus()
                + " ";
    }


    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
