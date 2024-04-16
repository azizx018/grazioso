public class Monkey extends RescueAnimal {
	
	//instance variables
	private String species;
	private int tailLength;
	private int height;
	private int bodyLength;
	

	public Monkey(String name, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String species,
	int tailLength, int height, int bodyLength) {
		
		setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
	}

	


//makes the output more readable
	@Override
	public String toString() {
		return "Monkey  species: " + species + ", tailLength: " + tailLength + ", height: " + height + ", bodyLength: "
				+ bodyLength + ", Name: " + getName() + ", Animal Type: " + getAnimalType() + ", Gender: "
				+ getGender() + ", Age: " + getAge() + ", Weight: " + getWeight() + ", Acquisitio Date: "
				+ getAcquisitionDate() + ", Acquisition Location: " + getAcquisitionLocation() + ", Reserved: "
				+ getReserved() + ", In Service Location: " + getInServiceLocation() + ", Training Status: "
				+ getTrainingStatus() + " ";
	}





	//Mutator and Accessor Methods
	public int getTailLength() {
		return tailLength;
	}

	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	

}

