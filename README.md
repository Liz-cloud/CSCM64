# CSCM64
## Software Testing

### Exercise 1.
A bus company is iteratively developing an app for their services. The state of the
current iteration can be found on Canvas. The class Customer represents a customer record. It currently implements two main functions:

•  The function relativeTicketPrice implements the function computeRelativePrice that we have already seen in Lab 02.
•  The function hasValidName tests if the customer’s name, which currently is represented by a single string, is valid. For the time being, a valid name is defined as follows:
  – A name must consist of exactly two words, separated by white space.
  – The name must be plausible, to prevent the creation of fake accounts. For the purpose of the first iteration, a name is defined to be plausible if and only if it does not contain the string “Zoidberg” as a substring (ignoring case).
The class already contains fields that are to be used in other methods, such as the customer’s phone number or home address. It is expected that the class will undergo frequent changes at this stage of development. However, the existing functionality should already be tested.

**Tasks**
1. Interpret relativeTicketPrice as a pure function that takes as input the values age, student, pensioner, and premiumMember, and outputs the relative ticket price as a double. Interpret hasValidName as a pure function that depends only on the field name. For each function, give a test suite that provides MC/DC.

2. Implement your test suites in JUnit. In order to do so, you will have to construct instances of the Customer class. For each of your test suites, use the Adapter pattern to create a stable
interface to the Customer class. For example, to test the hasValidName-method it should be possible to construct a customer record from a given string, ignoring all other fields.

4. It is time to implement some sanity checks to prevent the creation of impossible customer records. Implement the following sanity checks:
• It must not be possible to create a customer with a negative age.
• It must not be possible to create a customer with an age greater than 150.
• It must not be possible to create a customer who is under the age of 18 and a premium member.
• It must not be possible to create a pensioner under the age of 65.
• It must not be possible to create a customer with an invalid name.

Test that your implementation works correctly. How does this affect your test suites?

5. A user study has concluded that recording customer’s favourite emoji was “a terrible idea”. Remove the favouriteEmoji field and methods related to it from the customer record. How does this impact your test suites?

6. Representing the customer’s name as a single string is probably a bad idea. Refactor the code to obtain an improved representation of the customer’s name. Update the hasValidName method and the associated test suite accordingly.
