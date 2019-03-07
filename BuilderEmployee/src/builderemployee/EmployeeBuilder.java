/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderemployee;

/**
 *
 * @author aparcerozas
 */
public class EmployeeBuilder {
   private String lastName = "";
   private String middleName = "";
   private String firstName;
   private long id;
   private int birthYear = 0;
   private int birthMonth = 0;
   private int birthDate = 0;
   private int hireYear = 0;
   private int hireMonth = 0;
   private int hireDate = 0;

    public EmployeeBuilder(final String firstName, final long id) {
        this.firstName = firstName;
        this.id = id;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public EmployeeBuilder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public EmployeeBuilder setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public EmployeeBuilder setBirthDate(int birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public EmployeeBuilder setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }

    public EmployeeBuilder setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
        return this;
    }

    public EmployeeBuilder setHireDate(int hireDate) {
        this.hireDate = hireDate;
        return this;
    }
    
    public Employee crearEmployee(){
        return new Employee(lastName, middleName, firstName, id, birthYear,
                birthMonth, birthDate, hireYear, hireMonth, hireDate);
    }
}
