package com.miniproject.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast

class Home : AppCompatActivity(), Bottom.ButtonListener {


    var bottomFragment : Bottom? = null
    var mcd : ImageView? = null
    var dominos : ImageView? = null
    var appetite : ImageView? = null
    var sarovar: ImageView? = null
    var shivsagarThali:ImageView? = null
    var lapinoz:ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        supportActionBar!!.hide()

        dominos = findViewById(R.id.dominosOffers)
        mcd = findViewById(R.id.mcdOffers)
        appetite = findViewById(R.id.appetiteOffers)
        sarovar = findViewById(R.id.sarovarzOffers)

        mcd?.setOnClickListener(){
            Toast.makeText(this@Home,"Macdonald's", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ResturantList::class.java)
            intent.putExtra("RESTOOFFERS",0)
            startActivity(intent)
        }
        dominos?.setOnClickListener(){
            Toast.makeText(this@Home,"Dominos", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ResturantList::class.java)
            intent.putExtra("RESTOOFFERS",1)
            startActivity(intent)
        }
        appetite?.setOnClickListener(){
            Toast.makeText(this@Home,"The Appetite Momos", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ResturantList::class.java)
            intent.putExtra("RESTOOFFERS",7)
            startActivity(intent)
        }
        sarovar?.setOnClickListener(){
            Toast.makeText(this@Home,"Hotel Sarovar", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ResturantList::class.java)
            intent.putExtra("RESTOOFFERS",5)
            startActivity(intent)
        }

        bottomFragment = Bottom.newInstance(1)
        bottomFragment!!.listener = this

        val fragmentTransaction =  supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.bottom_fragment,bottomFragment!!)
        fragmentTransaction.commit()

    }
    override fun buttonSelected(index: Int) {
        when(index){
            R.id.home_buttonFragment->{
                Log.e("homeActivity","home_button")
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
            R.id.reasturantLis_buttonFragment->{
                Log.e("resturantList","resto_button")
                val intent = Intent(this, ResturantList::class.java)
                startActivity(intent)
            }
            R.id.acc_buttonFragment->{
                Log.e("resturantList","resto_button")

            }
        }

    }
}
