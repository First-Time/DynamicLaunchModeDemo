package com.lyf.dynamiclaunchmode

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btn_main.setOnClickListener {
//            toActivity<SecondActivity>()

            val intent = Intent()
            intent.action = "com.lyf.second"
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }
}
