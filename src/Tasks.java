import java.util.*;

public class Tasks {
    ArrayList<Problems> tasks = new ArrayList<Problems>();
    ArrayList<Problems> wait = new ArrayList<Problems>();


    public void addProbelm(Problems problem){
        tasks.add(problem);

    }
    public void removeProblim(Problems problem){
        tasks.remove(problem);
    }

    public void show() {

        Collections.sort(tasks, Comparator.comparingInt(Problems::getTaskPrioritet).reversed());

        if(tasks.size() == 0){
            for(Problems p:wait){
                System.out.println(p.getTaskName() + " | Приоритет: " + p.getTaskPrioritet() + "  Время: " + p.getTime());
            }
        }
        else {

            for (Problems p : tasks) {
                System.out.println(p.getTaskName() + " | Приоритет: " + p.getTaskPrioritet() + "  Время: " + p.getTime());
            }
        }
    }

    public void addToWait(Problems p){
        wait.add(p);
    }

}

class Problems{
    int taskPrioritet;
    String taskName;
    int time;
    public Problems(int prioriti , String name , int ti){
        this.taskName = name;
        this.taskPrioritet = prioriti;
        this.time = ti;

    }

    public int getTaskPrioritet() {
        return taskPrioritet;
    }

    public void setTaskPrioritet(int taskPrioritet) {
        this.taskPrioritet = taskPrioritet;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

class Proverka{
    public static void main(String[] args) {
        Problems aman = new Problems(2,"rewu",20);
        Problems nama = new Problems(4,"projeckt",120);
        Tasks manager = new Tasks();
        manager.addProbelm(aman);
        manager.addProbelm(nama);
        manager.show();
        manager.removeProblim(aman);
        manager.show();
    }
}
