import java.util.Scanner;
import java.util.*;

public class tmp
{
    public static void main(String[] args)
    {
        PeopleName Jace = new PeopleName("Hello World");
        Jace.speak();

    }
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
