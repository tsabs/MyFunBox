package com.example.bst.myfunbox.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.content.Context
import android.media.MediaPlayer
import android.support.design.widget.FloatingActionButton
import android.util.Log
import android.support.v7.app.AppCompatActivity
import android.view.*
import android.view.View.generateViewId
import android.view.View.inflate
import android.widget.*
import com.example.bst.myfunbox.R
import com.example.bst.myfunbox.adapter.MyAdapterR
import com.example.bst.myfunbox.model.Citation
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_rick.*
import kotlinx.android.synthetic.main.rick_button.*
import java.lang.ref.WeakReference


/**
 * A simple [Fragment] subclass.
 */
class RickFragment : Fragment() {

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
        val root = inflater!!.inflate(R.layout.fragment_rick, container, false)

        return root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list : ArrayList<Citation> = arrayListOf()
        list.add(Citation("Here just for create button"))
        list.add(Citation("unsless for now"))
        list.add(Citation("unsless for now"))

        view!!.findViewById<ListView>(R.id.listViewR).adapter = MyAdapterR(WeakReference(context), list)
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
