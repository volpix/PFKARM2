package mx.edu.tesoem.isc.karm.pfkarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tor extends AppCompatActivity implements View.OnClickListener {

    Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tor);

        atras=(Button) findViewById(R.id.button8);
        atras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent atras=new Intent(this,MenuP.class);
        startActivity(atras);
        finish();
    }
}
