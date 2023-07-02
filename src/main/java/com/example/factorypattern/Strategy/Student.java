package com.example.factorypattern.Strategy;

import com.example.factorypattern.Strategy.grade.BasicGradeEvaluation;
import com.example.factorypattern.Strategy.grade.GradeEvaluation;
import com.example.factorypattern.Strategy.grade.MajorGradeEvaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    int studentId;
    String studentName;
    ArrayList<Subject> subjectList = new ArrayList<>();

    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void addSubject(String name, int score, GradeType gradeType){

        /* Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);*/
        subjectList.add(
                new Subject.SubjectBuilder()
                .name(name)
                .scorePoint(score)
                .majorCode(gradeType)
                        .build()
        );
    }

    public void showStudentScore(){
        int total = 0;

        for(Subject s: subjectList){
            total += s.getScorePoint();
            System.out.println(studentName + " 학생의 " + s.getName() +"과목의 점수는 " + s.getScorePoint()+
                    "점 입니다.");
        }

        System.out.println(studentName +" 학생의 총점은 " + total + " 점 입니다.");
    }

    public void shcwGradeInfo(){

        GradeEvaluation[] gradeEvaluations = {new BasicGradeEvaluation(), new MajorGradeEvaluation()};

        List<GradeEvaluation> gradeList = new ArrayList<>();
        gradeList.add(new BasicGradeEvaluation());
        gradeList.add(new MajorGradeEvaluation());

        subjectList.stream().forEach(
                s -> {
                    //gradeEvaluations[s.getMajorCode()].getGrade(s.getScorePoint());
                    String grade = gradeList.stream().filter(o -> o.getType().equals(s.getGradeType())).findFirst().get().getGrade(s.getScorePoint());
                    System.out.println("학생 : "+ studentName +"의" + s.getName() + " 과목 성적은 " + s.getScorePoint() +"점 이고, 학점은 " + grade +"입니다.");
                }
        );

        /*for(Subject s: subjectList){

            String grade;

            if(s.getGradeType() == true){
                grade = gradeEvaluations[MAJOR].getGrade(s.getScorePoint());
            }else{
                grade = gradeEvaluations[BASIC].getGrade(s.getScorePoint());
            }

            System.out.println("학생 : "+ studentName +"의" + s.getName() + " 과목 성적은 " + s.getScorePoint() +"점 이고, 학점은 " + grade +"입니다.");
        }*/


    }
}
