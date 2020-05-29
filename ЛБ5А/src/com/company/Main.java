package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class RecordBook {

    List<List<Exam>> session = new ArrayList<>();
    public static class MonitoringSystem {
        public void startMonitoring() { }
    }

    public static class Exam {
        private String date;
        private String subject;
        private int mark;

        public Exam(String date) {
            this.date = date;
        }

        public Exam(String date, String subject, int mark) {
            this.date = date;
            this.subject = subject;
            this.mark = mark;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        @Override
        public String toString() {
            return "Экзамен {" +
                    "дата: '" + date + '\'' +
                    ", предмет: '" + subject + '\'' +
                    ", оценка: " + mark +
                    "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Exam exam = (Exam) o;
            return mark == exam.mark &&
                    Objects.equals(date, exam.date) &&
                    Objects.equals(subject, exam.subject);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date, subject, mark);
        }
    }

    private List<Exam> exams = new ArrayList<>();

    public class ExamController {
        public void addExam(String date, String subject, int mark){
            exams.add(new Exam(date,subject,mark));
        }

        public void removeExam(int index){
            exams.remove(index);
        }

        public List<Exam> getAllExams(){
            return exams;
        }

        public Exam getExam(int index){
            return exams.get(index);
        }
    }
    void AnonClass () {
        MonitoringSystem monitoringSystem = new MonitoringSystem() {
            public void startMonitoring() {
                System.out.println("Начало сессии");
            }
        };
    }

}

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
	    RecordBook recordBook = new RecordBook();
	    RecordBook.ExamController examController = recordBook.new ExamController();


        System.out.println("Введите даты,название,оценку экзаменов: ");
        String a_1 = in.next();
        String b_1 = in.next();
        int c_1 = in.nextInt();
        String a_2 = in.next();
        String b_2 = in.next();
        int c_2 = in.nextInt();
        String a_3 = in.next();
        String b_3 = in.next();
        int c_3 = in.nextInt();
	    examController.addExam(a_1+".01.2020",b_1,c_1);
        examController.addExam(a_2+".01.2020",b_2,c_2);
        examController.addExam(a_3+".01.2020",b_3,c_3);
        System.out.println(examController.getAllExams());
    }
}
