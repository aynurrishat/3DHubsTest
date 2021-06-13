Feature: User should be able to upload files

  @test
  Scenario:  upload model file

    Given   on home page
    When    click on home hero button
    And     upload file with upload file button
    And     send valid user email address
    And     click on continue your instant quote button
    And     click on cross sign pop up
    Then    Verify user can upload file




