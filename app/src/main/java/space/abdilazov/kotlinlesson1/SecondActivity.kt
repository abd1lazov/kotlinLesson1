package space.abdilazov.kotlinlesson1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_e_t2.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_t2)

        val data: String = intent.getStringExtra(MainActivity.KEY_RES).toString()
        data.let { getText.setText(data) }

        back.setOnClickListener {
            if (!getText.text.isNullOrBlank()) {
                setResult(
                    Activity.RESULT_OK,
                    Intent().putExtra(MainActivity.KEY_RES, getText.text?.toString())
                )
                finish()

            } else {
                Toast.makeText(this, "Edit Text не может быть пустым!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        finish()
    }
}


