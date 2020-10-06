package com.neo.mvphelloworld.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.neo.mvphelloworld.R;
import com.neo.mvphelloworld.contract.MainActivityContract;
import com.neo.mvphelloworld.presenter.MainActivityPresenter;

import static com.neo.mvphelloworld.contract.MainActivityContract.*;


/**
 * The View
 */
public class MainActivity extends AppCompatActivity implements MainActivityContract.View{
    private Button mButton;
    private TextView mTextView;
    private Presenter mPresenter;     // listener for presenter interface


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        mTextView = findViewById(R.id.textView_hello);
        mButton = findViewById(R.id.btn_hello);
        mButton.setOnClickListener(view -> mPresenter.onClick(view));
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}