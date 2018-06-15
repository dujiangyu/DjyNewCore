package com.pingxundata.answerliu.pxcore.base;

/**
 * Created by LH on 2017/8/31.
 * Fragment基类
 *
 * @author LH
 */
//public abstract class GSFragment<SV extends ViewDataBinding> extends Fragment {
//    // 布局view
//    protected SV bindingView;
//    protected View mRootView;
//    protected String TAG;
//    protected GSActivity mActivity;
//    protected boolean mIsLoadedData = false;
//
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        TAG = this.getClass().getSimpleName();
//        mActivity = (GSActivity) getActivity();
//    }
//
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        //这里的判断是起到设置缓存的效果，如果不判断则每次点击Tab都会刷新一次
//        if (mRootView==null){
//            bindingView = DataBindingUtil.inflate(LayoutInflater.from(mActivity),getRootLayoutResID(),null,false);
//            mRootView=bindingView.getRoot();
//            initData();
//        }else if (mRootView.getParent()!=null){
//            ((ViewGroup)mRootView.getParent()).removeView(mRootView);
//        }
//        return mRootView;
//    }
//
//    @Override
//    public void setUserVisibleHint(boolean isVisibleToUser) {
//        super.setUserVisibleHint(isVisibleToUser);
//        if (isResumed()) {
//            handleOnVisibilityChangedToUser(isVisibleToUser);
//        }
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (getUserVisibleHint()) {
//            handleOnVisibilityChangedToUser(true);
//        }
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        if (getUserVisibleHint()) {
//            handleOnVisibilityChangedToUser(false);
//        }
//    }
//    /**
//     * 处理对用户是否可见
//
//     *
//     * @param isVisibleToUser 是否对用户可见
//     */
//    private void handleOnVisibilityChangedToUser(boolean isVisibleToUser) {
//        if (isVisibleToUser) {
//            // 对用户可见
//            if (!mIsLoadedData) {
//                mIsLoadedData = true;
//                onLazyLoadOnce();
//            }
//            onVisibleToUser();
//        } else {
//            // 对用户不可见
//            onInvisibleToUser();
//        }
//    }
//
//    /**
//     * 懒加载一次。如果只想在对用户可见时才加载数据，并且只加载一次数据，在子类中重写该方法
//
//     */
//    protected void onLazyLoadOnce() {
//    }
//
//    /**
//     * 对用户可见时触发该方法。如果只想在对用户可见时才加载数据，在子类中重写该方法
//     */
//    protected void onVisibleToUser() {
//    }
//
//    /**
//     * 对用户不可见时触发该方法
//     */
//    protected void onInvisibleToUser() {
//    }
//
//    /**
//     * 获取布局文件根视图
//     * @return 根布局
//     */
//    protected abstract int getRootLayoutResID();
//
//
//    /**
//     * 处理业务逻辑，状态恢复等操作
//     *
//     */
//    protected abstract void initData();
//
//
//
//
//
//
//
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//
//    }
//
//    @Override
//    public  void onDestroy() {
//        super.onDestroy();
//    }
//
//    private ProgressDialog dialog;
//
//    public void showLoading() {
//        if (dialog != null && dialog.isShowing()) return;
//        dialog = new ProgressDialog(mActivity);
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
//}
