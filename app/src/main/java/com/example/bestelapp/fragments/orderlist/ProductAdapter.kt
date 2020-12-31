package com.example.bestelapp.fragments.orderlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.bestelapp.data.product.ModelProduct
import com.example.bestelapp.databinding.ListitemOrderlistProductBinding

/**
 * The [ListAdapter] class for a recyclerview displaying [ModelProduct]s
 *
 * @param clickListener A [ProductItemListener] detailing what to do when the buttons on the listitem are clicked.
 * @author Cedric Delaruelle
 * @see [OrderlistFragment] [OrderlistViewModel]
 */
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

        /**
         * Function to bind the [ModelProduct] and [ProductItemListener] to a [ViewHolder]
         *
         * @param clickListener A [ProductItemListener] detailing what to do when the buttons in the [ViewHolder] are clicked.
         * @param item The [ModelProduct] to bind to the [ViewHolder]
         */
        fun bind(clickListener: ProductItemListener, item: ModelProduct) {
            binding.product = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            /**
             * Function creating a new [ViewHolder] with a specified [ViewGroup] as parent, and inflating it.
             *
             * @param parent The specified [ViewGroup]
             * @return The requested [ViewHolder]
             */
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListitemOrderlistProductBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }
}

/**
 * A [DiffUtil.ItemCallback] class detailing classes to compare [ModelProduct]s
 *
 * @author Cedric Delaruelle
 */
class ProductDiffCallback : DiffUtil.ItemCallback<ModelProduct>() {
    override fun areItemsTheSame(oldItem: ModelProduct, newItem: ModelProduct): Boolean {
        return oldItem.productId == newItem.productId && oldItem.amount == newItem.amount && oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: ModelProduct, newItem: ModelProduct): Boolean {
        return oldItem == newItem
    }
}

/**
 * A class for specifying what to do when specific buttons are clicked.
 *
 * @param clickUpListener A function to be executed when 'Up' is clicked
 * @param clickDownListener A function to be executed when 'Down' is clicked
 * @author Cedric Delaruelle
 */
class ProductItemListener(
    val clickUpListener: (productName: String) -> Unit,
    val clickDownListener: (productName: String) -> Unit
) {
    /**
     * Function to be called when the 'Up' button is clicked.
     *
     * Executes the clickUpListener function specified on class creation
     */
    fun onUpClick(modelProduct: ModelProduct) = clickUpListener(modelProduct.name)

    /**
     * Function to be called when the 'Down' button is clicked.
     *
     * Executes the clickDownListener function specified on class creation
     */
    fun onDownClick(modelProduct: ModelProduct) = clickDownListener(modelProduct.name)
}
