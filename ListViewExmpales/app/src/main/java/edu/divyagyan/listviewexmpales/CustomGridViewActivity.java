package edu.divyagyan.listviewexmpales;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import edu.divyagyan.listviewexmpales.adapter.CustomGridViewMovieAdapter;
import edu.divyagyan.listviewexmpales.model.Movie;

public class CustomGridViewActivity  extends AppCompatActivity {

    private GridView gridView;

    private ArrayList<Movie> movieArrayList;

    private CustomGridViewMovieAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView = findViewById(R.id.gridview);
        initMovieList();

        adapter = new CustomGridViewMovieAdapter(this,movieArrayList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomGridViewActivity.this, movieArrayList.get(position).getTitle(),
                        Toast.LENGTH_SHORT).show();
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
