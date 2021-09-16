package ua.lviv.ib.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 30, message = "name must be between 3 and 30 symbols")
    @Column(name = "name")
    private String name;

    @Size(min = 3, max = 30, message = "surname must be between 3 and 30 symbols")
    @Column(name = "surname")
    private String surname;

    @Min(value = 18, message = "you must be older then 18 years old")
    @Column(name = "age")
    private int age;

    public Person() {}

    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
