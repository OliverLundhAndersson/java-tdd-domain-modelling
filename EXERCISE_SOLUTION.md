| Classes           | Variables                          | Methods             | Scenario                                                                                                   | Outcome |
|-------------------|------------------------------------|---------------------|------------------------------------------------------------------------------------------------------------|---------|
| 'ShoppingItem'    | String name                        |                     |                                                                                                            |         |
|                   | float price                        |                     |                                                                                                            |         |
| 'UserItem'        | ShoppingItem item                  | 'calculatePrice()'  | Return the cost of item * itemAmount                                                                       | float   |
|                   | Integer itemAmount                 |                     |                                                                                                            |         |
| 'ShoppingManager' | ArrayList(UserItem) shoppingBasket | 'countSumOfItems()' | Return the total cost of all items in shoppingBasket                                                       | float   |
|                   |                                    | 'printReceipt()'    | Print item.name, item.price and itemAmount for all items in shoppingBasket as well as 'countSumOfItems()'  |         |
