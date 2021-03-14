package lesson5adstract;

public class Dog extends Pet {

	@Override
	public String toString() {
		return "Dog []";
	}

	@Override
	void voice() {
		System.out.println("€ собака € кажу √ав-гав");
		
	}

	
}
