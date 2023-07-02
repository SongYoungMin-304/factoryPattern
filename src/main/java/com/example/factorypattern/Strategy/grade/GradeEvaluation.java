package com.example.factorypattern.Strategy.grade;

import com.example.factorypattern.Strategy.GradeType;

public interface GradeEvaluation {

    public String getGrade(int score);

    public GradeType getType();
}
