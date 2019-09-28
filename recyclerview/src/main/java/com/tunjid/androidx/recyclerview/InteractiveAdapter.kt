package com.tunjid.androidx.recyclerview

import androidx.recyclerview.widget.RecyclerView


abstract class InteractiveAdapter<VH : InteractiveViewHolder<*>, out T : Any?> protected constructor(
        val delegate: T
) : RecyclerView.Adapter<VH>()