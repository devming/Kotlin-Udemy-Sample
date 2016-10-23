package tech.thdev.kotlin_udemy_sample.view.sample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import tech.thdev.kotlin_udemy_sample.R
import java.util.*

/**
 * Created by tae-hwan on 10/20/16.
 */

class PresenterSampleAdapter(private val context: Context) : RecyclerView.Adapter<PresenterSampleAdapter.PresenterSampleViewHolder>() {

    // new로 바로 생성
    private val itemList = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresenterSampleViewHolder {
        return PresenterSampleViewHolder(parent)
    }

    override fun onBindViewHolder(holder: PresenterSampleViewHolder, position: Int) {
        holder.bindView(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    /**
     * Item을 추가한다
     */
    fun addItem(index: Int) {
        itemList.add(index)
    }

    inner class PresenterSampleViewHolder(parent: ViewGroup) :
            RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_sample, parent, false)) {

        private val textView by lazy {
            itemView?.findViewById(R.id.text) as TextView
        }

//        init {
//            textView = itemView.findViewById(R.id.text) as TextView
//        }

        fun bindView(index: Int) {
            textView.text = "Index : " + index
        }
    }
}