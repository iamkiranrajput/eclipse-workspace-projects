package com.hm.entity;


import jakarta.persistence.*;

@Entity
public class Answer {
	
	
	
	
    public Answer() {
		super();
	}

	@Id
    @Column(name="ans_id")
    private int ans_id;
    
    private String ans;

    @OneToOne(mappedBy="ans", cascade=CascadeType.ALL)
    private Question que;
    
    
    public int getAns_id() {
        return ans_id;
    }
    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
    }
    public Question getQue() {
        return que;
    }
    public void setQue(Question que) {
        this.que = que;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Answer [ans_id=" + ans_id + ", que=" + que + ", ans=" + ans + "]";
    }
}
