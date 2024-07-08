package feb24th;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		String[][] data=new String[4][3];
		

		for (int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(data[i][j]+"   ");
			}
			
			System.out.println();
		}

		
		data[0][0]="MadanReddy";
		data[0][1]="Madan123";
		data[0][2]="Adactin.com - Search Hotel";
		
		data[1][0]="MadanReddy";
		data[1][1]="Madan111";
		data[1][2]="Adactin.com - Hotel Reservation System";
		
		data[2][0]="Madan";
		data[2][1]="Madan123";
		data[2][2]="Adactin.com - Hotel Reservation System";
		
		data[3][0]="Madan";
		data[3][1]="Madan111";
		data[3][2]="Adactin.com - Hotel Reservation System";
		
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(data[i][j]+"   ");
			}
			
			System.out.println();
		}

	}

}
