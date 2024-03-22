# CPRO 2221 Assignment 3 - Addressing 3 out of 5 SOLID Principles
## Use Case
  ### Overview
  <p align="justify">
  An e-commerce application facilitates the buying and selling of products over the Internet. It
  involves various components such as product management, order processing, and pricing.
  </p>
  
  ### Scenario
  <p align="justify">
  Suppose we have an e-commerce platform with the main objective of displaying a list of
  products where users can select and buy their desired items. In this app, users can browse
  through the products available, add the product to the cart if desired, continue browsing or
  proceed to payment, and complete payment to confirm the transaction. Applying the principles
  of single responsibility, open-closed, and Liskov substitution ensures the platform’s efficiency,
  adaptability, and maintainability.
  </p>


## 3 of SOLID Principles
### Single Responsibility Principle (SRP)
  #### Overview
  <p align="justify">
  The Single Responsibility Principle (SRP) states that a class, module, or function should have
  only one reason to change. This means that a class, module, or function should only have one
  responsibility or purpose in a system. In other words, the SRP suggests that each class, module,
  or function in a software system should be responsible for only one part of the overall system
  functionality.
  </p>
  
  #### Importance
  <p align="justify">
  The SRP is a fundamental principle in software engineering because it makes code easier to
  understand, maintain, and extend since each class, module, or function focuses on a specific
  task. Additionally, it reduces the risk of unintended side effects when modifying code, as
  changes made to one responsibility won’t affect unrelated parts of the system. Ultimately,
  following the SRP leads to more robust and flexible software designs.
  </p>
  
  #### Application
  ##### Violated
  <p align="justify">
  In the violated version of the SRP, the ‘Order’ class has multiple responsibilities. While the
  primary responsibility of the ‘Order’ class should be to represent an order in an e-commerce
  system, this class also stores information about products, such as their names, ratings, and
  prices. This violates the SRP because a class should have only one primary responsibility.
  </p> 
  
  ##### Solved
  <p align="justify">
  In the solved version of the SRP, the ‘Order’ class is separated into two classes: the ‘Order’ class
  and the ‘Product’ class. The ‘Order’ class represents an order and its functionalities in an
  e-commerce system. This class is responsible for managing orders and order-related operations,
  such as adding products to the order, retrieving the product names in the order, getting the
  total items, and calculating the total price. On the other hand, the ‘Product’ class represents a
  product and its functionalities in an e-commerce system. This class is responsible for
  representing product details, such as name, rating, and price. By separating these
  responsibilities, each class adheres to the SRP, ensuring that they have a single reason to
  change.
  </p>

### Open-Closed Principle (OCP)
  #### Overview
  <p align="justify">
  The Open-Closed Principle (OCP) states that a class, module, or function should be open for
  extension but closed for modification. This means that the system should be designed in a way
  where new functionality can be added by extending existing code instead of modifying it. In
  essence, the OCP suggests that once a class, module, or function is created, it should not be
  modified to add new functionality.
  </p>
  
  #### Importance
  <p align="justify">
  The OCP is an essential principle in software engineering because it promotes code
  maintainability, reusability, and scalability. By adhering to the OCP, developers can create
  software systems that are easier to maintain and extend over time. It encourages the use of
  design patterns and modular programming practices. Additionally, it reduces the risk of
  introducing bugs or unintended side effects when making changes to existing code. Ultimately,
  the OCP helps create more robust and flexible software designs that can adapt to changing
  requirements.
  </p>
  
  #### Application
  ##### Violated
  <p align="justify">
  In the violated version of the OCP, the extensibility of the codebase is restricted. The
  ‘CreditCardPayment’ class has a ‘pay’ method that specifically handles payments made using a
  credit card. This class is not open for extension because it only caters to one payment method,
  meaning that the class would need to be modified if a new payment method is required.
  Additionally, the ‘Order’ class directly instantiates a ‘CreditCardPayment’ object as a property,
  making the ‘Order’ class not open for extension to support other payment methods without
  modification. Lastly, the ‘processOrder’ method in the ‘Order’ class directly invokes the ‘pay’
  method on the ‘CreditCardPayment’ object, which further ties the ‘Object’ class to the specific
  payment method. This violates the OCP because any changes or additions to payment methods
  would require modifications to existing classes.
  </p>
  
  ##### Solved
  <p align="justify">
  In the solved version of the OCP, a ‘Payment’ interface holding a ‘pay’ method that will be
  overridden by different payment methods is introduced. There are two concrete classes
  implementing the ‘Payment’ interface: ‘CreditCardPayment’ and ‘PayPalPayment’. Each
  payment method class provides its implementations of the ‘pay’ method specific to that
  payment method. By using an interface that holds methods that can be implemented by
  different payment methods, the code is open for extension because new payment methods can
  be added by creating additional classes that implement the ‘Payment’ interface without
  modifying existing code. Furthermore, the ‘Order’ class now has a property ‘payment’ of type
  ‘Payment’ instead of a property for a specific payment method. The ‘processOrder’ method
  now also takes a ‘Payment’ object as a parameter, allowing flexibility in the choice of payment
  method. This makes it so that the ‘processOrder’ method can dynamically set the payment
  method and invoke the ‘pay’ method on the provided ‘Payment’ object. This design allows the
  ‘Order’ method class to be closed for modification and open for extension, adhering to the OCP.
  </p>

