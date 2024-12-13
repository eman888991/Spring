<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <%--        import Bootstrap--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

</head>
<body background="${pageContext.request.contextPath}/resources/image/background.png">
    <form action="processForm" >
        <input type="text" placeholder="year" name="year">
        <input type="text" placeholder="month" name="month">
        <input type="text" placeholder="day" name="day">
        <input type="submit">
    </form>
</body>
</html>
