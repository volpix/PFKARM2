package mx.edu.tesoem.isc.karm.pfkarm;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent principal=new Intent(MainActivity.this,MenuP.class);
                startActivity(principal);
                finish();

            }
        },1500);
    }
}

