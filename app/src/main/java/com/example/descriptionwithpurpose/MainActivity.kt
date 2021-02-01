package com.example.descriptionwithpurpose

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


private lateinit var encryptionInputBar: EditText
private lateinit var encryptionOutputBar: TextView
private lateinit var decryptionInputBar: EditText
private lateinit var decryptionOutputBar: TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        encryptionInputBar = findViewById(R.id.encryptionInput)
        encryptionOutputBar = findViewById(R.id.encryptionOutput)
        decryptionInputBar = findViewById(R.id.decryptionInput)
        decryptionOutputBar = findViewById(R.id.decryptionOutput)

        encryptionInputBar.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

                val inputText: String = encryptionInputBar.text.toString()
                val inputArray: List<String> = inputText
                    .toList()
                    .map { char ->
                        return@map encryption(char.toString())
                    }

                encryptionOutputBar.text = inputArray.joinToString(" ")
            }

            override fun afterTextChanged(s: Editable) {}

        })

        decryptionInputBar.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

                val inputText: String = decryptionInputBar.text.toString()
                val inputArray: List<String> = inputText
                    .trim()
                    .split(" ")
                    .map { char ->
                        return@map decryption(char)
                    }

                decryptionOutputBar.text = inputArray.joinToString("")
            }

            override fun afterTextChanged(s: Editable) {}

        })
    }


    fun encryption(char: String): String {
        return when (char) {
            "q" -> char.replace("q", resources.getString(R.string.q11))
            "w" -> char.replace("w", resources.getString(R.string.w24))
            "e" -> char.replace("e", resources.getString(R.string.e21))
            "r" -> char.replace("r", resources.getString(R.string.r12))
            "t" -> char.replace("t", resources.getString(R.string.t6))
            "y" -> char.replace("y", resources.getString(R.string.y15))
            "u" -> char.replace("u", resources.getString(R.string.u4))
            "i" -> char.replace("i", resources.getString(R.string.i26))
            "o" -> char.replace("o", resources.getString(R.string.o27))
            "p" -> char.replace("p", resources.getString(R.string.p9))
            "a" -> char.replace("a", resources.getString(R.string.a22))
            "s" -> char.replace("s", resources.getString(R.string.s29))
            "d" -> char.replace("d", resources.getString(R.string.d3))
            "f" -> char.replace("f", resources.getString(R.string.f1))
            "g" -> char.replace("g", resources.getString(R.string.g17))
            "h" -> char.replace("h", resources.getString(R.string.h18))
            "j" -> char.replace("j", resources.getString(R.string.j16))
            "k" -> char.replace("k", resources.getString(R.string.k13))
            "l" -> char.replace("l", resources.getString(R.string.l5))
            "z" -> char.replace("z", resources.getString(R.string.z33))
            "x" -> char.replace("x", resources.getString(R.string.x25))
            "c" -> char.replace("c", resources.getString(R.string.c19))
            "v" -> char.replace("v", resources.getString(R.string.v14))
            "b" -> char.replace("b", resources.getString(R.string.b10))
            "n" -> char.replace("n", resources.getString(R.string.n20))
            "m" -> char.replace("m", resources.getString(R.string.m30))
            " " -> char.replace(" ", resources.getString(R.string.space))
            else -> char
        }
    }


    fun decryption(char: String): String {
        return when (char) {
            resources.getString(R.string.q11) -> char.replace(
                resources.getString(R.string.q11),
                "q"
            )
            resources.getString(R.string.w24) -> char.replace(
                resources.getString(R.string.w24),
                "w"
            )
            resources.getString(R.string.e21) -> char.replace(
                resources.getString(R.string.e21),
                "e"
            )
            resources.getString(R.string.r12) -> char.replace(
                resources.getString(R.string.r12),
                "r"
            )
            resources.getString(R.string.t6) -> char.replace(
                resources.getString(R.string.t6),
                "t"
            )
            resources.getString(R.string.y15) -> char.replace(
                resources.getString(R.string.y15),
                "y"
            )
            resources.getString(R.string.u4) -> char.replace(
                resources.getString(R.string.u4),
                "u"
            )
            resources.getString(R.string.i26) -> char.replace(
                resources.getString(R.string.i26),
                "i"
            )
            resources.getString(R.string.o27) -> char.replace(
                resources.getString(R.string.o27),
                "o"
            )
            resources.getString(R.string.p9) -> char.replace(
                resources.getString(R.string.p9),
                "p"
            )
            resources.getString(R.string.a22) -> char.replace(
                resources.getString(R.string.a22),
                "a"
            )
            resources.getString(R.string.s29) -> char.replace(
                resources.getString(R.string.s29),
                "s"
            )
            resources.getString(R.string.d3) -> char.replace(
                resources.getString(R.string.d3),
                "d"
            )
            resources.getString(R.string.f1) -> char.replace(
                resources.getString(R.string.f1),
                "f"
            )
            resources.getString(R.string.g17) -> char.replace(
                resources.getString(R.string.g17),
                "g"
            )
            resources.getString(R.string.h18) -> char.replace(
                resources.getString(R.string.h18),
                "h"
            )
            resources.getString(R.string.j16) -> char.replace(
                resources.getString(R.string.j16),
                "j"
            )
            resources.getString(R.string.k13) -> char.replace(
                resources.getString(R.string.k13),
                "k"
            )
            resources.getString(R.string.l5) -> char.replace(
                resources.getString(R.string.l5),
                "l"
            )
            resources.getString(R.string.z33) -> char.replace(
                resources.getString(R.string.z33),
                "z"
            )
            resources.getString(R.string.x25) -> char.replace(
                resources.getString(R.string.x25),
                "x"
            )
            resources.getString(R.string.c19) -> char.replace(
                resources.getString(R.string.c19),
                "c"
            )
            resources.getString(R.string.v14) -> char.replace(
                resources.getString(R.string.v14),
                "v"
            )
            resources.getString(R.string.b10) -> char.replace(
                resources.getString(R.string.b10),
                "b"
            )
            resources.getString(R.string.n20) -> char.replace(
                resources.getString(R.string.n20),
                "n"
            )
            resources.getString(R.string.m30) -> char.replace(
                resources.getString(R.string.m30),
                "m"
            )
            resources.getString(R.string.space) -> char.replace(
                resources.getString(R.string.space),
                " "
            )
            else -> char
        }
    }
}





