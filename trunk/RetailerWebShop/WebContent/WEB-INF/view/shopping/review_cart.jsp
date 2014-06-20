<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style media="screen" type="text/css">

.pinfo {
    background-color: #808080;
    color: #FFFFFF;
    float: right;
    padding: 10px;
    border-radius: 10px;
    -moz-border-radius: 10px;
    -webkit-border-radius: 10px;
}


</style>

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
		getWineQuantityPairs();
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
	
	var gWineQuantityPair = null;
	
	function getWineQuantityPairs() {

		var selectedProductsIdList = $("#selectedProductIdList").val();
		var idList = selectedProductsIdList.split(",");
		var wineQuantityPairArray = [];
		for (var i = 0; i < idList.length; i++) {
			var amountInputId = "a_" + idList[i];
			var amount = $("#"+amountInputId).val();
			var wineQuantityPair = {};
			wineQuantityPair.wineId = idList[i];
			wineQuantityPair.quantity = amount;
			wineQuantityPairArray.push(wineQuantityPair);
		}
		
		gWineQuantityPair = wineQuantityPairArray;
	}
	
	function writeWineQuanitiyPairs() {
		$("#wineQuanitiyPairs").val(JSON.stringify(gWineQuantityPair));
	}

</script>

<h1>Shopping Cart</h1>

<table cellspacing="20px;" >
	<tr>
		<td>
				<div>
			<c:forEach items="${selectedProductList}" var="product">
			<table cellspacing="20px;" id='table_${product.id}'>
			<tr>
			<td><div align="left"><img alt="${wine.name}" style="height: 288px; " src="<s:url value='/resource' />/wine_image/${product.imageUrl}"></div><td>
			<td valign="bottom">
				<table cellspacing="5px;" >
					<tr>
						<td class="ptd"><div class="pinfo">Wine Type</div></td>
						<td class="ptd"><div class="pinfo">: ${product.type}</div></td>
					</tr>
					<tr>
						<td class="ptd"><div class="pinfo">Name</div></td>
						<td class="ptd"><div class="pinfo">: ${product.name}</div></td>
					</tr>
					<tr>
						<td class="ptd"><div class="pinfo">Price</div></td>
						<td class="ptd"><div class="pinfo">: ${product.price}</div> <input
							type="hidden" class="price" value="${product.price}"
							id="p_${product.id}" /></td>
					</tr>
					<tr>
						<td class="ptd"><div class="pinfo">Weight</div></td>
						<td class="ptd"><div class="pinfo">: ${product.weight}</div></td>
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
			<td>
			</tr>
			</table>
			</c:forEach>
		
			
		</div>
				
		</td>
		<td>
		<h2>Amount Of Payment : <span id="totalPriceDiv">${totalPrice}</span></h2>
		<input type="hidden" id="totalPrice" name="totalPrice" value="${totalPrice}" style="width: 50px;" />
		
		
		<s:url var="placeOrderURL" value="/checkout/placeOrder" />
		<form method="post" action="${placeOrderURL}">
			<table cellspacing="5px;" >
				<tr>
					<td ><div class="pinfo">Shipment Type</div></td>
					<td >
						<div >
							<select name="shipmentUrgent">
								<option value="true" >Urgent Shipment (3 days)</option>
								<option selected="selected" value="false" >Regular Shipment (7 days)</option>
							</select>
						</div>
					</td>
				</tr>
				<tr>
					<td ><div class="pinfo">Warehouse City</div></td>
					<td >
						<div >
							<select name="warehouseCity">
								<option selected="selected" value="Heraklion" >Heraklion</option>
								<option value="Chania" >Chania</option>
								<option value="Rethimno" >Rethimno</option>
								<option value="Athens" >Athens</option>
							</select>
						</div>
					</td>
				</tr>
				<tr>
					<td ><div class="pinfo">Destination City</div></td>
					<td >
						<div >
							<select name="destinationCity">
								<option selected="selected" value="Heraklion" >Heraklion</option>
								<option value="Chania" >Chania</option>
								<option value="Rethimno" >Rethimno</option>
								<option value="Athens" >Athens</option>
							</select>
						</div>
					</td>
				</tr>
			</table>
			<br/>
			<input type="hidden" id="selectedProductIdList"
				name="selectedProductIdList" value="${selectedProductIdList}"
				style="width: 50px;" />
				
			<input type="hidden" id="wineQuanitiyPairs"
				name="wineQuanitiyPairs" value=""
				style="width: 50px;" />
			<input type="submit" value="Place Order" style="width: 180px; height: 30px;" onclick="writeWineQuanitiyPairs();"/>
		</form>
		
		</td>
	</tr>
</table>


<script type="text/javascript">
		$(document).ready(amountChanged());
</script>

