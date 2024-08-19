Snapdeal QA Automation Project

Overview
Welcome to the Snapdeal QA Automation Project. This repository contains automated test scripts designed to validate key functionalities of the Snapdeal website. The goal is to ensure that the website operates smoothly and as expected for end users.

Tools and Technologies

Selenium WebDriver

Why Selenium WebDriver?
- Web Automation: Selenium WebDriver is a robust tool for automating web interactions, making it ideal for testing dynamic web applications.
- Cross-Browser Testing: It supports multiple browsers, allowing us to verify compatibility across different environments.
- Integration: Selenium integrates seamlessly with various testing frameworks and tools, enhancing its versatility.

 TestNG

Why TestNG?
- Flexible Configuration: TestNG's XML-based configuration facilitates easy management of test suites and test cases.
- Parallel Execution: The ability to run tests in parallel speeds up the execution process, which is crucial for large test suites.
- Reporting: Provides detailed and comprehensive reports, helping in effective tracking and analysis of test results.

Java

Why Java?
- Rich Ecosystem: Java's extensive libraries and frameworks complement Selenium and TestNG, providing a solid foundation for automation.
- Performance: Known for its performance and reliability, Java is well-suited for executing extensive and complex test scenarios.
- Community Support: A large user community offers ample resources and support, aiding in development and troubleshooting.

Test Cases

The following test cases have been implemented to ensure the functionality and reliability of the Snapdeal website:
1. Title Verification
   - Objective: Confirm that the page title matches the expected title.
   - Reason: Verifies that the correct page is loaded, which is a fundamental check for the application's integrity.

2. Filtering Options
   - Objective: Ensure that filtering options are visible and functional.
   - Reason: Validates that users can filter products effectively, enhancing their shopping experience.

3. Clear Filter Button
   - Objective: Test the functionality of the button that clears applied filters.
   - Reason: Ensures that users can reset filters and view all available products.

4. Cart Functionality
   - Objective: Verify that items can be added to the cart and are displayed correctly.
   - Reason: Confirms that the shopping cart functionality is working as intended, which is crucial for the purchasing process.

5. Broken Links
   - Objective: Identify any broken links on the page.
   - Reason: Ensures that all links are operational, preventing users from encountering dead ends.

6. Pincode Search
   - Objective: Test the pincode search functionality to ensure it updates product availability based on the entered pincode.
   - Reason: Validates that users can check product availability in their area, improving the relevance of search results.

Test Implementation

The test cases are implemented using the following classes:
- VerifyBrokenLink.java: Checks for and reports broken links on the page.
- VerifyCart.java: Tests the cart's functionality, including adding and viewing items.
- VerifyClearFilter.java: Verifies that the clear filter button resets filters correctly.
- VerifyFilterTest.java: Ensures that filtering options are displayed and applied properly.
- VerifyPincodeSearch.java: Tests the functionality of the pincode input field.

Running the Tests

To execute the test suite, you can use the following methods:
- Via IDE: Open `testng.xml` in your preferred IDE and run it as a TestNG suite.

- Command Line (Maven):
  mvn test -DsuiteXmlFile=testng.xml

Challenges and Resolutions

Dynamic Web Elements

Issue: Some web elements were not immediately available for interaction.
Solution: Implemented explicit waits and retry logic to handle these elements effectively.

Handling Broken Links

Issue: Some links were dynamically generated, making it challenging to verify all links reliably.
Solution: Limited the link check to a manageable number and included exception handling to address temporary issues.

Conclusion

This project provides a comprehensive suite of automated tests for the Snapdeal website, leveraging Selenium WebDriver and TestNG. These tests help ensure that the website remains functional and user-friendly. If you have any questions or need further information, please feel free to reach out.

Thank you for reviewing this project!
---
