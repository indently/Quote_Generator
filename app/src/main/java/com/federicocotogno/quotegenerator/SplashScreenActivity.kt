package com.federicocotogno.quotegenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        splashTheScreen()
    }

    private fun splashTheScreen() {
        iv_splash.alpha = 0f

        iv_splash.animate().apply {
            alpha(1f)
            duration = 800

        }.withEndAction {

            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }.start()

    }
}
