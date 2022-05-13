package jp.techacademy.bunta.tsurumi.qa_app

import java.io.Serializable
import java.util.ArrayList

class Question(val title: String, val body: String, val name: String, val uid: String, val questionUid: String, val genre: Int, bytes: ByteArray, val answers: ArrayList<Answer>) : Serializable {
    val imageBytes: ByteArray
    val favoriteImage:ByteArray

    init {
        imageBytes = bytes.clone()
        favoriteImage=bytes.clone()
    }
}