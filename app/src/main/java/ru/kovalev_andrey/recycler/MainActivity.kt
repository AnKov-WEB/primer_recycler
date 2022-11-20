package ru.kovalev_andrey.recycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.kovalev_andrey.recycler.adapters.MainAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    //private lateinit var mainList: ArrayList<MainModel>

    var programNameList = arrayOf(
        "Заголовок первый",
        "Заголовок второй"
    )
    var programDescriptionList = arrayOf(
        "Кратенькое описание\nблока один",
        "Кратенькое описание\nблока два"
    )

    var programImages = intArrayOf(
        R.drawable.removebg_1, R.drawable.removebg_1
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mainList = arrayListOf<MainModel>()

        recyclerView = findViewById(R.id.unitRecycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // другой вариант ---------------------------------
        val mainAdapter = MainAdapter(programNameList, programDescriptionList, programImages);
        recyclerView.adapter = mainAdapter
        // другой вариант ---------------------------------

        /*mainList.add(MainModel(
            "Заголовок первый",
            "Кратенькое описание\nблока один"))

        mainList.add(MainModel(
            "Заголовок второй",
            "Кратенькое описание\nблока два"))*/

        //val adapter = MainAdapter(mainList)
        //recyclerView.adapter = adapter
    }
}