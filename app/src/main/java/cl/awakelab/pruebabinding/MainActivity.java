package cl.awakelab.pruebabinding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import cl.awakelab.pruebabinding.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageView.setBackgroundResource(R.drawable.ic_launcher_background);
        binding.textName.setText("Claudio");
        binding.textLastName.setText("Torres");
        binding.textEmail.setText("claudio.torres.burgos@gmail.com");
        binding.textPassword.setText("123456");
        binding.buttonCreateAccount.setText("Create account");


    }

    @Override
    public void onResume() {
        super.onResume();
        View parentLayout = findViewById(android.R.id.content);
        Snackbar.make(parentLayout, "Actividad iniciada", Snackbar.LENGTH_LONG)
                .setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                })
                .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                .show();
    }

}
