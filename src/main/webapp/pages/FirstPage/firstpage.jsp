
<div ng-controller="first_page_ctrl as xxx">
    <p>User-Name:</p> <input type="text"  ng-model="xxx.userInfo.userName"><br><br>
    <p>Email:</p> <input type="text"  ng-model="xxx.userInfo.password"><br><br>
    <button ng-click="xxx.addData()">addData</button>
    <button ng-click="xxx.displayPage()">Show Users</button>

    <button ng-click="xxx.emailPage()">email Page</button>
    <button ng-click="xxx.uploadPage()">upload Page</button>
    <button ng-click="xxx.login()">login Page</button>
</div>




