package com.sinaapp.yinizhizhublog.assignment1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button trueButton;
    private Button falseButton;
    private TextView questionView;
    private TextView resultView;
//    private Button nextButton;

    private TrueFalse[] QuestionBank= new TrueFalse[]{
            new TrueFalse(R.string.question_oceans, true),
            new TrueFalse(R.string.question_mideast, false),
            new TrueFalse(R.string.question_africa, false),
            new TrueFalse(R.string.question_americas, true),
            new TrueFalse(R.string.question_asia, true),
    };

    private int currentIndex = 0;

    private void updateQuestion(){
        int question = QuestionBank[currentIndex].getQuestion();
        questionView.setText(question);
        resultView.setText(R.string.result_null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionView = (TextView)findViewById(R.id.questionView);
        int question = QuestionBank[currentIndex].getQuestion();
        questionView.setText(question);
        resultView = (TextView)findViewById(R.id.resultView);

        trueButton = (Button)findViewById(R.id.true_button);
        falseButton = (Button)findViewById(R.id.false_button);

        questionView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % QuestionBank.length;
//                int question = QuestionBank[currentIndex].getQuestion();
//                questionView.setText(question);
                updateQuestion();
            }
        });
//        nextButton = (Button)findViewById(R.id.nextButton);
//        nextButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                currentIndex = (currentIndex + 1) % QuestionBank.length;
////                int question = QuestionBank[currentIndex].getQuestion();
////                questionView.setText(question);
//                updateQuestion();
//            }
//        });

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionBank[currentIndex].isTrueQuestion() == true){
                    resultView.setText(R.string.correct_toast);
                }
                else{
                    resultView.setText(R.string.incorrect_toast);
                }
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionBank[currentIndex].isTrueQuestion() == false){
                    resultView.setText(R.string.correct_toast);
                }
                else{
                    resultView.setText(R.string.incorrect_toast);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
