<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-1.7.2.js"></script>

<body>

<script>
    $(document).ready(function () {
        $("#btnSend").click(function () {
            $.ajax({
                url: 'Myservlet',
                type: 'POST',
                data: {name: $("#name").val()},
                success: function (result) { alert('success'); },
                error:function(){alert('error');}
            });
        });
    });
    
    
    $(document).ready(function () {
        $("#selector").change(function () {
            $.ajax({
                url: 'Myservlet',
                type: 'GET',
                data: {car: $("#selector").val()},
                success: function (result) { alert('success'); },
                error:function(){alert('error');}
            });
        });
    });
    
    
</script>
<label for="bar">A bar</label>
<input id="name" name="bar" type="text" value="" />
<input id="btnSend" type="button" value="Send" />


 <select id="selector">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select> 

<br> You choose car :   <% 
if (request.getAttribute("car")==null ) {}
else  
{   String car = (String)request.getAttribute("car");
	out.print(car);
	}

%>

</body>
</html>