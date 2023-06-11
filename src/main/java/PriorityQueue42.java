package main.java;

import java.util.*;

public class PriorityQueue42 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Students> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Students st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Priorities {
    public List<Students> getStudents(List<String> events) {
        PriorityQueue<Students> queue = new PriorityQueue<>(
                Comparator.comparing(Students::getCgpa).reversed()
                        .thenComparing(Students::getName)
                        .thenComparing(Students::getId)
        );
        for (String event : events) {
            String[] parts = event.split("\\s+");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Students student = new Students(id, name, cgpa);
                queue.add(student);
            } else if (parts[0].equals("SERVED")) {
                queue.poll();
            }
        }
        List<Students> students = new ArrayList<>(queue);
        students.sort(Comparator.comparing(Students::getCgpa).reversed()
                .thenComparing(Students::getName)
                .thenComparing(Students::getId)
        );
        return students;
    }
}
class Students {
    private final int id;
    private final String name;
    private final double cgpa;

    public Students(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
