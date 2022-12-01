package com.lib.compose_notifier

import android.content.Context
import android.widget.Toast

fun Context.showToast(){
    Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
}