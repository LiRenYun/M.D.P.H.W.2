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
            System.out.printf("C %d ��J�b�|:-1)break :",count);
            Renter = enter.nextDouble();
            if(Renter == -1)
                break;
            else
                circle[count++] = new Circle(Renter);
        }
        while(true)
        {
            System.out.printf("��J�s���P����:-1)break :\n�s��:");
            index = enter.nextInt();
            if(index == -1)
                break;
            else if(index > count || index < 0)
                System.out.println("Error!���s�b���s��");
            else
            {
                System.out.printf("����(0~360):");
                scale = enter.nextDouble();
                if(scale > 360 || scale < 0)
                    System.out.println("Error!����(0~360)");
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