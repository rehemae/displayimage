package dev.rehema.mycontact

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import dev.rehema.mycontact.databinding.ActivityViewContact2Binding
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.rehema.mycontact.databinding.ActivityMainBinding


class ViewContactActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityViewContact2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContact2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        getExtras()
    }

    fun getExtras() {
        val Extras = intent.extras
        var name = Extras?.getString("NAME")
        var phone = Extras?.getString("PHONE_NUMBER")
        var email = Extras?.getString("EMAIL")
        var adress = Extras?.getString("ADDRESS")
        var image = binding.imgPhoto

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, phone, Toast.LENGTH_SHORT).show()
        binding.tvName1.text = name
        binding.tvPhoneNumber.text = phone
        binding.tvEmail1.text = email
        binding.tvAdress.text = adress
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)


//        imgPhoto.image=image


    }
}