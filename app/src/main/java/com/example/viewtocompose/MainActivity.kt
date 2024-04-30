package com.example.viewtocompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.viewtocompose.screen.GreetingScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)    既存のAndroidView表示はコメントアウトして表示させない
        setContent {
            GreetingScreen(message = "AndroidViewプロジェクトから\nJetpackComposeの表示だよ！")
        }
    }
}
