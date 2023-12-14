import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;
    String location;
    int scdMarks;
    int pfMarks;

    public Student(String name, int age, String location, int scdMarks, int pfMarks) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.scdMarks = scdMarks;
        this.pfMarks = pfMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", scdMarks=" + scdMarks +
                ", pfMarks=" + pfMarks +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        String csvFilePath = "src\\list.csv"; // Replace with your CSV file path
//        List<Student> students = new ArrayList<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
//            String line;
//            boolean headerSkipped = false;
//            while ((line = reader.readLine()) != null) {
//                if (!headerSkipped) {
//                    headerSkipped = true;
//                    continue; // Skip the header line
//                }
//                String[] parts = line.split(",");
//                if (parts.length == 5) {
//                    String name = parts[0].trim();
//                    int age = Integer.parseInt(parts[1].trim());
//                    String location = parts[2].trim();
//                    int scdMarks = Integer.parseInt(parts[3].trim());
//                    int pfMarks = Integer.parseInt(parts[4].trim());
//
//                    Student student = new Student(name, age, location, scdMarks, pfMarks);
//                    students.add(student);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Calculate the average of pfMarks and scdMarks
        double totalPfMarks = 0;
        double totalScdMarks = 0;
        for (Student student : students) {
            totalPfMarks += student.pfMarks;
            totalScdMarks += student.scdMarks;
        }
        double avgPfMarks = totalPfMarks / students.size();
        double avgScdMarks = totalScdMarks / students.size();

        // Print the average marks
        System.out.println("Average pfMarks: " + avgPfMarks);
        System.out.println("Average scdMarks: " + avgScdMarks);

        // Print all student data including averages
        for (Student student : students) {
            System.out.println(student);
        }

        // Write the data, including averages, to an output CSV file
        String outputCsvFilePath = "src\\output.csv"; // Replace with your desired output CSV file path
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputCsvFilePath))) {
            writer.write("Name\tAge\tLocation\n"); // Write the header
            for (Student student : students) {
                writer.write(student.name + "\t" + student.age + "\t" + student.location +"\n");
            }
            writer.write("Average\t\t\t" + avgScdMarks + "\t" + avgPfMarks + "\n"); // Write the averages
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}