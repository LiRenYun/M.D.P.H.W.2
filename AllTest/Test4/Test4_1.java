import java.util.Scanner;


public class Test4_1 {
    public static void main(String[] args) {        
        Oval []oval = new Oval[100];
        Scanner enter = new Scanner(System.in);
        double Renter;
        double Lenther;
        double scale;
        int count = 0;
        int index;
        while(true)
        {
            System.out.printf("Oval %d 輸入a(長軸):-1)break :",count);
            Lenther = enter.nextDouble();
            if(Lenther == -1)
                break;
            System.out.printf("Oval %d 輸入b(短軸):-1)break :",count);
            Renter = enter.nextDouble();
            if(Renter == -1 || Lenther == -1)
                break;
            else
                oval[count++] = new Oval(Lenther,Renter);
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
                System.out.printf("Area:%f\nLength:%f\n",oval[index].area(),oval[index].lengthResult());
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
class Oval extends Circle
{
    double length;//長軸,R短軸
    public Oval(double enlength,double enR) {
        super(enR);
        length = enlength;
    }
    public Oval(double enR) {
        super(enR);
    }
    double area() {
    return 3.14 * length * r;
    }
    double lengthResult()
    {
        return 3.14 * 2 * r*4*(length-r);
    }
}