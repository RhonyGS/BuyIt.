package android.example.com.BuyIt;

import android.content.Intent;
import android.media.MediaPlayer;
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
        m11 = (TextView) findViewById(R.id.text_message_reply11);
        m12 = (TextView) findViewById(R.id.text_message_reply12);
        m13 = (TextView) findViewById(R.id.text_message_reply13);
        m14 = (TextView) findViewById(R.id.text_message_reply14);
        m15 = (TextView) findViewById(R.id.text_message_reply15);
        m16 = (TextView) findViewById(R.id.text_message_reply16);
        m17 = (TextView) findViewById(R.id.text_message_reply17);
        m18 = (TextView) findViewById(R.id.text_message_reply18);
        m19 = (TextView) findViewById(R.id.text_message_reply19);
        m20 = (TextView) findViewById(R.id.text_message_reply20);


        if (savedInstanceState != null) {

            boolean isVisible = savedInstanceState.getBoolean("reply_visible");

            if (isVisible) {

                m1.setText(savedInstanceState.getString("reply_m1"));
                m1.setVisibility(View.VISIBLE);

                m2.setText(savedInstanceState.getString("reply_m2"));
                m2.setVisibility(View.VISIBLE);

                m3.setText(savedInstanceState.getString("reply_m3"));
                m3.setVisibility(View.VISIBLE);

                m4.setText(savedInstanceState.getString("reply_m4"));
                m4.setVisibility(View.VISIBLE);

                m5.setText(savedInstanceState.getString("reply_m5"));
                m5.setVisibility(View.VISIBLE);

                m6.setText(savedInstanceState.getString("reply_m6"));
                m6.setVisibility(View.VISIBLE);

                m7.setText(savedInstanceState.getString("reply_m7"));
                m7.setVisibility(View.VISIBLE);

                m8.setText(savedInstanceState.getString("reply_m8"));
                m8.setVisibility(View.VISIBLE);

                m9.setText(savedInstanceState.getString("reply_m9"));
                m9.setVisibility(View.VISIBLE);

                m10.setText(savedInstanceState.getString("reply_m10"));
                m10.setVisibility(View.VISIBLE);

                m11.setText(savedInstanceState.getString("reply_m11"));
                m11.setVisibility(View.VISIBLE);

                m12.setText(savedInstanceState.getString("reply_m12"));
                m12.setVisibility(View.VISIBLE);

                m13.setText(savedInstanceState.getString("reply_m13"));
                m13.setVisibility(View.VISIBLE);

                m14.setText(savedInstanceState.getString("reply_m14"));
                m14.setVisibility(View.VISIBLE);

                m15.setText(savedInstanceState.getString("reply_m15"));
                m15.setVisibility(View.VISIBLE);

                m16.setText(savedInstanceState.getString("reply_m16"));
                m16.setVisibility(View.VISIBLE);

                m17.setText(savedInstanceState.getString("reply_m17"));
                m17.setVisibility(View.VISIBLE);

                m18.setText(savedInstanceState.getString("reply_m18"));
                m18.setVisibility(View.VISIBLE);

                m19.setText(savedInstanceState.getString("reply_m19"));
                m19.setVisibility(View.VISIBLE);

                m20.setText(savedInstanceState.getString("reply_m20"));
                m20.setVisibility(View.VISIBLE);
            }
        }
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent (this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }


    public void onActivityResult(int requestCode, int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {


            if (resultCode == RESULT_OK) {

                if(count==1){

                    String addart1 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m1.setText(addart1);
                }

                if(count==2){

                    String addart2 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m2.setText(addart2);
                }

                if(count==3){

                    String addart3 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m3.setText(addart3);
                }

                if(count==4){

                    String addart4 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m4.setText(addart4);
                }

                if(count==5){

                    String addart5 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m5.setText(addart5);
                }

                if(count==6){

                    String addart6 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m6.setText(addart6);
                }

                if(count==7){

                    String addart7 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m7.setText(addart7);
                }

                if(count==8){

                    String addart8 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m8.setText(addart8);
                }

                if(count==9){

                    String addart9 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m9.setText(addart9);
                }

                if(count==10){

                    String addart10 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m10.setText(addart10);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==11){

                    String addart11 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m11.setText(addart11);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==12){

                    String addart12 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m12.setText(addart12);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==13){

                    String addart13 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m13.setText(addart13);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==14){

                    String addart14 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m14.setText(addart14);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==15){

                    String addart15 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m15.setText(addart15);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==16){

                    String addart16 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m16.setText(addart16);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==17){

                    String addart17 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m17.setText(addart17);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==18){

                    String addart18 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m18.setText(addart18);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==19){

                    String addart19 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m19.setText(addart19);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                if(count==20){

                    String addart20 = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                    m10.setText(addart20);
                    Toast.makeText(MainActivity.this,   "Carrito lleno, compre ahora", Toast.LENGTH_SHORT).show();
                }

                count = count + 1;
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("reply_visible", true);

        outState.putString("reply_m1", m1.getText().toString());
        outState.putString("reply_m2", m2.getText().toString());
        outState.putString("reply_m3", m3.getText().toString());
        outState.putString("reply_m4", m4.getText().toString());
        outState.putString("reply_m5", m5.getText().toString());
        outState.putString("reply_m6", m6.getText().toString());
        outState.putString("reply_m7", m7.getText().toString());
        outState.putString("reply_m8", m8.getText().toString());
        outState.putString("reply_m9", m9.getText().toString());
        outState.putString("reply_m10", m10.getText().toString());
        outState.putString("reply_m11", m11.getText().toString());
        outState.putString("reply_m12", m12.getText().toString());
        outState.putString("reply_m13", m13.getText().toString());
        outState.putString("reply_m14", m14.getText().toString());
        outState.putString("reply_m15", m15.getText().toString());
        outState.putString("reply_m16", m16.getText().toString());
        outState.putString("reply_m17", m17.getText().toString());
        outState.putString("reply_m18", m18.getText().toString());
        outState.putString("reply_m19", m19.getText().toString());
        outState.putString("reply_m20", m20.getText().toString());



        outState.putInt("contador" ,count);
    }
}
