package com.demo.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class StudentSkillProfile {
    private int sid;
    private String name;
    private LocalDate birthDate;
    private String degree;
    private double degreeMarks;
    private Set<String> skills = new HashSet<>();

    public StudentSkillProfile() {
    }

    public StudentSkillProfile(int sid, String name, LocalDate birthDate, String degree, double degreeMarks) {
        this.sid = sid;
        this.name = name;
        this.birthDate = birthDate;
        this.degree = degree;
        this.degreeMarks = degreeMarks;
    }

    public int getSid() { return sid; }
    public void setSid(int sid) { this.sid = sid; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }
    public double getDegreeMarks() { return degreeMarks; }
    public void setDegreeMarks(double degreeMarks) { this.degreeMarks = degreeMarks; }
    public Set<String> getSkills() { return skills; }
    public void setSkills(Set<String> skills) { this.skills = skills; }
}