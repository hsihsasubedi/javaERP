<div ng-controller="DisplayController as xxx">
<h1>Image List</h1>

    <%--<img ng-src="xxx.users.listOfImages[0]" alt="image" style="width: 200px;">--%>
        <%--<img ng-src="" width ="50%" height="50%">--%>
    <%--<input type="text" ng-molel="xxx.users.name">--%>
<div ng-repeat="image in xxx.images">
    <img src="data:image/png;base64,{{image.base64Image}}" alt="{{image.name}}" width="100px" height="100px" style="float: left; padding: 10px;">
</div>
</div>
