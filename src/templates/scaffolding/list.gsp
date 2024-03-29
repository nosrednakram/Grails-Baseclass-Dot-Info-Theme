<% import grails.persistence.Event %>
<meta name="layout" content="baseclass">
<g:set var="entityName" value="\${message(code: '${domainClass.propertyName}.label', default: '${className}')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>

<content tag="breadcrumbs">
<a class="home" href="\${createLink(uri: '/')}"><g:message code="default.home.label"/></a> >
<g:link class="list" action="list">
         <g:message code="default.list.label" args="[entityName]" /></g:link>
</content>

<content tag="navbar">
<div class="nav" role="navigation">
   <ul>
      <li><g:link class="create" action="create">
         <g:message code="default.new.label" args="[entityName]" /></g:link>
      </li>
   </ul>
</div>
</content>

<content tag="flashmessage">
<g:if test="\${flash.message}">
<div class="message" role="status">\${flash.message}</div>
</g:if>
</content>

<content tag="main">
<div id="list-${domainClass.propertyName}" class="content scaffold-list" role="main">

   <h1><g:message code="default.list.label" args="[entityName]" /></h1>

   <table>
   <thead>
      <tr>
         <% excludedProps = Event.allEvents.toList() << 'id' << 'version'
         allowedNames = domainClass.persistentProperties*.name << 'dateCreated' << 'lastUpdated'
         props = domainClass.properties.findAll { allowedNames.contains(it.name) && !excludedProps.contains(it.name) && it.type != null && !Collection.isAssignableFrom(it.type) }
         Collections.sort(props, comparator.constructors[0].newInstance([domainClass] as Object[]))
         props.eachWithIndex { p, i ->
         if (i < 6) {
            if (p.isAssociation()) { %>
               <th>
                  <g:message code="${domainClass.propertyName}.${p.name}.label" 
                  default="${p.naturalName}" />
               </th>
            <% } else { %>
              <g:sortableColumn property="${p.name}" 
              title="\${message(code: '${domainClass.propertyName}.${p.name}.label', default: '${p.naturalName}')}" />
           <%  }   }   } %>
      </tr>
   </thead>
   <tbody>
      <g:each in="\${${propertyName}List}" status="i" var="${propertyName}">
      <tr class="\${(i % 2) == 0 ? 'even' : 'odd'}">
      <%  props.eachWithIndex { p, i ->
      if (i == 0) { %>
         <td>
           <g:link action="show" id="\${${propertyName}.id}">\${fieldValue(bean: ${propertyName}, field: "${p.name}")}</g:link>
         </td>
         <% } else if (i < 6) {
         if (p.type == Boolean || p.type == boolean) { %>
            <td><g:formatBoolean boolean="\${${propertyName}.${p.name}}" /></td>
         <% } else if (p.type == Date || p.type == java.sql.Date || p.type == java.sql.Time || p.type == Calendar) { %>
           <td><g:formatDate date="\${${propertyName}.${p.name}}" /></td>
        <% } else { %>
          <td>\${fieldValue(bean: ${propertyName}, field: "${p.name}")}</td>
        <%  }   }   } %>
      </tr>
      </g:each>
   </tbody>
   </table>
</div>
</content>

<content tag="pagination">
<div class="pagination">
   <g:paginate total="\${${propertyName}Total}" />
</div>
</content>
