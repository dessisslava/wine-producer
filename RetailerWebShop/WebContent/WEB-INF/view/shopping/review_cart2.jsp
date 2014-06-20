<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript">
	function amountChanged() {
		var priceList = $(".price");
		var totalPrice = 0;
		for (var i = 0; i < priceList.length; i++) {

			var pidStr = priceList[i].id;
			// 			alert(pidStr);
			var aidStr = pidStr.replace("p_", "a_");
			// 			alert(aidStr);
			var amountInput = $("#" + aidStr);
			var amount = amountInput.val();
			// 			alert(amount);
			totalPrice += (parseFloat(priceList[i].value) * parseInt(amount));

		}

		$("#totalPriceDiv").html(totalPrice);
		$("#totalPrice").val(totalPrice);
	};

	function removeProductCheckout(id) {

		var selectedProductsIdList = $("#selectedProductIdList").val();
		var idList = selectedProductsIdList.split(",");
		var index = idList.indexOf(id);

		if (index > -1) {
			idList.splice(index, 1);
		}

		var newIdList = "";
		for (var i = 0; i < idList.length; i++) {
			newIdList += idList[i];
			if (i != (idList.length - 1)) {
				newIdList += ",";
			}
		}

		// 		alert(newIdList);

		$("#table_" + id).remove();
		$("#selectedProductIdList").val(newIdList);

		amountChanged();
	}

</script>

<h1>Shopping Cart</h1>

<div>
	<c:forEach items="${selectedProductList}" var="product">
		<table cellspacing="0" id='table_${product.id}'>
			<tr>
				<td class="ptd"><div class="pinfo">Producer:</div></td>
				<td class="ptd"><div class="pinfo">${product.type}</div></td>
			</tr>
			<tr>
				<td class="ptd"><div class="pinfo">Product:</div></td>
				<td class="ptd"><div class="pinfo">${product.name}</div></td>
			</tr>
			<tr>
				<td class="ptd"><div class="pinfo">Price:</div></td>
				<td class="ptd"><div class="pinfo">${product.price}</div> <input
					type="hidden" class="price" value="${product.price}"
					id="p_${product.id}" /></td>
			</tr>
			<tr>
				<td class="ptd"><div class="pinfo">Weight:</div></td>
				<td class="ptd"><div class="pinfo">${product.weight}</div></td>
			</tr>
			<tr>
				<td class="ptd">Amount:</td>
				<td class="ptd"><input name="a_${product.id}"
					id="a_${product.id}" onchange="amountChanged();" type="text"
					value="1" style="width: 30px; text-align: center;" /></td>
			</tr>
			<tr>
				<td class="ptd"></td>
				<td class="ptd"><input
					onclick="removeProductCheckout('${product.id}');" type="button"
					value="Remove" style="width: 60px; text-align: center;" /></td>
			</tr>
		</table>
	</c:forEach>


	<input type="hidden" id="selectedProductIdList"
		name="selectedProductIdList" value="${selectedProductIdList}"
		style="width: 50px;" />
</div>


<h1>Payment Info</h1>
<s:url var="paymentURL" value="/checkout/pay" />
<form method="post" action="${paymentURL}">
	<table>
		<tr>
			<td>Amount Of Payment :</td>
			<td><div id="totalPriceDiv">${totalPrice}</div> <input
				type="hidden" id="totalPrice" name="totalPrice"
				value="${totalPrice}" style="width: 50px;" /></td>
		</tr>
		<tr>
			<td>Name Surname :</td>
			<td><input type="text" name="nameOnCard" /></td>
		</tr>
		<tr>
			<td>Credit Card Number :</td>
			<td><input type="text" name="numberOnCard" /></td>
		</tr>
		<tr>
			<td>CVC Number :</td>
			<td><input type="text" name="cvcNumberOnCard" /></td>
		</tr>
		<tr>
			<td>Credit Card Type :</td>
			<td><select name="creditCardType">
					<option selected="selected" value="1">Master Card</option>
					<option value="2">Visa</option>
					<option value="3">American Express</option>
					<option value="4">Maestro</option>
			</select></td>
		</tr>
		<tr>
			<td><input type="submit" value="Pay" style="width: 80px;" /></td>
			<td></td>
		</tr>
	</table>
</form>


