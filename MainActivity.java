package com.sinaapp.yinizhizhublog.firstapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

//    private TextView textView;
//    private Button button;
//    int count = 0;

//    private CheckBox eatBox;
//    private CheckBox sleepBox;
//    private CheckBox lolBox;
//    private CheckBox allCheckBox;

//    private RadioGroup radioGroup;
//    private RadioButton femaleButton;
//    private RadioButton maleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_imageview);

//        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
//        femaleButton = (RadioButton)findViewById(R.id.femaleButton);
//        maleButton = (RadioButton)findViewById(R.id.maleButton);
//
//        maleButton.setChecked(true);
//
//        RadioGroupListener listener = new RadioGroupListener();
//        radioGroup.setOnCheckedChangeListener(listener);

//        eatBox = (CheckBox)findViewById(R.id.eatBox);
//        sleepBox = (CheckBox)findViewById(R.id.sleepBox);
//        lolBox = (CheckBox)findViewById(R.id.lolBox);
//        allCheckBox = (CheckBox)findViewById(R.id.allCheckBox);
//
//        AllCheckListener listener = new AllCheckListener();
//        allCheckBox.setOnCheckedChangeListener(listener);

//        setContentView(R.layout.activity_main);
//
//        textView = (TextView)findViewById(R.id.textView);
//        button = (Button)findViewById(R.id.button);
//
//        ButtonListener buttonListener = new ButtonListener();
//        button.setOnClickListener(buttonListener);
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

//    class ButtonListener implements View.OnClickListener{
//        @Override
//        public void onClick(View V){
//            count++;
//            textView.setText(count + "");
//        }
//    }

//    class AllCheckListener implements CompoundButton.OnCheckedChangeListener{
//        @Override
//        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
//            eatBox.setChecked(isChecked);
//            sleepBox.setChecked(isChecked);
//            lolBox.setChecked(isChecked);
//        }
//    }

//    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener{
//        @Override
//        public void onCheckedChanged(RadioGroup group, int checkedId) {
//            if (checkedId == R.id.femaleButton){
//                System.out.println("You are the female!");
//            }
//            else{
//                System.out.println("You are the male!");
//            }
//        }
//    }
}
