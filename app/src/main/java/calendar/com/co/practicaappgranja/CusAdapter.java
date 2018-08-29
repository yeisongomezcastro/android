package calendar.com.co.practicaappgranja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class CusAdapter extends BaseAdapter{

    Context context;
    List<ItemGuia> listaItem;
    LayoutInflater inflater;

    public CusAdapter(Context context, List<ItemGuia> listaItem){
        this.context=context;
        this.listaItem=listaItem;
        inflater= LayoutInflater.from(context);
    }

    class viewHolder{
        ImageView imageView;
        TextView txtTsitle;
        TextView txtDescripcion;
    }

    @Override
    public int getCount() {
        return listaItem.size();
    }

    @Override
    public ItemGuia getItem(int i) {
        return listaItem.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        viewHolder holder = null;
        if(view==null){
            holder= new viewHolder();
            view = inflater.inflate(R.layout.item_guia,null);
            holder.imageView=view.findViewById(R.id.imageViewCA);
            holder.txtDescripcion = view.findViewById(R.id.textDescription);
            holder.txtTsitle = view.findViewById(R.id.textTitle);
            view.setTag(holder);
        }else{
            holder =(viewHolder) view.getTag();
        }
        holder.imageView.setImageResource(listaItem.get(i).getImagen());
        holder.txtTsitle.setText(listaItem.get(i).getTitle());
        holder.txtDescripcion.setText(listaItem.get(i).getDescripcion()) ;
        return view;
    }
}
