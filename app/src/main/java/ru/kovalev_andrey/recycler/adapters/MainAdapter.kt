package ru.kovalev_andrey.recycler.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.kovalev_andrey.recycler.R


class MainAdapter(
    //private var mainList: ArrayList<MainModel>
    private var programNameList: Array<String>,
    private var programDescriptionList: Array<String>,
    private var programImages: IntArray
    ): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.unit_list_item, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.headerText.text = programNameList[position]
        //holder.headerText.text = mainList[position].header
        holder.subtitleText.text = programDescriptionList[position]
        //holder.subtitleText.text = mainList[position].subtitle
        holder.imageView.setImageResource(programImages[position])
    }

    override fun getItemCount(): Int {
        return programNameList.size
        //return mainList.size
    }

    /*
    fun setList(list: List<MainModel>) {
        mainList = list
        notifyDataSetChanged()
    }
    */

    class MainViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val headerText: TextView = view.findViewById(R.id.headerText)
        val subtitleText: TextView = view.findViewById(R.id.subtitleText)
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }
}