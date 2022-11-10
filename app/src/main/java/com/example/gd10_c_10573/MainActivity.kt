package com.example.gd10_c_10573

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

taFragment()
binding.txtCari.setOnKeyListener(View.OnKeyListener{ _,
    keyCode, event->if(keyCode == KeyEvent.KEYCODE_ENTER && event.action== KeyEvent.ACTION_UP)
    {
        showDataFragment()
        return@OnKeyListener true
    }
    false
})
binding.btnAdd.setOnClickListener{
    startActivity(Intent(this,
        FormAddMahasiswaActivity::class.java))
}
}
fun showDataFragment() {
    val mFragmentManager = supportFragmentManager
    val mFragmentTransaction = mFragmentManager.beginTransaction()
    val mFragment = DataMahasiswaFragment()
    val textCari = binding.txtCari.text
    val mBundle = Bundle()
    mBundle.putString("cari", textCari.toString())
    mFragment.arguments = mBundle
    mFragmentTransaction.replace(R.id.fl_data, mFragment).commit()
}
}

}