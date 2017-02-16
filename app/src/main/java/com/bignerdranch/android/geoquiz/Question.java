package com.bignerdranch.android.geoquiz;

/**
 * Created by slb on 2016/12/9.
 */

public class Question {
    private int mTextResId;

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    private boolean mAnswerTrue;

    public  Question(int textResId,boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
