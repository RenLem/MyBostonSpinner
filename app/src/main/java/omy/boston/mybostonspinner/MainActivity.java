package omy.boston.mybostonspinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spiny = (Spinner) findViewById(R.id.spinner);
        TextView teksty = (TextView) findViewById(R.id.textView);


        ArrayAdapter<CharSequence> nekiAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                                R.array.podatci,
                                                android.R.layout.simple_list_item_activated_1);
        spiny.setAdapter(nekiAdapter);

    }// onCreate the end!

    public void naKlik(View view){
        TextView teksty = (TextView) findViewById(R.id.textView);
        Spinner spiny = (Spinner) findViewById(R.id.spinner);

        teksty.setText((CharSequence) spiny.getSelectedItem());
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    /**Metoda za puvratak podataka**/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        qLog("Zabilježena je metoda - onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**Spremanje podataka**/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        qLog("Zabilježena je metoda - onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //Pračenje loga
    private void qLog(String logTekst){
        Log.d("napravi Log", logTekst);
    }
}
