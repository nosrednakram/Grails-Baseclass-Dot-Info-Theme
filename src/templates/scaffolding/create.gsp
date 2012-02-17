<%=packageName%>
<meta name="layout" content="baseclass">
<g:set var="entityName" value="\${message(code: '${domainClass.propertyName}.label', default: '${className}')}" />
<title><g:message code="default.create.label" args="[entityName]" /></title>

<content tag="breadcrumbs">
<a class="home" href="\${createLink(uri: '/')}"><g:message code="default.home.label"/></a> >
<g:link class="list" action="list">
         <g:message code="default.list.label" args="[entityName]" /></g:link> >
<g:link class="create" action="create">
         <g:message code="default.create.label" args="[entityName]" /></g:link>
</content>

<content tag="navbar">
<div class="nav" role="navigation">
   <ul>
      <li><g:link class="list" action="list">
         <g:message code="default.list.label" args="[entityName]" /></g:link>
      </li>
   </ul>
</div>
</content>

<content tag="flashmessage">
<g:if test="\${flash.message}">
<div class="message" role="status">
   \${flash.message}
</div>
</g:if>
   <g:hasErrors bean="\${${propertyName}}">
   <ul class="error" role="alert">
      <g:eachError bean="\${${propertyName}}" var="error">
      <li <g:if test="\${error in org.springframework.validation.FieldError}">data-field-id="\${error.field}"</g:if>><g:message error="\${error}"/></li>
      </g:eachError>
   </ul>
   </g:hasErrors>
</content>

<content tag="main">
<div id="create-${domainClass.propertyName}" class="content scaffold-create" role="main">

<h1><g:message code="default.create.label" args="[entityName]" /></h1>

<g:form action="save" <%= multiPart ? ' enctype="multipart/form-data"' : '' %>>
   <fieldset class="form">
      <g:render template="form"/>
   </fieldset>
   <fieldset class="buttons">
      <g:submitButton name="create" class="save" value="\${message(code: 'default.button.create.label', default: 'Create')}" />
   </fieldset>
</div>
</g:form>
</content>
