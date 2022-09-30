package sky.pro.myCollection;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
