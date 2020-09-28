package com.myanmaritc.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.mycart.Adapter.FoodAdapter
import com.myanmaritc.mycart.model.Food
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var foodList=ArrayList<Food>()
        foodList.add(Food("Fine Grain Suger",20.00,1,R.drawable.sugar))
        foodList.add(Food("Peanuts",20.00,1,R.drawable.peanaut))
        foodList.add(Food("Dawat Rice",80.00,3,R.drawable.dawat))
        var foodAdapter=FoodAdapter(foodList)
        foodRecycler.layoutManager= LinearLayoutManager(this)
        foodRecycler.adapter=foodAdapter

    }
}