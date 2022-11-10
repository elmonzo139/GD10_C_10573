package com.example.gd10_c_10573

data class ResponseDataMahasiswa(
    @SerializedName("status") val stt:String,
    val totaldata: Int,
    val data:List<MahasiswaData>)