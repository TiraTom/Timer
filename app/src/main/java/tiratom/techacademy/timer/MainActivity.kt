package tiratom.techacademy.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    private val mTimer: Timer? = nil

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
