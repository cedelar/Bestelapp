package com.example.bestelapp.fragments.orderlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.bestelapp.data.product.ModelProduct
import com.example.bestelapp.databinding.ListitemOrderlistProductBinding
import timber.log.Timber

class ProductAdapter(private val clickListener: ProductItemListener) : ListAdapter<ModelProduct,
    ProductAdapter.ViewHolder>(ProductDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(clickListener, item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: ListitemOrderlistProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(clickListener: ProductItemListener, item: ModelProduct) {
            binding.product = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListitemOrderlistProductBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }
}

class ProductDiffCallback : DiffUtil.ItemCallback<ModelProduct>() {
    override fun areItemsTheSame(oldItem: ModelProduct, newItem: ModelProduct): Boolean {
        Timber.i("ItemComparizon")
        return oldItem.productId == newItem.productId && oldItem.amount == newItem.amount && oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: ModelProduct, newItem: ModelProduct): Boolean {
        return oldItem == newItem
    }
}

class ProductItemListener(
    val clickUpListener: (productName: String) -> Unit,
    val clickDownListener: (productName: String) -> Unit
) {
    fun onUpClick(modelProduct: ModelProduct) = clickUpListener(modelProduct.name)
    fun onDownClick(modelProduct: ModelProduct) = clickDownListener(modelProduct.name)
}
