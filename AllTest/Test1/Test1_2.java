public class Test1_2 {
    public static void main(String[] args) {
        int []numbers = {103,152,156,21,4,87,23,123,458,2,15};
        int count = 0,total = 0,average = 0;
        for(int i = 0;i < numbers.length;i++,count++)
            total += numbers[i];
        average = total/count;
        System.out.println("Average:"+average);
    }
}
