package com.example.m.bean;

import android.databinding.BaseObservable;

import com.example.m.bindingadapter.R;
import com.example.m.bindingadapter.bindingadapter.BindingAdapterItem;

/**
 * Created by m on 2017/5/6.
 */

public class ImageBean extends BaseObservable implements BindingAdapterItem {

    @Override
    public int getViewType() {
        return R.layout.adpter_image;
    }

}
