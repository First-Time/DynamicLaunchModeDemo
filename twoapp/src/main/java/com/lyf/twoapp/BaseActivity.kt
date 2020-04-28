package com.lyf.twoapp

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    lateinit var actionBar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        actionBar = supportActionBar!!
        actionBar?.setDisplayHomeAsUpEnabled(true)


        log("*****onCreate()方法*****")
        printTaskInfo(this, "onCrate")
        dumpTaskAffinity(this)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        log("*****onNewIntent()方法*****")
        printTaskInfo(this, "onNewIntent")
        dumpTaskAffinity(this)
    }

    override fun onStart() {
        super.onStart()
        log("*****onStart()方法*****")
    }

    override fun onResume() {
        super.onResume()
        log("*****onResume()方法*****")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
