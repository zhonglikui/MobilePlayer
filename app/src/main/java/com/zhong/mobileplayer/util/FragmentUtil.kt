package com.zhong.mobileplayer.util

import androidx.fragment.app.Fragment
import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.base.BaseFragment
import com.zhong.mobileplayer.ui.fragment.HomeFragment
import com.zhong.mobileplayer.ui.fragment.MvFragment
import com.zhong.mobileplayer.ui.fragment.VBangFragment
import com.zhong.mobileplayer.ui.fragment.YueDanFragment

class FragmentUtil private constructor(){
    val homeFragment by lazy { HomeFragment() }
    val mvFragment by lazy { MvFragment() }
    val vbangFragment by lazy { VBangFragment() }
    val yuedanFragment by lazy { YueDanFragment() }
    companion object{
        val fragmentUtil by lazy { FragmentUtil() }
    }
    /**
     * 根据tabid获取对应的fragment
     */
    fun getFragment(tabId:Int):Fragment{
        when(tabId){
            R.id.tab_home->return homeFragment
            R.id.tab_mv->return mvFragment
            R.id.tab_vbang->return vbangFragment
            R.id.tab_yuedan->return yuedanFragment

        }
        return homeFragment
    }
}