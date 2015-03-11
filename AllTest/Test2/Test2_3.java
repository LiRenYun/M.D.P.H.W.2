import java.util.Scanner;

public class Test2_3 {
    public static void main(String[] args) {
        int year;
        Scanner enter = new Scanner(System.in);
        while(true)
        {
            System.out.printf("Enter the year -1)break:");
            year = enter.nextInt();
            if(year == -1)
                break;
            if(year % 400 == 0 || ( year % 4 == 0&& year%100 != 0))
                System.out.println("¶|¦~");
            else
                System.out.println("¥­¦~");
        }
    }
    
}
