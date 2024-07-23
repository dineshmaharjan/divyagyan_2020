package edu.divyagyan.listviewexmpales;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import edu.divyagyan.listviewexmpales.adapter.MovieAdapter;
import edu.divyagyan.listviewexmpales.model.Movie;

public class CustomListViewActivity extends AppCompatActivity {

    private ListView movieListView;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> movieArrayList;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);
        movieListView = findViewById(R.id.movieListView);

        initMovieList();
        movieAdapter = new MovieAdapter(CustomListViewActivity.this, movieArrayList);
        movieListView.setAdapter(movieAdapter);


        movieListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomListViewActivity.this, movieArrayList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initMovieList() {
        movieArrayList = new ArrayList<>();

        Movie movie = new Movie("OpenHiemer", "Drama",
                "2 Hrs", "July 24, 2025", "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Ram Bahadur", "Action",
                "1.5 Hrs", "August 24, 2024", "https://t3.ftcdn.net/jpg/05/06/01/42/360_F_506014246_V1vbPMYo0rOu06xtNOb7pIC1PEy275bC.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Ram Bahadur", "Action",
                "1.5 Hrs", "August 24, 2024", "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Ram Bahadur", "Action",
                "1.5 Hrs", "August 24, 2024", "https://t3.ftcdn.net/jpg/05/06/01/42/360_F_506014246_V1vbPMYo0rOu06xtNOb7pIC1PEy275bC.jpg");
        movieArrayList.add(movie);
        movie = new Movie("Ram Bahadur", "Action",
                "1.5 Hrs", "August 24, 2024", "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");

        movieArrayList.add(movie);
        movie = new Movie("Ram Bahadur", "Action",
                "1.5 Hrs", "August 24, 2024", "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);


    }
}
