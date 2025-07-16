package duran.cesar.examenno_olguinamos

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import duran.cesar.examenno_olguinamos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var cancionAdapter: CancionAdapter
    private lateinit var cancionRepository: CancionRepository
    private lateinit var agregarResult: ActivityResultLauncher<Intent>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rvCanciones: RecyclerView = findViewById(R.id.rvCanciones)




        var listas = listOf(Cancion(
            "","WhitoutMe", "Eminem", "The Eminems Show", "3:20"),
            Cancion("","WhitoutMe", "Eminem", "The Eminems Show", "3:20"),
            Cancion("","The Real Slim Shady", "Eminem", "The Eminems Show", "2:10"),
            Cancion("","ushiudsbni", "Eminem", "The Eminems Show", "1:55"),
            Cancion("","ushiudsbni", "Eminem", "The Eminems Show", "1:55"),
            Cancion("","uihwieuhw", "Eminem", "The Eminems Show", "5:10"),
            Cancion("","skhjgdiw", "Eminem", "The Eminems Show", "1:40")
        )


        cancionAdapter = CancionAdapter(cancionRepository.getCancion())
        rvCanciones.adapter = cancionAdapter

        val btnAgregar: Button = findViewById(R.id.btnAgregarCancion)
        btnAgregar.setOnClickListener {

            var intent = Intent(this, AgregarCancion::class.java)
            startActivity(intent)

        }



    }

    fun setupRecycleView(canciones: List<Cancion>){



    }

    fun cargarCanciones(): List<Cancion>{

        var cancion1 = Cancion("","WhitoutMe", "Eminem", "The Eminems Show", "3:20")
        var cancion2 = Cancion("","The Real Slim Shady", "Eminem", "The Eminems Show", "2:10")
        var cancion3 = Cancion("","ushiudsbni", "Eminem", "The Eminems Show", "1:55")
        var cancion4 = Cancion("","uihwieuhw", "Eminem", "The Eminems Show", "5:10")
        var cancion5 = Cancion("","skhjgdiw", "Eminem", "The Eminems Show", "1:40")

        var canciones: List<Cancion> = emptyList()
        canciones.plus(cancion1)
        canciones.plus(cancion2)
        canciones.plus(cancion3)
        canciones.plus(cancion4)
        canciones.plus(cancion5)

        return canciones

    }
}