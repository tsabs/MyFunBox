package com.example.bst.myfunbox.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.bst.myfunbox.R
import com.example.bst.myfunbox.adapter.MyAdapterA
import com.example.bst.myfunbox.adapter.MyAdapterR
import com.example.bst.myfunbox.model.Citation
import kotlinx.android.synthetic.main.asterix_button.*
import java.lang.ref.WeakReference


/**
 * A simple [Fragment] subclass.
 */
class AsterixFragment : Fragment() {

    val TAG = "Fragment One"

    override fun onAttach(context: Context?) {
        Log.d(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_asterix, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list : ArrayList<Citation> = arrayListOf()
        list.add(Citation("C'est quoi cette porte au plafond ?!", R.raw.rr1))
        list.add(Citation("Another citation !",1))
//        list.add(Citation(buttonA.setText("C'est quoi cette porte au plafond")))


        view!!.findViewById<ListView>(R.id.listViewA).adapter = MyAdapterA(WeakReference(context), list)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }

}// Required empty public constructor
