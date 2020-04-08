package com.example.shoppinglist


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(9)

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<ExampleItem> {

        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable = when (i % 9){
                0 -> R.drawable.ic_omo
                1 -> R.drawable.ic_coke
                2 -> R.drawable.ic_fanta
                3 -> R.drawable.ic_custard
                4 -> R.drawable.ic_handwash
                5 -> R.drawable.ic_indomie
                6 -> R.drawable.ic_goldenmorn
                7 -> R.drawable.ic_facemask
                else -> R.drawable.ic_ribena

            }

            val item = ExampleItem(drawable, "Item $i", "Line 2")
            list += item
        }

        return list
    }
}


