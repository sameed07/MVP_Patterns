package main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/*
Loca unit test for MainPresenter
 */
public class MainPresenterTest {

    @Mock
    private MiainContract.MvpView view;
    MainPresenter mPresenter;


    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        mPresenter = new MainPresenter(view);
    }

    @Test
    public void handleSignInButtonClick() {

        mPresenter.handleSignInButtonClick();
        verify(view).showSignInScreen();
    }


    @Test
    public void handleSignUnButtonClick() {
        mPresenter.handleSignUnButtonClick();
        verify(view).showSignUpScreen();
    }
}