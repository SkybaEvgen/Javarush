package Solution;

import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
