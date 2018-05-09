

<div class="container">
    <div ng-controller="display_result_ctrl as xxx">
        <table class="table">
            <tr>
                <td>S.N</td>
                <td>UserName</td>
                <td>Password</td>
                <td>action</td>
            </tr>
            <tr ng-repeat="u in xxx.users">
                <td><span ng-bind="u.id"></span></td>
                <td><span ng-bind="u.userName"></span></td>
                <td><span ng-bind="u.password"></span></td>
                <td><span>
                    <!-- Button trigger modal -->
            <button type="button" ng-click="xxx.Edit(u.id)"class="btn btn-primary">
                Edit
            </button>
                </span></td>
                <td><span><button type="button" ng-click="xxx.Delete(u.id)" class="btn btn-danger ">Delete</button></span></td>
                <td>

            </tr>
        </table>
    </div>

</div>




