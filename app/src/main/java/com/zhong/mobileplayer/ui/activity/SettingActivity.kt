package com.zhong.mobileplayer.ui.activity

import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.appcompat.widget.Toolbar
import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.base.BaseActivity
import com.zhong.mobileplayer.util.ToolBarManager
import org.jetbrains.anko.find

class SettingActivity : BaseActivity(), ToolBarManager {
    override fun getLayoutId(): Int {
        return R.layout.activity_setting;
    }

    override val toolbar by lazy {
        find<Toolbar>(R.id.toolbar)
    }

    override fun initData() {
        super.initData()
        initSettingToolBar()
        val sp=PreferenceManager.getDefaultSharedPreferences(this);
        val isPush=sp.getBoolean("push",false)
    }


}
