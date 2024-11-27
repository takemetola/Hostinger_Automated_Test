# Test Case 1: User Login on [Hostinger](https://www.hostinger.com/) Webpage

## Objective
To verify that existing users can successfully log in via Gmail to their <a href="https://www.hostinger.com/" style="color:purple;">Hostinger</a> account.

## Preconditions
- An existing Hostinger account with valid credentials.
- A web browser (Google Chrome Version 120.0.6099.216) installed on the testing machine.

## Test Steps:

1. **Open Web Browser:**
    - Open Chrome web browser.

2. **Navigate to Hostinger Homepage:**
    - Enter the URL '<a href="https://www.hostinger.com/" style="color:purple;">www.hostinger.com</a>' in the browser's address bar and press Enter.

3. **Click on "Login":**
    - Click on the link to access the login page.

4. **Click on Login via Gmail:**

5. **Enter existing Gmail email account and click next:**
    - Data used: desire2work4hostinger@gmail.com

6. **Enter valid password for the account and click next:**
    - Data used: testapp123

6. **Verification:**
    - User is taken to homepage.
    - Verify by reading welcome message and user email on Account info tab.

## Expected Result
- The user should be successfully logged in, and the system should redirect to the user's account dashboard.
- A welcome message "Hi, John" should be displayed and test should read desire2work4hostinger@gmail.com email from
Account info tab.

## Postconditions
- The user should have access to their account settings.



# Test Case 2: User Profile Information Update

## Objective
Verify that a user can successfully update their account information, including changing their name, phone number, and adding additional details.

### Test Case 2.1: User Profile Update - Change Name

#### Objective
Verify that a user can successfully update their name in the account information.
## Preconditions:
- Login with valid account on set up:
  Data used:
  e-mail: desire2work4hostinger@gmail.com
  password: testapp123

#### Test Steps:
1. **Login with Existing User Data**
   - Navigate to the login page.
   - Enter valid existing user credentials.
   - Click on the login button.

2. **Navigate to Account Information**
   - Once logged in, navigate to the Account tab.
   - Click on the "Account Information" option.

3. **Change Name to John Wick**
   - Locate the "Name" field in the account information section.
   - Change the current first name and last name.
   - Type in a valid password.
   - Save the changes.

#### Expected Results
- After step 3, the user's name should be updated to "John Wick."

### Test Case 2.2: User Profile Update - Change Phone Number

#### Objective
Verify that a user can successfully update their phone number in the account information.
## Preconditions:
- Login with valid account on set up:
  Data used:
  e-mail: desire2work4hostinger@gmail.com
  password: testapp123

#### Steps
1. **Login with Existing User Data**
   - Navigate to the login page.
   - Enter valid existing user credentials.
   - Click on the login button.

2. **Navigate to Account Information**
   - Once logged in, navigate to the Account tab.
   - Click on the "Account Information" option.

3. **Change Phone Number with Password Confirmation**
   - Locate the "Phone Number" field in the account information section.
   - Change the current phone number.
     Data used: 123123
   - Enter the user's password to confirm the change.
   - Save the changes.

#### Expected Results
- After step 3, the phone number should be changed, and the changes should be confirmed with the password.

### Test Case 2.3: User Profile Update - Add Additional Details

#### Objective
Verify that a user can successfully add additional details to their account information.
## Preconditions:
- Login with valid account on set up:
  Data used:
  e-mail: desire2work4hostinger@gmail.com
  password: testapp123

#### Steps:
1. **Login with Existing User Data**
   - Navigate to the login page.
   - Enter valid existing user credentials.
   - Click on the login button.

2. **Navigate to Account Information**
   - Once logged in, navigate to the Account tab.
   - Click on the "Account Information" option.

3. **Update Additional Details with a Message**
   - Locate the "Additional Details" section.
   - Add the message.
     Data used: "# $ % & ' ( ) / 0 1 2 3 ; < = > ?  a b c { | } ~"
   - Enter the user's password to confirm the change.
   - Save the changes.

#### Expected Results
- After step 3, the additional details should include the added message.


# Test Case Scenario 3: Domain Search and service addition to the shopping cart
## Preconditions:
- Login with valid account on set up:
  Data used:
  e-mail: desire2work4hostinger@gmail.com
  password: testapp123

## Steps:
1. **Navigate to the Hostinger.com homepage.**
   - Should be on the homepage when logged in with set up account.

2. **Click on the "Domains" link.**
   - *Action:* Locate and click on the "Domains" link on the homepage.

3. **Enter the domain name "mylatestproject" in the domain search name box.**
   - *Action:* Type "mylatestproject" into the domain name input box.

4. **Click the "Search" button.**
   - *Action:* Click on the "Search" button.

5. **Scroll to the bottom of the screen.**
   - *Action:* Scroll down to the bottom of the search results.

6. **Confirm that ".ai" is available.**
   - *Action:* Verify the availability of "mylatestproject.ai" in the search results.

7. **Click on the "Buy Domain" button.**
   - *Action:* Click on the "Buy Domain" button.

8. **Read the total price for 2 years of renting the domain.**
   - *Action:* Locate and read the total price "$217.78" displayed for a 2-year rental of the domain during the checkout process.

## Expected Results:
- The search results should be displayed, and ".ai" should be available.
- The user should be able to click on "Buy Domain" and proceed to the checkout page.
- The total price "$217.78" for a 2-year lease of the domain should be clearly displayed.
