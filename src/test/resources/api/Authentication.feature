@Authentication
Feature: Authentication
  As an user
  I want to login or register
  So that I can see user information

  Scenario: Post - As user I have be able to register
    Given I set valid POST endpoint
    When I send POST HTTP Req
    Then I receive correct HTTP response code is 200

  Scenario: Post - As user I failed to register
    Given I set invalid POST endpoints
    When I send POST HTTP Reques
    Then I receive correct HTTP response code is 404

  Scenario: Post - As user I have be able to login
    Given I set valid POST endpoints
    When I send POST HTTP Reqs
    Then I receive the HTTP response code is 200

  Scenario: Post - As user I failed to login
    Given I set invalids POST endpoint
    When I sending POST HTTP Reques
    Then I receive the HTTP response code is 404

  Scenario: Get - As user I have be able to get user information
    Given I am set valid GET endpoint
    When I am send GET HTTP Request
    Then I am receive correct HTTP response code 200

  Scenario: Get - As user I failed to get user information
    Given I am set invalid GET endpoint
    When I am send GET HTTP Requests
    Then I am receive correct HTTP response code 404