package first;

public class MatrixSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating 2 matrices
				int a[][]= {{12,26,30},{27,34,50},{30,41,55}};
				int b[][]= {{2,3,4},{1,30,4},{2,35,6}};
				int i,j;
				//creating another matrix to store the sub of a[]&b[]
				
				int c[][]=new int[3][3];
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						c[i][j]=a[i][j]-b[i][j];
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}

	}

}
