package com.OneToManyHibernate.entity;

import jakarta.persistence.*;


@jakarta.persistence.Entity
@Table(name = "aTable")
public class Answer {

    @Id
    private int ansId;
    private String A;

    @ManyToOne
    private Question question;

    public Answer() {
        super();
    }

    public Answer(int ansId, String a, Question question) {
        super();
        this.ansId = ansId;
        A = a;
        this.question = question;
    }

    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer [ansId=" + ansId + ", A=" + A + ", question=" + question + "]";
    }
}
