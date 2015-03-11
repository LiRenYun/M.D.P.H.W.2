import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Circle []circle = new Circle[100];
        Scanner enter = new Scanner(System.in);
        double Renter;
        double scale;
        int count = 0;
        int index;
        while(true)
        {
            System.out.printf("C %d 輸入半徑:-1)break :",count);
            Renter = enter.nextDouble();
            if(Renter == -1)
                break;
            else
                circle[count++] = new Circle(Renter);
        }
        while(true)
        {
            System.out.printf("輸入編號與角度:-1)break :\n編號:");
            index = enter.nextInt();
            if(index == -1)
                break;
            else if(index > count || index < 0)
                System.out.println("Error!不存在的編號");
            else
            {
                System.out.printf("角度(0~360):");
                scale = enter.nextDouble();
                if(scale > 360 || scale < 0)
                    System.out.println("Error!角度(0~360)");
                else
                {
                    System.out.printf("Area:%f\nLength:%f\n",circle[index].area(scale),circle[index].lengthResult(scale));
                }
            }
        }
    }
    
}
class Circle {
    double r;
    Circle(double enR)
    {
        r = enR;
    }
    double area(double scale) {
    return 3.14 * r * r *(scale/360);
 }
    double lengthResult(double scale)
    {
        return 3.14 * 2 * r *(scale/360);
    }
}