import java.util.Scanner;
public class Test2_1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String name;
        int []birthday = new int[3];
        System.out.printf("Enter the Name:");
        name = enter.nextLine();
        System.out.printf("Enter the birthday(year):");
        birthday[0] = enter.nextInt();
        birthday[0] -=1911;
        System.out.printf("Enter the birthday(month):");
        birthday[1] = enter.nextInt();
        System.out.printf("Enter the birthday(day):");
        birthday[2] = enter.nextInt();
        System.out.println("Name:"+name);
        for(int i = 0;i < 3;i++)
        {
            if(i == 0 && birthday[0] > 0)
            {
                System.out.printf("民國:%d年",birthday[0]);
            }
            else if(i == 0 && birthday[0] < 0)
            {
                System.out.printf("民國前: %d 年",-birthday[0]);
            }
            if(i != 0)
                System.out.printf("%d",birthday[i]);
            if(i == 1)
                System.out.printf(" 月 ");
            else if(i == 2)
                System.out.printf(" 日\n");
        }
    }
}
