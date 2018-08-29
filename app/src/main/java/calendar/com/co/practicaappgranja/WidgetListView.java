package calendar.com.co.practicaappgranja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class WidgetListView extends AppCompatActivity {

    ListView listViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_list_view);
        initComponents();
        loadInfo();
    }

    public void initComponents(){
       listViewInfo = (ListView) findViewById(R.id.listViewInfo);
    }

    public void loadInfo() {
        final String[] array = {"Item 1","Item 2","Item 3"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        listViewInfo.setAdapter(arrayAdapter);
        listViewInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),array[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
