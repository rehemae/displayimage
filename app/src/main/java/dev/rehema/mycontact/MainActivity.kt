package dev.rehema.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.rehema.mycontact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact = Contact("Rehema Ephraim","+255757465733","raynanda@gmail.com","616 KorongoRoad","https://images.pexels.com/photos/3746254/pexels-photo-3746254.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact1 = Contact("anna Emanuel","+255757465730","anna@gmail.com","44 mlole","https://images.pexels.com/photos/3746254/pexels-photo-3746254.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact2 = Contact("sara Ephraim","+255757465739","sara@gmail.com","445 kIGOMA","https://images.pexels.com/photos/3746256/pexels-photo-3746256.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact3 = Contact("amon Saimon","+255757465722","amon@gmail.com","33 kORONGO ROAD","https://images.pexels.com/photos/3746256/pexels-photo-3746256.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact4 = Contact("ayubu Ephraim","+255757465736","ayubu@gmail.com","33 MLOLE","https://images.pexels.com/photos/3746256/pexels-photo-3746256.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact5= Contact("saimon Nanda","+255757465731","saimonnanda@gmail.com","55 MOROGORO ","https://images.pexels.com/photos/3746271/pexels-photo-3746271.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact6= Contact("Martha Nanda","+255757465732","marthananda@gmail.com","33 Dar es salaam","https://images.pexels.com/photos/3746271/pexels-photo-3746271.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact7= Contact("Happyness John","+255757465711","happyjohn@gmail.com","33 Nairobi","https://images.pexels.com/photos/3746271/pexels-photo-3746271.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact8= Contact("Bertha Bariko","+255757465700","berthabariko@gmail.com","33 Kenya","https://images.pexels.com/photos/3746284/pexels-photo-3746284.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact9= Contact("Ephraim Nanda","+255757465722","ephraimnanda@gmail.com","33 KASULU","https://images.pexels.com/photos/3746284/pexels-photo-3746284.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact10= Contact("Godfear Adam","+255757465744","godfearadam@gmail.com","33 MWANZA","https://images.pexels.com/photos/7295711/pexels-photo-7295711.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact11= Contact("Godfear Adam","+255757465744","godfearadam@gmail.com","33 MWANZA","https://images.pexels.com/photos/3746226/pexels-photo-3746226.jpeg?auto=compress&cs=tinysrgb&w=400")

        var contactList= listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11)
        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter





    }
}