package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxAverageGrade {
    public static int maxAverageGrade(String[][] studentsGrades) {
        //need to check again
        Map<String, int[]> gradesMap = new HashMap<>();


        for (String[] studentGrade : studentsGrades) {
            String student = studentGrade[0];
            int grade = Integer.parseInt(studentGrade[1]);
            if (!gradesMap.containsKey(student)) {
                gradesMap.put(student, new int[]{0, 0});
            }
            gradesMap.get(student)[0] += grade;
            gradesMap.get(student)[1] += 1;
        }

        double maxAvg = -1;
        for (int[] totalAndCount : gradesMap.values()) {
            double avg = (double) totalAndCount[0] / totalAndCount[1];
            if (avg > maxAvg) {
                maxAvg = avg;
            }
        }


        return (int) Math.floor(maxAvg);
    }

    public static void main(String[] args) {
        String[][] studentsGrades = {
                {"Rohit", "85"},
                {"Rahul", "80"},
                {"Amit", "85"},
                {"Rohit", "90"}
        };

        System.out.println(maxAverageGrade(studentsGrades)); // Output should be 87
    }
}
