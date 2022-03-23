package kg.geektech.a3homework51;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NameAdapter adapter;
    private ArrayList<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle1);
        names = new ArrayList<>();
        names.add("Oleksiy");
        names.add("Oleksiy");
        names.add("Dana");
        names.add("Dana");
        names.add("Milena");
        names.add("Milena");
        names.add("Katerina");
        names.add("Katerina");
        names.add("Mary");
        names.add("Mary");
        names.add("Aisat");
        names.add("Aisat");
        names.add("Melody");
        names.add("Melody");
        names.add("Nana");
        names.add("Nana");
        names.add("Valeria");
        names.add("Valeria");
        adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}