package com.miniproject.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_mcd.*
import org.json.JSONArray
import java.io.InputStream

class DominosFoodList : AppCompatActivity() {

    var foodName = arrayListOf<String>()
    var swigyPrice = arrayListOf<String>()
    var zomatoPrice = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dominos_food_list)


        //var value = intent.getStringExtra("hello")
        val position = intent.getIntExtra("hello",0)
        val filename = intent.getStringExtra("hello")
        Log.e("dominoFOod","$position")
        Log.e("dominoFOod","$filename")

        read_json(position, filename)
    }
    fun read_json(position : Int, filename: String)
    {
        var json:String? = null

        val inputStream : InputStream = assets.open("$filename")
        Log.e("dominoFOodlist","$filename")
        json = inputStream.bufferedReader().use{it.readText() }
        var jsonarr = JSONArray(json)

        for (i in 0..jsonarr.length()-1){
            var jsonobj = jsonarr.getJSONObject(i)
            foodName.add(jsonobj.getString("foodName"))
            swigyPrice.add(jsonobj.getString("swiggyPrice"))
            zomatoPrice.add(jsonobj.getString("zomatoPrice"))
        }
        var adpt = ArrayAdapter(this,android.R.layout.simple_list_item_1,foodName)
        var adptOne = ArrayAdapter(this,android.R.layout.simple_list_item_1,swigyPrice)
        var adptTwo = ArrayAdapter(this,android.R.layout.simple_list_item_1,zomatoPrice)
        McdListView.adapter = adpt
        price1ListView.adapter =adptOne
        price2ListView.adapter =adptTwo
        //return position
    }
}
