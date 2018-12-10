package main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vchat.muhammadfaizan.mvppatterns.R;

/**
 * It just display the main screen
 *
 */

public class MainActivity extends AppCompatActivity implements MiainContract.MvpView {

    private MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);

    }
}
