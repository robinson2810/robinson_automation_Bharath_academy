package language.basics;

public class ArraysConcepts {

	public static void main(String[] args) {
		
		// ✅ 1D Array: Simple list – great for names, roll numbers, etc.
		// ✅ 2D Array: Table format – good for project-wise grouping.
		// ✅ 3D Array: Cube format – perfect for company > project > employee data.

		/****Syntaxes to build Arrays****/

		// Syntax to initialize array : DataType [] Variable = new DataType [Length/size];
		// Syntax to store value in array : DataType [Index] = Value;
		// Syntax to retrieve value in array : DataType [Index];
		// Syntax to check total values in array : Variable.length;

		/****Challenges with Arrays****/

		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed

		String [] empnames = new String[3];
		empnames[0] = "Robinson";
		empnames[1] = "Janani";
		empnames[2] = "Zara";
		System.out.println(empnames.length);
		System.out.println(empnames[1]);

		//2D Array - Storing 3 set of employees name in two different project arrays
		String[][] projects = new String[2][3];
		//adding name in 1st project in 3rd box
		projects[0][2] = "edwinson";
		//adding name in 2nd project in 2nd box
		projects[1][1]="kumar";

		//3D Array - 3 companies 2 projects 4 employees
		//1st company has 2 project in that 1st project 4 employees working
		//1st company has 2 project in that 2nd project 4 employees working
		//like that remaining companies working
		String [][][] companies=new String[3][2][4];
		//1st company 2nd project 4th employee
		companies[0][1][3]="mary";
		//3rd company 1st project 2nd employee
		companies[2][0][1] = "sheela";
		
		
		//4d array - 4 company each has 3 projects each has 2 teams each has 3emp
		String [][][][] company =new String[4][3][2][3];
		// In 4th company 3rd project 2nd team 3rd emp name is joe
		company[3][2][1][2] = "Joe";
	


	}

}
