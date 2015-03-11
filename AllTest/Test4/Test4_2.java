import java.util.Scanner;


public class Test4_2 {

    public static void main(String[] args) {
        double a,b,c;
        int opt,count = 0;
        Scanner en = new Scanner(System.in);
        Shape []array = new Shape[100];
        while(true)
        {
            System.out.print("1.)圓形2.)橢圓3.)矩形4.)三角形-1)breka&ShowAll:");
            opt = en.nextInt();
            if(opt == 1)
            {
                do{
                    System.out.print("輸入半徑：");
                    a = en.nextDouble();
                    if(a<0)
                        System.out.print("Error!\n");
                }while(a < 0);
                array[count++] = new Circle(a);
            }
            else if(opt == 2)
            {
                do{
                    System.out.print("輸入長軸：");
                    a = en.nextDouble();
                    System.out.print("輸入短軸：");
                    b = en.nextDouble();
                    if(a<0 || b<0)
                        System.out.print("Error!\n");
                }while(a < 0 && b <0);
                array[count++] = new Oval(a,b);
            }
            else if(opt == 3)
            {
                do{
                    System.out.print("輸入長：");
                    a = en.nextDouble();
                    System.out.print("輸入寬：");
                    b = en.nextDouble();
                    if(a<0 || b <0)
                        System.out.print("Error!\n");
                }while(a < 0 && b < 0);
                array[count++] = new Oblong(a,b);
            }
            else if(opt == 4)
            {
                do{
                    System.out.print("輸入高：");
                    a = en.nextDouble();
                    System.out.print("輸入底：");
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
        System.out.println("圓形:"+this.area());
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
        System.out.println("橢圓形:"+this.area());
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
        System.out.println("矩形:"+this.area());
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
        System.out.println("三角形:"+this.area());
    }
}