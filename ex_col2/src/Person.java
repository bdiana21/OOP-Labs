public class Person {
    private Double salary;
    private String CNP;
    private int age;
    private String name;

    public Person(Double salary, String CNP, int age, String name) {
        this.salary = salary;
        this.CNP = CNP;
        this.age = age;
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCNP() {
        return CNP;
    }

    public String getName() {
        return name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
