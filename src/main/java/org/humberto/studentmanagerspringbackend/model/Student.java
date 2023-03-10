package org.humberto.studentmanagerspringbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity     //this class is going to be mapped to a table in the DB
public class Student implements Serializable {

    //atributtes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String career;
    private String phone;
    private String imgUrl;

    @Column(nullable = false, updatable = false)
    private String studentCode;

    //constructor
    public Student() {
    }

    public Student(Long id, String name, String email, String career, String phone,
                   String imgUrl, String studentCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.career = career;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.studentCode = studentCode;
    }
    //getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    //methods

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", career='" + career + '\'' +
                ", phone='" + phone + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
