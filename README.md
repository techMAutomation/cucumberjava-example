To Run all the Tests:

- open command prompt and navigate to the Project then run the below command:
mvn clean install -Dtags="@test"

To Run a specific Test:

- In the feature file remove the tag '@test' from the start of the Feature file.
- Add it to the scenario which one you would like to run
- Finally, run the above command so that it will run only that particular scenario

Tag features files or Scenarios as Manual:

- If you don't want to run the Features/scenarios, then tag them as - not @manual

