package fr.univ.cotedazur.iut.info.savin.android

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabString : Array<String> = arrayOf<String>()
        lateinit var tabChars : Array<AngelBeatsChars>

        val imgKanade : Drawable? = getDrawable(R.drawable.kanade_anime)
        val descKanade : String = "Kanade est la présidente du conseil des étudiants. Elle est chargée de stopper les activités perturbatrices au sein de l'école"
        val imgYuzuru : Drawable? = getDrawable(R.drawable.yuzuru_anime)
        val descYuzuru : String = "Yuzuru a une personnalité bienveillante et ne veut pas que quiconque ressente de la douleur ou de la tristesse"
        val imgYuri : Drawable? = getDrawable(R.drawable.yuri_anime)
        val descYuri : String = "Yuri a une personnalité déterminée et invite Otonashi à rejoindre son organisation qu'elle a fondée menant une lutte contre Dieu"

        val Kanade : AngelBeatsChars = AngelBeatsChars("Kanade Tachibana", imgKanade, descKanade)
        val Yuzuru : AngelBeatsChars = AngelBeatsChars("Yuzuru Otanashi", imgYuzuru, descYuzuru)
        val Yuri : AngelBeatsChars = AngelBeatsChars("Yuri Nakamura", imgYuri, descYuri)

        tabChars = arrayOf<AngelBeatsChars>(Kanade, Yuzuru, Yuri)

        angelBeatsCharsRecyclerView.layoutManager = LinearLayoutManager(this)
        angelBeatsCharsRecyclerView.adapter = AngelBeatsCharsAdapter(tabChars)
    }
}