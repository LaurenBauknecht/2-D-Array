public class DArrays

		{

		public static void main(String[] args)

			{

			First();

			Second();

			AddNumbers();

			}

		public static void First()

			{

			int arrayName [] [] = {{10,20},{30,40},{50,60}};

			System.out.println(arrayName[2][1]);

			}

		public static void Second()

			{

			String item [] [] = new String [4] [3];

			for(int rows = 0; rows < item.length; rows++)

				{

				for(int columns = 0; columns < item[0].length; columns++)

					{

					item [rows] [columns] = "MHS";

					}

				}

			for(int rows = 0; rows < item.length; rows++)

				{

				System.out.println();

				for(int columns = 0; columns < item[0].length; columns++)

					{

					System.out.print(item [rows] [columns] + " ");

					}
				}
			}

		public static void AddNumbers()

			{

			String item [] [] = new String [3] [3];

			int arrayName [] [] = {{1,2,3}, {4,5,6},{7,8,9}};

			for(int rows = 0; rows < item.length; rows++)

				{

				for(int columns = 0; columns < item[0].length; columns++)

					{

					System.out.println();

					

					

				}

			}

			}

			}

		




	