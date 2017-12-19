// ILIAS PAPOUNIDIS AOC 2017

class day1 {
	public static void main(String[] args) {

			int part = Integer.parseInt(args[0]);
			String input = args[1];
			String bigInput = input + input;
			int result = 0;

			if (part == 1) { // THIS IS THE CODE TO SOLVE PART 1

				if (input.charAt(input.length()-1) == input.charAt(0)){
					result += Character.getNumericValue(input.charAt(0));
				}

				for(int i=0; i < input.length()-1; i++){
					if(input.charAt(i) == input.charAt(i+1)) {
						result += Character.getNumericValue(input.charAt(i));
					}
				}
			} else if (part == 2) { // THIS IS THE CODE TO SOLVE PART 2

				for(int i=0; i<input.length(); i++) {
						if(bigInput.charAt(i) == bigInput.charAt(i+input.length()/2)) {
								result += Character.getNumericValue(input.charAt(i));
						}
				}
			}

	    System.out.println("Final result : " + result);
	}
}
