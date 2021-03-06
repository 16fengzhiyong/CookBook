package com.scorpiomiku.cookbook.ownInformation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.scorpiomiku.cookbook.R;
import com.scorpiomiku.cookbook.basket.BasketActivity;
import com.scorpiomiku.cookbook.collection.MyCollectionFragment;
import com.scorpiomiku.cookbook.dynamic.DynamicActivity;
import com.scorpiomiku.cookbook.dynamic.MyDynamicActivity;
import com.scorpiomiku.cookbook.module.FragmentModule;
import com.scorpiomiku.cookbook.sign.SignInActivity;

/**
 * Created by Administrator on 2017/7/2.
 */

public class MyInformationFragment extends FragmentModule {

    private ImageView mAccoutImageView;
    private TextView mAccountNameTextView;

    private ImageView mBasketImageView;
    private TextView mMyDynamicTextView;
    private TextView mDynamicTextView;
    private TextView mAccountSetTextView;
    private TextView mHelpTextView;
    private TextView mAccountManagerTextView;

    public static MyInformationFragment newInstance() {
        return new MyInformationFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.my_information_fragment_layout, container, false);
        mAccountNameTextView = (TextView) v.findViewById(R.id.my_information_name_text_view);
        mAccoutImageView = (ImageView) v.findViewById(R.id.my_information_image_view);
        mBasketImageView = (ImageView) v.findViewById(R.id.my_information_basket_image_view);
        mMyDynamicTextView = (TextView) v.findViewById(R.id.my_information_my_dynamic_text_view);
        mDynamicTextView = (TextView) v.findViewById(R.id.my_information_dynamic_text_view);
        mAccountSetTextView = (TextView) v.findViewById(R.id.my_information_account_set_text_view);
        mHelpTextView = (TextView) v.findViewById(R.id.my_information_help_text_view);
        mAccountManagerTextView = (TextView) v.findViewById(R.id.my_information_account_manage_text_view);

        mAccountManagerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), SignInActivity.class);
                startActivity(i);
            }
        });


        mBasketImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasketActivity.class);
                startActivity(i);
            }
        });
        mHelpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), HelpActivity.class);
                startActivity(i);
            }
        });

        mAccoutImageView.setImageResource(R.drawable.test);

        mDynamicTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DynamicActivity.class);
                startActivity(i);
            }
        });
        mMyDynamicTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MyDynamicActivity.class);
                startActivity(i);
            }
        });

        mAccountSetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), InformationChangeActivity.class);
                startActivity(i);
            }
        });
        return v;
    }
}
