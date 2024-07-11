# Servlet
### Servlet technology is used to create a web application
### Servlet is a Java class that is used to extend the functionality of a web server
### Servlet is an interface that must be implemented for creating any Servlet.
### Servlet is a class that extends the capabilities of the servers and responds to the incoming requests. It can respond to any requests.
### Servlet is a web component that is deployed on the server to create a dynamic web page.
![alt text](image.png)

# Advantages of Servlet
### 1. Better performance: because it creates a thread for each request, not process.
### 2. Portability: because it uses Java language.
### 3. Robust: JVM manages Servlets, so we don't need to worry about the memory leak, garbage collection, etc.
### 4. Secure: because it uses java language.

# Servlet Interface 
## Servlet interface provides common behaviour to all the servlets.Servlet interface defines methods that all servlets must implement.

### Servlet interface needs to be implemented for creating any servlet (either directly or indirectly). It provides 3 life cycle methods that are used to initialize the servlet, to service the requests, and to destroy the servlet and 2 non-life cycle methods.

# Methods of Servlet interface
### 1. public void init(ServletConfig config) 
    Initializes the servlet.
### 2. public void service(ServletRequest request,ServletResponse response)
    Provides response for the incoming request.
### 3. public void destroy()
    Is invoked only once and indicates that servlet is being destroyed.
### 4. public ServletConfig getServletConfig()
    returns the object of ServletConfig.
### 5. public String getServletInfo()
    returns information about servlet such as writer, copyright, version etc