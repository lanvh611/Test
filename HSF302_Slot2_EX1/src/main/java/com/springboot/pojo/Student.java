package com.springboot.pojo;
import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;

    @Column(name = "firstName", nullable = false, unique = true)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "marks")
    private  String marks;

    public Student(){

    }

    public Student(String firstName, String lastName, int marks) {
        super();
        this.setfirstName(firstName);
        this.setlastName(lastName);
        this.setmarks(marks);
    }

    public Student(int id, String firstName, String lastName, int marks) {
        super();
        this.setId(id);
        this.setfirstName(firstName);
        this.setlastName(lastName);
        this.setmarks(marks);
    }
}
