package mx.edu.ittepic.marcogaray.recyclapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView play, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new Lienzo(this));
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        info = findViewById(R.id.info);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                finish();
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarInfo();
            }
        });

    }

    public void mostrarInfo(){
        AlertDialog.Builder a = new AlertDialog.Builder(this);
        a.setTitle("RecyclApp")
                .setMessage("RecyclApp es un juego con la finalidad de aprender \n" +
                        "la importancia de la correcta separación y reciclaje de la basura mientras te diviertes. \n" +
                        "¿Cómo jugar? \n" +
                        "- Se presentará un objeto en el centro de la pantalla el cual deberás clasificarlo en una de las 6 categorias existentes para la separación de la basura \n" +
                        "- Tendrás que arrastrar el objeto hacia el bote de basura que creas correspondiente \n" +
                        "- Si aciertas ¡sumarás puntos! \n " +
                        "- Al equivocarte perderás vidas, así que ¡sé cuidadoso!")
                .setPositiveButton("Ok",null)
                .show();
    }

}
