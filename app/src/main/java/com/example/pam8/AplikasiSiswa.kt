package com.example.pam8

import android.app.Application
import com.example.pam8.repositori.ContainerApp
import com.example.pam8.repositori.ContainerDataApp

class AplikasiSiswa : Application(){
    /*
    AppContainer instance digunakan oleh kelas-kelas lainnnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}