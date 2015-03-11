public class Test1_1 {
    public static void main(String[] args) {
        int [][]timeData = {{4,13},{23,54},{45,23}};
        int total = 0;
        for(int i = 2;i >= 0;i--)
        {
            if(timeData[i][1]-timeData[i][0] < 0)
            {
                timeData[i-1][1] -= 1;
                timeData[i][1] += 60;
                timeData[i][1] -= timeData[i][0];
            }
            else if(timeData[i][1]-timeData[i][0] > 0)
            {
                timeData[i][1] -= timeData[i][0];
            }
            if(i == 2)
                total += timeData[i][1];
            else if(i == 1)
                total += timeData[i][1]*60;
            else if(i == 0)
                total += timeData[i][1]*60*60;
        }
        System.out.println("Total second:"+total);
    }
    
}
