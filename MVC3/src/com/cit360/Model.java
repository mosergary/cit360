package com.cit360;

public class Model {
    private String firstName;
    private String lastName;
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    static Model Database() {
        Model student = new Model();
        student.setFirstName("Gary");
        student.setLastName("Moser");
        student.setProject("MVC");
        return student;
    }
}