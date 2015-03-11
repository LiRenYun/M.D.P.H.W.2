

import java.util.Scanner;

public class Test3_2 {
    public static void main(String[] args) {
        int enyear,enmonth,enday,opt;
        Scanner en = new Scanner(System.in);
        System.out.printf("Year:");
        enyear = en.nextInt();
        System.out.printf("Month:");
        enmonth = en.nextInt();
        System.out.printf("Day:");
        enday = en.nextInt();
        datecheck date = new datecheck(enyear,enmonth,enday);
        while(true)
        {
            System.out.printf("1.)Change date2.)show 3.)check-1)break :");
            opt = en.nextInt();
            if(opt ==-1)
                break;
            else if(opt == 2)
                date.showdate();
            else if(opt == 3)
                if(date.checkuse() == false)
                    System.out.println("Error:date is not currect!");
                else
                {
                    date.showdate();
                    System.out.println("Currect!");
                }
            else if(opt == 1)
                date.enterymd();
                
        }
    }
}
class datecheck
{
    int year,month,day;
    Scanner enter = new Scanner(System.in);
    datecheck(int enyear,int enmonth,int enday)
    {
        year = enyear;
        month = enmonth;
        day = enday;
    }
    public void enterymd()
    {
        try{
            System.out.printf("Year:");
            year = enter.nextInt();
            System.out.printf("Month:");
            month = enter.nextInt();
            System.out.printf("Day:");
            day = enter.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    public void showdate()
    {
        System.out.printf("%d ¦~ %d ¤ë %d ¤é\n",year,month,day);
    }
    public boolean checkuse()
    {
        if(year < 0 || month<0 || month >12 || day < 0 || day >31)
            return false;
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            if(day > 31)
                return false;
            else
                return true;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            if(day > 30)
                return false;
            else
                return true;
        }
        else if(month == 2)
        {
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            {
                if(month > 29)
                    return false;
                else
                    return true;
            }
            else
            {
                if(month>28)
                    return false;
                else
                    return true;
            }
        }
        return false;
    }
    
}
