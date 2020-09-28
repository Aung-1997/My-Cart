package com.myanmaritc.mycart.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.mycart.R
import com.myanmaritc.mycart.model.Food
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(var foodlist:ArrayList<Food>):RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){
    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(food: Food){
            itemView.txtName.text=food.name
            itemView.numPrice.text= food.price.toString()
            itemView.txtWeight.text=food.weight.toString()
            itemView.imgFood.setImageResource(food.image)




        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_food,parent,false)
        return FoodViewHolder(view)

    }

    override fun getItemCount(): Int =foodlist.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(foodlist[position])

    }


}