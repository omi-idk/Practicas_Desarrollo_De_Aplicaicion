package com.example.monitor;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import com.example.monitor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.eqRecycler.setLayoutManager(new LinearLayoutManager(this));
        setContentView(binding.getRoot());
        EqAdapter adapter = new EqAdapter();
        binding.eqRecycler.setAdapter(adapter);
        adapter.submitList(eqList);

    }

}