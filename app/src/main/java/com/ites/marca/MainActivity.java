package com.ites.marca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.ites.marca.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // getSupportActionBar().setDisplayShowTitleEnabled(false);
        // getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    @Override
    // Implemento el menu en la activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    // Cuando hago click en el menu disparo la acción según la opcion elegida
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.envio_internacional:
                inicioEnvioIntenarcional();
                break;
            case R.id.menu_condiciones:
                inicioCondiciones();
                break;
            case R.id.salir:
                salir();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    private void inicioEnvioIntenarcional() {
        Intent i = new Intent(this, EnvioInternacionalActivity.class);
        i.putExtra("PARAMETRO", "VALOR");
        startActivity(i);
    }

    private void inicioCondiciones() {
        Intent i = new Intent(this, CondicionesActivity.class);
        i.putExtra("PARAMETRO", "VALOR");
        startActivity(i);
    }

    private void salir() {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }
}
