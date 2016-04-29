import java.util.ArrayList;

public class ArrayListTwo

	{

		public static void main(String[] args)

			{

				runintro();

				runpractice();

			}

		public static void runintro()

			{

			ArrayList<Double> list=new ArrayList<Double>();

			list.add(3.5);

			list.add(5.5);

			list.add(3.3);

			list.add(6.5);

			list.add(7.8);

			Double sum=0.0;

			for(int i=0;i<list.size();i++)

				{

					System.out.println(list.get(i));

					sum+=list.get(i);

				}

			System.out.println("Your array list's sum is "+sum);

			list.remove(0);

			list.add(2.1);

			list.add(1.6);

			Double newsum=0.0;

			for(int ii=0;ii<list.size();ii++)

				{

					newsum+=list.get(ii);

				}

			newsum=newsum/list.size();

			System.out.println("Your average is "+newsum);

			}

		public static void runpractice()

			{

				ArrayList<Double> temps=new ArrayList<Double>();

				temps.add(97.4);

				temps.add(98.5);

				temps.add(99.6);

				temps.add(97.7);

				temps.add(98.6);

				temps.add(98.4);

				temps.add(98.5);

				temps.add(99.9);

				temps.add(98.5);

				temps.add(98.8);

				int fevers=0;

				for(int iii=0;iii<temps.size();iii++)

					{

						if(temps.get(iii)>98.6)

							{

							fevers++;

							System.out.println("Patient number "+ (iii+1) + " has a tempurature of "+temps.get(iii)+" degrees fahrenheit!");

							System.out.println(" ");

							}

					}

				for(int iii=0;iii<temps.size();iii++)

					{

						if(temps.get(iii)>98.6)

							{

							System.out.println("Patient number "+ (iii+1) + " has a fever of "+ (temps.get(iii)-32)/1.8+" degrees Celsius");

							System.out.println(" ");

							}

					}

				System.out.println("There were a total of "+fevers+" fevers in this group!");

				for(int iii=temps.size();iii>0;iii--)

					{

						if(temps.get(iii-1)>98.6)

							{

							temps.remove(iii-1);

							}

					}

				System.out.println(" ");

				System.out.println("The following are the patients without fevers!");

				System.out.println(" ");

				for(int iii=0;iii<temps.size();iii++)

					{

						System.out.println("Patient number "+ (iii+1) + " has a tempurature of "+temps.get(iii)+" degrees fahrenheit!");

						System.out.println(" ");

					}

				for(int iii=0;iii<temps.size();iii++)

					{

						System.out.println("Patient number "+ (iii+1) + " has a fever of "+ (temps.get(iii)-32)/1.8+" degrees Celsius");

						System.out.println(" ");

					}

				ArrayList<Double> t=new ArrayList<Double>();

				t.add(97.4);

				t.add(98.5);

				t.add(99.6);

				t.add(97.7);

				t.add(98.6);

				t.add(98.4);

				t.add(98.5);

				t.add(99.9);

				t.add(98.5);

				t.add(98.8);

				double highest=0;

				for(int iii=0;iii<temps.size();iii++)

					{

						if(t.get(iii)>highest)

							{

								highest=t.get(iii);

							}

					}

				double lowest=100000;

				for(int iii=0;iii<temps.size();iii++)

					{

						if(t.get(iii)<lowest)

							{

								lowest=t.get(iii);

							}

					}

				System.out.println("Your lowest number was "+ lowest);

				System.out.println("Your highest number was "+ highest);

			}

		

	}