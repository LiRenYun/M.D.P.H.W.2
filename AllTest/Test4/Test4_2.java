import java.util.Scanner;


public class Test4_2 {

    public static void main(String[] args) {
        double a,b,c;
        int opt,count = 0;
        Scanner en = new Scanner(System.in);
        Shape []array = new Shape[100];
        while(true)
        {
            System.out.print("1.)���2.)���3.)�x��4.)�T����-1)breka&ShowAll:");
            opt = en.nextInt();
            if(opt == 1)
            {
                do{
                    System.out.print("��J�b�|�G");
                    a = en.nextDouble();
                    if(a<0)
                        System.out.print("Error!\n");
                }while(a < 0);
                array[count++] = new Circle(a);
            }
            else if(opt == 2)
            {
                do{
                    System.out.print("��J���b�G");
                    a = en.nextDouble();
                    System.out.print("��J�u�b�G");
                    b = en.nextDouble();
                    if(a<0 || b<0)
                        System.out.print("Error!\n");
                }while(a < 0 && b <0);
                array[count++] = new Oval(a,b);
            }
            else if(opt == 3)
            {
                do{
                    System.out.print("��J���G");
                    a = en.nextDouble();
                    System.out.print("��J�e�G");
                    b = en.nextDouble();
                    if(a<0 || b <0)
                        System.out.print("Error!\n");
                }while(a < 0 && b < 0);
                array[count++] = new Oblong(a,b);
            }
            else if(opt == 4)
            {
                do{
                    System.out.print("��J���G");
                    a = en.nextDouble();
                    System.out.print("��J���G");
                    b = en.nextDouble();
                    if(a<0 || b <0)
                        System.out.print("Error!\n");
                }while(a < 0 && b <0);
                array[count++] = new Triangle(a,b);
            }
            else if(opt == -1)
            {
                for(int i = 0;i<count;i++)
                    array[i].show();
                break;
            }
        }
    }
    
}
abstract class Shape {
    abstract double area();
    abstract void show();
}
class Circle extends Shape {
    double r;
    public Circle(double r) {
    this.r = r;
    }
    @Override
    public double area() {
        return 3.14 * r * r;
    }  
    @Override
    void show() {
        System.out.println("���:"+this.area());
    }
}
class Oval extends Shape{
    double a,b;
    public Oval(double a,double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    double area() {
        return 3.14*a*b;
    }

    @Override
    void show() {
        System.out.println("����:"+this.area());
    }
}
class Oblong extends Shape{
    double length,wide;
    public Oblong(double length,double wide)
    {
        this.length = length;
        this.wide = wide;
    }
    @Override
    double area() {
        return length*wide;
    }

    @Override
    void show() {
        System.out.println("�x��:"+this.area());
    }
}
class Triangle extends Shape{
    double high,base;
    public Triangle(double high,double wide)
    {
        this.high = high;
        this.base = wide;
    }
    @Override
    double area() {
        return high*base/2;
    }

    @Override
    void show() {
        System.out.println("�T����:"+this.area());
    }
}