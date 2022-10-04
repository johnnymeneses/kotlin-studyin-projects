package com.example.gmailrecyclerview.adapter

import android.graphics.Color
import android.graphics.Typeface
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailrecyclerview.model.Email
import kotlinx.android.synthetic.main.email_item.view.*

class EmailViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(email: Email) {

        with(email){
            val hash = user.hashCode()
            itemView.txt_icon.text = user.first().toString()
            itemView.txt_icon.background = itemView.oval(Color.rgb(hash, hash/2,0))

            itemView.txt_user.text = user
            itemView.txt_subject.text = subject
            itemView.txt_preview.text = preview
            itemView.txt_date.text = date

            itemView.txt_user.setTypeface(Typeface.DEFAULT, if (unread) Typeface.BOLD else Typeface.NORMAL)
            itemView.txt_subject.setTypeface(Typeface.DEFAULT, if (unread) Typeface.BOLD else Typeface.NORMAL)
            itemView.txt_date.setTypeface(Typeface.DEFAULT, if (unread) Typeface.BOLD else Typeface.NORMAL)

//                itemView.img_star.setImageResource(
//                    if(stared) com.google.android.material.R.drawable.abc_ic_star_black_16dp
//                     else          com.google.android.material.R.drawable.abc_ic_star_black_36dp
//                )



        }

    }
}