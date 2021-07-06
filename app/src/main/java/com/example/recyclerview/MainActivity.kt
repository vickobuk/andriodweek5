package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding
        private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.byn, R.drawable.download, R.drawable.fft, R.drawable.fgal,
            R.drawable.ive, R.drawable.mit, R.drawable.mki, R.drawable.willo


        )
        val name = arrayOf(
            "victor", "promise", "micheal", "david", "John", "Nathan", "Dada", "Sandra"
        )
        val othername = arrayOf(
            "Sharon", "Fejiro", "Eden", "Oke", "Daniel", "Tessy", "Obaro", "Danise", "Dorin", "Joy"
        )
        val lasttime = arrayOf(

            "Nigeria", "Niger", "England", "Ghana", "Finland", "Holland", "Canada", "Italy"
        )
        val phoneNo = arrayOf(
            "08037296831", "09023191701", "08068523499", "08054666020", "08063744534",
            "08134638162", "08079098557", "08034916194"
        )
        val country = arrayOf(
            "Asaba", "Oleh", "Sagamu", "Benin", "Auchi", "Brige"

        )
        userArrayList=ArrayList()

        for (i in name.indices){
            val user= User(name[i],othername[i],lasttime[i],phoneNo[i],imageId[i],)
            userArrayList.add(user)
        }
        binding.listview.isClickable= true
        binding.listview.adapter=MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name= name[position]
            val othername=othername[position]
            val lasttime =lasttime[position]
            val imageId= imageId[position]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("othername",othername)
            i.putExtra("lasttime",lasttime)
            i.putExtra("imageId",imageId)
            startActivity(i)



        }
    }

    }
