# Tenmo - A money movement application's server

A server side application that can create accounts, transfer money, and request money between users. Definitely not inspired by any popular consumer money movement applications.

## User stories
1. As a user of the system, I need to be able to register myself with a username and password.
   1. The ability to register has been provided in your starter code.
2. As a user of the system, I need to be able to log in using my registered username and password.
   1. Logging in returns an Authentication Token. I need to include this token with all my subsequent interactions with the system outside of registering and logging in.
   2. The ability to log in has been provided in your starter code.
   3. User ids start at 1001.
3. As a user, when I register a new account is created for me.
   1. The new account has an initial balance of $1000.
   2. Account ids start at 2001.
4. As an authenticated user of the system, I need to be able to see my Account Balance.
5. As an authenticated user of the system, I need to be able to *send* a transaction of a specific amount of TE Bucks to a registered user.
   1. I should be able to choose from a list of users to send TE Bucks to.
   2. I must not be allowed to send money to myself.
   3. A transaction includes the User IDs of the from and to users and the amount of TE Bucks.
   4. The receiver's account balance is increased by the amount of the transaction.
   5. The sender's account balance is decreased by the amount of the transaction.
   6. I can't send more TE Bucks than I have in my account.
   7. I can't send a zero or negative amount.
   8. A Sending Transfer has an initial status of *Approved*.
   9. Transaction ids start at 3001.
6. As an authenticated user of the system, I need to be able to see transactions I have sent or received.
7. As an authenticated user of the system, I need to be able to retrieve the details of any transaction based upon the transaction ID.
8. As an authenticated user of the system, I need to be able to *request* a transaction of a specific amount of TE Bucks from another registered user.
   1. I should be able to choose from a list of users to request TE Bucks from.
   2. I must not be allowed to request money from myself.
   3. I can't request a zero or negative amount.
   4. A transaction includes the User IDs of the from and to users and the amount of TE Bucks.
   5. A Request Transfer has an initial status of *Pending*.
   6. No account balance changes until the request is approved.
   7. The transaction request should appear in both users' list of transactions (use case #5).
9.  As an authenticated user of the system, I need to be able to see my *Pending* transactions.
10. As an authenticated user of the system, I need to be able to either approve or reject a Request Transfer.
   8. I can't "approve" a given Request Transfer for more TE Bucks than I have in my account.
   9. The Request Transfer status is *Approved* if I approve, or *Rejected* if I reject the request.
   10. If the transaction is approved, the requester's account balance is increased by the amount of the request.
   11. If the transaction is approved, the requestee's account balance is decreased by the amount of the request.
   12. If the transaction is rejected, no account balance changes.