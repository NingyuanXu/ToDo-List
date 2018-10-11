package main.model;

import implementations.Dailytask;

import java.util.ArrayList;

public abstract class Task implements Dailytask {
    protected int number;
    protected String content;
    protected String course;
    protected String date;
    protected String type;
    protected int timeneeded;


    public Task(int number, String content, String course, String type, String date, int timeneeded) {
        this.number = number;
        this.content = content;
        this.course = course;
        this.date = date;
        this.type = type;
        this.timeneeded = timeneeded;
    }

    public Task(ArrayList<String> data){
        load(data);
    }

    public abstract String complete();


    // EFFECTS: get the number for the task
    public int getNumber() {
        return number;
    }


    // EFFECTS: get the content for the task
    public String getContent() {
        return content;
    }


    // EFFECTS: get the course for the task

    public String getCourse() {
        return course;
    }

    // EFFECTS: get the date for the task

    public String getDate() {
        return date;
    }

    // EFFECTS: get the type for the task

    public String getType() {
        return type;
    }

    // EFFECTS: get the time needed for the task

    public int getTimeneeded() {
        return timeneeded;
    }

    // MODIFIES: this
    // EFFECTS: sets number to parameter
    public void setNumber(int number) {
        this.number = number;
    }

    // MODIFIES: this
    // EFFECTS: sets content to parameter

    public void setContent(String content) {
        this.content = content;
    }

    // MODIFIES: this
    // EFFECTS: sets course to parameter
    public void setCourse(String course) {
        this.course = course;
    }

    // MODIFIES: this
    // EFFECTS: sets date to parameter
    public void setDate(String date) {
        this.date = date;
    }

    // MODIFIES: this
    // EFFECTS: sets type to parameter

    public void setType(String type) {
        this.type = type;
    }

    // MODIFIES: this
    // EFFECTS: sets timeneeded to parameter

    public void setTimeneeded(int timeneeded) {
        this.timeneeded = timeneeded;
    }

    protected abstract void load(ArrayList<String> data);

}

