import java.util.Scanner;
class car
{
		int modelyr;
		String modelname;
		// Constructor
		public car(int year, String name)
		{
		int modelyr = year;
		String modelname = name;
		}
		
		public static void main(String args[])
		{
			car mycar = new car(1969, "Mustang");
			System.out.println(mycar.modelyr + " "+ mycar.modelname);
		
		}
}
