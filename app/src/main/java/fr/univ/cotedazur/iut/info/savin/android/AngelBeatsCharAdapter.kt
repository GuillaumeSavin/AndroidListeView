package fr.univ.cotedazur.iut.info.savin.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.character_and_description.view.*

class AngelBeatsCharsAdapter(val chars: Array<AngelBeatsChars>) : RecyclerView.Adapter<AngelBeatsCharsAdapter.ViewHolder>() {
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindAngelBeatsChars(angelBeatsChars: AngelBeatsChars) {
            with(angelBeatsChars) {
                itemView.angelBeatsCharsTxt.text = angelBeatsChars._nom
                itemView.angelBeatsCharsImg.setImageDrawable(angelBeatsChars._img)
                itemView.angelBeatsCharsDesc.text = angelBeatsChars._description
            }
        }
    }

    override fun getItemCount(): Int = chars.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView = LayoutInflater.from(parent.context).inflate(R.layout.character_and_description, parent, false)

        return ViewHolder(lineView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAngelBeatsChars(chars[position])
    }
}