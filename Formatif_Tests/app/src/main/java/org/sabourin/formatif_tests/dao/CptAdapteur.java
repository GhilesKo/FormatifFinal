package org.sabourin.formatif_tests.dao;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.sabourin.formatif_tests.R;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CptAdapteur extends RecyclerView.Adapter<CptAdapteur.ViewHolder> {

    public List<Integer> listeNomrbes;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;


        public ViewHolder(TextView view) {
            super(view);
            // Define click listener for the ViewHolder's View


       textView = view;

        }


    }

    /**
     * Initialize the dataset of the Adapter.
     *

     */
    public CptAdapteur() {
        listeNomrbes = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CptAdapteur.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        TextView view = (TextView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_cpt,viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
       int intCourant = listeNomrbes.get(position);
        viewHolder.textView.setText(""+intCourant);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return listeNomrbes.size();
    }
}
