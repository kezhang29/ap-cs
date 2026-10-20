// Replace each question with a comment that describes what the code is doing.
public class ForLoop{
	public void test1(){
		//1) Describe what is happening below
		System.out.println("\n\nTest1");
        // Prints the numbers from 0-9, starts at 0 and increments by ones until it hits the <10 condition, greatets
        // numnber is nine
		for(int i=0; i < 10; i++){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test2(){
		//2) Describe what is happening below
		System.out.println("\n\nTest2");
        // Prints the numbers from 15-3. Starts at 15 and decrements by ones until it violates the >2 condition, 
        // so it prints 3 as the final number
		for(int i=15; i > 2; i--){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test3(int max){
		//3) Describe what is happening below
		System.out.println("\n\nTest3");
        // Starts at 0 and increments by five until it violates the <= max condition, which is passed in when calling this method
		for(int i=0; i <= max; i+=5){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test4(int min, int max){
		//4) Describe what is happening below
		System.out.println("\n\nTest4");
        // Starts at max, which is passed in when calling the method and decrements by twos until the condition >min is violated
		for(int i=max; i > min; i-=2){
			System.out.print(i + " ");
		}
	System.out.println();
	}
	
	//5) When does it make sense to use a for loop instead of a while loop?


}
 