package dev.rehema.mycontact

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import dev.rehema.mycontact.databinding.ActivityViewContact2Binding
import android.widget.Toast


class ViewContactActivity2 : AppCompatActivity() {
    lateinit var tvName1:TextView
    lateinit var tvPhone_number:TextView
    lateinit var tvEmail1:TextView
    lateinit var tvAdress:TextView
    lateinit var imgPhoto:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact2)
        tvName1=findViewById(R.id.tvName1)
        tvPhone_number=findViewById(R.id.tvPhone_number)
        tvEmail1=findViewById(R.id.tvEmail1)
        tvAdress=findViewById(R.id.tvAddress)
        imgPhoto=findViewById(R.id.imgPhoto)
        getExtras()
    }
    fun getExtras(){
        val Extras=intent.extras
        val name= Extras?.getString("NAME","")
        val phone=Extras?.getString("PHONE_NUMBER","")
        val adress=Extras?.getString("ADDRESS","")
        val email=Extras?.getString("EMAIL","")
        val image=Extras?.getString("IMAGE","")
//        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
//        Toast.makeText(this,phone,Toast.LENGTH_SHORT).show()
        tvName1.text=name
        tvPhone_number.text=phone
        tvAdress.text=adress
        tvEmail1.text=email


    }
}