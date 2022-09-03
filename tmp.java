import java.util.Scanner;

public class tmp
{
    public static void main(String[] args)
    {
        System.out.println("请输入若干个数字，每输入一个数字并回车确认.");
        System.out.println("最后输入数字 0 来结束输入");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        double x = reader.nextDouble();
        while(x != 0 )
        {
            sum = sum + x;
            x = reader.nextDouble();
        }
        System.out.println("Sum=" + sum);


        float boy[] = new float[4];

    }
}

class Student
{
    void speak(String S)
    {
        System.out.println(S);
    }
}

class People
{
    int height;
    String ear;
    void Speak(String S)
    {
        System.out.println(S);
    }
}
