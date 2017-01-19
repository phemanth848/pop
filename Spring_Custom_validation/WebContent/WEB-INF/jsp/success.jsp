<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ page isELIgnored="false" %> 
            
 <tr>
    <td>
     Hi, Your informations are,
    </td>
</tr>
<br>
<tr>
    <td>User Name:</td>
    <td>${userInfo.name}</td>
</tr>
<br>
<tr>
    <td>E-mail:</td>
    <td>${userInfo.email}</td>
</tr>
<br>
<tr>
    <td>Birthday:</td>
    <td>${userInfo.dob}</td>
</tr>
<br>
<tr>
    <td>Profession:</td>
    <td>${userInfo.desgination}</td>
</tr>
