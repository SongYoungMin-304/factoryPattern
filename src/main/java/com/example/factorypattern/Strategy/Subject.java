package com.example.factorypattern.Strategy;

public class Subject {

    public Subject(SubjectBuilder subjectBuilder) {
        this.name = subjectBuilder.name;
        this.scorePoint = subjectBuilder.scorePoint;
        this.gradeType = subjectBuilder.majorCode;
    }

    public static class SubjectBuilder{
        private String name;
        private int scorePoint;
        private GradeType majorCode;

        public SubjectBuilder name(String name){
            this.name = name;
            return this;
        }

        public SubjectBuilder scorePoint(int scorePoint){
            this.scorePoint = scorePoint;
            return this;
        }

        public SubjectBuilder majorCode(GradeType majorCode){
            this.majorCode = majorCode;
            return this;
        }

        public Subject build(){
            return new Subject(this);
        }
    }


    private String name;
    private int scorePoint;
    private GradeType gradeType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public void setGradeType(GradeType gradeType) {
        this.gradeType = gradeType;
    }
}
