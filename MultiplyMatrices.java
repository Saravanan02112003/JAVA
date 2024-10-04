package first;

public class MultiplyMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1=2,c1=3;
		int r2=3,c2=2;
		//r1=c2
		//r2=c1;
		int[][] firstMatrix= {{3,-2,4},{3,2,4}};
		int[][] secondMatrix= {{2,3},{4,5},{1,2}};
		//multiplying two matrices
		int[][] product=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
					product[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
				}
			}
		}
		System.out.println("multiplaction of 2 matrices is");
		for(int[] row:product)
		{
			for(int column:row)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}

}
