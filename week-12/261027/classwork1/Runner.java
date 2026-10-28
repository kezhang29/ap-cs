public class Runner {
    public static void main(String[] args) {
        int total = 0;
        // The inner loop only runs one time, outer loop runs twice so total is incremented by 2 twice
		for(int r=0; r<2; r++) {
		   for(int c=1; c<2; c++)  {
		      total+=2; 
             }
		}
		System.out.println(total);
    }    
}
