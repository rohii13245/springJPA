package com.example.daimond1;

public class Topic {

    public String id;
    public String name;
    public String subject;

    public Topic(){

    }

    public Topic(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
