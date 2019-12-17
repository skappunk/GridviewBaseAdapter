package mx.edu.tesoem.isc.karr.gridviewbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;

    ArrayList<String> arreglo= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvdatos);
        Contenido contenidoobj= new Contenido(arreglo, this);
        arreglo.add("kevin");
        arreglo.add("triton");
        arreglo.add("juanero");
        arreglo.add("nash");
        arreglo.add("rene");
        arreglo.add("diiego");
        arreglo.add("eltri");
        arreglo.add("juanavitas");

    }
}
