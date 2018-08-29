package calendar.com.co.practicaappgranja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends AppCompatActivity {
    ListView listViewGuia;
    CusAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        initComponents();
        loadGuia();
    }

    private void loadGuia(){
        final List<ItemGuia> listaGuia = new ArrayList<>();
        listaGuia.add(new ItemGuia(R.drawable.carmen,"El Carmen","La tierra de la loza"));
        listaGuia.add(new ItemGuia(R.drawable.pp,"El Peñol","La tierra de la piedra del peñol"));
        listaGuia.add(new ItemGuia(R.drawable.sancarlos,"San Carlos","La tierra del agua"));
        customAdapter = new CusAdapter(this,listaGuia);
        listViewGuia.setAdapter(customAdapter);
        listViewGuia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),listaGuia.get(i).getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void initComponents(){
        listViewGuia = (ListView) findViewById(R.id.listViewCustomAdapter);

    }
}
