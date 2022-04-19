package com.example.project_login.model;

public class Data {

    String title;
    String description;
    String skills;
    String salary;
    String id;
    String date;
    String name;
    String from;
    String to;
    String date_on;
    String seats;
    String luggage_info;
    String contact;
    String budget;

    public Data(){

    }

    public Data(String title, String description, String skills, String salary, String id, String date) {
        this.title = title;
        this.description = description;
        this.skills = skills;
        this.salary = salary;
        this.id = id;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Data(String name, String from, String to, String date_on, String seats, String luggage_info, String contact, String budget){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate_on() {
        return date_on;
    }

    public void setDate_on(String date_on) {
        this.date_on = date_on;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getLuggage_info() {
        return luggage_info;
    }

    public void setLuggage_info(String luggage_info) {
        this.luggage_info = luggage_info;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
