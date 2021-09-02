package steps.table;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTaskWithData extends TestBase {

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Given("Click Add new Task")
    public void clickNewTask() throws MalformedURLException {
        Android_setUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
    }

    @And("Enter {string} and {string}")
    public void enterAnd(String taskName, String taskDesc) {
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDesc(taskDesc);
    }

    @When("Click Save")
    public void clickAndSave() {
        createTaskPage.clickSaveBtn();
    }

    @Then("Task Add successfully")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }
}
