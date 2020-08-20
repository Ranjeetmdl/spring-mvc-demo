<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
       
       First Name : <form:input path="firstName"/>
       <br><br>
       
       Last Name : <form:input path="lastName"/>
       <br><br>
       Country :
       <form:select path="country">
          <form:options items="${theCountryOptions}"/>
       </form:select>
       
       <br><br>
       Favorite Language:
       Java<form:radiobutton path="favoriteLanguage" value="Java"/>
       Python<form:radiobutton path="favoriteLanguage" value="Python"/>
       C#<form:radiobutton path="favoriteLanguage" value="C#"/>
       Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
       <br><br>
       
       <br><br>
       Operating Systems:
       Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
       MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
       Linux<form:checkbox path="operatingSystems" value="Linux"/>
       Sun Solaris<form:checkbox path="operatingSystems" value="Sun Solaris"/>
       
       <br><br>
       <input type="submit" value="Submit">
       
    </form:form>

</body>
</html>