package com.desarrollodeaplicaciones.reciclerviewcardview;

        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

/**
 * Created by Usuario on 06/02/2017.
 */

public class ProductoAdaptador extends RecyclerView.Adapter<ProductoAdaptador.ProductoViewHolder>{
    private ArrayList<ClsProducto> item;

    public ProductoAdaptador(ArrayList<ClsProducto> item) {
        this.item = item;
    }

    @Override
    public ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_productos,parent,false);
        ProductoViewHolder producto = new ProductoViewHolder(v);
        return producto;
    }

    @Override
    public void onBindViewHolder(ProductoViewHolder holder, int i) {
        holder.nombre.setText(item.get(i).getNombre_p());
        holder.precio.setText(item.get(i).getPrecio_p());
        holder.imagen.setImageResource(item.get(i).getImagen_p());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ProductoViewHolder extends RecyclerView.ViewHolder{
        TextView nombre, precio;
        ImageView imagen;
        public ProductoViewHolder(View itemView){
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.lblNombre);
            precio=(TextView)itemView.findViewById(R.id.lblPrecio);
            imagen=(ImageView)itemView.findViewById(R.id.imgProducto);

        }

    }
}
