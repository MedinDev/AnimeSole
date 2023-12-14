package com.example.animesole219j104.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "views")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Year")
    private String year;

    @Column(name = "Age")
    private int age;

    @Column(name = "Director")
    private String director;

    @Column(name = "AnimeType")
    private String animeType;

    public Book() {

    }

    public Book(String name, String email, String year, int age, String director, String animeType) {
        super();
        this.name = name;
        this.email = email;
        this.year = year;
        this.age = age;
        this.director = director;
        this.animeType = animeType;
    }

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAnimeType() {
        return animeType;
    }

    public void setAnimeType(String animeType) {
        this.animeType = animeType;
    }
}
