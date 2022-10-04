package com.example.gmailrecyclerview.adapter

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
import com.example.gmailrecyclerview.R
import com.example.gmailrecyclerview.model.Email
import kotlinx.android.synthetic.main.email_item.view.*


class EmailAdapter(val emails: MutableList<Email>) :
    RecyclerView.Adapter<EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    override fun getItemCount(): Int = emails.size


}

fun View.oval(@ColorInt color: Int): ShapeDrawable {
    val oval = ShapeDrawable(OvalShape())

    with(oval) {
        intrinsicHeight = height
        intrinsicWidth = width
        paint.color = color
    }

    return oval
}