<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>
<%@ taglib prefix="tiles" uri="/WEB-INF/taglib/tiles-jsp.tld"%>
<html>
<head>

<title>Retailer</title>

<link href="<s:url value="/resource" />/css/site.css" rel="stylesheet"
	type="text/css" />

<style type="text/css">
#freewall_container {
	position: relative;
	width: 960px;
	margin: auto;
}

.freewall_item {
	background: rgb(224, 224, 224);
	height: 500px;
	width: 250px;
}

@keyframes start {from { transform:scale(0);
	
}

to {
	transform: scale(1);
}

}
@-webkit-keyframes start {from { -webkit-transform:scale(0);
	
}

to {
	-webkit-transform: scale(1);
}

}
.freewall_container .freewall_item[data-state="init"] {
	display: none;
}

.freewall_container .freewall_item[data-state="start"] {
	display: block;
	animation: start 0.5s;
	-webkit-animation: start 0.5s;
}

.freewall_container .freewall_item[data-state="move"] {
	transition: top 0.5s, left 0.5s, width 0.5s, height 0.5s;
	-webkit-transition: top 0.5s, left 0.5s, width 0.5s, height 0.5s;
}
</style>

<script src="<s:url value="/resource" />/js/jquery.js" type="text/javascript"></script>
<script src="<s:url value="/resource" />/js/freewall.js" type="text/javascript"></script>
<script src="<s:url value="/resource" />/js/json2.js" type="text/javascript"></script>
</head>

<body>
	<div id="container">
		<div id="top">
			<tiles:insertAttribute name="top" />
		</div>
		<div id="side">
			<tiles:insertAttribute name="side" />
		</div>

		<div id="content">
			<tiles:insertAttribute name="content" />
		</div>
		<div id="side_down">
			<tiles:insertAttribute name="side_down" />
		</div>
	</div>
</body>
</html>
