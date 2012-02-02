<!-- Staff -->
<sec:access expression="hasRole('ROLE_STAFF')">
<ul>
   <li>
      <g:link controller='UserLink' action='index'>User Link</g:link>
   </li>
</ul>                        
</sec:access>
<!-- Banner Admins -->
<sec:access expression="hasRole('ROLE_SCT-SUPERUSERS')">
<ul>
   <li>
     <g:link controller='AdminLink' action='index'>Admin Link</g:link>
   </li>
</ul>
</sec:access>
