package com.example.ayou.jk_takeout.firstpage.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ayou.jk_takeout.R;
import com.example.ayou.jk_takeout.firstpage.model.bean_class;
import com.example.ayou.jk_takeout.firstpage.view.classShopActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by AYOU on 2017/4/25.
 */

public class twoClass extends Fragment {

    private Context context;
    private LayoutInflater mInflater;
    private List<bean_class.DataBean.ListBean> mList_class;


    public twoClass() {
    }

    public twoClass(Context context) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = mInflater.inflate(R.layout.class_two_item, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    //传递数据
    public void getData(List<bean_class.DataBean.ListBean> list){
        if (mList_class==null){
            mList_class = new ArrayList<>();
        }
        mList_class.addAll(list);
    }

    @OnClick({R.id.iv_class_two_japan, R.id.iv_class_two_cake, R.id.iv_class_two_dark, R.id.iv_class_two_yellow, R.id.iv_class_two_malatang, R.id.iv_class_two_lifeshop, R.id.iv_class_two_pizza})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_class_two_japan:
                Intent intent = new Intent(context, classShopActivity.class);
                intent.putExtra("id",mList_class.get(8).getId());
                startActivity(intent);
                break;
            case R.id.iv_class_two_cake:
                Intent intent1 = new Intent(context, classShopActivity.class);
                intent1.putExtra("id",mList_class.get(9).getId());
                startActivity(intent1);
                break;
            case R.id.iv_class_two_dark:
                Intent intent2 = new Intent(context, classShopActivity.class);
                intent2.putExtra("id",mList_class.get(10).getId());
                startActivity(intent2);
                break;
            case R.id.iv_class_two_yellow:
                Intent intent3 = new Intent(context, classShopActivity.class);
                intent3.putExtra("id",mList_class.get(11).getId());
                startActivity(intent3);
                break;
            case R.id.iv_class_two_malatang:
                Intent intent4 = new Intent(context, classShopActivity.class);
                intent4.putExtra("id",mList_class.get(12).getId());
                startActivity(intent4);
                break;
            case R.id.iv_class_two_lifeshop:
                Intent intent5 = new Intent(context, classShopActivity.class);
                intent5.putExtra("id",mList_class.get(13).getId());
                startActivity(intent5);
                break;
            case R.id.iv_class_two_pizza:
                Intent intent6 = new Intent(context, classShopActivity.class);
                intent6.putExtra("id",mList_class.get(14).getId());
                startActivity(intent6);
                break;
        }
    }
}