package com.example.splashopening

import android.animation.ObjectAnimator
import android.content.Context
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.splashopening.databinding.FragmentPortalBinding
import com.example.splashopening.databinding.FragmentSplashScreenBinding
import com.example.splashopening.screen.portalFragment

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        val customTabsButton = findViewById<View>(R.id.portal_screen_button)
        customTabsButton.setOnClickListener(this)
        }


    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
    }
    override fun onClick(view: View){
        when(view.id){
            R.id.portal_screen_button ->{
                openCustomTabs()
            }
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
    fun openCustomTabs(){
        val url = "https://www.google.com/"
        CustomTabsIntent.Builder().build().launchUrl(this,Uri.parse(url))
    }
}