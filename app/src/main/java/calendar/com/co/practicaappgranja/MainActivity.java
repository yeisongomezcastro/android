package calendar.com.co.practicaappgranja;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    Spinner spinner;

    private String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    private String[] lenguajes ={"c#","java","PHP","Pythom","scala","gosu","html"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intitComponents();
    }

    private void intitComponents(){
        spinner = (Spinner) findViewById(R.id.spinnerDias);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> arrayAdapterAutoComplete = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,lenguajes);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,dias);
        spinner.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(arrayAdapterAutoComplete);
        autoCompleteTextView.setTextColor(Color.RED);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),dias[i],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void intent(View view) {
        Intent intent = new Intent(this,WidgetListView.class);
        startActivity(intent);
    }

    public void customAdapter(View view) {
        Intent intent = new Intent(this,CustomAdapter.class);
        startActivity(intent);
    }
}
