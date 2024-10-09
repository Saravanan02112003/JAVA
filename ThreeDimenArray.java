package first;

public class ThreeDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating 3d with 2*3*4
		int[][][] cube=new int[2][3][4];
		//initializing values
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
					cube[i][j][k]=i+j+k;
				}
			}
		}
		//accesing&printing
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.print(cube[i][j][k]+"");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
