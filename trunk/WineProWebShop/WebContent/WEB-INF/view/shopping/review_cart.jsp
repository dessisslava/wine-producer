<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<h1>Order Grapes</h1>

<s:url var="orderGrapesURL" value="/orderGrapes" />
<form method="post" action="${orderGrapesURL}">
	<table>
		<tr>
			<td>Grape Variety : </td>
			<td>
				<select name="grapeVariety">
					<option value="RED">Red Grapes</option>
					<option value="WHITE">White Grapes</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Grape Quantity :</td>
			<td><input name="quantity"  type="text" value="1.0" />&nbsp;&nbsp; tons</td>
		</tr>
		<tr>
			<td>Delivery Address : </td>
			<td><select name="deliveryAddress">
					<option selected="selected" value="HER">Heraklion</option>
					<option value="RET">Rethimno</option>
				</select>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="Order Grapes" class="" /></td>
			<td></td>
		</tr>
	</table>
</form>


