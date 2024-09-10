package com.OneToManyHibernate.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "qTable")
public class Question {

    @Id
    private int Qid;
    private String Q;

    @OneToMany(mappedBy = "question")
    private List<Answer> ans;

    public Question() {
        super();
    }

    public Question(int qid, String q, List<Answer> ans) {
        super();
        Qid = qid;
        Q = q;
        this.ans = ans;
    }

    public int getQid() {
        return Qid;
    }

    public void setQid(int qid) {
        Qid = qid;
    }

    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }

    public List<Answer> getAns() {
        return ans;
    }

    public void setAns(List<Answer> ans) {
        this.ans = ans;
    }
}
