<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:set value="admin@abc.com" var="email" />

<hr>
<a href="mailTo:${email}" style="text-align: center;">Contact</a>