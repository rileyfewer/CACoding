package interface_adapter.clear_users;

import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;
import use_case.login.LoginInputData;
import use_case.login.LoginInputBoundary;
public class ClearController {
    final ClearInputBoundary clearUseCaseInteractor;

    public ClearController(ClearInputData clearUseCaseInteractor){
        this.clearUseCaseInteractor = (ClearInputBoundary) clearUseCaseInteractor;
    }

    public void execute() {
        ClearInputData clearInputData = new ClearInputData();
        clearUseCaseInteractor.execute(clearInputData);
    }
}
