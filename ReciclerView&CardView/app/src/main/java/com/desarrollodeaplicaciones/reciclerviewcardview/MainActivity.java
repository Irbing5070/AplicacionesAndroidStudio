package com.desarrollodeaplicaciones.reciclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ClsProducto> datos = new ArrayList<ClsProducto>();
        datos.add(new ClsProducto(R.drawable.memoria_ram, "Memoria Ram DDR3", "32 $us"));
        datos.add(new ClsProducto(R.drawable.tarjeta_madre, "Tarjeta Madre Asus", "112 $us"));
        datos.add(new ClsProducto(R.drawable.disco_duro, "Disco Duro 500Gb", "52 $us"));
        datos.add(new ClsProducto(R.drawable.procesador_i5, "Procesador Intel CoreI5", "187 $us"));
        datos.add(new ClsProducto(R.drawable.monitor, "Monitor Led 20", "100 $us"));
        datos.add(new ClsProducto(R.drawable.combo_delux, "Combo case Delux", "52 $us"));


        reciclador = (RecyclerView) findViewById(R.id.reciclador);
        lmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(lmanager);

        adaptador = new ProductoAdaptador(datos);
        reciclador.setAdapter(adaptador);
    }
}
