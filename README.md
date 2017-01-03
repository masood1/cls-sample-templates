# cls-sample-templates
Sample templates to create MicroServices using Spring Boot

1. This sample contains a REST-API exposed using Spring Data Rest Repository Support.
2. The complete operation on MESSAGE table has been exposed using the api.
3. For Testing we are using H2 as an embeded database.
4. Note that the API is powered by Spring Data Rest Repository so no Rest Controller has been used, we only define 
   an interface and annotate it with @RepositoryRestResource.
5. The exposed endpoints will also support pagination apart from CRUD operations.


Steps to run 

1. To run clone or download the project
2. Go to root directory (where the pom.xml resides)
3. Run [ mvn clean install ] if build is successfull 
4. You should see a new target directory being created containg a jar file [jarFileName-version-SNAPSHOT.jar]
5. Now run the jar file using command [java -jar jarFileName-version-SNAPSHOT.jar]
6: Go to http:localhost:7071/

You should see the following output

{
  "_links": {
      "messageses": {
            "href": "http://localhost:7071/messages{?page,size,sort}",
	          "templated": true
		      },
		          "profile": {
			        "href": "http://localhost:7071/profile"
				    }
				      }
				      }
