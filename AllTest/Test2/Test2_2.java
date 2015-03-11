import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        double []number = new double[2];
        Scanner enter = new Scanner(System.in);
        int opt;
        for(int i =0;i < 2;i++)
        {
            System.out.printf("Enter the number %d:",i+1);
            number[i] = enter.nextDouble();
        }
        System.out.printf("1.)+ 2.)- 3.)* 4.)/ :");
        opt = enter.nextInt();
        switch(opt)
        {
            case 1:
                System.out.printf("(%.2f) + (%.2f) = %.2f\n",number[0],number[1],number[0]+number[1]);
                break;
            case 2:
                System.out.printf("(%.2f) - (%.2f) = %.2f\n",number[0],number[1],number[0]-number[1]);
                break;
            case 3:
                System.out.printf("(%.2f) * (%.2f) = %.2f\n",number[0],number[1],number[0]*number[1]);
                break;
            case 4:
                if(number[1] != 0)
                    System.out.printf("(%.2f) / (%.2f) = %.2f\n",number[0],number[1],number[0]/number[1]);
                else
                    System.out.println("Error message:°£¼Æ¬°0");
                break;
        }
    }
}
