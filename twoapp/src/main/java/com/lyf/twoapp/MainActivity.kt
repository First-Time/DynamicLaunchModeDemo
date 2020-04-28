package com.lyf.twoapp

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.setDisplayHomeAsUpEnabled(false)

        btn_jump.setOnClickListener {
            val intent = Intent()
            intent.action = "com.lyf.second"
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)

            /*val intent = Intent()
            intent.action = "com.lyf.second"
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)*/
        }
    }
}
