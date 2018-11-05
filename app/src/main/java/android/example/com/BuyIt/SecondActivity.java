package android.example.com.BuyIt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
//TextViews correspondientes a los articulos
    public static final String EXTRA_MESSAGE = "android.example.com.BuyIt.extra.MESSAGE";
    private TextView appwatc;
    private TextView aud;
    private TextView lapt;
    private TextView corn;
    private TextView drone;
    private TextView cam;
    private TextView discod;
    private TextView ps4;
    private TextView xbox;
    private TextView tablet;
    private TextView pendr;
    private TextView tv;
    private TextView rout;
    private TextView swit;
    private TextView repet;
    private TextView imp;
    private TextView mouse;
    private TextView pbank;
    private TextView cel;
    private TextView pc;

    public SecondActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        appwatc = (TextView) findViewById(R.id.apple_watch);
        aud = (TextView) findViewById(R.id.audifonos);
        lapt = (TextView) findViewById(R.id.laptop);
        corn = (TextView) findViewById(R.id.corneta);
        drone = (TextView) findViewById(R.id.drone);
        cam = (TextView) findViewById(R.id.camara);
        discod = (TextView) findViewById(R.id.discoduro);
        ps4 = (TextView) findViewById(R.id.ps4);
        xbox = (TextView) findViewById(R.id.xbox);
        tablet = (TextView) findViewById(R.id.tablet);
        pendr = (TextView) findViewById(R.id.pendrive);
        tv = (TextView) findViewById(R.id.tv);
        rout = (TextView) findViewById(R.id.router);
        swit = (TextView) findViewById(R.id.conmutador);
        repet = (TextView) findViewById(R.id.repetidor);
        imp = (TextView) findViewById(R.id.impresora);
        mouse = (TextView) findViewById(R.id.mouse);
        pbank = (TextView) findViewById(R.id.powerbank);
        cel = (TextView) findViewById(R.id.celular);
        pc = (TextView) findViewById(R.id.pc);
    }

    //Metodos de seleccion para cada articulo. Pasa a la actividad principal y lo muestra.
    public void compraAw(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart1 = appwatc.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart1);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraAud(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart2 = aud.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart2);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraLap(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart3 = lapt.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart3);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraCor(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart4 = corn.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart4);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraDrone(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart5 = drone.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart5);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraCam(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart6 = cam.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart6);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraDisc(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart7 = discod.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart7);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraPs4(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart8 = ps4.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart8);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraXbox(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart9 = xbox.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart9);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraTab(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart10 = tablet.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart10);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraPend(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart11 = pendr.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart11);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraTv(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart12 = tv.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart12);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraRout(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart13 = rout.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart13);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraConmu(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart14 = swit.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart14);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraRep(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart15 = repet.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart15);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraImp(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart16 = imp.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart16);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraMou(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart17 = mouse.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart17);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraPow(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart18 = pbank.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart18);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraCel(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart19 = cel.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart19);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraPc(View view) {
        Toast.makeText(SecondActivity.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart20 = pc.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart20);
        setResult(RESULT_OK,addintent);
        finish();
    }
}