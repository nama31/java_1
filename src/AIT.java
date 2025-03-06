import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AIT {

}

class Students{
    Integer id;
    String name;
    int age;
    HashSet<String> corses = new HashSet<String>();

    public Students(Integer id ,String name, int age ){
        this.name = name;
        this.id = id;
        this.age = age;

    }
    public void addCourse(String course){
        corses.add(course);
    }


    public void removeCourse(String course){
        corses.remove(course);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HashSet<String> getCorses() {
        return corses;
    }


}


class ManagmentUnit {
    HashMap<Integer,Students > uni = new HashMap<Integer, Students>();


    public void addStudent(Students s){
        uni.put(s.getId(),s);
    }

    public void removeStudent(Integer id){
        uni.remove(id);
    }

    public void updete(Integer id , String name, int age ){
        uni.get(id).setName(name);
        uni.get(id).setAge(age);
    }

    public void showStudents(){
        for(Integer i : uni.keySet()){
            System.out.println(uni.get(i).getId() + "" + uni.get(i).getAge() +""+ uni.get(i).getName());
            System.out.println(uni.get(i).getCorses());
        }
    }

    public void serch(Integer id){
        for (Integer i: uni.keySet()){
            if (uni.get(i).getId() == id){
                System.out.println(uni.get(i).getId() + "" + uni.get(i).getAge() +""+ uni.get(i).getName());
                System.out.println(uni.get(i).getCorses());
            }
        }
    }

    public void onCourse(String corse){
        for(Integer i: uni.keySet()){
            if(uni.get(i).getCorses().contains(corse)){
                System.out.println(uni.get(i).getId() + "" + uni.get(i).getAge() +""+ uni.get(i).getName());
            }
        }
    }

}


class MainUniAIT{
    public static void main(String[] args) {
        Students aman = new Students(1,"aman",18);
        aman.addCourse("OOP Java is cool");
        Students nama = new Students(2,"nama",24);
        ManagmentUnit ait = new ManagmentUnit();
        ait.addStudent(aman);
        ait.showStudents();
    }
}








