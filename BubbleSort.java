public class BubbleSort{
	public static void main(String[] args) {
		int [] myArray={13,25,7,18,9};

		for (int i=myArray.length-1; i>0; i--)
		{
			int temp=0;
			for (int j=0; j<i; j++)
			{
				if (myArray[j]>myArray[j+1])
				{
					temp=myArray[j];
					myArray[j]=myArray[j+1];
					myArray[j+1]=temp;
				}
			}

			for (int k=0; k<myArray.length; k++)
			System.out.print(myArray[k]+" ");
			System.out.println();
			
		}

		
		
	}
}