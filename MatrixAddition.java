package first;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating 2 matrices
		int a[][]= {{1,2,3},{2,34,5},{3,4,5}};
		int b[][]= {{2,3,4},{2,3,4},{2,35,6}};
		int i,j;
		//creating another matrix to store the sum of a[]&b[]
		
		int c[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
