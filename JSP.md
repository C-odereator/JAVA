# JSP - Jakarta Server Pages ( Java server pages )

###  1. It is a server-side technology which is used for creating web applications
###  2. It is used to create dynamic web content
###  3. JSP = JAVA + HTML
###  4. It is an advanced version of Servlet Technology i.e. a web-based technology that helps us to create dynamic and platform-independent web pages

## There are several types of tags
### JSP Scriptlet tag
### In JSP, java code can be written inside the jsp page using the scriptlet tag
### The scripting elements provides the ability to insert java code inside the jsp
### There are three types of scripting elements
- 1 Scriptlet tag
  - A scriptlet tag is used to execute java source code in JSP
```jsp
  Example 1
  
  <%  java source code %>  

```
- 2 Expression tag
  - It is mainly used to print the values of variable or method  
```jsp
  Example 1

  Current Time: <%= java.util.Calendar.getInstance().getTime() %>    

```  
- 3 Declaration tag
  - The JSP declaration tag is used to declare fields and methods
```jsp
  Example 1

  <%! int data=50; %>  
  <%= "Value of the variable is:"+data %>

  Example 2

  <%!   
    int cube(int n){  
    return n*n*n*;  
  }  
  %>  
  <%= "Cube of 3 is:"+cube(3) %>
```