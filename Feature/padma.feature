@app

Feature: online
Scenario: shopping
Given OpenApplication
When searchProduct
Then BuyProduct