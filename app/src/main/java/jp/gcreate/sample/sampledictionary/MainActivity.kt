package jp.gcreate.sample.sampledictionary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val firebase = "firebase"

    (findViewById<TextView>(R.id.text)).text = firebase
  }
}
