package polbeng.ac.id.intentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secound.*
import java.util.logging.Logger

class SecoundActivity : AppCompatActivity() {
    val Log = Logger.getLogger(SecoundActivity::class.java.name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)
        Log.info("onCreate")
        btnExitActivity.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }
    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }
}