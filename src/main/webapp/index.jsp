<html>
<body>
    <div><span class="time" id="time"></span></div>
    <%
        String existErr = (String) session.getAttribute("existErr");
        String emailErr = (String) session.getAttribute("emailErr");
        String passErr = (String) session.getAttribute("passErr");
    %>


<h2>Hello World!</h2>
<form action="welcome.jsp" method="post">
    <table id="form_table">
        <tr>
            <td>Email:</td>
            <td><input type="text" placeholder="<%=(emailErr != null ? emailErr: "Enter email")%>" name="email" required="true"></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input type="text" placeholder="<%=(existErr != null ? existErr: "Enter name")%>" name="name" required="true"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" placeholder="<%=(passErr != null ? passErr: "Enter password")%>" name="password" required="true"></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><input type="text" name="gender" required="false"></td>
        </tr>
        <tr>
            <td>Favourite Colour:</td>
            <td><input type="text" name="colour" required="false"></td>
        </tr>
        <tr>
            <td>TOS</td>
            <td><input type="checkbox" name="tos" required="true"></td>
        </tr>
        <tr>
            <td><a href="cancel.jsp" class="button"> Cancel</a>
                <input class="button" type="submit" value="Sign In">
            </td>
        </tr>
    </table>
</body>
</html>
