package com.hfad.simple_watchlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

	private String[] localDataSet;
	private int[] imageDataSet;
	private boolean likeSatus;
	private Listener listener;

	interface Listener {
		void onLikeClick();
	}

	public void setListener(Listener listener) {
		this.listener = listener;
	}

	/**
	 * Provide a reference to the type of views that you are using
	 * (custom ViewHolder).
	 */
	public static class ViewHolder extends RecyclerView.ViewHolder {
		private final TextView textView;
		private final ImageView imageView;
		private final RadioButton like;

		public ViewHolder(View view) {
			super(view);
			// Define click listener for the ViewHolder's View

			textView = (TextView) view.findViewById(R.id.textView);
			imageView = (ImageView) view.findViewById(R.id.imageView);
			like = (RadioButton) view.findViewById(R.id.like);
		}

		public TextView getTextView() {
			return textView;
		}

		public ImageView getImageView() {
			return imageView;
		}

		public RadioButton getLikeView() { return like; }
	}

	/**
	 * Initialize the dataset of the Adapter.
	 *
	 * @param dataSet String[] containing the data to populate views to be used
	 * by RecyclerView.
	 */
	public CustomAdapter(String[] dataSet, int[] imageSet) {
		localDataSet = dataSet;
		imageDataSet = imageSet;
	}

	// Create new views (invoked by the layout manager)
	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
		// Create a new view, which defines the UI of the list item
		View view = LayoutInflater.from(viewGroup.getContext())
				.inflate(R.layout.text_row_item, viewGroup, false);

		return new ViewHolder(view);
	}

	// Replace the contents of a view (invoked by the layout manager)
	@Override
	public void onBindViewHolder(ViewHolder viewHolder, final int position) {

		// Get element from your dataset at this position and replace the
		// contents of the view with that element
		viewHolder.getTextView().setText(localDataSet[position]);
		viewHolder.getImageView().setImageResource(imageDataSet[position]);
		viewHolder.getLikeView().setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				listener.onLikeClick();
			}
		});
	}

	// Return the size of your dataset (invoked by the layout manager)
	@Override
	public int getItemCount() {
		return localDataSet.length;
	}
}
