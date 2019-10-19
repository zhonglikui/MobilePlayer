package com.zhong.mobileplayer.ui.activity
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {
    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }

    override fun onAnimationEnd(view: View?) {
        startActivity<MainActivity>()
        finish()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash;
    }

    override fun initListener() {
        super.initListener()
        ViewCompat.animate(imageView).scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2*1000).start()
    }
}
