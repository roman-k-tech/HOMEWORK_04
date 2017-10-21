import java.util.Random;
import java.util.Scanner;

/**
 * Created by Роман on 15.10.2017.
 */
public class Student extends Human
{

    public Student()
    {
        Random random = new Random();
        mark = random.nextInt(12);
        super.setAge(random.nextInt(3) + 17);
    }

    private Integer mark;

    public Student(boolean b)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input name: ");
        String input = s.next();

        super.setName(input);
        new Student();
    }

    @Override
    public void print_human()
    {
        super.print_human();
        System.out.println("Student.");
    }

    public Integer getMark()
    {
        return mark;
    }
    public void setMark(Integer mark)
    {
        this.mark = mark;
    }
}
