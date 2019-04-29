import firstTask.Solution;
import general.Loader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Loader l  = new Loader("src/main/resources/product_data.csv");
        int command =0;
        Scanner sc = new Scanner(System.in);

        Solution s = new Solution(l.getProducts(), 10000);
        s.find();
        while (command != 4)
        {
            System.out.println("Commands");
            System.out.println("1 - Change bag capacity (default 10000)");
            System.out.println("2 - How much bags do you need");
            System.out.println("3 - Print bags");
            System.out.println("4 - Exit");
            System.out.println("Insert command number");

            command = sc.nextInt();
            switch (command)
            {


                case (1):
                    {
                        System.out.println("Type size of bag");
                        int size =sc.nextInt();
                        s = new Solution(l.getProducts(), size);
                        if(!s.find())
                        {
                            System.out.println("Weight of single item exceed weight capacity");
                        }
                        else
                        {
                            System.out.print("Needed bags: ");
                            System.out.println(s.countBags());
                        }
                        break;
                    }
                case(2):
                    {
                        System.out.print("Needed bags: ");
                        System.out.println(s.countBags());
                        break;
                    }
                case (3):
                    {
                        s.showBags();
                        break;
                    }
            }


            System.out.println();
        }
    }
}
