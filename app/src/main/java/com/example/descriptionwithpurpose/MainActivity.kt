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
            "Q" -> char.replace("Q",resources.getString(R.string.Q11))
            "w" -> char.replace("w", resources.getString(R.string.w24))
            "W" -> char.replace("W", resources.getString(R.string.W24))
            "e" -> char.replace("e", resources.getString(R.string.e21))
            "E" -> char.replace("E", resources.getString(R.string.E21))
            "r" -> char.replace("r", resources.getString(R.string.r12))
            "R" -> char.replace("R", resources.getString(R.string.R12))
            "t" -> char.replace("t", resources.getString(R.string.t6))
            "T" -> char.replace("T", resources.getString(R.string.T6))
            "y" -> char.replace("y", resources.getString(R.string.y15))
            "Y" -> char.replace("Y", resources.getString(R.string.Y15))
            "u" -> char.replace("u", resources.getString(R.string.u4))
            "U" -> char.replace("U", resources.getString(R.string.U4))
            "i" -> char.replace("i", resources.getString(R.string.i26))
            "I" -> char.replace("I", resources.getString(R.string.I26))
            "o" -> char.replace("o", resources.getString(R.string.o27))
            "O" -> char.replace("O", resources.getString(R.string.O27))
            "p" -> char.replace("p", resources.getString(R.string.p9))
            "P" -> char.replace("P", resources.getString(R.string.P9))
            "a" -> char.replace("a", resources.getString(R.string.a22))
            "A" -> char.replace("A", resources.getString(R.string.A22))
            "s" -> char.replace("s", resources.getString(R.string.s29))
            "S" -> char.replace("S", resources.getString(R.string.S29))
            "d" -> char.replace("d", resources.getString(R.string.d3))
            "D" -> char.replace("D", resources.getString(R.string.D3))
            "f" -> char.replace("f", resources.getString(R.string.f1))
            "F" -> char.replace("F", resources.getString(R.string.F1))
            "g" -> char.replace("g", resources.getString(R.string.g17))
            "G" -> char.replace("G", resources.getString(R.string.G17))
            "h" -> char.replace("h", resources.getString(R.string.h18))
            "H" -> char.replace("H", resources.getString(R.string.H18))
            "j" -> char.replace("j", resources.getString(R.string.j16))
            "J" -> char.replace("J", resources.getString(R.string.J16))
            "k" -> char.replace("k", resources.getString(R.string.k13))
            "K" -> char.replace("K", resources.getString(R.string.K13))
            "l" -> char.replace("l", resources.getString(R.string.l5))
            "L" -> char.replace("L", resources.getString(R.string.L5))
            "z" -> char.replace("z", resources.getString(R.string.z33))
            "Z" -> char.replace("Z", resources.getString(R.string.Z33))
            "x" -> char.replace("x", resources.getString(R.string.x25))
            "X" -> char.replace("X", resources.getString(R.string.X25))
            "c" -> char.replace("c", resources.getString(R.string.c19))
            "C" -> char.replace("C", resources.getString(R.string.C19))
            "v" -> char.replace("v", resources.getString(R.string.v14))
            "V" -> char.replace("V", resources.getString(R.string.V14))
            "b" -> char.replace("b", resources.getString(R.string.b10))
            "B" -> char.replace("B", resources.getString(R.string.B10))
            "n" -> char.replace("n", resources.getString(R.string.n20))
            "N" -> char.replace("N", resources.getString(R.string.N20))
            "m" -> char.replace("m", resources.getString(R.string.m30))
            "M" -> char.replace("M", resources.getString(R.string.M30))
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
            resources.getString(R.string.Q11) -> char.replace(
                resources.getString(R.string.Q11),
                "Q")
            resources.getString(R.string.w24) -> char.replace(
                resources.getString(R.string.w24),
                "w"
            )
            resources.getString(R.string.W24) -> char.replace(
                resources.getString(R.string.W24),
                "W"
            )
            resources.getString(R.string.e21) -> char.replace(
                resources.getString(R.string.e21),
                "e"
            )
            resources.getString(R.string.E21) -> char.replace(
                resources.getString(R.string.E21),
                "E"
            )
            resources.getString(R.string.r12) -> char.replace(
                resources.getString(R.string.r12),
                "r"
            )
            resources.getString(R.string.R12) -> char.replace(
                resources.getString(R.string.R12),
                "R"
            )
            resources.getString(R.string.t6) -> char.replace(
                resources.getString(R.string.t6),
                "t"
            )
            resources.getString(R.string.T6) -> char.replace(
                resources.getString(R.string.T6),
                "T"
            )
            resources.getString(R.string.y15) -> char.replace(
                resources.getString(R.string.y15),
                "y"
            )
            resources.getString(R.string.Y15) -> char.replace(
                resources.getString(R.string.Y15),
                "Y"
            )
            resources.getString(R.string.u4) -> char.replace(
                resources.getString(R.string.u4),
                "u"
            )
            resources.getString(R.string.U4) -> char.replace(
                resources.getString(R.string.U4),
                "U"
            )
            resources.getString(R.string.i26) -> char.replace(
                resources.getString(R.string.i26),
                "i"
            )
            resources.getString(R.string.I26) -> char.replace(
                resources.getString(R.string.I26),
                "I"
            )
            resources.getString(R.string.o27) -> char.replace(
                resources.getString(R.string.o27),
                "o"
            )
            resources.getString(R.string.O27) -> char.replace(
                resources.getString(R.string.O27),
                "O"
            )
            resources.getString(R.string.p9) -> char.replace(
                resources.getString(R.string.p9),
                "p"
            )
            resources.getString(R.string.P9) -> char.replace(
                resources.getString(R.string.P9),
                "P"
            )
            resources.getString(R.string.a22) -> char.replace(
                resources.getString(R.string.a22),
                "a"
            )
            resources.getString(R.string.A22) -> char.replace(
                resources.getString(R.string.A22),
                "A"
            )
            resources.getString(R.string.r12) -> char.replace(
                resources.getString(R.string.r12),
                "r"
            )

            resources.getString(R.string.R12) -> char.replace(
                resources.getString(R.string.R12),
                "R"
            )
            resources.getString(R.string.s29) -> char.replace(
                resources.getString(R.string.s29),
                "s"
            )
            resources.getString(R.string.S29) -> char.replace(
                resources.getString(R.string.S29),
                "S"
            )
            resources.getString(R.string.d3) -> char.replace(
                resources.getString(R.string.d3),
                "d"
            )
            resources.getString(R.string.D3) -> char.replace(
                resources.getString(R.string.D3),
                "D"
            )
            resources.getString(R.string.f1) -> char.replace(
                resources.getString(R.string.f1),
                "f"
            )
            resources.getString(R.string.F1) -> char.replace(
                resources.getString(R.string.F1),
                "F"
            )
            resources.getString(R.string.g17) -> char.replace(
                resources.getString(R.string.g17),
                "g"
            )
            resources.getString(R.string.G17) -> char.replace(
                resources.getString(R.string.G17),
                "G"
            )
            resources.getString(R.string.h18) -> char.replace(
                resources.getString(R.string.h18),
                "h"
            )
            resources.getString(R.string.H18) -> char.replace(
                resources.getString(R.string.H18),
                "H"
            )
            resources.getString(R.string.j16) -> char.replace(
                resources.getString(R.string.j16),
                "j"
            )
            resources.getString(R.string.J16) -> char.replace(
                resources.getString(R.string.J16),
                "J"
            )
            resources.getString(R.string.k13) -> char.replace(
                resources.getString(R.string.k13),
                "k"
            )
            resources.getString(R.string.K13) -> char.replace(
                resources.getString(R.string.K13),
                "K"
            )
            resources.getString(R.string.l5) -> char.replace(
                resources.getString(R.string.l5),
                "l"
            )
            resources.getString(R.string.L5) -> char.replace(
                resources.getString(R.string.L5),
                "L"
            )
            resources.getString(R.string.z33) -> char.replace(
                resources.getString(R.string.z33),
                "z"
            )
            resources.getString(R.string.Z33) -> char.replace(
                resources.getString(R.string.Z33),
                "Z"
            )
            resources.getString(R.string.x25) -> char.replace(
                resources.getString(R.string.x25),
                "x"
            )
            resources.getString(R.string.X25) -> char.replace(
                resources.getString(R.string.X25),
                "X"
            )
            resources.getString(R.string.c19) -> char.replace(
                resources.getString(R.string.c19),
                "c"
            )
            resources.getString(R.string.C19) -> char.replace(
                resources.getString(R.string.C19),
                "C"
            )
            resources.getString(R.string.v14) -> char.replace(
                resources.getString(R.string.v14),
                "v"
            )
            resources.getString(R.string.V14) -> char.replace(
                resources.getString(R.string.V14),
                "V"
            )
            resources.getString(R.string.b10) -> char.replace(
                resources.getString(R.string.b10),
                "b"
            )
            resources.getString(R.string.B10) -> char.replace(
                resources.getString(R.string.B10),
                "B"
            )
            resources.getString(R.string.n20) -> char.replace(
                resources.getString(R.string.n20),
                "n"
            )
            resources.getString(R.string.N20) -> char.replace(
                resources.getString(R.string.N20),
                "N"
            )
            resources.getString(R.string.m30) -> char.replace(
                resources.getString(R.string.m30),
                "m"
            )
            resources.getString(R.string.M30) -> char.replace(
                resources.getString(R.string.M30),
                "M"
            )
            resources.getString(R.string.space) -> char.replace(
                resources.getString(R.string.space),
                " "
            )
            else -> char
        }
    }
}





