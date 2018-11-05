package android.example.com.BuyIt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    int count = 1;


    private TextView m1;
    private TextView m2;
    private TextView m3;
    private TextView m4;
    private TextView m5;
    private TextView m6;
    private TextView m7;
    private TextView m8;
    private TextView m9;
    private TextView m10;
    private TextView m11;
    private TextView m12;
    private TextView m13;
    private TextView m14;
    private TextView m15;
    private TextView m16;
    private TextView m17;
    private TextView m18;
    private TextView m19;
    private TextView m20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = (TextView) findViewById(R.id.text_message_reply);
        m2 = (TextView) findViewById(R.id.text_message_reply2);
        m3 = (TextView) findViewById(R.id.text_message_reply3);
        m4 = (TextView) findViewById(R.id.text_message_reply4);
        m5 = (TextView) findViewById(R.id.text_message_reply5);
        m6 = (TextView) findViewById(R.id.text_message_reply6);
        m7 = (TextView) findViewById(R.id.text_message_reply7);
        m8 = (TextView) findViewById(R.id.text_message_reply8);
        m9 = (TextView) findViewById(R.id.text_message_reply9);
        m10 = (TextView) findViewById(R.id.text_message_reply10);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent (this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }


    public void onActivityResult(int requestCode, int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);

    }

}
