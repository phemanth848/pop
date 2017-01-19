<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<s:form action="reg" method="post" commandName="userInfo">
<h3>Registration Form</h3>
<pre>
<tr>
	<td>Name:</td>
	<td><s:input path="name" /></td>
	<td><s:errors path="name"/>
</tr>
<tr>
	<td>Password:</td>
	<td><s:password path="password"/></td>
	<td><s:errors path="password"/>
</tr>
<tr>
	<td>email:</td>
	<td><s:input path="email"/></td>
	<td><s:errors path="email"/>
</tr>
<tr>
	<td>DOB:</td>
	<td><s:input path="dob"/></td>
	<td><s:errors path="dob"/>
</tr>
<tr>
	<td>Designation:</td>
	<td><s:select path="desgination" items="${designations}"/></td>
	<td><s:errors path="desgination"/>
</tr>
	<input type="submit" value="Register"/>
</pre>
</s:form>