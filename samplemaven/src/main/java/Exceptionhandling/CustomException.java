package Exceptionhandling;

public class CustomException {

	
		

			public static void main(String[] args) throws VotingException {
				int age=12;
				if(age>18)
				{
					System.out.println("eligible");
				}
				else
				{
					throw new VotingException("Age under 18"); 
				}
			}

		

	}


