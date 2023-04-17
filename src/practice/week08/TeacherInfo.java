package practice.week08;

public class TeacherInfo {

// -Teacher class should include First Name, Last Name, ID Number, Age, Field of Study, Employee Number

    private int Id ;
    private String teacherName;
    private String teacherLastName;
    private String teacherSubject;
    private int age;
    private int employeeNo;

    // to add value for this variables we have to create
    // constructor without parameter and with parameter

    public TeacherInfo() {
    }

    public TeacherInfo(int id, String teacherName, String teacherLastName, String teacherSubject, int age, int employeeNo) {
        Id = id;
        this.teacherName = teacherName;
        this.teacherLastName = teacherLastName;
        this.teacherSubject = teacherSubject;
        this.age = age;
        this.employeeNo = employeeNo;
    }

    // to set data and to get data we have to create getter and setter


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    //If we want to see these data we have to create toString method


    @Override
    public String toString() {
        return "TeacherInfo{" +
                "Id=" + Id +
                ", teacherName='" + teacherName + '\'' +
                ", teacherLastName='" + teacherLastName + '\'' +
                ", teacherSubject='" + teacherSubject + '\'' +
                ", age=" + age +
                ", employeeNo=" + employeeNo +
                '}';
    }
}
