package com.example.caesarcipher

import android.util.Log
import androidx.databinding.ObservableField
import java.lang.StringBuilder

class VigenereCipherViewModel {

    var message = ObservableField<String>()
    var key = ObservableField<String>()
    var result = ObservableField<String>()
    private fun getKeyValue(): String {
        var key = this.key.get() ?: ""
        val messageLength = message.get()?.length ?: 0
        if (key.length >= messageLength) return key
        if (key.isEmpty()) key=" "
        with(StringBuilder()) {
            while (this.length <= messageLength) {
                append(key)
                Log.d("MYT", toString())
            }
            return toString()
        }

    }

    fun cipher() {
        val message = this.message.get() ?: ""
        val key = getKeyValue()
        with(StringBuilder()) {
            for (i in message.indices)
                append((message[i].code + key[i].code).toChar())
            Log.d("MYT", toString())
            result.set(toString())
        }

    }

    fun deCipher() {
        val message = this.message.get() ?: ""
        val key = getKeyValue()
        with(StringBuilder()) {
            for (i in message.indices)
                append((message[i].code - key[i].code).toChar())

            Log.d("MYT", toString())
            result.set(toString())
        }

    }
}
