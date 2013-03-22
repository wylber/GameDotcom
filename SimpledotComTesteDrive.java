public class SimpledotComTesteDrive{
	public static voi main(String[] args){
	Simpledotcom dot = new Simpledotcom();
	
		int[] locations = {2,3,4};
		
		dot.setLocationCells(locations);
		String userGuess ="2";
		
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if (result.equals("hit") ){
			testResult = "passed";
			}
			System.out.println(testResult);
	}
} 	