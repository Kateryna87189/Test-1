import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private List<Task> tasks; //= new ArrayList<>();
    private List<String> technologies;

    public Programmer(String name, List<String> technologies) {
        this.name = name;
        this.tasks = new ArrayList<>();
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return name + '\'' +" "+"technologie"+
                ", tasks=" + tasks;
    }
    //metod dobavut' zada4y
    public void addTask (Task task){
        tasks.add(task);
    }
    //polu4it' spisok zada4
    public List<Task> getTasks(){
        return tasks;
    }
    //proverka nomera zada4i
    public boolean checkTaskByNumber(int number){
        for (int i = 0; i < tasks.size(); i++) {
          if  (tasks.get(i).getNumber()==number){
              return true;
          }

        }
        return false;
    }

}
