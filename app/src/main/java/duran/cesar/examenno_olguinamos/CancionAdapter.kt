package duran.cesar.examenno_olguinamos

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.log

class CancionAdapter(

    var listaCanciones: List<Cancion>,

    ): RecyclerView.Adapter<CancionAdapter.ViewHolder>(){

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        val tvName: TextView = itemView.findViewById(R.id.tvNombre)
        val tvArtista: TextView = itemView.findViewById(R.id.tvArtista)
        val btnAccionDetail: LinearLayout = itemView.findViewById(R.id.lyItemCancion)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CancionAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CancionAdapter.ViewHolder, position: Int) {

       var cancion = listaCanciones[position]


        holder.tvName.text = cancion.nombre
        holder.tvArtista.text = cancion.artista


    }


    override fun getItemCount(): Int {

        return listaCanciones.size

    }



}