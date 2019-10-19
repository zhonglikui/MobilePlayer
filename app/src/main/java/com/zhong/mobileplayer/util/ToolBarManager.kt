package com.zhong.mobileplayer.util

import android.content.Intent
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.ui.activity.SettingActivity

/**
 * 所有界面toolbar的管理类
 */
interface ToolBarManager {
    val toolbar: Toolbar
    /**
     * 处理main里面的toolbar
     */
    fun initMainToolBar() {
        toolbar.setTitle("手机影音")
        toolbar.inflateMenu(R.menu.main)
        toolbar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener {
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                when (item?.itemId) {
                    R.id.setting -> {
                        toolbar.context.startActivity(
                            Intent(
                                toolbar.context,
                                SettingActivity::class.java
                            )
                        )
                    }
                }
                return true
            }
        })
    }

    /**
     * 处理设置页面的toolbar
     */
    fun initSettingToolBar(){
        toolbar.setTitle("设置")

    }

    /**
     * 处理关于页面的toolbar
     */
    fun initAboutToolBar(){
        toolbar.setTitle("关于")
    }

}

