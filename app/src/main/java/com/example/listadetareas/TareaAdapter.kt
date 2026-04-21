package com.example.listadetareas

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadetareas.databinding.ItemTareaBinding

class TareaAdapter(
    private val tareas: MutableList<Tarea>,
    private val onEliminar: (Int) -> Unit
) : RecyclerView.Adapter<TareaAdapter.TareaViewHolder>() {

    inner class TareaViewHolder(val binding: ItemTareaBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaViewHolder {
        val binding = ItemTareaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return TareaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TareaViewHolder, position: Int) {
        val tarea = tareas[position]

        // TODO 1
        holder.binding.tvTitulo.text = tarea.titulo

        // TODO 2
        holder.binding.cbCompletada.setOnCheckedChangeListener(null)
        holder.binding.cbCompletada.isChecked = tarea.completado

        actualizarEstiloTexto(holder, tarea.completado)

        // TODO 3
        holder.binding.cbCompletada.setOnCheckedChangeListener { _, isChecked ->
            tarea.completado = isChecked
            actualizarEstiloTexto(holder, isChecked)
        }

        // TODO 4
        holder.binding.btnEliminar.setOnClickListener {
            onEliminar(holder.adapterPosition)
        }
    }

    override fun getItemCount(): Int = tareas.size

    // Esta función tacha o destacha el texto según el estado
    private fun actualizarEstiloTexto(holder: TareaViewHolder, completada: Boolean) {
        if (completada) {
            holder.binding.tvTitulo.paintFlags =
                holder.binding.tvTitulo.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            holder.binding.tvTitulo.paintFlags =
                holder.binding.tvTitulo.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
    }
}

z