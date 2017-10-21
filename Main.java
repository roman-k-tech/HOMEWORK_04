import java.util.Scanner;

/**
 * Created by Роман on 15.10.2017.
 */
public class Main
{
    public static void main (String[] args) throws NoSpace
    {
        Group group = new Group();
        Student student = new Student();
        student.setName("Ira");
        group.add_student(student);

        student = new Student();
        student.setName("Denis");
        group.add_student(student);

        student = new Student();
        student.setName("Ivan");
        group.add_student(student);

        student = new Student();
        student.setName("Roman");
        group.add_student(student);

        student = new Student();
        student.setName("Nikolai");
        group.add_student(student);

        student = new Student();
        student.setName("Sveta");
        group.add_student(student);

        student = new Student();
        student.setName("Alla");
        group.add_student(student);

        student = new Student();
        student.setName("Evgen");
        group.add_student(student);

        student = new Student();
        student.setName("Vova");
        group.add_student(student);

        boolean exited = false;
        String input = null;
        Scanner s = new Scanner(System.in);
        while (!exited)
        {
            System.out.println("\nCommands:");
            System.out.println("1 - Add Student");
            System.out.println("2 - Remove Student");
            System.out.println("3 - Search Student");
            System.out.println("4 - Print Group");
            System.out.println("5 - Print Group alphabetically");
            System.out.println("6 - Sort group by name");
            System.out.println("7 - Sort group by marks");
            System.out.println("8 - Get list of 18+");
            System.out.println("0 - Exit program.\n");

            System.out.print("Input command: ");
            input = s.next();

            switch (input.charAt(0))
            {
                case '0':
                    System.out.println("Exited.");
                    exited = true;
                    break;
                case '1':
                    try {
                        group.add_student(new Student(true));
                    }
                    catch (NoSpace e)
                    {
                        System.out.println(e.getMessage());
                        //e.printStackTrace();
                    }
                    break;
                case '2':
                    System.out.print("Input Student number: ");
                    group.remove_student(Integer.parseInt(s.next()));
                    break;
                case '3':
                    System.out.print("Input stdent's name: ");
                    Integer i = group.search_student(s.next());
                    System.out.println("Student number is " + i);
                    break;
                case '4':
                    group.print_self();
                    break;
                case '5':
                    group.self_print_alph();
                    break;
                case '6':
                    group.sort("name");
                    break;
                case '7':
                    group.sort("mark");
                    break;
                case '8':
                    group.print_self(group.get18());
                    break;
                default:
                    System.out.println("INVALID COMMAND!");
                    break;
            }
        }
    }

}
