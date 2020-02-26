package com.github.divya.Quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer questionId;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private Integer questionLevel;
    private String correctAnswer;

    public Question(Integer questionId, String question, String answer1, String answer2, String answer3,
                    String answer4, Integer questionLevel, String correctAnswer) {
        this.questionId = questionId;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.questionLevel = questionLevel;
        this.correctAnswer = correctAnswer;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", questionLevel=" + questionLevel +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
