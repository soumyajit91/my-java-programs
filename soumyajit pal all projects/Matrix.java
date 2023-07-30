
import java.util.*;
class matrix
{
	private double[][] mat;
	int row, column;

	//constructor
	matrix()
	{
		row=0;
		column=0;
	}

	//constructor
	matrix(int r, int c)
	{
		row = r;
		column = c;
		mat = new double[row][column];
	}

	//function to accept matrix values from user
	public void get_input()
	{
		Scanner s = new Scanner(System.in);
		int i=0,j=0;
		
		System.out.println("Enter the matrix elements(row-wise)");
		for (i=0; i < row; i++)
		{
			for(j=0; j<column; j++)
	        {
				mat[i][j] = s.nextDouble();
			}

		}
	}

	//function to print matrix 
	public void print_matrix()
	{
		int i = 0, j = 0;
		System.out.println("The matrix is:>>");
		for (i = 0; i < row; i++)
		{
			System.out.println("");
			for (j = 0; j < column; j++)
			{
				System.out.print("   "+mat[i][j]);
			}

		}
	}

	//function to add 2 matrices
	public matrix add(matrix m1)
	{
		matrix ans = new matrix(row,column);
		int i=0,j=0;
		if (this.row != m1.row || this.column != m1.column)
		{
			System.out.println("ERROR: The two matrices should have same no. of rows and columns for addition!");
		}
		else
		{
			for (i = 0; i < row; i++)
			{
				for (j = 0; j < column; j++)
				{
					ans.mat[i][j] = this.mat[i][j] + m1.mat[i][j];
				}
			}
		}
		return ans;
	}

	//function to subtract 2 matrices
	public matrix sub(matrix m1)
	{
		matrix ans = new matrix(row,column);
		int i=0,j=0;
		if (this.row != m1.row || this.column != m1.column)
		{
			System.out.println("ERROR: The two matrices should have same no. of rows and columns for subtraction!");
		}
		else
		{
			for (i = 0; i < row; i++)
			{
				for (j = 0; j < column; j++)
				{
					ans.mat[i][j] = this.mat[i][j] - m1.mat[i][j];
				}
			}
		}
		return ans;
	}
}


class mat_op
{

	private static matrix m1,m2,ans;
	public static void main(String args[])
	{
		int i = 0, j = 0,r=0,c=0;
		Scanner s = new Scanner(System.in);

		//get the no. of rows and columns of the matrix from the user
		System.out.println("Enter no. of rows:");
		r = s.nextInt();
		System.out.println("Enter no. of columns:");
		c = s.nextInt();

		//accept the first matrix
		System.out.println("Enter the first matrix:>>");
		m1 = new matrix(r,c);
		m1.get_input();

		//accept the second matrix
		System.out.println("Enter the second matrix:>>");
		m2 = new matrix(r,c);
		m2.get_input();

		//Add the 2 matrices and print the result
		ans = m1.add(m2);
		System.out.println("\nAddition of the two matrices is:>>");
		ans.print_matrix();

		//Suntract the 2 matrices and print the result
		ans = m1.sub(m2);
		System.out.println("\nSubtraction of the two matrices is:>>");
		ans.print_matrix();
	
	}
}
