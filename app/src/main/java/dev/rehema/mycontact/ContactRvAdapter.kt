package dev.rehema.mycontact

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.rehema.mycontact.databinding.ContactListItemBinding
import kotlin.coroutines.coroutineContext

class ContactRvAdapter(var contactList:List<Contact>):
    RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)

        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
    var currentContact=contactList.get(position)
        with(holder.binding){
            tvName.text=currentContact.name
            tvEmail.text=currentContact.email
            tvPhone.text=currentContact.phone
            tvAddress.text=currentContact.address


            Picasso.get()
                .load(currentContact.image)
                .resize(300,300)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_person_outline_24)
                .into(imgContact)
            cvContact.setOnClickListener {
              val context=  holder.itemView.context
                val intent=Intent(context,ViewContactActivity2::class.java)
                intent.putExtra("NAME",currentContact.name)
                intent.putExtra("PHONE_NUMBER",currentContact.phone)
                intent.putExtra("EMAIL",currentContact.email)
                intent.putExtra("ADDRESS",currentContact.address)
//                intent.putExtra("IMAGE",currentContact.image)
                context.startActivity(intent)
            holder.binding.imgContact.setOnClickListener {
                Toast.makeText(context,"you have clicked in my face",Toast.LENGTH_SHORT)
                    .show()
            }
            }

        }


    }

    override fun getItemCount(): Int {
    return contactList.size
    }

}
class ContactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root){

}