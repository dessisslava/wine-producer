<%@ taglib prefix="spring" uri="/WEB-INF/taglib/spring.tld"%>

<div>
	<h2>Sign in to Wine Retailer</h2>

	<p>Please sign in to access administration panel.</p>

	<spring:url var="authUrl" value="/authentication_check" />
	<form method="post" class="signin" action="${authUrl}">

		<fieldset>
			<table cellspacing="0">
				<tr>
					<th><label for="username">Username</label></th>
					<td><input id="username" name="j_username" type="text" /></td>
				</tr>
				<tr>
					<th><label for="password">Password</label></th>
					<td><input id="password" name="j_password" type="password" /></td>
				</tr>
				<tr>
					<th></th>
					<td><input id="remember_me"
						name="_spring_security_remember_me" type="checkbox" /> <label
						for="remember_me" class="inline">Remember me</label></td>
				</tr>
				<tr>
					<th></th>
					<td><input name="commit" type="submit" value="Sign In" /></td>
				</tr>
			</table>
		</fieldset>
	</form>

	<script type="text/javascript">
		document.getElementById('username').focus();
	</script>
</div>