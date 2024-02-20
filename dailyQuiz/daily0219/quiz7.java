package daily0219;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;

public class quiz7 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("저팔계", 95, 93)
    };


    public static double avg(ToDoubleFunction<Student> selector) {
        double sum = 0;
        for (Student student : students) {
            sum += selector.applyAsDouble(student);
        }
        return sum / students.length;
    }


    public static void main(String[] args) {
        double englishAvg = avg( Student::getEnglishScore );
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg( Student::getMathScore );
        System.out.println("수학 평균 점수: " + mathAvg);
    }

    public static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}