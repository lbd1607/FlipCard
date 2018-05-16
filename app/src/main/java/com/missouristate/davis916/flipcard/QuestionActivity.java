package com.missouristate.davis916.flipcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/*
* Laura Davis CIS 262-902
* 2 March 2018
*
*/

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Button answerBtn = (Button)findViewById(R.id.button);
        answerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showAnswer = new Intent(QuestionActivity.this,
                        AnswerActivity.class);
                startActivity(showAnswer);
            }//end onClick
        });
    }//end onCreate

    @Override
    protected void onStart(){
        super.onStart();
        overridePendingTransition(R.anim.question_out, R.anim.answer_in);
    }//end onStart

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }//end createOptionsMenu

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button,
        //as long as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }//end onOptionsItemSelected
}//end QuestionActivity class
