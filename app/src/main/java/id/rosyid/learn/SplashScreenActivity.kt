package id.rosyid.learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashScreenActivity : AppCompatActivity() {

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus)
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
                    )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        // Waktu lamanya Splash Screen, 1000 = 1 Detik
        val splashTimeout: Long = 3000

        Handler().postDelayed({
            // Proses perpindahan activity menggunakan Intent
            startActivity(Intent(this, MainActivity::class.java))
            // Mengakhiri Activity
            finish()
        }, splashTimeout)
    }
}

