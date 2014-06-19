<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>

<style media="screen" type="text/css">

.button {
    background-color: #CC0066;
    color: #FFFFFF;
    float: right;
    padding: 10px;
    border-radius: 10px;
    -moz-border-radius: 10px;
    -webkit-border-radius: 10px;
}

.big-btn {
    width: 160px;
    height: 50px;
}

</style>

<div align="center">
	<h2>Order Grapes From Growers</h2>
	<img alt="Order Grapes" style="height: 128px; width: 128px;"
		src="<s:url value='/resource' />/image/grape-icon.png">
		
		
	<script type="text/javascript">
	</script>

	<s:url var="orderGrapesURL" value="/orderGrapes" />
	<form method="get" class="signin" action="${orderGrapesURL}" >

		<fieldset>
			<legend></legend>
			<input type="submit" value="Order Grapes" class="button big-btn" />
		</fieldset>
	</form>
</div>