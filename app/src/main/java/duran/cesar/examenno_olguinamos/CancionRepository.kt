package duran.cesar.examenno_olguinamos

import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.google.firebase.firestore.toObject

class CancionRepository {

    val db = Firebase.firestore
    var _listaCanciones = MutableLiveData<List<Cancion>>(emptyList())
    var listaCanciones: LiveData<List<Cancion>> = _listaCanciones


    fun getCancion():ArrayList<Cancion> {

        val result = db.collection("canciones").get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    Log.d(null, "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { exception ->
                Log.w(null, "Error getting documents.", exception)
            }

        var lista = ArrayList<Cancion>()

        for (n in result.result) {

            lista.add(n.toObject<Cancion>())

        }

        return lista

    }

}