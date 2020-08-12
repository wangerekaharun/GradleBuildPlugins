package ke.co.appslab.gradleplugins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *  Main Activity which is the Launcher Activity
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}