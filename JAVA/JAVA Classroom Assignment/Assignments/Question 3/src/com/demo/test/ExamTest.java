package com.demo.test;

import java.time.LocalDate;
import java.util.Scanner;

class Question {
    int qno;
    String question;
    String[] options;
    int answer;
    int marks;

    Question(int qno, String question, String[] options, int answer, int marks) {
        this.qno = qno;
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.marks = marks;
    }
}

class Exam {
    int examId;
    String name;
    String topic;
    LocalDate dateOfExam;
    Question[] questions;

    Exam(int examId, String name, String topic, LocalDate dateOfExam, Question[] questions) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.dateOfExam = dateOfExam;
        this.questions = questions;
    }

    int conduct(Scanner scanner) {
        int score = 0;
        for (Question q : questions) {
            System.out.println("\n" + q.qno + ". " + q.question);
            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }
            System.out.print("Answer: ");
            int ans = Integer.parseInt(scanner.nextLine());
            if (ans == q.answer) score += q.marks;
        }
        return score;
    }
}

public class ExamTest {
    private static Exam javaExam() {
        return new Exam(1, "Java Test", "Core Java", LocalDate.now(), new Question[]{
                new Question(1, "Which keyword creates inheritance?", new String[]{"extends", "implements", "inherits", "super"}, 1, 1),
                new Question(2, "Which collection stores unique values?", new String[]{"List", "Set", "Queue", "Map"}, 2, 1),
                new Question(3, "Which method starts a Java program?", new String[]{"run", "main", "start", "init"}, 2, 1),
                new Question(4, "Which block handles exceptions?", new String[]{"if", "try-catch", "switch", "loop"}, 2, 1),
                new Question(5, "Which is not primitive?", new String[]{"int", "double", "String", "char"}, 3, 1)
        });
    }

    private static Exam htmlExam() {
        return new Exam(2, "HTML Test", "HTML Basics", LocalDate.now(), new Question[]{
                new Question(1, "HTML stands for?", new String[]{"Hyper Text Markup Language", "High Text Machine Language", "Hyper Tabular Markup Language", "None"}, 1, 1),
                new Question(2, "Tag for link?", new String[]{"img", "a", "p", "div"}, 2, 1),
                new Question(3, "Tag for image?", new String[]{"image", "pic", "img", "src"}, 3, 1),
                new Question(4, "Which tag creates a table row?", new String[]{"td", "tr", "table", "row"}, 2, 1),
                new Question(5, "HTML files commonly use extension?", new String[]{"html", "java", "css", "xml"}, 1, 1)
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;
        do {
            System.out.println("1. Java");
            System.out.println("2. HTML");
            System.out.print("Which exam do you want to appear? ");
            int choice = Integer.parseInt(scanner.nextLine());
            Exam exam = choice == 1 ? javaExam() : htmlExam();
            int score = exam.conduct(scanner);
            System.out.println("Marks: " + score);
            System.out.println(score >= 3 ? "Congratulations you completed the test." : "Better luck next time.");
            System.out.print("Do you want to continue? y/n: ");
            again = scanner.nextLine();
        } while (again.equalsIgnoreCase("y"));
    }
}