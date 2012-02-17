<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8" />
  <title><g:layoutTitle default="Grails" /></title>
  <link rel="stylesheet" href="${resource(dir:'css/baseclass',file:'main.min.css')}" />
  <link rel="stylesheet" href="${resource(dir:'css/baseclass',file:'960.min.css')}" />
  <!--[if !IE]>-->
  <style type="text/css">
  body {
  font-size:16px;
  }
  </style>
  <!--<[endif]-->

  <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
  <g:layoutHead />
  <g:javascript library="application" />

  <r:layoutResources />


  </head>
    <body>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${resource(dir:'images',file:'spinner.gif')}"
                 alt="${message(code:'spinner.alt',default:'Loading...')}" />
        </div>
        <div class="container_12 wrapper">

          <div class="grid_2 sideColumn">
              <nav>
              <g:render template="/common/mainnav" />
              </nav>
          </div>

          <div class="grid_8 mainColumn">
             <div id="mainBanner">
                <h1>Place Holder</h1>
             </div>
             <p id="breadcrumbs">
                <g:pageProperty name="page.breadcrumbs" />
             </p>
             <g:pageProperty name="page.flashmessage" />
             <g:pageProperty name="page.main" />
             <g:pageProperty name="page.pagination" />
             <r:layoutResources />
          </div>

          <div class="grid_2 thirdColumn">
             <div id="userAccount">
               <g:render template="/common/useroptions" />
             </div>
             <g:pageProperty name="page.navbar" />
             <div id="search">
               <g:render template="/common/search" />
             </div>
          </div>

          <div class="grid_12" id="footer">
              <footer>
              <g:render template="/common/footer" />
              </footer>
          </div>
        </div>
    </body>
</html>
