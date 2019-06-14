package com.ites.marca;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class EnvioInternacionalActivity extends AppCompatActivity implements OnClickListener {

    ImageView llamar;
    ImageView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio_internacional);

        llamar = findViewById(R.id.txt_llamar);
        llamar.setOnClickListener(this);
        web = findViewById(R.id.txt_web);
        web.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txt_llamar:
                llamarPorTelefono();
                break;
            case R.id.txt_web:
                irWeb();
                break;
        }
    }

    private void irWeb() {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fedex.com"));
        startActivity(i);
    }

    private void llamarPorTelefono() {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel://0800-888-5454"));
        startActivity(i);
    }

}
