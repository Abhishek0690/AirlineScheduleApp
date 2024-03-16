package com.example.group11_comp304sec005_lab03.viewmodel
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.group11_comp304sec005_lab03.AirLineData
import java.text.SimpleDateFormat
import java.util.Date

class FlightsAdapter(
    private val onItemClicked: (AirLineData) -> Unit
) : ListAdapter<FlightsAdapter , FlightsAdapter.FLightsViewHolder>(DiffCallback) {

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<AirLineData>() {
            override fun areItemsTheSame(oldItem: AirLineData, newItem: AirLineData): Boolean {
                return oldItem.flightNumber == newItem.flightNumber
            }

            override fun areContentsTheSame(oldItem: AirLineData, newItem: AirLineData): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FLightsViewHolder {
        val viewHolder = FLightsViewHolder(
            FlightsBinding.inflate(
                LayoutInflater.from( parent.context),
                parent,
                false
            )
        )
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            onItemClicked(getItem(position))
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: FLightsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class FLightsViewHolder(
        private var binding: FlightsBinding
    ): RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SimpleDateFormat")
        fun bind(schedule: AirLineData) {
            binding.stopNameTextView.text = schedule.airLineName
            binding.arrivalTimeTextView.text = SimpleDateFormat(
                "h:mm a").format(Date(schedule.arrivalTime.toLong() * 1000)
            )
        }
    }
}
