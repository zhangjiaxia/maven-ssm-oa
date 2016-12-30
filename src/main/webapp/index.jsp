<%@page import="com.huawei.service.impl.PersonServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
     pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
用户和任务的多对多关联：
用户名：${username}<br>
任务内容：${taskcontent}
<br>
<h2>Hello World!</h2>
<c:forEach items="${list}" var="user">
                <tr>
                	<td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.mobile}</td>
                </tr>
            </c:forEach>
</body>
</html>
