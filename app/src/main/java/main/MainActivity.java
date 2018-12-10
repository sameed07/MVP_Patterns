package main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

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

    //these are MVP view methods

    @Override
    public void showSignInScreen() {

        Toast.makeText(this, "Taking user to signun Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {

        Toast.makeText(this, "Taking user to signupScreen", Toast.LENGTH_SHORT).show();
        
    }
}
