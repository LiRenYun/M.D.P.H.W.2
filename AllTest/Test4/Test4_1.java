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
            System.out.printf("Oval %d ��Ja(���b):-1)break :",count);
            Lenther = enter.nextDouble();
            if(Lenther == -1)
                break;
            System.out.printf("Oval %d ��Jb(�u�b):-1)break :",count);
            Renter = enter.nextDouble();
            if(Renter == -1 || Lenther == -1)
                break;
            else
                oval[count++] = new Oval(Lenther,Renter);
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
    double length;//���b,R�u�b
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