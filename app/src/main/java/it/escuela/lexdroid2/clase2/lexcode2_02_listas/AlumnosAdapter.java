package it.escuela.lexdroid2.clase2.lexcode2_02_listas;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by marcos on 14/11/2015.
 */
public class AlumnosAdapter extends ArrayAdapter<Alumnos> {

    Context context;
    int layoutResouceId;
    Alumnos data[] = null;
    //constructor
    public AlumnosAdapter(Context context,int layoutResourceId, Alumnos[] data ){
        super(context, layoutResourceId, data);

        this.context = context;
        this.layoutResouceId = layoutResourceId;
        this.data = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        // holder mantenimiento una lista con muchos registros
        // todo esto lo hacia el arrayadapter ahora lo hacemos nosostros por personalizarlo

        View row = convertView;
        AlumnosHolder holder =null;

        if(row= null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row=inflater.inflate(layoutResouceId,parent,false);
            holder = new Alumnos Holder();
            holder.image = (ImageView)row.findViewById(R.id.image);
            holder.text = (TextView) row.findViewById(R.id.text);
            row.setTag(holder);

        }else{
            holder = (AlumnosHolder)row.getTag();
        }

        Alumnos alumnos = data[position];
        holder.text.setText(alumnos.title);
        holder.image.setImageResource(alumnos.icon);

        return true;
    }

    static class  AlumnosHolder{
        ImageView image;
        TextView text;
    }
    
}
