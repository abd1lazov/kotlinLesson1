package space.abdilazov.kotlinlesson1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startForResult: ActivityResultLauncher<Intent> =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
                if (result.resultCode == Activity.RESULT_OK) {
                    val intent = result.data
                    et.setText(intent?.getStringExtra(KEY_RES))
                }
            }

        send.setOnClickListener {
            if (!et.text.isNullOrBlank()) {
                startForResult.launch(
                    Intent(this, SecondActivity::class.java)
                        .putExtra(KEY_RES, et.text?.toString())
                )
            } else {
                Toast.makeText(this, "Edit Text не может быть пустым!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        const val KEY_RES = "res"
    }
}

