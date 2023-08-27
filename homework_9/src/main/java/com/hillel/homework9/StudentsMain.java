package com.hillel.homework9;

public class StudentsMain {
    public static void main(String[] args) {

        StudentsData StudentsData = new StudentsData("Иванов", 5,"Математике" );
        StudentsData studentsData1 = new StudentsData("Петрова", 4,"Физике" );
        StudentsData studentsData2 = new StudentsData("Сидоров", 3,"Программированию" );
        StudentsData.printFormatted();
        studentsData1.printFormatted();
        studentsData2.printFormatted();
    }
}


