$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/feature.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.homeLogo.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to url",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.homeLogo.navigate_to_google_com(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I complete action",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenition.homeLogo.i_complete_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefenition.homeLogo.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.homeLogo.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});