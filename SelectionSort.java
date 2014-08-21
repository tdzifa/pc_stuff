public class SelectionSort
{
	public static void main(String[] args) {
		int[] data = {13,25,7,34,33,100,45,69,23,56,0,-3,13,34};

		for (int i=0; i<data.length;i++)
		{
			int pos=i;
			int min = data[i];
			for (int j=i; j<data.length-1;j++)
			{
				
				if (min>data[j+1])
				{
					min=data[j+1];
					pos=j+1;
				}
			}

			int temp = data[i];
			data[i]=data[pos];
			data[pos]=temp;

			for (int k=0; k<data.length; k++)
		{
			System.out.print(data[k]+" ");
		}
			System.out.println();
		}

		
	}
}