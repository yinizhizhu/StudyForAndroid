package com.sinaapp.yinizhizhublog.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Lee on 2015/12/27.
 */
public class CheatActivity extends Activity {
    public static final String EXTRA_ANSWER_IS_TRUE = "com.sinaapp.yinizhizhublog.assignment1.answer_is_true";
    private TextView answerTextView;
    private Button showAnswer;
    private boolean answerIsTrue;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        answerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        answerTextView = (TextView)findViewById(R.id.answerTextView);
        showAnswer = (Button)findViewById(R.id.showAnswerButton);
        showAnswer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (answerIsTrue){
                    answerTextView.setText(R.string.true_button);
                } else {
                    answerTextView.setText(R.string.false_button);
                }
            }
        });
    }
}
