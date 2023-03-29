package practice.week6;

import java.sql.PreparedStatement;

public class ToStringMethod {


    private int phoneNumber ;
    private String name ;
    private String email ;

    public ToStringMethod(int phoneNumber, String name, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ToStringMethod{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ToStringMethod toStringMethod = new ToStringMethod(125,"Mehmet","mali@gmail.com") ;
        System.out.println(toStringMethod);
    }



}
