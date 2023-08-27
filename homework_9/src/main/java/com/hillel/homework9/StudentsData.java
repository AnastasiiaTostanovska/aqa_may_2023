package com.hillel.homework9;

public class StudentsData {
    String surname;
    int mark;
    String subject;

    public StudentsData(String surname, int mark, String subject) {
        this.surname = surname;
        this.mark = mark;
        this.subject = subject;
    }

    public void printFormatted() {
        System.out.println(String.format("Студент %-15s получил %-3s по %-10s", surname, mark, subject));
    }
}



