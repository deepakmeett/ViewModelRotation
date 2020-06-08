package com.example.viewmodelrotation;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    
    TextView textView;
    Button addButton, removeButton;
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        textView = findViewById( R.id.text );
        addButton = findViewById( R.id.buttonPanel );
        removeButton = findViewById( R.id.buttonPanel2 );
        viewModel = new ViewModelProvider(this).get( MainViewModel.class );

        textView.setText( String.valueOf(viewModel.score ) );
        
        addButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.score++;
                textView.setText( String.valueOf(viewModel.score ) );
            }
        } );
        
        removeButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.score--;
                textView.setText( String.valueOf(viewModel.score ) );
            }
        } );
        
    }
}
