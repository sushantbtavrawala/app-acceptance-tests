$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("app_home_page.feature");
formatter.feature({
  "line": 3,
  "name": "Check Ebay Home Page",
  "description": "",
  "id": "check-ebay-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Check navigation to ebay home page",
  "description": "",
  "id": "check-ebay-home-page;check-navigation-to-ebay-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the \"ebay home\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I will be on the \"ebay home\" page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ebay home",
      "offset": 19
    }
  ],
  "location": "CommonStepDef.scala:11"
});
formatter.result({
  "duration": 134727224,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ebay home",
      "offset": 18
    }
  ],
  "location": "CommonStepDef.scala:15"
});
formatter.result({
  "duration": 116867,
  "status": "passed"
});
});