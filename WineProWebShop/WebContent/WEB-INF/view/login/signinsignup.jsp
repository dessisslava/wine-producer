<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div>
	<sec:authorize access="!isAuthenticated()">

		<div class="msg">
			<h3>Please Sign In!</h3>
		</div>

		<form class="signin" action="<s:url value="/authentication_check"/>"
			method="post">
			<fieldset>
				<div>
					<label for="j_username">Username</label> <input id="email"
						type="text" name="j_username" />
				</div>
				<div>
					<label for="j_password">Password</label> <input id="pass"
						type="password" name="j_password" />
				</div>
				<input id="remember_me" type="checkbox" value="1"
					name="_spring_security_remember_me" /> <label for="remember_me">Remember
					me</label> <input id="submit" type="submit" value="Sign In!" name="commit" />
			</fieldset>
		</form>
	</sec:authorize>

	<sec:authorize access="isAuthenticated()">
		<span><sec:authentication property="principal.username" /> </span> 
		<br /> 
		<s:url value="/logout" var="logout_url" /> 
		<a href="${logout_url}">Logout</a> 
		
		<sec:authorize url="/admin">
				<s:url value="/admin" var="admin_url" />
				<br />
				<a href="${admin_url}">Admin</a>
			</sec:authorize>
	</sec:authorize>
</div>