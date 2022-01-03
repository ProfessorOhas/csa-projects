package fracCalc;

public class FracCalc {

    public static void main(String[] args) 
    {

    // TODO: Read the input from the user and call produceAnswer with an equation
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswerOne(String input)
    {
    	String FirstFraction = input.substring(0, input.indexOf(" ")-1);
    	String Operand = input.substring(input.indexOf(" ")+1, input.indexOf(" ")+2);
    	String SecondFraction = input.substring(input.indexOf(" ")+3);
        return SecondFraction;
    }
    
    public static String produceAnswerTwo(String input)
    { 
    	String FirstFraction = input.substring(0, input.indexOf(" "));
    	String FirstFractionWhole = "0";
    	String FirstFractionNumerator = "0";
		String FirstFractionDenominator = "1";
    	if (FirstFraction.contains("_")) {
    		FirstFractionWhole = FirstFraction.substring(0, FirstFraction.indexOf("_"));
		}
		if (FirstFraction.contains("/")) {
			FirstFractionNumerator = FirstFraction.substring(FirstFraction.indexOf("_")+1, FirstFraction.indexOf("/"));
			FirstFractionDenominator = FirstFraction.substring(FirstFraction.indexOf("/")+1);

		} else {
			FirstFractionWhole = FirstFraction.substring(0);
		}
    	String Operand = input.substring(input.indexOf(" ")+1, input.indexOf(" ")+2);
    	String SecondFraction = input.substring(input.indexOf(" ")+3, input.length());
    	String SecondFractionWhole = "0";
    	String SecondFractionNumerator = "0";
		String SecondFractionDenominator = "1";
    	if (SecondFraction.contains("_")) {
    		SecondFractionWhole = SecondFraction.substring(0, SecondFraction.indexOf("_"));
		}
		if (SecondFraction.contains("/")) {
			SecondFractionNumerator = SecondFraction.substring(SecondFraction.indexOf("_")+1, SecondFraction.indexOf("/"));
			SecondFractionDenominator = SecondFraction.substring(SecondFraction.indexOf("/")+1);

		} else {
			SecondFractionWhole = SecondFraction.substring(0);
		}
        return "whole:" + SecondFractionWhole + " numerator:" + SecondFractionNumerator + " denominator:" + SecondFractionDenominator;
    }
    
    public static String produceAnswer(String input)
    { 
    	String FirstFraction = input.substring(0, input.indexOf(" "));
    	String FirstFractionWhole = "0";
    	String FirstFractionNumerator = "0";
		String FirstFractionDenominator = "1";
    	if (FirstFraction.contains("_")) {
    		FirstFractionWhole = FirstFraction.substring(0, FirstFraction.indexOf("_"));
		}
		if (FirstFraction.contains("/")) {
			FirstFractionNumerator = FirstFraction.substring(FirstFraction.indexOf("_")+1, FirstFraction.indexOf("/"));
			FirstFractionDenominator = FirstFraction.substring(FirstFraction.indexOf("/")+1);

		} else {
			FirstFractionWhole = FirstFraction.substring(0);
		}
    	String Operand = input.substring(input.indexOf(" ")+1, input.indexOf(" ")+2);
    	String SecondFraction = input.substring(input.indexOf(" ")+3, input.length());
    	String SecondFractionWhole = "0";
    	String SecondFractionNumerator = "0";
		String SecondFractionDenominator = "1";
    	if (SecondFraction.contains("_")) {
    		SecondFractionWhole = SecondFraction.substring(0, SecondFraction.indexOf("_"));
		}
		if (SecondFraction.contains("/")) {
			SecondFractionNumerator = SecondFraction.substring(SecondFraction.indexOf("_")+1, SecondFraction.indexOf("/"));
			SecondFractionDenominator = SecondFraction.substring(SecondFraction.indexOf("/")+1);

		} else {
			SecondFractionWhole = SecondFraction.substring(0);
		}

		if (FirstFractionDenominator == "1" && SecondFractionDenominator == "1") {
			if (Operand.contains("+")) {
				int tempFirstWholeNumber = Integer.parseInt(FirstFractionWhole);
				int tempSecondWholeNumber = Integer.parseInt(SecondFractionWhole);
				int End = tempFirstWholeNumber + tempSecondWholeNumber;
				return "" + End;
			}
			else if (Operand.contains("-")) {
				int tempFirstWholeNumber = Integer.parseInt(FirstFractionWhole);
				int tempSecondWholeNumber = Integer.parseInt(SecondFractionWhole);
				int End = tempFirstWholeNumber - tempSecondWholeNumber;
				return "" + End;
			}
			else if (Operand.contains("*")) {
				int tempFirstWholeNumber = Integer.parseInt(FirstFractionWhole);
				int tempSecondWholeNumber = Integer.parseInt(SecondFractionWhole);
				if (tempFirstWholeNumber < 0 && tempSecondWholeNumber < 0) {
					tempFirstWholeNumber *= -1;
					tempSecondWholeNumber *= -1;
				}
				int End = tempFirstWholeNumber * tempSecondWholeNumber;
				return "" + End;
			}
			else if (Operand.contains("/")) {
				int tempFirstWholeNumber = Integer.parseInt(FirstFractionWhole);

				int tempSecondWholeNumber = Integer.parseInt(SecondFractionWhole);
				if (tempFirstWholeNumber < 0 && tempSecondWholeNumber < 0) {
					tempFirstWholeNumber *= -1;
					tempSecondWholeNumber *= -1;
				}
				if (tempSecondWholeNumber == -1) {
					tempFirstWholeNumber *= -1;
					String End = "" + tempFirstWholeNumber;
					return End;
				} else if (tempSecondWholeNumber == 1) {
					String End = "" + tempFirstWholeNumber;
					return End;
				}
				if (tempFirstWholeNumber == 0 || tempFirstWholeNumber == -0) {
					String End = "0";
					return End;
				}
				String End = reduce(tempFirstWholeNumber, tempSecondWholeNumber);
				return End;
			}
			return "";
		}
    	else {
    		int tempFirstWholeNumber = Integer.parseInt(FirstFractionWhole);
			int tempFirstWholeNumberSign = 1;
			if (tempFirstWholeNumber < 0) {
				tempFirstWholeNumberSign = -1;
				tempFirstWholeNumber *= -1;
			}
			int FirstFractionDen = Integer.parseInt(FirstFractionDenominator);
			int FirstFractionNum = tempFirstWholeNumberSign*(Integer.parseInt(FirstFractionNumerator) + (tempFirstWholeNumber * FirstFractionDen));
			int tempSecondWholeNumber = Integer.parseInt(SecondFractionWhole);
			int tempSecondWholeNumberSign = 1;
			if (tempSecondWholeNumber < 0) {
				tempSecondWholeNumberSign = -1;
				tempSecondWholeNumber *= -1;
			}
			int SecondFractionDen = Integer.parseInt(SecondFractionDenominator);
			int SecondFractionNum = tempSecondWholeNumberSign*(Integer.parseInt(SecondFractionNumerator) + (tempSecondWholeNumber * SecondFractionDen));
			
			if (Operand.contains("+")) {
				String End = addition(FirstFractionNum, FirstFractionDen, SecondFractionNum, SecondFractionDen);
				return End;
			}
			else if (Operand.contains("-")) {
				SecondFractionNum *= -1;
				String End = addition(FirstFractionNum, FirstFractionDen, SecondFractionNum, SecondFractionDen);
				return End;
			}
			else if (Operand.contains("*")) {
				String End = multiplication(FirstFractionNum, FirstFractionDen, SecondFractionNum, SecondFractionDen);
				return End;
			}
			else if (Operand.contains("/")) {
				String End = division(FirstFractionNum, FirstFractionDen, SecondFractionNum, SecondFractionDen);
				return End;
			}
			return "";
    	}
    }
    
    public static String addition(int FirstFractionNum, int FirstFractionDen, int SecondFractionNum, int SecondFractionDen) {
    	
		/*int CommonDenominator = CommonDen(FirstFractionDen, SecondFractionDen);
		System.out.println(FirstFractionDen + ", " + SecondFractionDen + ": " + CommonDenominator);
    	int Num = (FirstFractionNum * CommonDenominator) + (SecondFractionNum * CommonDenominator);
    	int Den = (CommonDenominator);
    	
    	String End = reduce(Num, Den);
    	return End;
    	*/
    	if (FirstFractionNum == 0) {
    		String End = reduce(SecondFractionNum, SecondFractionDen);
    		return End;
    	} else if (SecondFractionNum == 0) {
    		String End = reduce(FirstFractionNum, FirstFractionDen);
    		return End;
    	}
    	int LCD = ((FirstFractionDen * SecondFractionDen)/GCD(FirstFractionDen, SecondFractionDen));
    	System.out.println(LCD);
    	FirstFractionNum *= (LCD/FirstFractionDen);
    	System.out.println(FirstFractionNum);

    	SecondFractionNum *= (LCD/SecondFractionDen);
    	System.out.println(SecondFractionNum);

    	int Num = FirstFractionNum + SecondFractionNum;
    	if (Num == 0) {
    		String End = "0";
    		return End;
    	}
    	System.out.println(Num);
    	String End = reduce(Num, LCD);
    	System.out.println(End);
    	return End;
    	
    }
    

	public static String multiplication(int FirstFractionNum, int FirstFractionDen, int SecondFractionNum, int SecondFractionDen) {
		
		int Num = (FirstFractionNum * SecondFractionNum);
    	int Den = (FirstFractionDen * SecondFractionDen);
    	if (Num == 0) {
    		String End = "0";
    		return End;
    	}
    	String End = reduce(Num, Den);
    	return End;
	}
	
	public static String division(int FirstFractionNum, int FirstFractionDen, int SecondFractionNum, int SecondFractionDen) {
		
		if (SecondFractionNum < 0) {
			SecondFractionDen *= -1;
			SecondFractionNum *= -1;
		}
		int Num = (FirstFractionNum * SecondFractionDen);
    	int Den = (FirstFractionDen * SecondFractionNum);
    	if (Num < 0 && Den < 0) {
    		Num *= -1;
    		Den *= -1;
    	}
    	if (Num == 0) {
    		String End = "0";
    		return End;
    	}
    	String End = reduce(Num, Den);
    	return End;
	}
	
	public static int GCD(int x, int y){
	   if (y==0) {return x;}
	   return GCD(y,x%y);
	}
	
	public static String reduce(int Num, int Den) {
		int Whole = Num/Den;
		int Numerator = Num%Den;
		if (Numerator < 0 && Whole != 0) {Numerator *= -1;}
		int Denominator = Den;
		if (Denominator == 1) {
			return "" + Whole;
		}
		Numerator /= GCD(Num, Den);
		Denominator /= GCD(Num, Den);
		if (Numerator < 0 && Denominator < 0) {
			Numerator *= -1;
			Denominator *= -1;
		}
		if (Whole == 0) {
			return "" + Numerator + "/" + Denominator;
		}
		if (Numerator == 0) {
			return "" + Whole;
		}
		return "" + Whole + "_" + Numerator + "/" + Denominator;
	}
	    

}
