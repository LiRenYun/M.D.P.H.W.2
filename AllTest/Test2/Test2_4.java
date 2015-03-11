
import java.util.Scanner;

public class Test2_4 {
    public static void main(String[] args) {
        int opt,count = 0;
        String []names = new String[100];
        int []grades = new int[100];
        Scanner enter = new Scanner(System.in);
        while(true)
        {
            System.out.printf("1.)Enter the grade 2.)search -1)break :");
            opt = enter.nextInt();
            if(opt == -1)
                break;
            else if(opt == 1)
            {
                while(true)
                {
                    try{
                        System.out.printf("Name %d -1)end :",count);
                        names[count] = enter.next();
                        
                        if(names[count].equals("-1") == true)
                            break;
                        System.out.printf("grade %d :",count);
                        grades[count++] = enter.nextInt();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error:NumberFormatException("+e+")");
                        enter.next();
                        if(count-1 >= 0)
                            count--;
                    }
                }
            }
            else if(opt == 2)
            {
                System.out.printf("Student Index:");
                opt = enter.nextInt();
                if(opt >= count)
                    System.out.println("Error!超過總數的index!");
                else
                    System.out.println("Index:"+opt+":"+names[opt] +"\tGrade :"+grades[opt]);
            }
        }
    }
    
}