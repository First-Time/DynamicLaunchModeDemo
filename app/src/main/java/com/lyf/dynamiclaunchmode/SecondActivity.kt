package com.lyf.dynamiclaunchmode

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn_third.setOnClickListener {
            toActivity<ThirdActivity>()
//            toActivity<SecondActivity>()

            /*val intent = Intent()
            intent.action = "com.lyf.second"
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)*/
        }
    }
}
