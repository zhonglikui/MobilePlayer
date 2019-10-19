package com.zhong.mobileplayer.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.base.BaseActivity
import com.zhong.mobileplayer.util.ToolBarManager
import org.jetbrains.anko.find

class AboutActivity : BaseActivity(),ToolBarManager {
    override val toolbar by lazy {
        find<Toolbar>(R.id.toolbar)
    }
    override fun getLayoutId(): Int {
        return R.layout.activity_about
    }

    override fun initData() {
        super.initData()
        initAboutToolBar()
    }
}


