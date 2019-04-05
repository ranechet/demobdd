$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demo.feature");
formatter.feature({
  "line": 1,
  "name": "first feature",
  "description": "",
  "id": "first-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "this is first scenario",
  "description": "",
  "id": "first-feature;this-is-first-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "my first given",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});