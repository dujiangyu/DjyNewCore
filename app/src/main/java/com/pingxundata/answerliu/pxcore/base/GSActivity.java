/*
package com.pingxundata.answerliu.pxcore.base;//package com.answerliu.answerliupro.base;
//
//import android.app.Activity;
//import android.app.ProgressDialog;
//import android.content.pm.ActivityInfo;
//import android.databinding.DataBindingUtil;
//import android.databinding.ViewDataBinding;
//import android.graphics.Color;
//import android.os.Build;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.Menu;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowManager;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import com.answerliu.answerliupro.R;
//import com.lzy.okgo.OkGo;
//import com.umeng.analytics.MobclickAgent;
//
//
*
// * Activity基类
//

//public abstract class GSActivity<SV extends ViewDataBinding> extends AppCompatActivity {
//
//
//    protected String TAG;
//    protected Activity me;
//    // 布局view
//    protected SV bindingView;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        TAG = this.getClass().getSimpleName();
//        this.me = this;//引用me自己，便于子类调用
//
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设置竖屏
//        bindingView = DataBindingUtil.setContentView(me, getLayoutId());
//        initData();
//
//    }
//
//
//
*
//     * 5.0以上的手机设置全透明状态栏
//

//    private void setFullTransparency() {
//        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
//        }
//    }
//
//
*
//     * 获取根布局
//     *
//     * @return 布局ID
//

//    protected abstract int getLayoutId();
//
//
*
//     * 加载数据
//

//    protected abstract void initData();
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        MobclickAgent.onResume(this);
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        MobclickAgent.onPause(this);
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        return true;
//    }
//
//
*
//     * 初始化头部返回的View
//

//    public void initTopView(String titleStr) {
//        RelativeLayout back = (RelativeLayout) findViewById(R.id.iv_topview_back);
//        TextView title = (TextView) findViewById(R.id.tv_topview_title);
//        if (back != null) {
//            back.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    finish();
//                }
//            });
//        }
//        if (title != null) {
//            title.setText(titleStr);
//        }
//    }
//
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        OkGo.getInstance().cancelTag(this);
//    }
//
//    private ProgressDialog dialog;
//
//
//    public void showLoading() {
//        if (dialog != null && dialog.isShowing()) return;
//        dialog = new ProgressDialog(me);
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        dialog.setCanceledOnTouchOutside(false);
//        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//        dialog.setMessage("请求网络中...");
//        dialog.show();
//    }
//
//    public void dismissLoading() {
//        if (dialog != null && dialog.isShowing()) {
//            dialog.dismiss();
//        }
//    }
//
//}
*/
