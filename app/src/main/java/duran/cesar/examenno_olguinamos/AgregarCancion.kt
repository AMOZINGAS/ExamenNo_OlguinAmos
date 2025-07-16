package duran.cesar.examenno_olguinamos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AgregarCancion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agregar_cancion)



        val btnGuardar: Button = findViewById(R.id.btnGuardar)
        val etNombre: EditText = findViewById(R.id.etNombre)
        val etArtista: EditText = findViewById(R.id.etArtista)
        val etAlbum: EditText = findViewById(R.id.btnAlbum)
        val etDuration: EditText = findViewById(R.id.etDuracion)

        btnGuardar.setOnClickListener {

            if(etNombre.text.isNullOrBlank() || etArtista.text.isNullOrBlank() || etAlbum.text.isNullOrBlank() || etDuration.text.isNullOrBlank()){

                Toast.makeText(this, "No se permiten campos vacios", Toast.LENGTH_SHORT).show()

            }else{

                var cancion = Cancion("", etNombre.text.toString(), etArtista.text.toString(), etAlbum.text.toString(), etDuration.text.toString())
                startActivity(Intent(this, MainActivity::class.java))

            }

        }

    }
}