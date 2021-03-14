package lesson5adstract;

public  class Cow extends Pet {
	
	@Override
	public String toString() {
		return "Cow []";
	}

	@Override
	void voice() {
		System.out.println("Я корова я кажу Мууу-мууу");
		
	}

	
}
