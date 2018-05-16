package com.missouristate.davis916.flipcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Laura Davis CIA262-902
 * 2 March 2018
 */

public class AnswerActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Button questionBtn = (Button)findViewById(R.id.button2);
        questionBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent showQuestion = new Intent(AnswerActivity.this,
                        QuestionActivity.class);
                startActivity(showQuestion);
            }//end onClick
        });
    }//end onCreate()

    @Override
    protected void onStart(){
        super.onStart();
        overridePendingTransition(R.anim.answer_out, R.anim.question_in);
    }//end onStart()

}//end AnswerActivity class
