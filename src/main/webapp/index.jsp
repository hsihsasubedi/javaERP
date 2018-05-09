
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset ="utf-8">
    <title>AngularJS $http Example</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular-animate.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular-touch.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/1.3.3/ui-bootstrap-tpls.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.5/angular-route.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/angular-base64-upload@0.1.23/dist/angular-base64-upload.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <%--<link href="/common/css/app.css" rel="stylesheet"/>--%>
</head>
<body ng-app="myapp" class="ng-cloak">

<div ng-view></div>

<script src="app.js"></script>
<script src="/pages/FirstPage/controller/first_page_ctrl.js"></script>
<script src="/pages/FirstPage/services/first_page_services.js"></script>

<script src="/pages/FirstPage/factory/modalFactory.js"></script>
<script src="/pages/FirstPage/controller/modalController.js"></script>
<script src="/pages/FirstPage/services/modalServices.js"></script>

<script src="/pages/FirstPage/controller/display_result_ctrl.js"></script>
<script src="/pages/FirstPage/services/display_result_service.js"></script>


<script src="/pages/email/controller/Email_Controller.js"></script>
<script src="/pages/email/services/Email_Services.js"></script>


<script src="/pages/FileUpload/Controller/Upload_Controller.js"></script>
<script src="/pages/FileUpload/Services/Upload_Services.js"></script>


<script src="/pages/auth/controller/Auth_Controller.js"></script>
<script src="/pages/auth/services/Auth_Srevices.js"></script>


<script src="/pages/FileUpload/Controller/DisplayController.js"></script>
<script src="/pages/FileUpload/Services/DisplayServices.js"></script>


<script src="/pages/common/HttpService.js"></script>
<script src="/pages/common/RounteProvider/routProvider.js"></script>




<script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>
</html>
