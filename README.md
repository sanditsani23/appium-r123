# R123-Appium

## Requirements
- AppiumStudio
- IDE
- JRE, JDK Library
- TestNG
- Device for testing

## Package Structure
```
├──  JRE System Library
├──  src
│   ├── android.r123.config
│      └──  AndroidTestData.properties
│      └──  Config.properties
│   ├── android.r123.auth
│      └──  C1_Login_VerifiedUser.java
│   ├── android.r123.pageobjects
│      └──  AssertEqual_List.java
│      └──  Auth.java
│      └──  Beranda.java
│   ├── android.r123.util
│      └──  Base_Test.java
│      └──  GeneralUtilities.java
├──  Referenced Libraries
├──  libs
├──  test-output
└──   testng.xml

```


**android.r123.config** packages include :
  - *AndroidTestData.properties* is a file where we save the data that will we use in the automation. Such as username, password, URL, OTP, etc.
  - *Config.properties* is a file where we setup the app mobile setting from the appium to eclipse, such as APP_Package, APP_Activity, LocalHostURL and DeviceNumber.
  
  **android.r123.pageobjects** This package where we placed our objects. It can be based on the feature, page, etc. The packages include :
  -  *AssertEqual_List.java* is a file where we write all verify method.
  -  *Auth.java* is a file where we save objects for authentication flow / page.
  -  *Beranda.java* is a file where we save objects in Beranda page.
  
  **android.ninetynine.util** This package where we placed our objects. It can be based on the feature, page, etc. The package include :
  -  *Base_Test.java* is a file where we setting the app_package, app_activity to connect it to appium. 
  -  *GeneralUtilities.java* is a file where we write basic method that we will call it from pageobjects package. Such a *click method*, *input method*, *verify method*, etc.

**android.ninetynine.auth** This package where we placed our test case. It can be based on the feature, regression, etc. The package include :
  -  *C1_Login_VerifiedUser.java* is a example file where we write login with verified user test case.


## Installation
1. Install all the requirements above.
2. Clone the repo.

**AppiumStudio**
1. Connect the device to laptop.
2. Open the device that appium read.
3. In 'Application' section, click 'Import application from Android Device'
4. Search *app_package* that we want to test (in this case, the name is 'com.rumah123.debug')
5. Click 'Import'

**IDE**
1. Open the project in IDE.

## How to Run
**AppiumStudio**
1. Connect the device to laptop
2. Open the phone that already connected with appium
3. Make sure the emulator running 

**IDE**
1. Open android.r123.auth (this package were we save the test case)
2. Right click by one of the java file that we want to run
3. Run As > TestNG


## Appium Documentation on Confluence
https://99dotco.atlassian.net/wiki/spaces/9GE/pages/1210646529/Appium+Documentation
