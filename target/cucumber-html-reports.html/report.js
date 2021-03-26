$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Google.feature");
formatter.feature({
  "name": "As a user, I should be able to search details",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Google"
    }
  ]
});
formatter.scenario({
  "name": "I should be able to see results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Google"
    }
  ]
});
formatter.step({
  "name": "I am on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "google.step_def.Google_Search_Step_Def.iam_on_the_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Iphone\" and enter search area",
  "keyword": "When "
});
formatter.match({
  "location": "google.step_def.Google_Search_Step_Def.ienter_and_enter_search_area(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "google.step_def.Google_Search_Step_Def.I_should_be_able_to_see_the_search_result()"
});
formatter.result({
  "status": "passed"
});
});