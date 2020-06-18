package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public  void submit(View view){

        float ratingValue = ratingBar.getRating();

        if (ratingValue<1){
            textView.setText("Rating: " + ratingValue + "\nWe will try our best nest Time");
        }else if(ratingValue>=1&&ratingValue<2){
            textView.setText("Rating: " +  ratingValue + "\nWe will surely improve next time");
        }
        else if(ratingValue<=3 && ratingValue>=2){
            textView.setText("Rating: " +  ratingValue + "\nWe are constantly Improving");
        }else if(ratingValue>3 && ratingValue<=4){
            textView.setText("Rating: " +  ratingValue + "\nThanks for your valuable feedback");
        }
        else if(ratingValue>4 && ratingValue<=5){
            textView.setText("Rating: " +  ratingValue + "\nThankyou!!!");
        }else{
            textView.setText("Rating: " +  ratingValue + "\nPlease Give your rating:)");
        }




    }
}
