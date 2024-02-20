package daily0219;

import java.util.function.*;

public class quiz6 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("저팔계", 95, 93)
    };


    static double avg(ToIntFunction<Student> f) {
        int totalScore = 0;
        for (Student student : students) {
            totalScore += f.applyAsInt(student);
        }
        return (double) totalScore / students.length;
    }
    static double agv1(Function<Student, Integer> f){
        int sum=0;
        for(Student student: students){
            sum += f.apply(student);
        }
        return (double) sum/students.length;
    }


    public static void main(String[] args) {
        //매개변수 1개 있고, 리턴값 1개 있음-> function쓰기
        // 매개변수 값 Student, return 값 Integer
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
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