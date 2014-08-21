public class InsertionSort
{
	public static void main(String[] args) {
		
		int[] data = {13,25,7,18,9};

		for (int i=0; i<data.length; i++)
		{	
			int temp=0;
			for (int j=i+1; j>0; j--)
			{
				
				if (data[j]<data[j-1])
				{
					temp=data[j];
					data[j]=data[j-1];
					data[j-1]=temp;
				}
			}

			
			for (int k=0; k<data.length; k++)
		{
			System.out.print(data[k]+" ");
		}
			System.out.println();
		}
	}
}