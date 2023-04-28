<%--
  Created by IntelliJ IDEA.
  User: компьютер
  Date: 27.04.2023
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <title>User Management</title>
</head>
<body>
<h1>User Management</h1>

<s:decorate template="/layout/edit.xhtml">
  <ui:define name="label">Create User</ui:define>
  <h:form>
    <h:panelGrid columns="2">
      <h:outputLabel for="name" value="Name:"/>
      <h:inputText id="name" value="#{userBean.user.name}"/>

      <h:outputLabel for="email" value="Email:"/>
      <h:inputText id="email" value="#{userBean.user.email}"/>

      <h:commandButton value="Save" action="#{userBean.saveUser}"/>
    </h:panelGrid>
  </h:form>
</s:decorate>

<h:dataTable value="#{userBean.allUsers}" var="user">
  <h:column>
    <f:facet name="header">ID</f:facet>
    #{user.id}
  </h:column>
  <h:column>
    <f:facet name="header">Name</f:facet>
    #{user.name}
  </h:column>
  <h:column>
    <f:facet name="header">Email</f:facet>
    #{user.email}
  </h:column>
  <h:column>
    <h:commandLink value="Edit" action="#{userBean.editUser(user)}"/>
  </h:column>
  <h:column>
    <h:commandLink value="Delete" action="#{userBean.deleteUser(user.id)}"/>
  </h:column>
</h:dataTable>

</body>
</html>