package practice.week08;

public class StudentInfo {

    // -Student class should include First Name, Last Name, ID Number, Age, Field of Study, School Number

    private int Id ;
    private String studentName;
    private String studentLastName;
    private String field;
    private int age;
    private int SchoolNo;

    public StudentInfo() {
    }

    public StudentInfo(int id, String studentName, String studentLastName, String field, int age, int schoolNo) {
        Id = id;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.field = field;
        this.age = age;
        SchoolNo = schoolNo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSchoolNo() {
        return SchoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        SchoolNo = schoolNo;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "Id=" + Id +
                ", studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", field='" + field + '\'' +
                ", age=" + age +
                ", SchoolNo=" + SchoolNo +
                '}';
    }






}
