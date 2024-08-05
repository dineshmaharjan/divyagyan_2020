package edu.divyagyan.listviewexmpales.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.divyagyan.listviewexmpales.R;
import edu.divyagyan.listviewexmpales.model.Movie;

public class CustomGridViewMovieAdapter extends ArrayAdapter<Movie> {
    private Activity context;
    private ArrayList<Movie> movies;


    public CustomGridViewMovieAdapter(Activity context, ArrayList<Movie> movies) {
        super(context, R.layout.item_movie_grid, movies);
        this.context = context;
        this.movies = movies;
    }


    @NonNull
    @Override
    @SuppressLint("MissingInflatedId")
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = context.getLayoutInflater().inflate(R.layout.item_movie_grid, parent, false);

        ImageView movieImageView = view.findViewById(R.id.posterImageView);
        TextView titleTextView = view.findViewById(R.id.movieTitleTextView);

        Movie movie = movies.get(position);
        titleTextView.setText(movie.getTitle());

        Picasso.get().load(movie.getImageUrl()).into(movieImageView);

        return view;

    }
}