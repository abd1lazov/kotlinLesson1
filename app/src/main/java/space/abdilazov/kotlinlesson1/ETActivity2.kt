package space.abdilazov.kotlinlesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_e_t2.*
import kotlinx.android.synthetic.main.activity_main.*

class ETActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_t2)

        val ii = intent.getStringExtra("aa_koichai")
        getText.setText(ii)

        back.setOnClickListener {
            if (getText.text.isEmpty()) Toast.makeText(
                this, "Edit Text не может быть пустым!!!", Toast.LENGTH_SHORT)
                .show()
            else {
                val intent = Intent(this, MainActivity::class.java)
                    .putExtra("mal", getText.text.toString())
                startActivity(intent)
            }


        }
    }
}