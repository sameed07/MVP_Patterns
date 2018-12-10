package main;


/**
 * this define the contract between the view {@link MainActivity} and presenter {@link MiainContract}
 */
public interface MiainContract {

    interface MvpView{
        void showSignInScreen();
        void showSignUpScreen();
    }
    interface Presenter{
        void handleSignInButtonClick();
        void handleSignUnButtonClick();
    }
}
