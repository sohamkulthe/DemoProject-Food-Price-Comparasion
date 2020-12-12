package com.miniproject.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mcd.*
import kotlinx.android.synthetic.main.activity_resturant_list.*
import org.json.JSONArray
import java.io.InputStream

class ResturantList : AppCompatActivity(){

    var arr = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resturant_list)


        val restoPosition = intent.getIntExtra("RESTOOFFERS",-1)
        var listView_resturant = findViewById<ListView>(R.id.listView_resturant)
        var list = mutableListOf<Model>()

        if (restoPosition != -1){
            perform_action(restoPosition)
        }

        list.add(Model("Macdonalds","cost for two 200",R.drawable.mcda ))
        list.add(Model("Dominos","cost for two 300",R.drawable.domonos ))
        list.add(Model("ShivSagar","cost for two 300",R.drawable.dosa ))
        list.add(Model("LaPinoz","cost for two 200",R.drawable.lapinoz ))
        list.add(Model("Chinese Corner","cost for two 200",R.drawable.chinese ))
        list.add(Model("Sai Deep","cost for two 200",R.drawable.pavbhaji ))
        list.add(Model("Mamledar Misal","cost for two 150",R.drawable.mamledarmisal ))
        list.add(Model("The Appetite","cost For Two 200", R.drawable.the_appetite))

        listView_resturant.adapter = Adapter(this, R.layout.row,list)
       // read_json()
        //var restolist  = findViewById<ListView>(R.id.listView_resturant)

        listView_resturant.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id ->
            if (position== 0 ){
                Toast.makeText(this@ResturantList,"Macdonald's",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                intent.putExtra("hello","mcd.json")
                startActivity(intent)
            }
            if (position== 1 ){
                Toast.makeText(this@ResturantList,"Dominos",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                Log.e("Restolist","$position")
                intent.putExtra("hello",1)
                intent.putExtra("hello","dominos.json")
                startActivity(intent)
            }
            if (position== 2 ){
                Toast.makeText(this@ResturantList,"ShivSagar",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                intent.putExtra("hello",2)
                intent.putExtra("hello","shivsagar.json")
                startActivity(intent)
            }
            if (position== 3 ){
                Toast.makeText(this@ResturantList,"LaPinoz",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                intent.putExtra("hello",3)
                intent.putExtra("hello","lapinoz.json")
                startActivity(intent)
            }
            if (position== 4 ){
                Toast.makeText(this@ResturantList,"Chinese Corner",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                intent.putExtra("hello",4)
                intent.putExtra("hello","chinese.json")
                startActivity(intent)
            }
            if (position== 5 ){
                Toast.makeText(this@ResturantList,"Sai Deep",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                intent.putExtra("hello",5)
                intent.putExtra("hello","saideep.json")
                startActivity(intent)
            }
            if (position== 6 ){
                Toast.makeText(this@ResturantList,"Mamledar Misal",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                intent.putExtra("hello",6)
                intent.putExtra("hello","misal.json")
                startActivity(intent)
            }
            if (position== 7 ){
                Toast.makeText(this@ResturantList,"The Appetite",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DominosFoodList::class.java)
                intent.putExtra("hello",7)
                intent.putExtra("hello","appetite.json")
                startActivity(intent)
            }
        }


    }
    fun perform_action(restoPosition: Int){
        if (restoPosition== 0 ){
            Toast.makeText(this@ResturantList,"Mcd",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
            intent.putExtra("hello","mcd.json")
            startActivity(intent)
        }
        if (restoPosition== 1 ){
            Toast.makeText(this@ResturantList,"Dominos",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
           // Log.e("Restolist","$position")
            intent.putExtra("hello",1)
            intent.putExtra("hello","dominos.json")
            startActivity(intent)
        }
        if (restoPosition== 2 ){
            Toast.makeText(this@ResturantList,"ShivSagar",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
            intent.putExtra("hello",2)
            intent.putExtra("hello","shivsagar.json")
            startActivity(intent)
        }
        if (restoPosition== 3 ){
            Toast.makeText(this@ResturantList,"LaPinoz",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
            intent.putExtra("hello",3)
            intent.putExtra("hello","lapinoz.json")
            startActivity(intent)
        }
        if (restoPosition== 4 ){
            Toast.makeText(this@ResturantList,"Chinese Corner",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
            intent.putExtra("hello",4)
            intent.putExtra("hello","chinese.json")
            startActivity(intent)
        }
        if (restoPosition== 5 ){
            Toast.makeText(this@ResturantList,"Sai Deep",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
            intent.putExtra("hello",5)
            intent.putExtra("hello","saideep.json")
            startActivity(intent)
        }
        if (restoPosition== 6 ){
            Toast.makeText(this@ResturantList,"Mamledar Misal",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
            intent.putExtra("hello",6)
            intent.putExtra("hello","misal.json")
            startActivity(intent)
        }
        if (restoPosition== 7 ){
            Toast.makeText(this@ResturantList,"The Appetite",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DominosFoodList::class.java)
            intent.putExtra("hello",7)
            intent.putExtra("hello","appetite.json")
            startActivity(intent)
        }
    }
    /*
    fun read_json(){
        var json:String? = null
        val inputStream : InputStream = assets.open("resto.json")
        json = inputStream.bufferedReader().use{it.readText() }

        var jsonarr = JSONArray(json)

        for (i in 0..jsonarr.length()){
            var jsonobj = jsonarr.getJSONObject(i)
            arr.add(jsonobj.getString("firstName"))
        }
        var adpt = ArrayAdapter(this,R.layout.row,arr)
        listView_resturant.adapter = adpt
    }*/
}
