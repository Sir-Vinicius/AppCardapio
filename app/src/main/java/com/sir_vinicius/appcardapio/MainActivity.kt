package com.sir_vinicius.appcardapio

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sir_vinicius.appcardapio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOrder.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button_Order -> realizarPedido()
        }
    }

    private fun realizarPedido() {
        var hasSelectedItems = false
        val itemsSelecionados = StringBuilder()

        val checkboxesContainer = binding.root.findViewById<ViewGroup>(R.id.checkboxes_container)
        val checkboxes = checkboxesContainer.findCheckboxes()

        for (checkbox in checkboxes) {
            if (checkbox.isChecked) {
                hasSelectedItems = true
                itemsSelecionados.append("${checkbox.text}, ")
            }
        }

        if (!hasSelectedItems) {
            Toast.makeText(this, "Selecione pelo menos um item antes de realizar o pedido", Toast.LENGTH_SHORT).show()
            return
        }

        // Exibir itens selecionados
        Toast.makeText(this, "Pedido realizado com sucesso! Itens selecionados: ${itemsSelecionados.trimEnd(',', ' ')}", Toast.LENGTH_LONG).show()
    }
    private fun ViewGroup.findCheckboxes(): List<CheckBox> {
        val checkboxes = mutableListOf<CheckBox>()
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            if (child is ViewGroup) {
                checkboxes.addAll(child.findCheckboxes())
            } else if (child is CheckBox) {
                checkboxes.add(child)
            }
        }
        return checkboxes
    }
}
