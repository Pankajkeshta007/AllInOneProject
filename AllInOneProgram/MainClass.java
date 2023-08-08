package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass {
	static UserData[] users=null;

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t\t\t----------------------------------------");
		System.out.println("\t\t\t\t\tM A I N   M E N U");
		System.out.println("\t\t\t\t----------------------------------------");
		while(true)
		{
			
		System.out.println("________________________________");
		System.out.println("1.TO REGISTER. \n2.TO LOGIN.");
		System.out.println("ENTER YOUR CHOICE :");
		System.out.println("_________________________________");
		String  Stringchoice = reader.readLine();
		
		
		int  choice = Integer.parseInt(Stringchoice);
		
		switch(choice) {
		case 1:
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("\t\t\t\t\tR E G I S T E R    M E N U ");
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("ENTER NUMBER OF USERS TO REGISTER ");
			String n1=reader.readLine();
			int n= Integer.parseInt(n1);
			users=new UserData[n];
			for(int i =0; i<n; i++)
			{
				System.out.println("ENTER USER EMAIL ID :");
				String emailid=reader.readLine();
				System.out.println("ENTER USER PASSWORD :");
				String passwd=reader.readLine();
				int password=Integer.parseInt(passwd);
				UserData userdata = new UserData(emailid, password);
				users[i]=userdata;
				
			}
			System.out.println("YOU HAVE SUCCESSFULLY REGISTERED !");
		
			
						break;
		case 2:
			if(users==null) {
				System.out.println("PLEASE REGISTER FIRST ");
				continue;
			}
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("\t\t\t\t\tL O G I N    M E N U ");
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("ENTER EMAIL ID :");
		    String email= reader.readLine();
		    System.out.println("ENTER PASSWORD :");
		    String pass=reader.readLine();
		    int passwd = Integer.parseInt(pass);
		    boolean result = false;
		   for( UserData userdata :users) {
			   if(userdata.getEmailId().equals(email) && userdata.getPassword() == passwd) {
				   result=true;
				   
			   
	
		    	
		    }
			   if(result) {
				    System.out.println("\t\tY O U  H A V E  L O G I N   S U C C E S S F U L L Y !");
				    System.out.println("\n\n\n\n\n\n\t\t\tENTER Y TO SHOW OPERATION WINDOW AND N FOR EXIT");
				    String y=reader.readLine();
				    if(y.equalsIgnoreCase("Y"))
				    {
				    	 OperationWindow.operationWindowChoices();
				    	
				    }
				    String no=reader.readLine();
				    if(no.equalsIgnoreCase("N"))
				    {
				    	break;
				    }
			   }
			
			   else
			   {
				   System.out.println("USER LOGIN FAILED");
			   }
		   }
             break;

			default :
				System.out.println("ENTER A VALID CHOICE ");
		}
		System.out.println("ENTER ANY KEY FOR CONTINUE AND N FOR EXIT");
		String n = reader.readLine();
		if(n.equalsIgnoreCase("N"))
		{
			break;
		}
		}
		System.out.println("\t\t\t\t____________________________");
		System.out.println("\t\t\t\t\tTHANKYOU");
		System.out.println("\t\t\t\t____________________________");
		

}
}