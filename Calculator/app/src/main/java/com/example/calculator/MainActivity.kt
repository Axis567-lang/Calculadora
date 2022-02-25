package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity()
{
    // OPERATIONS
    val operación = ""

    // DEBUG
    private val TAG = "a"
    // FLAGS
    private var history: Boolean = false
    // TEXT
    private var textView: TextView? = null
    private var inputWrite: TextInputLayout? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //      //      //

        // TEXT
        textView = findViewById(R.id.textView)
        inputWrite = findViewById(R.id.input)

        // BUTTONS // NUMBERS
        val button1: Button = findViewById(R.id.butt1)
        val button2: Button = findViewById(R.id.butt2)
        val button3: Button = findViewById(R.id.butt3)
        val button4: Button = findViewById(R.id.butt4)
        val button5: Button = findViewById(R.id.butt5)
        val button6: Button = findViewById(R.id.butt6)
        val button7: Button = findViewById(R.id.butt7)
        val button8: Button = findViewById(R.id.butt8)
        val button9: Button = findViewById(R.id.butt9)
        val button0: Button = findViewById(R.id.butt0)
        // OPERATIONS
        val buttonPlus: Button = findViewById(R.id.buttPlus)
        val buttonMin: Button = findViewById(R.id.buttMin)
        val buttonTimes: Button = findViewById(R.id.buttTimes)
        val buttonDiv: Button = findViewById(R.id.buttDiv)
        val buttonRes: Button = findViewById(R.id.buttRes)
        //      //      //

        // IMPLEMENTATION // BUTTONS // NUMBERS
        button1.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('1')
            }
        })

        button2.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('2')
            }
        })

        button3.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('3')
            }
        })

        button4.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('4')
            }
        })

        button5.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('5')
            }
        })

        button6.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('6')
            }
        })

        button7.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('7')
            }
        })

        button8.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('8')
            }
        })

        button9.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('9')
            }
        })

        button0.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addNumber('0')
            }
        })
                    // BUTTONS // OPERACIONES
        buttonPlus.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addSymbol('+')
            }
        })

        buttonMin.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addSymbol('-')
            }
        })

        buttonTimes.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addSymbol('x')
            }
        })

        buttonDiv.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                addSymbol('/')
            }
        })

        buttonRes.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                TODO("kalkular")
            }
        })

    }

    private fun addNumber(Num : Char)
    {
        val Num2 = Num.toString()
        Log.e(TAG, "${Num2}")
        if(!history)
        {
            textView?.text = Num2
            history = true
        }
        else
        {
            textView?.append(" " + Num2)
        }
    }

    private fun addSymbol(Sym : Char)
    {
        Log.e(TAG, "${Sym}")
        if(!history)
        {
            if(Sym == '-')
            {
                textView?.text = Sym.toString()
                history = true
            }

        }
        else
        {
            textView?.append(" " + Sym)
        }
    }

    private fun calcular(Operacion : String) : Int
    {
        var resultado = 0
        val delimitadores = arrayOf('+', '-', 'x', '-')

        var singleOp = mutableListOf<String>()

        val orden = mutableListOf<Char>()




        for (delimiter: Char in delimitaSR)
        {
            if (Operacion.contains('+'))
                contadorSR.add('+')
            else(Operacion.contains('-'))
                contadorSR.add('-')

            if (Operacion.contains('x'))
                contadorMD.add('x')
            else(Operacion.contains('/'))
            contadorSR.add('/')

            listaOpera.add(Operacion.split(delimiter).toString())
        }


    }

}