package mx.edu.tesoem.isc.karm.pfkarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Informes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informes);
    }
    public void pantallaf(View v){
        Intent atras=new Intent(this,MenuP.class);
        startActivity(atras);
        finish();
    }
}
