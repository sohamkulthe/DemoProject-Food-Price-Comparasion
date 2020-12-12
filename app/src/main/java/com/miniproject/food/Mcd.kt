package com.miniproject.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_mcd.*
import kotlinx.android.synthetic.main.activity_resturant_list.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.InputStream

class Mcd : AppCompatActivity() {

    var foodName = arrayListOf<String>()
    var swigyPrice = arrayListOf<String>()
    var zomatoPrice = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mcd)

        read_json()
        Log.e("mcdActivity","$foodName")
        Log.e("mcd","$swigyPrice")

    }


    fun read_json()
    {
        var json:String? = null
        val inputStream : InputStream = assets.open("resto.json")
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
    }

}
