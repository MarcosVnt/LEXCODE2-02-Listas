package it.escuela.lexdroid2.clase2.lexcode2_02_listas;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    //1
    /*static final String[] Nombres = new String[]{"Jose1","Jose2","Jose3",
            "Jose4","Jose5","Jose6","Jose7","Jose8",
            "Jose9","Jose10"};
*/
    //2adaptadores recorrer array intermediario : coloca los datos que pasamos en el array
    //2para personalizar primero definir



   // ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1));
        listView = getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT.show();

            }
        });*/

        Alumnos alumnos_datos[] new Alumnos[]{
                new Alumnos(android.R.drawable.ic_launcher, "Jose1"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose2"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose3"),
                new Alumos(android.R.drawable.ic_launcher, "Jose4"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose5"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose6"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose7"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose8"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose9"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose10"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose11"),
                new Alumnos(android.R.drawable.ic_launcher, "Jose12")

        };
       AlumnosAdapter adapter = new AlumnosAdapter(this, R.layout.listview_item,row, alumnos_datos);

        listView = (ListView) findViewById(R.id.listView);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row,null);
        listView.addHeaderView(header);
        litView.setAdapter(adapter);
    }
}
