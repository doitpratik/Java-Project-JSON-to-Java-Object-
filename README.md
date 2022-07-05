# Java-Project-JSON-to-Java-Object (Simple command line based interface):
  Minor java project, Made using Jackson API which is popularly used for converting Java Object into JSON data
  and Vice Versa.
  
  # JSON:
    JavaScript Object Notation (JSON) is a lightweight, text-based, language-independent data interchange format. 
    It stores the object in the form of Key-value pair.
    JSON is compact. An average JSON string is about 2/3 of the size of the same data in XML.
    JSON is easy to learn, easy to read, and easy to understand.
    JSON Primitive Data type Support:
      1. String
      2. Number
      3. Boolean
      4. Null
    JSON supports 2 complex data type:
      1. Object (This one we are dealing with in the project)
      2. Array 
      
      Example of JSON data:
      
        { 
           "salesRep" : { "name" : "Dorothy Gale", 
                          "age" : 38, 
                          "region" : "Kansas, USA" 
                        }, 
           "tractorSales" : { "2009Quarterly" : [ 13, 27, 18, 9 ], 
                              "2008Quarterly" : [ 11, 17, 32, 5 ], 
                              "2007Quarterly" : [ 9, 25, 16, 10 ] 
                            } 
        }
        
  # How to Run the project
    1. Install the dependency jar files
        a. jackson-core-asl-1.19.3.jar
        b. jackson-mapper.asl-1.19.3.jar
    2. Setup the project and add the above jar files in the dependencies and build the project
    
    
 # Output :
    Image of Output Screen
    ![JSON_to_JAVAObj image](https://user-images.githubusercontent.com/65550720/177305110-15e17c8f-2ed8-42ce-bc88-5d44a26d40e3.PNG)
