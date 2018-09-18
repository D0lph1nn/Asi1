package com.example.opilane.asi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<King> kings = (new Kings()).getKings();
    private List<String> lines = new ArrayList();
    private ListView view, view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.listKings1);
        view2 = findViewById(R.id.listKings2);

        view2.setAdapter(new ArrayArapter<King>
                (this, android.R.layout.simple_list_item_multiple_choice, kings));
        view2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }

        });
    }
    public void update(King king) {
        String line = toString(king);
        if (!lines.remove(line)) lines.add(line);
        view.setAdapter(new ArrayAdapter<String>
                (MainActivity.this.android.R.layout.simple_list_item_1, lines));
    }

    private String toString(King king) {
        
    }
}
