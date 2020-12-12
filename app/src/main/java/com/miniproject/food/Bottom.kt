package com.miniproject.food


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

/**
 * A simple [Fragment] subclass.
 */
class Bottom : Fragment(), View.OnClickListener {

    var home_buttonFragment : ImageView? = null
    var reasturantLis_buttonFragment : ImageView? = null
    var acc_buttonFragment : ImageView? = null

    var screenType = -1


    interface ButtonListener{
        fun buttonSelected(index : Int)
    }
    var listener : ButtonListener? = null

    companion object{
        fun newInstance(screenType : Int): Bottom{
            var fragment = Bottom()

            var args = Bundle()
            args.putInt("screenType", screenType)
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bottom, container, false)

        home_buttonFragment = view.findViewById(R.id.home_buttonFragment)
        reasturantLis_buttonFragment = view.findViewById(R.id.reasturantLis_buttonFragment)
        acc_buttonFragment = view.findViewById(R.id.acc_buttonFragment)

        screenType = arguments!!.getInt("screenType")

        if (screenType !=1){

            home_buttonFragment!!.visibility = View.VISIBLE
            reasturantLis_buttonFragment!!.visibility = View.VISIBLE
            acc_buttonFragment!!.visibility = View.VISIBLE
        }
        else if (screenType==2){
            home_buttonFragment!!.visibility = View.VISIBLE
            reasturantLis_buttonFragment!!.visibility = View.GONE
            acc_buttonFragment!!.visibility = View.VISIBLE
        }
        else{
            home_buttonFragment!!.setOnClickListener(this)
            reasturantLis_buttonFragment!!.setOnClickListener(this)
            acc_buttonFragment!!.setOnClickListener(this)
        }
        return view

    }
    override fun onClick(v : View?){
        if (listener != null){
            listener!!.buttonSelected(v!!.id)
        }

    }


}
