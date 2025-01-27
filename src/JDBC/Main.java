package JDBC;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] students = {
                {"john Doe", "20", "john.doe@example.com"},
                {"Jhn Smith","22","jane.smith@example.com"},
                {"Zakaria","33","zazak@gmail.com"}


        };
        insertStudentData postgres = new insertStudentData();
        postgres.insertDummyData(students);
    }
}