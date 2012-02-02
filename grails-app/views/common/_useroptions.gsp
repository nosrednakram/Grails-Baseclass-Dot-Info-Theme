<sec:ifLoggedIn>
   <p>
      <g:link controller='logout' action='index'>Logout</g:link>
      <sec:username/>
   </p>
</sec:ifLoggedIn>
<sec:ifNotLoggedIn>
   <p><g:link controller='login' action='auth'>Login</g:link></p>
</sec:ifNotLoggedIn>
