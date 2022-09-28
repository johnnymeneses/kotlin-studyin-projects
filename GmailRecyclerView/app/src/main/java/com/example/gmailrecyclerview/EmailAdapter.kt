package com.example.gmailrecyclerview

import android.graphics.Color
import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import android.graphics.Typeface.NORMAL
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailrecyclerview.model.Email
import kotlinx.android.synthetic.main.email_item.view.*

class EmailAdapter(val emails: List<Email>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    override fun getItemCount(): Int = emails.size


    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(email: Email) {

            with(email){
                val hash = user.hashCode()
                itemView.txt_icon.text = user.first().toString()
                itemView.txt_icon.background = itemView.oval(Color.rgb(hash, hash/2,0))

                itemView.txt_user.text = user
                itemView.txt_subject.text = subject
                itemView.txt_preview.text = preview
                itemView.txt_date.text = date

                itemView.txt_user.setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)
                itemView.txt_subject.setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)
                itemView.txt_date.setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)

//                itemView.img_star.setImageResource(
//                    if(stared) com.google.android.material.R.drawable.abc_ic_star_black_16dp
//                     else          com.google.android.material.R.drawable.abc_ic_star_black_36dp
//                )



            }

        }
    }
}

fun View.oval(@ColorInt color: Int): ShapeDrawable{
    val oval = ShapeDrawable(OvalShape())

    with(oval){
        intrinsicHeight = height
        intrinsicWidth = width
        paint.color = color
    }

    return oval
}