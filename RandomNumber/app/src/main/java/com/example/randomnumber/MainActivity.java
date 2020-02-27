package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

/*Since I dont have time to fully code and create the project since I wasted the majority of my time
* on the code below, Ill just document my thoughts here.  I initially thought that the below code
* was required as it was in teh previous assignments but seeing as we only have 1 answer with
* multiple numbers, I scrapped it, I believe my random generator along with my user input works
* however my equals statement wont work properly.  I did figure out how to use a custom picture for
* my correct and incorrect answers, althought the incorrect answer would show later.  I understand
* what would be required by making the second activity that included the back button along with the
* correct answer toast or incorrect, which would require intent to be used to ferry the answers,
* user input, and other data over to the other activity.*/

public class MainActivity extends AppCompatActivity {
    private Button mPlayButton;
    private Button mBackButton;
    EditText answer_box = (EditText) findViewById(R.id.answer_box);
    String useranswer = answer_box.getText().toString();
    Random ranGen = new Random();
    String ranNum = ranGen.nextInt(5, 1) + 1;
    if useranswer.equals(ranNum)
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random ranGen = new Random();
        int ranNum = ranGen.nextInt(5, 1) + 1;

    }

/*Over thought and wasted the majority on my time on trying to get the code below to work
* after rethinking the assignment, I ended up scrapping this as it wasnt at all applicable
* I'll put further documentation in this file as well.*/


/*    private void checkAnswer(boolean userTrue) {
        boolean ismAnswerTrue = CorrectNumber.isAnswerTrue();
        int messageResId = 0;
        if (userTrue == ismAnswerTrue) {
            messageResId = R.string.correct_toast;
        }
        else {
            messageResId = R.string.incorrect_toast;
        }
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
    }*/

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = (Button) findViewById(R.id.play_button);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });
    }*/
}
