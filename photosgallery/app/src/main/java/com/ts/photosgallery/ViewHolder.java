package com.ts.photosgallery;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

public interface ViewHolder {
    @NonNull
    GalleryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType);

    int getItemCount();
}
