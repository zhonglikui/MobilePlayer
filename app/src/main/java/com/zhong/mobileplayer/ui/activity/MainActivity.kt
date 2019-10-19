package com.zhong.mobileplayer.ui.activity

import androidx.appcompat.widget.Toolbar
import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.base.BaseActivity
import com.zhong.mobileplayer.util.FragmentUtil
import com.zhong.mobileplayer.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity(), ToolBarManager {
    override val toolbar by lazy {
        find<Toolbar>(R.id.toolbar)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main;
    }

    override fun initData() {
        super.initData()
        initMainToolBar()
    }

    override fun initListener() {
        super.initListener()
        bottomBar.setOnTabSelectListener {
         val transient=  supportFragmentManager.beginTransaction()
            transient.replace(R.id.main_container,FragmentUtil.fragmentUtil.getFragment(it),it.toString())
            transient.commit()
        }
    }


}
