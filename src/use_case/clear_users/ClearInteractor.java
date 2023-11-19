package use_case.clear_users;
import data_access.FileUserDataAccessObject;
import entity.User;
import use_case.login.LoginOutputBoundary;
import use_case.login.LoginUserDataAccessInterface;

import java.util.List;
// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    @Override
    public void execute(ClearInputData clearInputData) {
        clearUserDAO.getUsers();
        clearUserDAO.clear();
    }

    final ClearUserDataAccessInterface clearUserDAO;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDAO,
                           ClearOutputBoundary clearPresenter) {
        this.clearUserDAO = clearUserDAO;
        this.clearPresenter = clearPresenter;
    }

}
