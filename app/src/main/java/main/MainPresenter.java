package main;

/**
 * Responsilbe for handling actions from the view and  updating the UI as required
 */
public class MainPresenter implements MiainContract.Presenter {

    private MiainContract.MvpView mvpView;

    MainPresenter(MiainContract.MvpView mvpView){
        this.mvpView = mvpView;
    }

    // Presenter methods
    @Override
    public void handleSignInButtonClick() {

        mvpView.showSignInScreen();
    }

    @Override
    public void handleSignUnButtonClick() {

        mvpView.showSignUpScreen();
    }
}
