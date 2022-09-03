import java.util.Scanner;
import java.util.*;

public class tmp
{
    public static void main(String[] args)
    {
        Point p1;
        Point p2;

        p1 = new Point();
        p2 = new Point();

        System.out.println("p1的引用：" + p1);
        System.out.println("p2的引用： " + p2);

        p1.setXY(1111,2222);
        p2.setXY(-100, -200);

        System.out.println("p1的x坐标：" + p1.x + ",y坐标：" + p1.y);
        System.out.println("p2的x坐标：" + p2.x + ",y坐标：" + p2.y);

        p1 = p2;

        System.out.println("p2的值赋给p1之后\n");

        System.out.println("p1的引用：" + p1);
        System.out.println("p2的引用： " + p2);

        p1.setXY(1111,2222);
        p2.setXY(-100, -200);

        System.out.println("p1的x坐标：" + p1.x + ",y坐标：" + p1.y);
        System.out.println("p2的x坐标：" + p2.x + ",y坐标：" + p2.y);



    }
}

class Point
{
    int x;
    int y;
    void setXY(int m, int n)
    {
        x = m;
        y = n;
    }

    Point()
    {}
}

class PeopleName
{
    float height;
    float weight;
    String Sk;

    PeopleName(String Se)
    {
        Sk = Se;
        System.out.println("Entity Initial....\n");
    }

    PeopleName()
    {

    }

    void speak()
    {
        System.out.println(Sk);
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
