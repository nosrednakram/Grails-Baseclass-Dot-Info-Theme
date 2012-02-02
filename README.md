# Baseclass.info Grails Theme

This documentation is available at http://host/app/theme in a themed example page.  You can remove the grails-app/conf/ThemeUrlMappings.groovy file if you don't want the mapping.

This is a simple theme system that installs a new layout and scaffolding so when you generate new views they will use the new theme. It uses a 12 column grid system based on the 960 Grid System. I included modified templates from the Adaptive CSS system so you can set a width. Although the adapt.js script is included this system does not use it. You can pick any of the provided widths and change from 960 by replacing the link to 960.min.css with the desired width. The layout is named root and should be accessed by setting the meta layout content to root.

~~~~
    <meta name="layout" content="root" />
~~~~
   
## Common Page Sections

It uses a few common elements in grails-app/views/common. This is were you set define the common static content used on more than one page.

* Footer in _footer.gsp
* Main Navigation in _mannav.gsp
* User Options in _useroptions.gsp
* Site Search in _search.gsp

These common sub sections are included in the root or other layouts you may wish to use with a render template tag.

~~~~
    <g:render template="/common/mainnav" />
~~~~
   
## Page Specific Sections

This theme differs from the default in that it uses a root instead of a main layout, with more sections by default. The main advantage of creating these different section is that it allow the flexibility to move section of the page to different locations easily when accommodating different layout. The sections that all pages should have.

* navbar - Page specific navigation, generally an unordered list
* flashmessage - Output of grails flash message, generally an unordered list
* breadcrumgs - Links for breadcrumbs, generally a paragraph of anchors with a separator
* main - the pages main content
* pagination - pagination links generally in a div

These sections should have wrapping elements contained in the layout preferably. To include than element you use a pageProperty tag.

~~~~
    <g:Property name="page.main" />
~~~~
   
In you gsp pages you specify the sections with a tag. To specify the tag for main which was used in the previous example you would wrap the page section in content tags with a appropriate tag label.

~~~~
    <content tag="main">
        Tag specific related content .....
    <content>
~~~~

