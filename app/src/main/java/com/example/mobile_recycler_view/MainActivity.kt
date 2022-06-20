package com.example.mobile_recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data()
    }

    fun data () {
        val array: ArrayList<Mobile> = ArrayList()
        array.add(Mobile("IPhone", "Description IPhone", R.drawable.iphone))
        array.add(Mobile("Alcatel", "Description Alcatel", R.drawable.alcatel))
        array.add(Mobile("Dcode", "Description Dcode", R.drawable.dcode))
        array.add(Mobile("Huawei", "Description Huawei", R.drawable.huawei))
        array.add(Mobile("Infinix", "Description Infinix", R.drawable.infinix))
        array.add(Mobile("Itel", "Description Itel", R.drawable.itel))
        array.add(Mobile("MyTouch", "Description MyTouch", R.drawable.my_touch))
        array.add(Mobile("OnePlus", "Description OnePlus", R.drawable.oneplus))
        array.add(Mobile("Oppo74", "Description Oppo74", R.drawable.oppo74))
        array.add(Mobile("Samsung", "Description Samsung", R.drawable.samsung))
        array.add(Mobile("Tecno", "Description Tecno", R.drawable.tecno))
        array.add(Mobile("Wiko", "Description Wiko", R.drawable.wiko))
        array.add(Mobile("Xiomi", "Description Xiomi", R.drawable.xiomi))

        val customAdapter: CustomAdapter = CustomAdapter(array)

        recycler?.layoutManager =   LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recycler?.adapter =  customAdapter
    }

}