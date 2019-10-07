package mx.edu.tesoem.isc.karm.pfkarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Metasploitable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metasploitable);
    }
    public void pantalla2(View v){
        Intent atras=new Intent(this,MenuP.class);
        startActivity(atras);
        finish();
    }
}
