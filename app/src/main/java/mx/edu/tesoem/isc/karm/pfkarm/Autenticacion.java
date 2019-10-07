package mx.edu.tesoem.isc.karm.pfkarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Autenticacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacion);
    }
    public void pantalla4(View v){
        Intent atras=new Intent(this,MenuP.class);
        startActivity(atras);
        finish();
    }
}
