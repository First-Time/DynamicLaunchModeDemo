package com.lyf.dynamiclaunchmode

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


        printTaskInfo(this, "onCrate")
        dumpTaskAffinity(this)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        printTaskInfo(this, "onNewIntent")
        dumpTaskAffinity(this)
    }

    override fun onRestart() {
        super.onRestart()
        printTaskInfo(this, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        printTaskInfo(this, "onStart")
    }

    override fun onResume() {
        super.onResume()
        printTaskInfo(this, "onResume")
    }

    override fun onPause() {
        super.onPause()
        printTaskInfo(this, "onPause")
    }

    override fun onStop() {
        super.onStop()
        printTaskInfo(this, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        printTaskInfo(this, "onDestroy")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
