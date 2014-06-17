<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>

<div>
	<h2>Shopping Cart</h2>
	<img alt="Shopping Cart" style="height: 24px; width: 24px;"
		src="<s:url value='/resource' />/image/Shopping-Cart-Icon.png">
		
	<script type="text/javascript">
		function processProductIds() {
			var idArr = [];
			var selectedProductsLi = $(".selectedProduct");
			for (var i = 0; i < selectedProductsLi.length; i++) {
				var s = selectedProductsLi[i].id;
				s = s.replace("prd_", "");
				idArr.push(s);
			}
			$("#selectedProductIdList").val(idArr);
		}
	</script>

	<s:url var="checkoutURL" value="/checkout" />
	<form method="post" class="signin" action="${checkoutURL}" onsubmit="processProductIds();">

		<fieldset>
			<legend></legend>
			<ol id="shoppingCardDiv"></ol>
			<input type="hidden" id="selectedProductIdList" name="selectedProductIdList" value=""> <input type="submit" value="Check Out" />
		</fieldset>
	</form>
</div>