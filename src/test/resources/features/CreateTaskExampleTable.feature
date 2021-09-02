Feature: Create New Task
  Scenario Outline: Then user can add new task
    Given Click Add new Task
    And Enter "<TaskName>" and "<TaskDesc>"
    When Click Save
    Then Task Add successfully

  Examples:
    | TaskName        | TaskDesc       |
    | Cucumber Task 1 | Task 1 Details |
    | Cucumber Task 2 | Task 2 Details |