package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        /*studentList = studentList.stream().sorted((s1, s2) -> {
            if (s2.getCgpa() == s1.getCgpa()) {
                if (s2.getFname() == s1.getFname()) {
                    return s1.getId() - s2.getId();
                } else {
                    return s1.getFname().compareTo(s2.getFname());
                }
            } else if (s2.getCgpa() > s1.getCgpa()) {
                return 1;
            } else {
                return -1;
            }
        }).collect(Collectors.toList());*/

        studentList.stream().sorted(Comparator.comparingDouble(Student::getCgpa).reversed()
                        .thenComparing(Student::getFname).thenComparing(Student::getId))
                .map(Student::getFname).collect(Collectors.toList());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
        in.close();
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}