import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Scanner;
 public class Courses {
    String professorName;
    String courseName;
    String coursName;
    int maxStudent;
    Student[] studentList = new Student[100];
    int credits;
    int studentInCourse=0;

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Courses(String professorName, String courseName, int maxStudent, int credits) {
        this.professorName = professorName;
        this.courseName = courseName;
        this.maxStudent = maxStudent;
        this.credits = credits;
    }

}
class Student{
    String firstName;
    String lastName;
    int studentId;
    String major;
    int year;
    Courses[] coursesList = new Courses[10];
    int maxCredit = 0;
    int indexCourse=0;


    public Student(String firstName,String lastName,int studentId,String major,int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.major = major;
        this.year = year;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Courses[] getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(Courses[] coursesList) {
        this.coursesList = coursesList;
    }

    public int getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(int maxCredit) {
        this.maxCredit = maxCredit;
    }
}

class Uni{
    Student[] allStudent = new Student[1000];
    int indexAvalibleStudent = 0;
    Courses[] allCourses = new Courses[100];
    int indexAvalibleCurses = 0;

    public void addStudent(String firstName,String lastName,int studentId,String major,int year){
        Student fi = new Student( firstName, lastName, studentId, major, year);
        allStudent[indexAvalibleStudent] = fi;
        indexAvalibleStudent++;
    }

    public void addCourse(String professorName, String courseName,  int maxStudent,  int credits){
        Courses newCours = new Courses(professorName,courseName,maxStudent,credits);
        allCourses[indexAvalibleCurses] = newCours;
        indexAvalibleCurses++;

    }
    public void registr(String studentName, String courseName){

        for(int i = 0;i<indexAvalibleCurses;i++){
            if(allCourses[i].studentInCourse>=allCourses[i].maxStudent){
                break;
            }
            else if(allCourses[i].getCourseName().equals(courseName)){
                for(int j=0;j<indexAvalibleStudent;j++){
                    if(allCourses[i].credits+allStudent[j].maxCredit>=12){
                        break;
                    }
                    else if(allStudent[j].getFirstName().equals(studentName)){
                        allStudent[j].coursesList[allStudent[j].indexCourse]=allCourses[i];
                        allStudent[j].indexCourse +=1;
                        allCourses[i].studentList[allCourses[i].studentInCourse] = allStudent[j];
                        allCourses[i].studentInCourse++;
                        allStudent[j].maxCredit += allCourses[i].credits;
                    }
                }
            }
        }
    }
public void allCoursesatStudent(String studentName){
        for(int i = 0;i<indexAvalibleStudent;i++){
            if(allStudent[i].getFirstName().equals(studentName)){
                for(int j=0;j<allStudent[i].indexCourse;j++){
                    System.out.println(allStudent[i].coursesList[j].getCourseName());
                }
            }
        }
    }
    public void allStudentAtCourse(String courseName){
        for(int i = 0;i<indexAvalibleCurses;i++){
            if(allCourses[i].getCourseName().equals(courseName)){
                for(int a =0;a<allCourses[i].studentInCourse;a++){
                    System.out.println(allCourses[i].studentList[a].getFirstName());
                }
            }
        }
    }

}

class Metod {
    public static void main(String[] args) {
         /*Student Aman = new Student("Aman","Anarbekov",1,"CS",2024);
        Courses CS = new Courses("Munara","CS101",100,6);
        Uni Ait = new Uni();
        Ait.addStudent("Aman","Anarbekov",1,"CS",2024);
        Ait.addCourse("Munara","CS101",100,6);
        Ait.registr("Aman","CS101");
        Ait.addCourse("Emil","PL",60,4);
        Ait.addCourse("Ulan","ENG",60,6);
        Ait.registr("Aman","PL");
        Ait.registr("Aman","ENG");
        Ait.allCoursesatStudent("Aman");
        Ait.allStudentAtCourse("CS101");*/
        Uni Ait = new Uni();
        Scanner scan = new Scanner(System.in);
        String massage = """
                1 1. Add a Student
        
                2. Add a Course
                
                3. Register a Student for a Course
                
                4. List All Courses a Student is Enrolled In
                
                5. List All Students in a Course
                
                6. Exit
                """;

        while (true){
            System.out.println(massage);
            int option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1:
                    System.out.println("enter student name , id ,major, year");
                    String firstName = scan.nextLine();
                    System.out.println("enter student last name");
                    String lastName = scan.nextLine();
                    System.out.println("enter student id");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("enter student major");
                    String major = scan.nextLine();
                    System.out.println("enter student year");
                    int year = scan.nextInt();
                    scan.nextLine();
                    Ait.addStudent(firstName,lastName,id,major,year);
                    break;


                case 2:
                    System.out.println("enter professor name");
                    String profesorName = scan.nextLine();
                    System.out.println("enter course name");
                    String courseName = scan.nextLine();
                    System.out.println("enter max student in course");
                    int maxStudent = scan.nextInt();
                    System.out.println("enter credit count");
                    scan.nextLine();
                    int credit = scan.nextInt();
                    Ait.addCourse(profesorName,courseName,maxStudent,credit);
                    break;



                case 3:
                    System.out.println("enter student name");
                    String Name = scan.nextLine();
                    System.out.println("enter course name");
                    String cName = scan.nextLine();
                    Ait.registr(Name,cName);
                    break;


                case 4:
                    System.out.println("enter student name");
                    String sName = scan.nextLine();
                    Ait.allCoursesatStudent(sName);
                    break;

                case 5:
                    System.out.println("enter course name");
                    String coName = scan.nextLine();
                    Ait.allStudentAtCourse(coName);
                    break;

                case 6:
                    return;

            }

        }



    }
}