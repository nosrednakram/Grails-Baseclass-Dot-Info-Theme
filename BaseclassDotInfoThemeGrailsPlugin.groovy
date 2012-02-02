class BaseclassDotInfoThemeGrailsPlugin {
    // the plugin version
    def version = "0.4"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.0 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Baseclass Dot Info Theme Plugin" // Headline display name of the plugin
    def author = "Mark Anderson"
    def authorEmail = "nosrednakram@gmail.com"
   def description = '''\
Baseclass.info Grails Theme

This documentation is available at http://host/app/theme in a themed example page.

This is a simple theme system that installes a new layout and scaffolding so when you generate new views they will use the new theme. It uses a 12 column grid system based on the 960 Grid System. I included modified templates from the Adaptive CSS system so you can set a width. Allthough the adapt.js script is included this system does nott use it. You can pick any of the provided widths and change from 960 by replacing the link to 960.min.css with the desired width. The layout is named root and should be accessed by setting the meta layout content to root.

   <meta name="layout" content="root" />
   
Common Page Sections

It uses a few common elements in grails-app/views/common. This is were you set define the common static content used on more than one page.

* Footer in _footer.gsp
* Main Navigation in _mannav.gsp
* User Options in _useroptions.gsp
* Site Search in _search.gsp

These common sub sections are included in the root or other layouts you may wish to use with a render template tag.

   <g:render template="/common/mainnav" />
   
Page Specific Sections

This theme differs from the default in that it uses a root instead of a main layout, with more sections by default. The main advantage of creating these different section is that it allow the flexibility to move section of the page to different locations easily when accomidating differnt layout. The sections that all pages should have.

* navbar - Page specific navigation, generally an unordered list
* flashmessage - Output of grails flash message, generally an unordered list
* breadcrumgs - Links for breadcrumbs, generally a paragraph of anchors with a seperater
* main - the pages main content
* pagination - pagination links generally in a div

These sections should have wrapping elements contained in the layout preferably. To include than element you use a pageProperty tag.

   <geProperty name="page.main" />
   
In you gsp pages you specify the sections with a tag. To specify the tag for main which was used in the preveous example you would wrap the page section in content tags with a appropriate tag label.

   <content tag="main">
      Tag specific related content .....
   <content>
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/baseclass-dot-info-theme"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.grails-plugins.codehaus.org/browse/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
