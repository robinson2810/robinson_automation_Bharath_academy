package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PrintStatements{
/********** Advantages Of Print Statements
 * @throws FileNotFoundException ******************/
	//Debugging and Error Detection
	//Monitoring Program Execution
	//Testing and Validation
	//Education and Learning
	//Logging System
	public static void main(String[] args) throws FileNotFoundException {
		
		//Print The Content And Then Go To Next Line
		System.out.println("Hello,World!");
		
		//Print The Content And Then Stay On Same Line
		System.out.print("Hello,");
		System.out.print("Hello, World!");
		System.out.println();
		
		//Print the formatted content  and them stay on same line
		System.out.printf("%s is completed BE,EmpID is %d and visa status is %b","Robin",12345,true);
		System.out.println();
		
		//Format the digits and then Print the formated content and then stay on same line
		System.out.format("Total Bill is %.2f %n", 100.9875453);
		System.out.println();
		
		//Join Multiple Print Statements Together"
		System.out.append("My Name Is Robinson").append(",My Emp id is 1234").append(" edwinson");
		System.out.println();
		
		//Print the Char based on ASCII value
		System.out.write(65);
		System.out.println();
		
		//Print Logs of Program
		//Logger log = Logger.getLogger("MyLogger"); try first this
		java.util.logging.Logger log = java.util.logging.Logger.getLogger("MyLogger");
		log.info("Current line is 44");
		log.warning("There is some warning at line 45, Pease check");
		
		//Print the errors in print statements
		System.err.println("Error : Expected result is not matching with actual result");
		
		
		//Print the given txt in txt file seperately
		PrintWriter writer = new PrintWriter("C:\\Automation Training\\AutomationProject\\Logs.txt");
		writer.println(LocalDateTime.now() + "  Currently Line 53 is  Running");
		writer.println(LocalDate.now() + " Currently Line 54 is  Running");
		writer.println("Execution is Completed");
		writer.close();
	}

}
