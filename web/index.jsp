<%--
  Created by IntelliJ IDEA.
  User: pjz
  Date: 2018/1/11
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style>
          #mydiv{
              height: 100px;
              width: 100px;
              border: 1px solid rebeccapurple;
          }
      </style>
  </head>
  <body>
  <form >
      name:<input type="text" name="name" id="name"/>
      password:<input type="password" name="password" id="password"/>
      <input type="submit" value="提交" id="cc">
  </form>
  <div id="mydiv"></div>
  </body>
</html>
<script>
    (function(){
        function loadXMLDoc(name,password) {
            var xmlhttp;
            if(window.XMLHttpRequest){
                xmlhttp = new XMLHttpRequest()
            }else {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }

            xmlhttp.onreadystatechange = function () {
                if(xmlhttp.readyState==4 && xmlhttp.status==200){
                    document.getElementById("mydiv").innerHTML = xmlhttp.responseText;
                }
            }
            xmlhttp.open("GET","/index.do?name=ss",true);
            xmlhttp.send();
        }
        cc.click = loadXMLDoc(name.value,password.value);

    })();

</script>