### Liskov Substitution Principle (LSP)
  #### Overview
  <p align="justify">
  The Liskov Substitution Principle (LSP) states that any subclass of a superclass should be usable
  in place of the superclass without affecting the correctness of the program. This means that a
  subclass should never change the characteristics or properties of its superclass. Simply, the LSP
  suggests that when creating a superclass that is extended to a subclass, the subclass should
  utilize all of the properties and behaviour of the superclass.
  </p>
  
  #### Importance
  <p align="justify">
  The LSP is a significant principle in object-oriented programming because it promotes
  polymorphism and abstraction. By adhering to the LSP, developers can design more flexible and
  extensible software systems that are easier to understand, maintain, and evolve over time. It
  encourages the creation of cohesive class hierarchies, facilitating code reuse and promoting
  good design practices in object-oriented programming. Ultimately, the LSP ensures the creation
  of flexible software solutions capable of adapting to evolving needs.
  </p>
  
  #### Application
  ##### Violated
  <p align="justify">
  In the violated version of the LSP, the ‘Ebook’ class extends the ‘Product’ class that has a ‘ship’
  method. However, since an ebook doesn’t need to be shipped, the ‘Ebook’ class doesn’t
  properly implement the ‘ship’ method. This violates the LSP because it means that the ‘Ebook’
  class doesn’t maintain the same behaviour as the ‘Product’ class.
  </p>
  
  ##### Solved
  <p align="justify">
  In the solved version of the LSP, two other classes that extend the ‘Product’ class are
  introduced: the ‘DigitalProduct’ class and the ‘PhysicalProduct’ class. The ‘Product’ class serves
  as the base class for different types of products in an e-commerce system. It has a ‘printDetails’
  method for printing product details and a ‘deliver’ method that represents the action of
  delivering a product. Subclasses implement these methods, which is realistic as all products
  have product details and need to be delivered in some way. Next, the class hierarchy continues
  with the ‘PhysicalProduct’ class and the ‘DigitalProduct’ class. These are subclasses of the
  ‘Product’ class that represent physical products and digital products, respectively. They both
  override the ‘deliver’ method of the ‘Product’ class to specify the proper delivery method for a
  physical product or a digital product. Finally, the ‘Camera’ and ‘Ebook’ subclasses are last in the
  class hierarchy. These are subclasses that represent specific types of products of the
  ‘PhysicalProduct’ class and the ‘DigitalProduct’ class, respectively. They inherit the behaviour of
  their respective parent classes and provide additional specific functionalities. This design
  ensures that subclasses maintain the same behaviour as their base class, adhering to the LSP.
  </p>
