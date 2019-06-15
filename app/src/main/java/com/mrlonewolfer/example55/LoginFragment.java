package com.mrlonewolfer.example55;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import javax.security.auth.callback.Callback;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends DialogFragment {

    private Callback callback;

    public LoginFragment() {
        // Required empty public constructor
    }

    public static DialogFragment newInstance() {
        return new LoginFragment();
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL,R.style.FullscreenDailogTheme);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_login, container, false);

    return view;
    }

    public interface Callback {

        void onActionClick(String name);

    }

}
