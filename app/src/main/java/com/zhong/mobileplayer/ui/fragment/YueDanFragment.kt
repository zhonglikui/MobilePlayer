package com.zhong.mobileplayer.ui.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.base.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class YueDanFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context,R.layout.fragment_yue_dan,null)
    }


}
