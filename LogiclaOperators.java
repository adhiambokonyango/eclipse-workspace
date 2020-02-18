package logiclaOperators;

public class LogiclaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//logical AND
		System.out.printf("%s%n"
				+ "%s: %b%n"
				+ "%s: %b%n"
				+ "%s: %b%n"
				+ "%s: %b%n%n",
				"Conditional AND (&&)",
				"false && false",	(false && false),
				"false && true",(false && true) ,
				"true && false",(true && false),
				"true && true",(true && true));
			//end Logical AND
		
		//logical OR
		System.out.printf("%s%n"
				+ "%s: %b%n"
				+ "%s: %b%n"
				+ "%s: %b%n"
				+ "%s: %b%n%n",
				"Conditional OR (||)",
				"false && false",	(false ||false),
				"false && true",(false || true) ,
				"true && false",(true || false),
				"true && true",(true || true));
			//end Logical OR
		
		//boolean logical AND
		System.out.printf("%s%n"
				+ "%s: %b%n"
				+ "%s: %b%n"
				+ "%s: %b%n"
				+ "%s: %b%n%n",
				"Boolean logical  AND (&)",
				"false && false",	(false & false),
				"false && true",(false & true) ,
				"true && false",(true & false),
				"true && true",(true & true));
			//end boolean Logical AND
		
		//boolean logical inclusiveOR
				System.out.printf("%s%n"
						+ "%s: %b%n"
						+ "%s: %b%n"
						+ "%s: %b%n"
						+ "%s: %b%n%n",
						"Boolean logical inclusive OR (|)",
						"false && false",	(false | false),
						"false && true",(false | true) ,
						"true && false",(true | false),
						"true && true",(true | true));
					//end boolean Logical inclusiveOR
				
				//boolean logical exclusiveOR
				System.out.printf("%s%n"
						+ "%s: %b%n"
						+ "%s: %b%n"
						+ "%s: %b%n"
						+ "%s: %b%n%n",
						"Boolean logical exclusive OR (^)",
						"false && false",	(false ^ false),
						"false && true",(false ^ true) ,
						"true && false",(true ^ false),
						"true && true",(true ^ true));
					//end boolean Logical exclusiveOR
				
				// create truth table for ! (logical negation) operator
				 System.out.printf("%s%n"
				 		+ "%s: %b%n"
				 		+ "%s: %b%n",
				 		"Logical NOT (!)",
				"!false",(!false) , 
				"!true", (!true));
				//end logical not
	}//end main

}//end class
