package practice.week08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TransactionManager {

    /*
    ====================================
Teacher and Student Management Panel
====================================
1- Student Transaction
2- Teacher Transaction
   Q. Exit

Depending on whether the user selects "Student Transaction" or "Teacher Transaction,"
the following options should be displayed:
======= Transactions ============
1-Add
2-Delete with ID
3-Search with ID
4-List All
  Q. Return to Main Menu
     */

    // private List<Object> ==>> Object is including all data types(int,String,boolean,double,float)
   // we can add any data in this list but if we use List<TeacherInfo> method we can add any data from
   //TeacherInfo class in the list


    // List<TeacherInfo> ==>> it means I will use data whatever is avaliable for this class
    private List<TeacherInfo> teachersInfoList ;
    private List<StudentInfo> studentsInfoList;
    private Scanner scan ;

    // we are using constructor for readable and for easier maintenance
    public TransactionManager(){
        teachersInfoList = new ArrayList<>();
        studentsInfoList = new ArrayList<>() ;
        scan = new Scanner(System.in) ;
    }

    public void start(){
        String input;

        do{
            System.out.println("\nMain Menu");
            System.out.println("1. Student Transaction");
            System.out.println("2. Teacher Transaction");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice");
            input = scan.nextLine();
            switch (input){
                case "1" :studentTransaction();break;
                case "2" :teacherTransaction();break;
                case "3" :
                    System.out.println("Exiting Program...");;break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!input.equals("3"));
    }

/*
======= Transactions ============
1-Add
2-Delete with ID
3-Search with ID
  Q. Return to Main Menu
     */
    private void studentTransaction() {
     String input ;
     do {
         System.out.println("\nStudent Transaction");
         System.out.println("1. Add Student");
         System.out.println("2. Delete with ID");
         System.out.println("3. Search with ID");
         System.out.println("4. Return to Main Menu");
         System.out.println("Enter Your Transaction");
         input = scan.nextLine();
         switch (input){
             case "1" : addStudent(); break;
             case "2" : deleteStudent(); break;
             case "3" : searchStudent(); break;
             case "4" :
                 System.out.println("Returning to Main menu");; break;
             default:
                 System.out.println("Invalid choice");
         }
     }while (!input.equals("4"));
    }

    private void addStudent() {
        System.out.println("Enter the student ID:");
        int studentId = scan.nextInt();

        System.out.println("Enter Student Name");
        String studentName = scan.nextLine() ;
        scan.nextLine() ;// if we use more scanner object consecutively we should put default scanner object

        System.out.println("Enter Student Last Name");
        String studentLastName = scan.nextLine();

        System.out.println("Enter Student Subject");
        String studentSubject = scan.nextLine();

        System.out.println("Enter Student Age");
        int studentAge = scan.nextInt();

        System.out.println("Enter Student School No");
        int studentNo = scan.nextInt();
        scan.nextLine();

        // WE should create Object from the StudentInfo class to assign this values from the user
        StudentInfo student = new StudentInfo(studentId,studentName,studentLastName,studentSubject,
                studentAge,studentNo) ;

        studentsInfoList.add(student) ;
        System.out.println("Student added successfully");
    }

    private void deleteStudent() {

        System.out.println("enter student ID");
        int id = scan.nextInt();

        boolean flag = false ;

        for(int i = 0 ; i<studentsInfoList.size() ; i++){
            StudentInfo student = studentsInfoList.get(i) ;
            if(student.getId() ==id){
                studentsInfoList.remove(i);
                System.out.println("Student deleted successfuly");
                flag = true;
                break;
            }
            if(!flag){
                System.out.println("Student not found");
            }
        }
    }

    private void searchStudent() {
        System.out.println("enter student ID");
        int id = scan.nextInt();

        boolean flag = false ;

        for(StudentInfo student : studentsInfoList){
            if(student.getId()==id){
                System.out.println("Student found");
                System.out.println("ID" +student.getId());
                System.out.println("Name" +student.getStudentName());
                System.out.println("Last Name" +student.getStudentLastName());
                System.out.println("Age" +student.getAge());
                flag = true ;
                break;
            }
        }if(!flag){
            System.out.println("Student not found");
        }

    }





    private void teacherTransaction() {
        String input ;
        do {
            System.out.println("\nTeacher Transaction");
            System.out.println("1. Add Teacher");
            System.out.println("2. Delete Teacher with ID");
            System.out.println("3. Search Teacher with ID");
            System.out.println("4. Return to Main Menu");
            System.out.println("Enter Your Transaction");
            input = scan.nextLine();
            switch (input){
                case "1" : addTeacher(); break;
                case "2" : deleteTeacher(); break;
                case "3" : searchTeacher(); break;
                case "4" :
                    System.out.println("Returning to Main menu");; break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (!input.equals("4"));
    }

    private void addTeacher() {
        System.out.println("Enter the Teacher ID:");
        int TeacherId = scan.nextInt();

        System.out.println("Enter Teacher Name");
        String TeacherName = scan.nextLine() ;
        scan.nextLine() ;// if we use more scanner object consecutively we should put default scanner object

        System.out.println("Enter Teacher Last Name");
        String TeacherLastName = scan.nextLine();

        System.out.println("Enter Teacher Subject");
        String TeacherSubject = scan.nextLine();

        System.out.println("Enter Teacher Age");
        int TeacherAge = scan.nextInt();

        System.out.println("Enter Teacher School No");
        int EmployeeNo = scan.nextInt();
        scan.nextLine();

        // WE should create Object from the StudentInfo class to assign this values from the user
        TeacherInfo teacher = new TeacherInfo(TeacherId,TeacherName,TeacherLastName,TeacherSubject,
                TeacherAge,EmployeeNo) ;

        teachersInfoList.add(teacher) ;
        System.out.println("Student added successfully");
    }

    private void deleteTeacher() {
        System.out.println("Enter teacher ID");
        int id = scan.nextInt();
        scan.nextLine();

        boolean flag = false;

        for (int i = 0; i < teachersInfoList.size(); i++) {
            TeacherInfo teacher = teachersInfoList.get(i);
            if (teacher.getId() == id) {
                teachersInfoList.remove(i);
                System.out.println("Teacher deleted successfully");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Teacher not found");
        }
    }

    private void searchTeacher() {
        System.out.println("Enter teacher ID");
        int id = scan.nextInt();
        scan.nextLine();

        boolean flag = false;

        for (TeacherInfo teacher : teachersInfoList) {
            if (teacher.getId() == id) {
                System.out.println("Teacher found");
                System.out.println("ID: " + teacher.getId());
                System.out.println("Name: " + teacher.getTeacherName());
                System.out.println("Last Name: " + teacher.getTeacherLastName());
                System.out.println("Age: " + teacher.getAge());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Teacher not found");
        }
    }




}
