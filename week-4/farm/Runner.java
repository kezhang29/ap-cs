public class Runner{
	public static void main(String[] args){
		// Instantiate chicken, dog, cat objects
		Chicken chicken = new Chicken();
		Dog dog = new Dog();
		Cat cat = new Cat();
	
		// Call methods from dog, cat, and chicken
		chicken.speak();
		dog.speak();
		cat.speak();  

		dog.sayName();
		cat.sayName();
    
		dog.jump();
		cat.jump();
 	}
 	
}
