# priceAPI
none

#High level assumptions/ Key Points
1. Server is listening on port 8080 on the localhost.
2. Since Database integration was not the primary concern, have created a list (which will act as a collection of courses) in the priceServiceImpl
3. Course structre is :

   {
        "id": int,
        "title": String,
        "price": int,
        "priceStrategy": int
    }
 A post method is available to add courses to the list which will take Course object as a requestBody.This is the only way to add more courses to the structure.
 To avoid this, redis cache can also be used as an alternative.

4. Assuming only two currecy methods as of now: INR and USD
   Marked them in CourseRequest(request type for pricing api) as 
   paymentMode 0 -> INR
   paymentMode 1 -> USD
   
5. Handled conversion fee in conversionFee class and took conversion fee as :
INR -> 0%
USD -> 10%

6. Handled conversion fee in conversionFee class and took tax rate as:
INR -> 20%
USD -> 35%

#Steps to run the server
1. Import the project to Intellij/Eclipse/STS.
2. Run the application from RestapiApplication.java

#Steps to test api using postman:
Use postman to call post method with body as :
{
        "id": 3,
        "paymentMode": 1
}
(pass as raw, JSON(applicaton/json))
on URL: 
http://localhost:8080/pricing

*For valid calls, check the list id of courses in priceServiceImpl.java file. Alos pass only 0 or 1 as payment mode.


 

