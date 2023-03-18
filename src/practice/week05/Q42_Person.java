package practice.week05;

import java.util.ArrayList;
import java.util.List;

public class Q42_Person {

    /*
Create a constructor and list with the following parameters
age,idNo, bloodType,isAlive

Create constructor in a method and add dynamic parameters

 */

    // I want to create final data type to make it dynamic variable
    // and using constructor with parameter
    final int employeeAge;
    final int employeeIdNo;
    final String employeeBloodType;
    final boolean employeeIsAlive;

    public Q42_Person(int employeeAge, int employeeIdNo, String employeeBloodType, boolean employeeIsAlive) {
        this.employeeAge = employeeAge;
        this.employeeIdNo = employeeIdNo;
        this.employeeBloodType = employeeBloodType;
        this.employeeIsAlive = employeeIsAlive;

    }

    // if we want to print variables we have to create toString method
    // toString method is reading and appearing variables
    @Override
    public String toString() {
        return "Q42_Person{" +
                "employeeAge=" + employeeAge +
                ", employeeIdNo=" + employeeIdNo +
                ", employeeBloodType='" + employeeBloodType + '\'' +
                ", employeeIsAlive=" + employeeIsAlive +
                '}';
    }
}
