Feature: Job Search

  @sanity @regression
  Scenario Outline: :  verify Job Search Result Using Different data

    Given I am On homepage
  When I enter job title "<jobTitle>"
  And I enter Location "<location>"
  And I select distance "<distance>"
  And I click on moreSearchOptionsLink
  And I enter salaryMin "<salaryMin>"
  And I enter salaryMax "<salaryMax>"
  And I select salaryType "<salaryType>"
  And I select jobType "<jobType>"
  And I click on 'Find Jobs' button
  Then verify the result "<result>"
  Examples:

    | jobTitle                | location    | distance | salaryMin | salaryMax | salaryType | jobType   | result                                               |
    | Tester                  | Harrow      | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow                      |
    | Developer               | London      | 7 miles  | 28000     | 32000     | Per annum  | Permanent | Permanent Developer jobs in London                   |
    | Senior Business Analyst | Birmingham  | 10 miles | 40000     | 45000     | Per annum  | Permanent | Permanent Senior Business Analyst jobs in Birmingham |
    | Test Analyst            | West London | 15 miles | 39000     | 45000     | Per annum  | Permanent | Permanent Test Analyst jobs in West London           |
    | Test Engineer           | Somerset    | 10 miles | 3000      | 4000      | Per month  | Contract  | Contract Test Engineer jobs in Somerset              |
    | Test Manager            | London      | 10 miles | 4000      | 5000      | Per month  | Contract  | Contract Test Manager jobs in London                 |
    | Development Manager     | London      | 15 miles | 50000     | 60000     | Per annum  | Permanent | Permanent Development Manager jobs in London         |


