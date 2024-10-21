import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Task> taskList1=new ArrayList<>();//sozdaem pystoj list dlja task
        taskList1.add(new Task(1,"task number 1","Realizacuja zada4i n. 1"));//dodaem zada4y v list
        taskList1.add(new Task(2,"task number 2","Realizacuja zada4i n. 2"));
        taskList1.add(new Task(3,"task number 3","Realizacuja zada4i n. 3"));

        List.of(//sozdaem pystoj list  task s dannumi
                new Task(4,"task number 4","Realizacuja zada4i n. 4"),
                new Task(5,"task number 5","Realizacuja zada4i n. 5"),
                new Task(6,"task number 6","Realizacuja zada4i n. 6"),
                new Task(7,"task number 7","Realizacuja zada4i n. 7")
        );

        List <String> technologies1 = List.of("Java","go","msql");
        List <String> technologies2 = List.of("Java","go","msql","c++");

        List<Programmer> programmers=List.of(
        new Programmer("Jack", technologies1),
        new Programmer("Lena", technologies2),
        new Programmer("Nick",List.of("Java","go","msql") )
        );

        for (int i = 0; i < programmers.size(); i++) {
            System.out.println(programmers.get(i));

        }
        System.out.println("--------------------------------------dobavit' vsem zada4y n. 1");
        for (int i = 0; i < programmers.size(); i++) {
            programmers.get(i).addTask(taskList1.get(0));

        }
        //System.out.println(programmers);
        programmers.get(1).addTask(taskList1.get(1));
        for (int i = 0; i < programmers.size(); i++) {
            System.out.println(programmers.get(1));

        }
        System.out.println("est' li y Lenu n 2");
        System.out.println(programmers.get(1).checkTaskByNumber(2));

        System.out.println("est' li y Jacka n 2");
        System.out.println(programmers.get(2).checkTaskByNumber(2));


    }
}