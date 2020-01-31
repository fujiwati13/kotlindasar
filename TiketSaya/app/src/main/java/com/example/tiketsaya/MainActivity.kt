package com.example.tiketsaya

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //materi tipe data
        //Tipe Data String,Number

        //var namaSiswa:String=""


        //var testVar =10
        //testVar=15

       // val testVal=10
        //testVal=15 //begitu value diganti 15 ,akan muncul error cacing merah


        //materi variable

        //di kotlin variable cuma ada 2 yaitu var dan val
        //Variable var value nya bisa diubah walupun sebelum nya sudah di set
        //Variable val tidak bisa di ubah,sudah final

       /* var nama="Fujiwati"
        Log.v("cantik" ,"ini nama nya :"+nama)

        nama="Himatul"
        Log.v("cantik" ,"ini nama nya :"+nama)*/

        //materi property
//        val siswa = siswa()
//        siswa.namaSiswa="Fujiwati" //set value
//        Log.v("Result", "Nama Siswa "+siswa.namaSiswa)//get value yang sudah di set sebelumnya

        //materi confition
        var a=10
        var b=20

       /* if (a>b){
            Log.v("Result","Value a > value b")
        }else if ( a < b){
            Log.v("Result"," Value a < value b")
        }else {
            Log.v("Result","Salah")
        }*/

        /*when (a){
            1-> Log.v("Result","Value a > value b")
            2->  Log.v("Result"," Value a < value b")
            else -> {
                Log.v("Result","Salah")
            }
        }*/

        //materi looping
        //perulangan for untuk peraturan dan while do untuk perulangan tidak beraturan

       /* for (number in 1..5){
            Log.v("Result","Ini Value nya : " +number)
        }*/

        var x=1
        while (x<5){
            Log.v("Result","Ini Value nya : " +x)
            x++
        }
    }
}
