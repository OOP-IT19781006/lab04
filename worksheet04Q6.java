import java.util.EventListener;
import java.util.Scanner;
class Q6
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number of month");
        int month=scanner.nextInt();
        if(month==1||month==2||month==3||month==4||month==5||month==6||month==7||month==8||month==9||month==10||month==11||month==12)
        {
            if(month==12||month==1||month==2)
            {
                System.out.println("Winter");
            }
            else if(month==3||month==4||month==5)
            {
                System.out.println("Spring");
            }
            else if(month==6||month==7||month==8)
            {
                System.out.println("Summer");
            }
            else
            {
                System.out.println("Autumn");
            }
        }
    }
}