<!DOCTYPE html>
<html>
    <head>
        <title>Home page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>

    <body class="container">
        <br>
        <br>
        <div class="row">
            <div class="col-sm-12 col-md-4 col-lg-2">
                <form action="/task" method="POST">
                 <div class="form-group m-2">
                   <label for="email">Email address</label>
                   <input name="email" type="email" class="form-control" id="email" placeholder="Enter email" required>
                 </div>
                 <div class="form-group m-2">
                   <label for="task">Task</label>
                   <input name="task" type="text" class="form-control" id="task" placeholder="Enter task" required>
                 </div>
                 <input type="submit" class="btn btn-primary"/>
               </form>
            </div>
        </div>
        
    <#if taskSubmissions?has_content>
        <p class="mt-3">Existing tasks</p>
        <table class="table">
            <thead>
              <tr>
                <th scope="col">Id</th>
                <th scope="col">Email</th>
                <th scope="col">Task</th>
                <th scope="col">Created at</th>
              </tr>
            </thead>
            <tbody>
                <#list taskSubmissions as taskSubmission>
                    <tr>
                        <td>${taskSubmission.getId()}</td>
                        <td>${taskSubmission.getEmail()}</td>
                        <td>${taskSubmission.getTask()}</td>
                        <td>${taskSubmission.getTimpeStamp()}t</td>
                    </tr>
                </#list>
             </tbody>
        </table>
    </#if>
    </body>

</html>