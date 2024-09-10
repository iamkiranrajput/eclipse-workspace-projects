package com.hm.entity;

import jakarta.persistence.*;

@Entity
public class Question {
	
    public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @Column(name="que_id")
    private int QId;
    
    @OneToOne
    private Answer ans;
    
    private String que;
    
    public int getQId() {
        return QId;
    }
    public void setQId(int qId) {
        QId = qId;
    }
    public Answer getAns() {
        return ans;
    }
    public void setAns(Answer ans) {
        this.ans = ans;
    }
    public String getQue() {
        return que;
    }
    public void setQue(String que) {
        this.que = que;
    }

    @Override
    public String toString() {
        return "Question [QId=" + QId + ", ans=" + ans + ", que=" + que + "]";
    }
}
