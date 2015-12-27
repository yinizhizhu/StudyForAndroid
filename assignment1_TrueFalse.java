package com.sinaapp.yinizhizhublog.assignment1;

/**
 * Created by Lee on 2015/12/21.
 */
public class TrueFalse {
    private int Question;

    private boolean TrueQuestion;
    public TrueFalse(int question, boolean trueQuestion){
        Question = question;
        TrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return Question;
    }

    public boolean isTrueQuestion() {
        return TrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        TrueQuestion = trueQuestion;
    }

    public void setQuestion(int question) {
        Question = question;
    }
}
