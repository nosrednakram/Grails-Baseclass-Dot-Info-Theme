<title>Banner Web</title>
<meta name="layout" content="root" />

<content tag="breadcrumbs">
<a class="home" href=".">Home</a>
</content>

<content tag="flashmessage">
<g:if test="${flash.message}">
<div class="message" role="status">${flash.message}</div>
</g:if>
</content>

<content tag="main">
<div class="body">
   <h1>Baseclass.info Grails Theme</h1>
   <p>
      This is a simple theme system that installes a new layout and scaffolding so when you generate new views they will use the new theme.  It uses a 12 column grid system based on the <a href="http://960.gs">960 Grid System</a>.  I included modified templates from the <a href="http://adapt.960.gs/"> Adaptive CSS</a> system so you can set a width.  Allthough the adapt.js script is included this system doesn't use it.  You can pick any of the provided widths and change from 960 by replacing the link to 960.min.css with the desired width.  The layout is named root and should be accessed by setting the meta layout content to root.
   </p>

   <pre>
   &lt;meta name="layout" content="root" /&gt;
   </pre>

   <h2>Common Page Sections</h2>

   <p>
      It uses a few common elements in <code>grails-app/views/common</code>.  This is were you set define the common static content used on more than one page.
   </p>

   <ul>
      <li>Footer in <strong>_footer.gsp</strong></li>
      <li>Main Navigation in <strong>_mannav.gsp</strong></li>
      <li>User Options in <strong>_useroptions.gsp</strong></li>
      <li>Site Search in <strong>_search.gsp</strong></li>
   </ul>

   <p>
      These common sub sections are included in the root or other layouts you may wish to use with a render template tag.
   </p>

   <pre>
   &lt;g:render template="/common/mainnav" /&gt;
   </pre>

   <h2>Page Specific Sections</h2>

   <p>
      This theme differs from the default in that it's schaffolding uses a root layout, with more sections by default.  The main advantage of creating these different section is that it allow the flexibility to move section of the page to different locations easily when accomidating differnt layout.  The sections that all pages should have.
   </p>

   <ul>
      <li>
        <strong>navbar</strong> - Page specific navigation, generally an 
        unordered list
      </li>
      <li>
         <strong>flashmessage</strong> - Output of grails flash message,
         generally an unordered list
      </li>
      <li>
         <strong>breadcrumgs</strong> - Links for breadcrumbs, generally a 
         paragraph of anchors with a seperater
      </li>
      <li>
         <strong>main</strong> - the pages main content
      </li>
      <li>
         <strong>pagination</strong> - pagination links generally in a div
      </li>
   </ul>

   <p>
      These sections should have wrapping elements contained in the layout preferably.  To include than element you use a pageProperty tag.
   </p>

   <pre>
   &lt;geProperty name="page.main" /&gt;
   </pre>

   <p>
      In you gsp pages you specify the sections with a tag.  To specify the tag for main which was used in the preveous example you would wrap the page section in content tags with a appropriate tag label.
   </p>

   <pre>
   &lt;content tag="main"&gt;
      Tag specific related content .....
   &lt;content&gt;
   </pre>

</div>
</content>
