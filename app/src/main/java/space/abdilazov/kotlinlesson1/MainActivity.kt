package space.abdilazov.kotlinlesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_e_t2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){


//    private latent var btnMessage: Button
//    val text = "Welcome to application!"
//    val duration = Toast.LENGTH_SHORT
//    val toast = Toast.makeText(applicationContext, text, duration).show()
//    //    Строковые переменные
//    var name: String = "Application" // явная объевление переменной
//    var appVersion = "2.1.1" // неявная объявление переменной
//    val surname = "Abdicate" //неявная объявления переменной и не изменяемая
//    //    целочисленные переменные
//    var age = 234134314
//    //    дробные переменные
//    var f: Float = 43.5F
//    var f1 = 43.3F

//    var d: Double = 32.2
//    var d1 = 32.2
//    //    условные переменные
//    var isolated: Boolean = true
//    var inched = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val i = intent.getStringExtra("mal")
        ET.setText(i)

        send.setOnClickListener {
            if (ET.text.isEmpty()) Toast.makeText(
                this, "Edit Text не может быть пустым!!!", Toast.LENGTH_SHORT)
                .show()
            else {
                val iii = Intent(this, ETActivity2::class.java)
                    .putExtra("aa_koichai", ET.text.toString())
                startActivity(iii)
            }

        }
    }
}
//На первой активити добавить EditText + Button,
//при вводе если значения в editText пустое и вы нажали на button,
//то отобразить Toast, что EditText не может быть пустым,
//иначе Перейти на вторую активити и отобразить значение в EditText, также добавить Button,
//если EditText не пуст,
//то вернуться на 1 активити и отобразить текст из 2 активити.(использовать registerForActivity)