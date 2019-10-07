package mx.edu.tesoem.isc.karm.pfkarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuP extends AppCompatActivity implements View.OnClickListener {

    Button btn,btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_p);

        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn1=(Button) findViewById(R.id.button2);
        btn1.setOnClickListener(this);
        btn2=(Button) findViewById(R.id.button3);
        btn2.setOnClickListener(this);
        btn3=(Button) findViewById(R.id.button4);
        btn3.setOnClickListener(this);
        btn4=(Button) findViewById(R.id.button5);
        btn4.setOnClickListener(this);
        btn5=(Button) findViewById(R.id.button6);
        btn5.setOnClickListener(this);
        btn6=(Button) findViewById(R.id.button7);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==btn.getId()){
            Intent Tor=new Intent(this,Tor.class);
            startActivity(Tor);
            finish();
        }
        if (v.getId()==btn1.getId()){
            Intent Meta = new Intent(this,Metasploitable.class);
            startActivity(Meta);
            finish();
        }
        if (v.getId()==btn2.getId()){
            Intent Command = new Intent(this,CommandInjection.class);
            startActivity(Command);
            finish();
        }
        if (v.getId()==btn3.getId()){
            Intent Autentico = new Intent(this,Autenticacion.class);
            startActivity(Autentico);
            finish();
        }
        if (v.getId()==btn4.getId()){
            Intent Web = new Intent(this,Websploit.class);
            startActivity(Web);
            finish();
        }
        if (v.getId()==btn5.getId()){
            Intent Info=new Intent(this,Info.class);
            startActivity(Info);
            finish();
        }
        if (v.getId()==btn6.getId()){
            Intent Infor=new Intent(this,Informes.class);
            startActivity(Infor);
            finish();
        }
    }
}
