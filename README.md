Developed in Java with Rest Assured

### Execution API Tests
`cd C:\Users\Digriz\IdeaProjects\Slotegrator` - setup your way to project

`mvn test -Dtest="AuthorizationTest"` - to run from command line. Also you may run them inside the IDE.

### Execution UI Tests
`cd C:\Users\Digriz\IdeaProjects\Slotegrator` - setup your way to project
`mvn clean test"` - to run from command line.

#### src/test folder:

`Folder: actions` - has all actions on pages;

`Folder: base -> BaseTest.java` - contains configuration for WebDriver;

`Folder: pages` - has locators and common data from pages;

`AddOffice369Test.java` - running UI tests.

`AutorizationTest.java` - running API tests.

