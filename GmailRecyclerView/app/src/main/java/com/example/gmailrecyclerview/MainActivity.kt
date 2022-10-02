package com.example.gmailrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.UP
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailrecyclerview.model.email
import com.example.gmailrecyclerview.model.fakeEmails
import com.mooveit.library.Fakeit
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = EmailAdapter(fakeEmails())
        recycler_view_main.adapter = adapter //= EmailAdapter(fakeEmails())
        recycler_view_main.layoutManager = LinearLayoutManager(this)

        supportActionBar!!.hide()

        val helper =
            androidx.recyclerview.widget.ItemTouchHelper(
                ItemTouchHelper(
                    androidx.recyclerview.widget.ItemTouchHelper.UP
                            or androidx.recyclerview.widget.ItemTouchHelper.DOWN,
                    androidx.recyclerview.widget.ItemTouchHelper.LEFT)
            )

        helper.attachToRecyclerView(recycler_view_main)


    }

    inner class ItemTouchHelper(dragDirs: Int, swipeDirs: Int) :
        androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs) {

        //Movimentar
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean {
            val from: Int = viewHolder.adapterPosition //Posição origem
            val to: Int = target.adapterPosition //Posição Destino

            Collections.swap(adapter.emails, from, to)
            adapter.notifyItemMoved(from, to)
            return true

        }

        //Excluir
        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            adapter.emails.removeAt(viewHolder.adapterPosition)
            adapter.notifyItemRemoved(viewHolder.adapterPosition)
        }

    }


}


//Classe para ouvir os eventos de touch